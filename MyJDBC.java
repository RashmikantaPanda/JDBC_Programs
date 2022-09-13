import java.sql.*;
//Display records
public class MyJDBC {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Student");
            while (resultSet.next()) {
                //System.out.println(resultSet.getString("Student Name")+" --- "+resultSet.getString("Roll no."));
                System.out.println(resultSet.getString(1)+" --- "+resultSet.getString(2)+" "+resultSet.getString(3)+" --- "+resultSet.getString(4));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
