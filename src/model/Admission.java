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
public class Admission {
    private int Admission_id;
    private String Date_admitted;
    private String Date_discharged;
    private int Doctor_Doctor_id;
    private int Ward_Ward_id;
    private int Patient_record_Patient_id;
    private int Bill_Bill_id;

    public Admission() {
    }

    public Admission(int Admission_id,String Date_admitted, String Date_discharged, int Doctor_Doctor_id, int Ward_Ward_id,int Patient_record_Patient_id) {
        this.Admission_id = Admission_id;
        this.Date_admitted = Date_admitted;
        this.Date_discharged = Date_discharged;
        this.Doctor_Doctor_id = Doctor_Doctor_id;
        this.Ward_Ward_id = Ward_Ward_id;
        this.Patient_record_Patient_id = Patient_record_Patient_id;
        //this.Bill_Bill_id = Bill_Bill_id;
    }

    public Admission(String Date_admitted, String Date_discharged){
        this.Date_admitted = Date_admitted;
        this.Date_discharged = Date_discharged;
    }

    public Admission(String Date_admitted, String Date_discharged, int Doctor_id, int Ward_id, int Patient_record_Patient_id) {
        this.Date_admitted = Date_admitted;
        this.Date_discharged = Date_discharged;
        this.Doctor_Doctor_id = Doctor_Doctor_id;
        this.Ward_Ward_id = Ward_Ward_id;
        this.Patient_record_Patient_id = Patient_record_Patient_id;
    }


    public Admission(int Patient_record_Patient_id, int Bill_Bill_id) {
        this.Patient_record_Patient_id = Patient_record_Patient_id;
        this.Bill_Bill_id = Bill_Bill_id;
    }

    /**
     * @return the Admission_id
     */
    public int getAdmission_id() {
        return Admission_id;
    }

    /**
     * @param Admission_id the Admission_id to set
     */
    public void setAdmission_id(int Admission_id) {
        this.Admission_id = Admission_id;
    }

    /**
     * @return the Date_admitted
     */
    public String getDate_admitted() {
        return Date_admitted;
    }

    /**
     * @param Date_admitted the Date_admitted to set
     */
    public void setDate_admitted(String Date_admitted) {
        this.Date_admitted = Date_admitted;
    }

    /**
     * @return the Date_discharged
     */
    public String getDate_discharged() {
        return Date_discharged;
    }

    /**
     * @param Date_discharged the Date_discharged to set
     */
    public void setDate_discharged(String Date_discharged) {
        this.Date_discharged = Date_discharged;
    }

    /**
     * @return the Doctor_Doctor_id
     */
    public int getDoctor_Doctor_id() {
        return Doctor_Doctor_id;
    }

    /**
     * @param Doctor_Doctor_id the Doctor_Doctor_id to set
     */
    public void setDoctor_Doctor_id(int Doctor_Doctor_id) {
        this.Doctor_Doctor_id = Doctor_Doctor_id;
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
     * @return the Patient_record_Patient_id
     */
    public int getPatient_record_Patient_id() {
        return Patient_record_Patient_id;
    }

    /**
     * @param Patient_record_Patient_id the Patient_record_Patient_id to set
     */
    public void setPatient_record_Patient_id(int Patient_record_Patient_id) {
        this.Patient_record_Patient_id = Patient_record_Patient_id;
    }

    /**
     * @return the Bill_Bill_id
     */
    public int getBill_Bill_id() {
        return Bill_Bill_id;
    }

    /**
     * @param Bill_Bill_id the Bill_Bill_id to set
     */
    public void setBill_Bill_id(int Bill_Bill_id) {
        this.Bill_Bill_id = Bill_Bill_id;
    }


    
}
