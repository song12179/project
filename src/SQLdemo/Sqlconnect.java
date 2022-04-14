package SQLdemo;

import java.sql.*;

public class Sqlconnect {
    public static void main(String []args){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String url="jdbc:mysql://localhost:3306/baby";
        String user = "root";
        String password = "root";
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "select id sid,first_name,salary from s_emp";
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
