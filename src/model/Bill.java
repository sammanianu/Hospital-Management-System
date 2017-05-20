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
public class Bill {
    private int Bill_id;
    private int Admission_Admission_id;
    private double Medicine_charge;
    private double Room_charge;
    private double Operation_charge;
    private double Doctor_charge;
    private double Lab_charge;
    private double Nursing_charge;
    //private double No_of_dates;
    private double Advance_amount;
    private double Net_amount;
    private int Clerk_Clerk_id;
    private String Date;

    public Bill() {
    }

    public Bill(double Medicine_charge, double Room_charge, double Operation_charge, double Doctor_charge, double Lab_charge, double Nursing_charge) {
        //this.Bill_id = Bill_id;
        this.Medicine_charge = Medicine_charge;
        this.Room_charge = Room_charge;
        this.Operation_charge = Operation_charge;
        this.Doctor_charge = Doctor_charge;
        this.Lab_charge = Lab_charge;
        this.Nursing_charge = Nursing_charge;
        //this.No_of_dates = No_of_dates;
        //this.Advance_amount = Advance_amount;
        //this.Clerk_Clerk_id = Clerk_Clerk_id;
        //this.Date = Date;
    }

    public Bill(int Admission_Admission_id, double Medicine_charges, double Room_charges, double Operation_charges, double Doctor_charges, double Lab_charges, double Nursing_charges,double Advance_amount,String Date) {
        this.Admission_Admission_id = Admission_Admission_id;
        this.Medicine_charge = Medicine_charges;
        this.Room_charge = Room_charges;
        this.Operation_charge = Operation_charges;
        this.Doctor_charge = Doctor_charges;
        this.Lab_charge = Lab_charges;
        this.Nursing_charge = Nursing_charges;
        this.Advance_amount =Advance_amount;
        this.Date = Date;
    }

    public Bill(int Bill_id, int Admission_Admission_id, double Medicine_charge, double Room_charge, double Operation_charge, double Doctor_charge, double Lab_charge, double Nursing_charge, double Advance_amount, String Date) {
        this.Bill_id = Bill_id;
        this.Admission_Admission_id = Admission_Admission_id;
        this.Medicine_charge = Medicine_charge;
        this.Room_charge = Room_charge;
        this.Operation_charge = Operation_charge;
        this.Doctor_charge = Doctor_charge;
        this.Lab_charge = Lab_charge;
        this.Nursing_charge = Nursing_charge;
        this.Advance_amount = Advance_amount;
        //this.Net_amount = Net_amount;
        this.Date = Date;
    }

    
    /**
     * @return the Bill_id
     */
    public int getBill_id() {
        return Bill_id;
    }

    /**
     * @param Bill_id the Bill_id to set
     */
    public void setBill_id(int Bill_id) {
        this.Bill_id = Bill_id;
    }

    /**
     * @return the Admission_Admission_id
     */
    public int getAdmission_Admission_id() {
        return Admission_Admission_id;
    }

    /**
     * @param Admission_Admission_id the Admission_Admission_id to set
     */
    public void setAdmission_Admission_id(int Admission_Admission_id) {
        this.Admission_Admission_id = Admission_Admission_id;
    }

    /**
     * @return the Medicine_charge
     */
    public double getMedicine_charge() {
        return Medicine_charge;
    }

    /**
     * @param Medicine_charge the Medicine_charge to set
     */
    public void setMedicine_charge(double Medicine_charge) {
        this.Medicine_charge = Medicine_charge;
    }

    /**
     * @return the Room_charge
     */
    public double getRoom_charge() {
        return Room_charge;
    }

    /**
     * @param Room_charge the Room_charge to set
     */
    public void setRoom_charge(double Room_charge) {
        this.Room_charge = Room_charge;
    }

    /**
     * @return the Operation_charge
     */
    public double getOperation_charge() {
        return Operation_charge;
    }

    /**
     * @param Operation_charge the Operation_charge to set
     */
    public void setOperation_charge(double Operation_charge) {
        this.Operation_charge = Operation_charge;
    }

    /**
     * @return the Doctor_charge
     */
    public double getDoctor_charge() {
        return Doctor_charge;
    }

    /**
     * @param Doctor_charge the Doctor_charge to set
     */
    public void setDoctor_charge(double Doctor_charge) {
        this.Doctor_charge = Doctor_charge;
    }

    /**
     * @return the Lab_charge
     */
    public double getLab_charge() {
        return Lab_charge;
    }

    /**
     * @param Lab_charge the Lab_charge to set
     */
    public void setLab_charge(double Lab_charge) {
        this.Lab_charge = Lab_charge;
    }

    /**
     * @return the Nursing_charge
     */
    public double getNursing_charge() {
        return Nursing_charge;
    }

    /**
     * @param Nursing_charge the Nursing_charge to set
     */
    public void setNursing_charge(double Nursing_charge) {
        this.Nursing_charge = Nursing_charge;
    }

    /**
     * @return the Advance_amount
     */
    public double getAdvance_amount() {
        return Advance_amount;
    }

    /**
     * @param Advance_amount the Advance_amount to set
     */
    public void setAdvance_amount(double Advance_amount) {
        this.Advance_amount = Advance_amount;
    }

    /**
     * @return the Net_amount
     */
    public double getNet_amount() {
        return Net_amount;
    }

    /**
     * @param Net_amount the Net_amount to set
     */
    public void setNet_amount(double Net_amount) {
        this.Net_amount = Net_amount;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }


}
