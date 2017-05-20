/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.LoginUser;
import model.Login;

/**
 *
 * @author sanu
 */
public class LoginController {
    public static boolean addLogin(Login login ) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Login(Employee_Employee_id,User_name,Password) values(?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       preparedStatement.setInt(1, login.getEmployee_Employee_id());
       preparedStatement.setString(2, login.getUser_name());
       preparedStatement.setString(3, login.getPassword());
    
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    
    public static Login searchLoginDetail(String Employee_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from login where Employee_Employee_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Employee_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Login(rst.getInt("Employee_Employee_id"),rst.getString("User_name"), rst.getString("Password"));
        }
        return null;
    }
}
