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
public class Receptionist extends Employee {
    private int Receptionist_id;
    private String Receptionist_shift;
    private int Employee_Employee_id;
    
    public Receptionist() {
    }
    
    public Receptionist(String Receptionist_shift, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Receptionist_shift = Receptionist_shift;
    }   

    public Receptionist(int Receptionist_id, int Employee_Employee_id, String Receptionist_shift) {
        this.Receptionist_id = Receptionist_id;
        this.Employee_Employee_id = Employee_Employee_id;
        this.Receptionist_shift = Receptionist_shift;
    }

    public Receptionist(int Receptionist_id, String Receptionist_shift, int Employee_Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(Employee_Employee_id,First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Receptionist_id = Receptionist_id;
        this.Receptionist_shift = Receptionist_shift;
        this.Employee_Employee_id = Employee_Employee_id;
    }

      
    /**
     * @return the Receptionist_id
     */
    public int getReceptionist_id() {
        return Receptionist_id;
    }

    /**
     * @param Receptionist_id the Receptionist_id to set
     */
    public void setReceptionist_id(int Receptionist_id) {
        this.Receptionist_id = Receptionist_id;
    }

    /**
     * @return the Receptionist_shift
     */
    public String getReceptionist_shift() {
        return Receptionist_shift;
    }

    /**
     * @param Receptionist_shift the Receptionist_shift to set
     */
    public void setReceptionist_shift(String Receptionist_shift) {
        this.Receptionist_shift = Receptionist_shift;
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
