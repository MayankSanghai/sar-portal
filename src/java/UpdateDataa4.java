import java.io.*;
import java.sql.*;
import XYZ.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayank
 */
public class UpdateDataa4 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try
        {
            String Id=(String)session.getAttribute("Id");
            String Name=request.getParameter("CompanyName");
            String Desc=request.getParameter("Description");
            String StDate=request.getParameter("StartDate");
            String EndDate=request.getParameter("EndDate");
            //String FileName=request.getParameter("text2");
            String str = "update pintern set CompanyName=?,Description=?,StartDate=?,EndDate=? where Id=?";
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
            update.setString(1,Name);
            update.setString(2,Desc);
            update.setString(3,StDate);
            update.setString(4,EndDate);
            update.setString(5,Id);
            update.executeUpdate();
            session.setAttribute("getAlerta4", "Yes");
            response.sendRedirect("a4.jsp");
        }
         catch(Exception e)   
         {
            response.sendRedirect("CommonError.jsp");
         }
    }
}
