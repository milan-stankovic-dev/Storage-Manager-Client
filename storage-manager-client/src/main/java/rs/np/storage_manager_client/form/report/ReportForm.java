//package form.report;
package rs.np.storage_manager_client.form.report;

import com.toedter.calendar.JDateChooser;

import rs.np.storage_manager_client.form.mode.FormMode;
import rs.np.storage_manager_client.form.model.ReportTableModel;
import rs.np.storage_manager_common.domain.Product;
import rs.np.storage_manager_common.domain.Report;
import rs.np.storage_manager_common.domain.ReportItem;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milan
 */
public class ReportForm extends javax.swing.JDialog {
private boolean capChanged;
private Report report;
FormMode mode;
    /**
     * Creates new form ReportForm
     */
    public ReportForm(JFrame parent, boolean modal, FormMode mode) {
        super(parent, modal);
        this.mode = mode;
//        capChanged = false;
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

        jCheckBox1 = new javax.swing.JCheckBox();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCapacity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        cbReports = new javax.swing.JComboBox<>();
        lblSearch = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnFind = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setText("STORAGE CAPACITY REPORT:*");

        jLabel2.setText("Report Date:");

        lblInfo.setForeground(new java.awt.Color(255, 0, 0));
        lblInfo.setText("*all products have a maximum storage capacity of 200. Click on the edit button to change this");

        jLabel4.setText("Total capacity available (in %):");

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblReport);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblSearch.setText("Search for report by date:");

        btnFind.setText("Find");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lblTitle))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbReports, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(465, 465, 465)
                                .addComponent(btnSubmit))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(jLabel2)
                    .addComponent(lblSearch))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new EditCapacityForm(this, true).setVisible(true);
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        
    }//GEN-LAST:event_btnSubmitActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Report> cbReports;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblReport;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables


    public void fillTotalCapacity() {
        try {
            
            double capacityUsed;
            List<Double> individualCapacities = calculateAllCapacities(report);
            capacityUsed = summarizeIndividualCapacities(individualCapacities);
            txtCapacity.setText(String.valueOf(Math.round((100.00 - capacityUsed)*100.0)/100.0));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private double summarizeIndividualCapacities(List<Double> individualCapacities) {
        double sum = 0;
        for(int i = 0;i<individualCapacities.size();i++){
            sum+=individualCapacities.get(i);
        }
        return (double)sum/individualCapacities.size();
    }
//
    public void setModel(Report report) {
        AbstractTableModel model = new ReportTableModel(report,this);
        tblReport.setModel(model);
    }

    public void fillTable(List<Product> products, int capacity) {
    try {
        //        setModel();
        this.report = new Report();
        int size = products.size();
        for(int i = 0;i<size;i++){
            ReportItem item = new ReportItem();
            item.setProduct(products.get(i));
            item.setProductCapacity((Double.valueOf(products.get(i).getAmount())/item.getTotalAvailableCapacity())*100);
            //item.setID(i);
            if(capacity != 0){
                item.setTotalAvailableCapacity(capacity);
            }
            item.setReportID(report.getReportDate());
            report.getReportItems().add(item);
        }
        setModel(report);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        report.setReportDate(format.parse(txtDate.getText()));
        //report.setTotalAvailableCapacity(totalCapAvailable);
        System.out.println(report);
    } catch (ParseException ex) {
        Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Date parsing exception " + ex.getMessage());
    }
    }

    public void adjustLabel() {
        if(capChanged == false)
            lblInfo.setVisible(true);
        else
            lblInfo.setVisible(false);
    }

    public boolean isCapChanged() {
        return capChanged;
    }

    public void setCapChanged(boolean capChanged) {
        this.capChanged = capChanged;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    private List<Double> calculateAllCapacities(Report report) {
        List<Double> responseList = new ArrayList<>();
        for(ReportItem item: report.getReportItems()){
            double value = item.calculateCapacity();
            responseList.add(value);
        }
        return responseList;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(JButton btnEdit) {
        this.btnEdit = btnEdit;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public JLabel getLblInfo() {
        return lblInfo;
    }

    public void setLblInfo(JLabel lblInfo) {
        this.lblInfo = lblInfo;
    }

    public JTextField getTxtCapacity() {
        return txtCapacity;
    }

    public void setTxtCapacity(JTextField txtCapacity) {
        this.txtCapacity = txtCapacity;
    }

    public JTextField getTxtDate() {
        return txtDate;
    }

    public void setTxtDate(JTextField txtDate) {
        this.txtDate = txtDate;
    }

    public JTable getTblReport() {
        return tblReport;
    }

    public void setTblReport(JTable tblReport) {
        this.tblReport = tblReport;
    }

    public FormMode getMode() {
        return mode;
    }

    public void setMode(FormMode mode) {
        this.mode = mode;
    }

    public JComboBox<Report> getCbReports() {
        return cbReports;
    }

    public void setCbReports(JComboBox<Report> cbReports) {
        this.cbReports = cbReports;
    }

    public JDateChooser getDateChooser() {
        return dateChooser;
    }

    public void setDateChooser(JDateChooser jDateChooser1) {
        this.dateChooser = jDateChooser1;
    }

    public JLabel getLblSearch() {
        return lblSearch;
    }

    public void setLblSearch(JLabel lblSearch) {
        this.lblSearch = lblSearch;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(JLabel lblTitle) {
        this.lblTitle = lblTitle;
    }

    public JButton getBtnFind() {
        return btnFind;
    }

    public void setBtnFind(JButton btnFind) {
        this.btnFind = btnFind;
    }
    
}
