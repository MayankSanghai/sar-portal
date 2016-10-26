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
public class UpdateDataa3 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try
        {
            String Id=(String)session.getAttribute("Id");
            String Name=request.getParameter("CompanyName");
            String Desc=request.getParameter("Description");
            String StDate=request.getParameter("StartDate");
            //String FileName=request.getParameter("text2");
            String str = "update pstartup set CompanyName=?,StartDate=?,Description=? where Id=?";
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
            update.setString(1,Name);
            update.setString(2,StDate);
            update.setString(3,Desc);
            //update.setString(4,FileName);
            update.setString(4,Id);
            update.executeUpdate();
            session.setAttribute("getAlerta3", "Yes");
            response.sendRedirect("a3.jsp");
        }
         catch(Exception e)   
         {
            response.sendRedirect("CommonError.jsp");
         }
    }
}
