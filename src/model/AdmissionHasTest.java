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
public class AdmissionHasTest {
    private int Admission_Admission_id;
    private int Test_Test_id;

    public AdmissionHasTest() {
    }

    public AdmissionHasTest(int Admission_Admission_id, int Test_Test_id) {
        this.Admission_Admission_id = Admission_Admission_id;
        this.Test_Test_id = Test_Test_id;
    }

    public AdmissionHasTest(int Test_Test_id) {
        this.Test_Test_id = Test_Test_id;
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
     * @return the Test_Test_id
     */
    public int getTest_Test_id() {
        return Test_Test_id;
    }

    /**
     * @param Test_Test_id the Test_Test_id to set
     */
    public void setTest_Test_id(int Test_Test_id) {
        this.Test_Test_id = Test_Test_id;
    }
    
    
}
