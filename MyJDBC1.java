//insert 1 record
import java.sql.*;

public class MyJDBC1 {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
            Statement st = con.createStatement();
//            ResultSet rs =
            st.executeUpdate("insert into Student values('BS18-214','Ankita Mishra ',21,372)");
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//            }
            System.out.println("one record inserted successfully");
            st.close();
            con.close();
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
