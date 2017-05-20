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
public class Nurse extends Employee {
    private int Nurse_id;
    private String Nurse_type;
    private int Ward_Ward_id;
    private int Employee_Employee_id;

    public Nurse() {
    }
    
    public Nurse(int Ward_Ward_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email,String Nurse_type) {
        super(First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        //this.Employee_Employee_id = Employee_Employee_id;
        this.Ward_Ward_id = Ward_Ward_id;
        this.Nurse_type = Nurse_type;
    }
    /*public Nurse(int Employee_Employee_id, int Ward_Ward_id, int Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contactno, String Registration_date, String Email) {
        super(Employee_id, First_name, Last_name, NIC, Address, Sex, Contactno, Registration_date, Email);
        this.Employee_Employee_id = Employee_Employee_id;
        this.Ward_Ward_id = Ward_Ward_id;
    }*/
    public Nurse(int Nurse_id, String Nurse_type, int Ward_Ward_id, int Employee_Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(Employee_Employee_id,First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Nurse_id = Nurse_id;
        this.Nurse_type = Nurse_type;
        this.Ward_Ward_id = Ward_Ward_id;
        this.Employee_Employee_id = Employee_Employee_id;
    }
    
    

    public Nurse(int Nurse_id, String Nurse_type, int Employee_Employee_id, int Ward_Ward_id) {
        this.Nurse_id = Nurse_id;
        this.Nurse_type = Nurse_type;
        this.Employee_Employee_id = Employee_Employee_id;
        this.Ward_Ward_id = Ward_Ward_id;
    }


    /**
     * @return the Nurse_id
     */
    public int getNurse_id() {
        return Nurse_id;
    }

    /**
     * @param Nurse_id the Nurse_id to set
     */
    public void setNurse_id(int Nurse_id) {
        this.Nurse_id = Nurse_id;
    }

    /**
     * @return the Nurse_type
     */
    public String getNurse_type() {
        return Nurse_type;
    }

    /**
     * @param Nurse_type the Nurse_type to set
     */
    public void setNurse_type(String Nurse_type) {
        this.Nurse_type = Nurse_type;
    }

    /**
     * @return the Ward_Ward_id
     */
    public int getWard_Ward_id() {
        return Ward_Ward_id;
    }

    /**
     * @param Ward_Ward_id the Ward_Ward_id to set
     */
    public void setWard_Ward_id(int Ward_Ward_id) {
        this.Ward_Ward_id = Ward_Ward_id;
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
