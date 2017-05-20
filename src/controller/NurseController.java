/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import database.DBConnection;
import java.sql.ResultSet;
import model.Nurse;
import model.Patient_record;


public class NurseController {
   public static boolean addNurse(Nurse nurse ) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Nurse(Nurse_type,Employee_Employee_id,Ward_Ward_id) values(?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       preparedStatement.setString(1, nurse.getNurse_type());
       preparedStatement.setInt(2, EmployeeController.getLastEmployeeId());
       preparedStatement.setInt(3, nurse.getWard_Ward_id());
    
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
   
   public static boolean UpdateNurse(Nurse nurse) throws SQLException, ClassNotFoundException {
        String sql = "Update nurse set  Nurse_type = ?, Employee_Employee_id = ?, Ward_Ward_id = ? where Nurse_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, nurse.getNurse_type());
            stm.setObject(2, nurse.getEmployee_Employee_id());
            stm.setObject(3, nurse.getWard_Ward_id());
            stm.setObject(4, nurse.getNurse_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
       public static int getLastNurseId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Nurse_id FROM nurse ORDER BY Nurse_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Nurse_id");
        }
        return lastId;
    }

    public static Nurse searchNurseDetail(String Nurse_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from nurse where Nurse_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Nurse_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Nurse(rst.getInt("Nurse_id"), rst.getString("Nurse_type"),  rst.getInt("Employee_Employee_id"),rst.getInt("Ward_Ward_id"));
        }
        return null;
    }
}
