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
public class UpdateDatac1 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try
        {
            String Id=(String)session.getAttribute("Id");
            String title=request.getParameter("Title");
            String pAt=request.getParameter("PresentedAt");
            String date=request.getParameter("Date");
          
            String str = "update presearch set Title=?,PresentedAt=?,Date=? where Id=?";
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
            update.setString(1,title);
            update.setString(2,pAt);
            update.setString(3,date);
            update.setString(4,Id);
            update.executeUpdate();
            session.setAttribute("getAlertc1", "Yes");
            response.sendRedirect("c1.jsp");
        }
         catch(Exception e)   
         {
            response.sendRedirect("CommonError.jsp");
         }
    }
}
