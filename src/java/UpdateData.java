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
public class UpdateData extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try
        {
            String Id=(String)session.getAttribute("Id");
            String Name=request.getParameter("f1");
            String Branch=request.getParameter("f3");
            String Semester=request.getParameter("f4");
            String Mobile=request.getParameter("f5");
            String Address=request.getParameter("f6");
            String Email=request.getParameter("f7");
            String Hostel=request.getParameter("f8");
            String str = "update pid set Name=?,Branch=?,Semester=?,MobileNo=?,Address=?,Email=?,Hostel=? where Id=?";
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
            update.setString(1,Name);
            update.setString(2,Branch);
            update.setString(3,Semester);
            update.setString(4,Mobile);
            update.setString(5,Address);
            update.setString(6,Email);
            update.setString(7,Hostel);
            update.setString(8,Id);
            update.executeUpdate();
            session.setAttribute("getAlert", "Yes");
            response.sendRedirect("afterlogin.jsp");
        }
         catch(Exception e)   
         {
            response.sendRedirect("CommonError.jsp");
         }
    }
}
