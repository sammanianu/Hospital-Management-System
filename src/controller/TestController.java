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
import model.Test;

/**
 *
 * @author sanu
 */
public class TestController {
    public static boolean addTest(Test test) throws SQLException, ClassNotFoundException{
       String sql = "Insert into test(Doctor_Doctor_id,Category,Description,Date,results) values(?,?,?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
     
       preparedStatement.setObject(1, test.getDoctor_id());
       preparedStatement.setObject(2, test.getCategory());
       preparedStatement.setObject(3, test.getDescription());
       preparedStatement.setObject(4, test.getDate());
       preparedStatement.setObject(5, test.getResults());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    public static boolean UpdateTest(Test test) throws SQLException, ClassNotFoundException {
        String sql = "Update test set  Date = ?, Category = ?, Doctor_Doctor_id = ?, Description=?, Results=? where Test_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, test.getDate());
            stm.setObject(2, test.getCategory());
            stm.setObject(3, test.getDoctor_id());
            stm.setObject(4, test.getDescription());
            stm.setObject(5, test.getResults());
            stm.setObject(6, test.getTest_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    
    public static int getLastTestId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Test_id FROM test ORDER BY Test_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Test_id");
        }
        return lastId;
    }
    public static Test searchTestDetail(String Test_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from test where Test_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Test_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Test(rst.getInt("Doctor_Doctor_id"), rst.getString("Category"), rst.getString("Description"),rst.getString("Date"),rst.getString("Results"));
        }
        return null;
    }
}
