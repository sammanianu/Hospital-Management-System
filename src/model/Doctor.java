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
public class Doctor extends Employee{
    private int Doctor_id;
    private String Qualifications;
    private int Employee_Employee_id;

    public Doctor() {
    }

    public Doctor(String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email,String Qualifications) {
        super(First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Qualifications = Qualifications;
    }

    public Doctor(int Doctor_id, int Employee_Employee_id, String Qualifications) {
        this.Doctor_id = Doctor_id;
        this.Employee_Employee_id = Employee_Employee_id;
        this.Qualifications = Qualifications;
    }

    public Doctor(int Doctor_id, String Qualifications, int Employee_Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(Employee_Employee_id,First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Doctor_id = Doctor_id;
        this.Qualifications = Qualifications;
        this.Employee_Employee_id = Employee_Employee_id;
    }

    
    
    /**
     * @return the Doctor_id
     */
    public int getDoctor_id() {
        return Doctor_id;
    }

    /**
     * @param Doctor_id the Doctor_id to set
     */
    public void setDoctor_id(int Doctor_id) {
        this.Doctor_id = Doctor_id;
    }

    /**
     * @return the Qualifications
     */
    public String getQualifications() {
        return Qualifications;
    }

    /**
     * @param Qualifications the Qualifications to set
     */
    public void setQualifications(String Qualifications) {
        this.Qualifications = Qualifications;
    }

    /**
     * @return the Employee_Employee_id
     */
    public int getEmployee_Employee_id() {
        return Employee_Employee_id;
    }

    /**
     * @param Employee_Employee_id the Employee_Employee_id to set
     */
    public void setEmployee_Employee_id(int Employee_Employee_id) {
        this.Employee_Employee_id = Employee_Employee_id;
    }

    
    
}

