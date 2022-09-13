import java.sql.*;
public class CreateTable {
    public static void main(String args[]) {
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
            Statement stmt=con.createStatement();
//            stmt.execute("create table database1.Employee (eno INT primary key,ename varchar2(20),sal INT)");
            //stmt.execute("CREATE TABLE `database1`.`mytable` (" + "  `sl no` INT NOT NULL," + "  `product name` VARCHAR(45) NULL," + "  PRIMARY KEY (`sl no`));");
            System.out.println("Table created successfully");
            stmt.executeUpdate("insert into database1.mytable values(102,'Jyoti');");
            System.out.println("One recored inserted successfully");
            stmt.cancel();
            con.close();
        }catch (Exception exception){
            exception.getCause();
        }
        }
    }
