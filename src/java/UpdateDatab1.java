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
public class UpdateDatab1 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try
        {
            String Id=(String)session.getAttribute("Id");
            String Name=request.getParameter("ClubName");
            String Desc=request.getParameter("Description");
            String Pos=request.getParameter("Position");
            String Date=request.getParameter("Date");

            String str = "update pclubawards set ClubName=?,Description=?,Position=?,Date=? where Id=?";
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
            update.setString(1,Name);
            update.setString(2,Desc);
            update.setString(3,Pos);
            update.setString(4,Date);
            update.setString(5,Id);
            update.executeUpdate();
            session.setAttribute("getAlert", "Yes");
            response.sendRedirect("b1.jsp");
        }
         catch(Exception e)   
         {
            response.sendRedirect("CommonError.jsp");
         }
    }
}
