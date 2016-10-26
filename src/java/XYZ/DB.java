package XYZ;


/**
 *
 * @author sahilajmera
 */
import java.sql.*;

public class DB {

    public Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        } catch (Exception ex) {
            ex.getMessage();
        }

        return con;
    }

}
