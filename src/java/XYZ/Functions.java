package XYZ;

/**
 *
 * @author sahilajmera
 */
import java.sql.*;


public class Functions {

    public int submitPersonal(String Name, String Branch, String Semester, String Mobile, String Address, String Email, String Hostel, String Id) {
        int flag = 0;
       
        String str = "update pid set Name=?,Branch=?,Semester=?,MobileNo=?,Address=?,Email=?,Hostel=? where Id=? ";
        try {
            DB doa = new DB();
            Connection con = doa.getConnection();
            PreparedStatement update= con.prepareStatement(str);
           // update = 
            update.setString(1,Name);
            update.setString(2,Branch);
            update.setString(3,Semester);
            update.setString(4,Mobile);
            update.setString(5,Address);
            update.setString(6,Email);
            update.setString(7,Hostel);
            update.setString(8,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        
        return flag;
    }
    /*
    public int submita2(String Id,String ClubName,String StartDate,String EndDate)
    {
        int flag=0;
          String str = "insert into  pclub values(?,?,?,?)";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,ClubName);
            update.setString(2,StartDate);
            update.setString(3,EndDate);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
     public int submita3(String Id,String CompanyName,String Description,String StartDate)
    {
        int flag=0;
          String str = "insert into pstartup values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,CompanyName);
            update.setString(2,Description);
            update.setString(3,StartDate);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
     
     public int submita3(String Id,String CompanyName,String Description,String StartDate)
    {
        int flag=0;
          String str = "insert into pstartup values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,CompanyName);
            update.setString(2,Description);
            update.setString(3,StartDate);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
        public int submita4(String Id,String CompanyName,String Description,String StartDate,String EndDate)
    {
        int flag=0;
          String str = "insert into pintern values(?,?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,CompanyName);
            update.setString(2,Description);
            update.setString(3,StartDate);
            update.setString(4,EndDate);
            update.setString(5,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
    
     public int submita5(String Id,String CompanyName,String Description,String StartDate)
    {
        int flag=0;
          String str = "insert into pstartup values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,CompanyName);
            update.setString(2,Description);
            update.setString(3,StartDate);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
    
        public int submita6(String Id,String CompanyName,String Description,String StartDate)
    {
        int flag=0;
          String str = "insert into pstartup values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,CompanyName);
            update.setString(2,Description);
            update.setString(3,StartDate);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
        
            public int submitb1(String Id,String ClubName,String Description,String Position,String Date)
    {
        int flag=0;
          String str = "insert into pclubawards values(?,?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,ClubName);
            update.setString(2,Description);
            update.setString(3,Position);
            update.setString(4,Date);
            update.setString(5,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
            
                      public int submitb2(String Id,String Competition,String Description,String Position,String Date)
    {
        int flag=0;
          String str = "insert into pinterawards values(?,?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,Competition);
            update.setString(2,Description);
            update.setString(3,Position);
            update.setString(4,Date);
            update.setString(5,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
                      
    public int submitc1(String Id,String Title,String PresentedAt,String Date)
    {
        int flag=0;
          String str = "insert into presearch values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,Title);
            update.setString(2,PresentedAt);
            update.setString(3,Date);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    
      public int submitc2(String Id,String Title,String Details,String Date)
    {
        int flag=0;
          String str = "insert into pinnovation values(?,?,?,?)";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,Title);
            update.setString(2,Details);
            update.setString(3,Date);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
      
        public int submitc3(String Id,String Name,String Description,String Date)
    {
        int flag=0;
          String str = "insert into presearch values(?,?,?,?) ";
        try {
            DB doa = new DB();
        Connection con = doa.getConnection();
            PreparedStatement update= null;
            update = con.prepareStatement(str);
            update.setString(1,Name);
            update.setString(2,Description);
            update.setString(3,Date);
            update.setString(4,Id);
            flag = update.executeUpdate();
        } catch (Exception e) {
             e.getMessage();  
        }
        return flag;
    }
    //Here all the methods of different pages will come.
*/
}