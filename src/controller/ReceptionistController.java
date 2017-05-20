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
import model.Nurse;
import model.Receptionist;

/**
 *
 * @author sanu
 */
public class ReceptionistController {
       public static boolean addReceptionist(Receptionist receptionist) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Receptionist(Receptionist_shift,Employee_Employee_id) values(?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       //preparedStatement.setObject(1, receptionist.getReceptionist_id());
       preparedStatement.setObject(1, receptionist.getReceptionist_shift());
       preparedStatement.setInt(2, EmployeeController.getLastEmployeeId());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
       
       public static boolean UpdateReceptionist(Receptionist receptionist) throws SQLException, ClassNotFoundException {
        String sql = "Update receptionist set  Receptionist_shift = ?, Employee_Employee_id = ? where Receptionist_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, receptionist.getReceptionist_shift());
            stm.setObject(2, receptionist.getEmployee_Employee_id());
            stm.setObject(3, receptionist.getReceptionist_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
       public static int getLastReceptionistId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Receptionist_id FROM receptionist ORDER BY Receptionist_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Receptionist_id");
        }
        return lastId;
    }
       public static Receptionist searchReceptionistDetail(String Receptionist_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from receptionist where Receptionist_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Receptionist_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Receptionist(rst.getInt("Receptionist_id"),rst.getInt("Employee_Employee_id"),rst.getString("Receptionist_shift"));
        }
        return null;
    }
}
