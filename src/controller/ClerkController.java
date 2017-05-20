/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.DBConnection;
import java.sql.ResultSet;
import model.Clerk;
import model.Employee;
import model.Nurse;
import model.Receptionist;

/**
 *
 * @author sanu
 */
public class ClerkController {
    public static boolean addClerk(Clerk clerk) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Clerk(Employee_Employee_id) values(?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       preparedStatement.setInt(1, EmployeeController.getLastEmployeeId());
      
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    
    public static int getLastClerkId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Clerk_id FROM clerk ORDER BY Clerk_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Clerk_id");
        }
        return lastId;
    }
    public static boolean UpdateClerk(Clerk clerk) throws SQLException, ClassNotFoundException {
        String sql = "Update clerk set  Employee_Employee_id = ? where Clerk_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, clerk.getEmployee_Employee_id());
            stm.setObject(2, clerk.getClerk_id());
            

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    public static Clerk searchClerkDetail(String Clerk_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from clerk where Clerk_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Clerk_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Clerk(rst.getInt("Clerk_id"), rst.getInt("Employee_Employee_id"));
        }
        return null;
    }
}

