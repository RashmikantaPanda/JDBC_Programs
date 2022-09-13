import java.io.*;
import java.sql.*;

/*
    1.INSERT
    2.DISPLAY
 */

public class MyJDBC3 {
     Connection con=con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");;
     Statement st=con.createStatement();;
    String sql;
    ResultSet rs;
    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

    public MyJDBC3() throws SQLException {
    }

    void input() throws IOException {
        System.out.println("Enter the insert statement : ");
        sql=br.readLine();
    }
    void display() throws SQLException, IOException {
//        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
//        st=con.createStatement();
        System.out.println("Enter the display statement : ");
        sql=br.readLine();
       rs=st.executeQuery(sql);
        while (rs.next()) {
           // System.out.println(rs.getString("Student Name")+" --- "+rs.getString("Roll no."));
            System.out.println(rs.getString(1)+" --- "+rs.getString(2)+" --- "+rs.getString(3)+
                    " --- "+rs.getString(4));
        }
        rs.close();
//        con.close();
//        st.close();


    }

    void insert() throws SQLException, IOException {
        String ch="y";
      // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
      //  st=con.createStatement();
        while(ch.equals("y")){
            input();
            st.executeUpdate(sql);
            System.out.println("Do you want to insert more ? (y/n)");
            ch= br.readLine();

        }
    }

    public static void main(String[] args)throws Exception {
        MyJDBC3 obj1=new MyJDBC3();
//        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "rkpanda509");
//        st=con.createStatement();
        int a=1;
        while(a!=3){
            System.out.println("What you want to do ? \n1.INSERT\n2.DISPLAY");
            a=Integer.parseInt(br.readLine());
            switch(a){
                case 1 :
                    obj1.insert();
                    break;
                case 2 :
                    obj1.display();
                    break;
                case 3 :
                    a=3;
                    break;

                default :
                    System.out.println("Wrong Choice");
                    break;
            }
        }
        obj1.rs.close();
        obj1.st.close();
        obj1.con.close();
    }
}
