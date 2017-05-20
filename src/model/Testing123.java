/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sanu
 */
public class Testing123 {
    public static boolean UpdateDoctor(Doctor doctor) throws SQLException, ClassNotFoundException {
        String sql = "Update doctor set docFirstName = ?, docLastName = ?, specialty = ?, degree = ?, docNic = ?, docAddress = ?, docContactNo =? where doctorId = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(8, doctor.getDoctorId());
            stm.setObject(1, doctor.getDocFirstName());
            stm.setObject(2, doctor.getDocLastName());
            stm.setObject(3, doctor.getSpecialty());
            stm.setObject(4, doctor.getDegree());
            stm.setObject(5, doctor.getDocNic());
            stm.setObject(6, doctor.getDocAddress());
            stm.setObject(7, doctor.getDocContactNo());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
}

