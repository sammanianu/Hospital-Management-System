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
import model.Bill;
import model.Nurse;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class BillController {
    public static boolean addBill(Bill bill ) throws SQLException, ClassNotFoundException{
       String sql = "Insert into bill(Medicine_charge,Room_charge,Operation_charge,Doctor_charge,Lab_charge,Nursing_charge,Advance,Date) values(?,?,?,?,?,?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       //preparedStatement.setObject(1, bill.getBill_id());
       
       preparedStatement.setObject(1, bill.getMedicine_charge());
       preparedStatement.setObject(2, bill.getRoom_charge());
       preparedStatement.setObject(3, bill.getOperation_charge());
       preparedStatement.setObject(4, bill.getDoctor_charge());
       preparedStatement.setObject(5, bill.getLab_charge());
       preparedStatement.setObject(6, bill.getNursing_charge());
       //preparedStatement.setObject(7, bill.getAdmission_Admission_id());
       preparedStatement.setObject(7, bill.getAdvance_amount());
       preparedStatement.setObject(8, bill.getDate());
       //preparedStatement.setObject(9, bill.getNet_amount());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    public static boolean UpdateBill(Bill bill) throws SQLException, ClassNotFoundException {
        String sql = "Update nurse set Medicine_charge=?,Room_charge=?,Operation_charge=?,Doctor_charge=?,Lab_charge=?,Nurse_charge=?,Advance=? where Bill_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, bill.getMedicine_charge());
            stm.setObject(2, bill.getRoom_charge());
            stm.setObject(3, bill.getOperation_charge());
            stm.setObject(4, bill.getDoctor_charge());
            stm.setObject(5, bill.getLab_charge());
            stm.setObject(6, bill.getNursing_charge());
            stm.setObject(7, bill.getAdvance_amount());
            stm.setObject(8, bill.getBill_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    
    public static int getLastBillId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Bill_id FROM bill ORDER BY Bill_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Bill_id");
        }
        return lastId;
    }
    
    public static Bill searchBillDetail(String Bill_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from bill where Bill_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Bill_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Bill(rst.getDouble("Medicine_charge"), rst.getDouble("Room_charge"), rst.getDouble("Operation_charge"), rst.getDouble("Doctor_charge"), rst.getDouble("Lab_charge"), rst.getDouble("Nursing_charge"));
        }
        return null;
    }
}
