import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.sql.*;

public class MyJDBC4 {
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
    Statement st=con.createStatement();
    PreparedStatement pst;
//    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public MyJDBC4() throws SQLException {
    }
    void insert() throws SQLException, IOException {
        String str="Insert into student values(?,?,?,?);";
        pst=con.prepareStatement(str);

        String ch="y";
        while(ch.equalsIgnoreCase("Y")){
            ch = "";
            String roll="";
            String name="";
            int age = 0;
            int mark = 0;
            System.out.println("Enter RollNo : ");
            roll=br.readLine();
            System.out.println("Enter Student Name : ");
            name=br.readLine();
            System.out.println("Enter age : ");
            age=Integer.parseInt(br.readLine());

            System.out.println("Enter mark : ");
            mark=Integer.parseInt(br.readLine());

            pst.setString(1,roll);
            pst.setString(2,name);
            pst.setInt(3,age);
            pst.setInt(4,mark);
            pst.executeUpdate();
            System.out.println("Do you want to Insert another ?y/n");
            ch=br.readLine();
        }

    }

    public static void main(String[] args) throws SQLException,IOException {
        MyJDBC4 obj1=new MyJDBC4();
        obj1.insert();

    }
}
