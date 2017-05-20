/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author sanu
 */
public class BillDetailForm extends javax.swing.JPanel {

    /**
     * Creates new form BillDetailForm
     */
    public BillDetailForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        billDetailPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        billIdLabel = new javax.swing.JLabel();
        medicineChargeLabel = new javax.swing.JLabel();
        roomChargeLabel = new javax.swing.JLabel();
        operationChargeLabel = new javax.swing.JLabel();
        doctorChargeLabel = new javax.swing.JLabel();
        labChargeLabel = new javax.swing.JLabel();
        nursingChargeLabel = new javax.swing.JLabel();
        advanceLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Bill Detail Form");

        jLabel2.setText("Bill Id");

        jLabel3.setText("Medecine Charge");

        jLabel4.setText("Room Charge");

        jLabel5.setText("Operation Charge");

        jLabel6.setText("Doctor Charge");

        jLabel7.setText("Lab Charge");

        jLabel8.setText("Nursing Charge");

        jLabel9.setText("Advance");

        jLabel10.setText("Date");

        billIdLabel.setText("------------------------------------------------");

        medicineChargeLabel.setText("-------------------------------------------------");

        roomChargeLabel.setText("------------------------------------------------");

        operationChargeLabel.setText("------------------------------------------------");

        doctorChargeLabel.setText("------------------------------------------------");

        labChargeLabel.setText("------------------------------------------------");

        nursingChargeLabel.setText("------------------------------------------------");

        advanceLabel.setText("----------------------------------------------------");

        dateLabel.setText("---------------------------------------------------");

        javax.swing.GroupLayout billDetailPanelLayout = new javax.swing.GroupLayout(billDetailPanel);
        billDetailPanel.setLayout(billDetailPanelLayout);
        billDetailPanelLayout.setHorizontalGroup(
            billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billDetailPanelLayout.createSequentialGroup()
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billDetailPanelLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel1))
                    .addGroup(billDetailPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(52, 52, 52)
                        .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicineChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(operationChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nursingChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(64, 64, 64)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(advanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        billDetailPanelLayout.setVerticalGroup(
            billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billDetailPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(billIdLabel)
                    .addComponent(advanceLabel))
                .addGap(43, 43, 43)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(medicineChargeLabel)
                    .addComponent(dateLabel))
                .addGap(36, 36, 36)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roomChargeLabel))
                .addGap(38, 38, 38)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(operationChargeLabel))
                .addGap(33, 33, 33)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(doctorChargeLabel))
                .addGap(36, 36, 36)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labChargeLabel))
                .addGap(39, 39, 39)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nursingChargeLabel))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel advanceLabel;
    private javax.swing.JPanel billDetailPanel;
    public static javax.swing.JLabel billIdLabel;
    public static javax.swing.JLabel dateLabel;
    public static javax.swing.JLabel doctorChargeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel labChargeLabel;
    public static javax.swing.JLabel medicineChargeLabel;
    public static javax.swing.JLabel nursingChargeLabel;
    public static javax.swing.JLabel operationChargeLabel;
    public static javax.swing.JLabel roomChargeLabel;
    // End of variables declaration//GEN-END:variables
}