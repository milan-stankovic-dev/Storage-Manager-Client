//package form.report;
package rs.np.storage_manager_client.form.report;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import rs.np.storage_manager_client.connection.Client;
import rs.np.storage_manager_common.domain.Product;
import rs.np.storage_manager_common.domain.ReportItem;

/**
 *
 * @author Milan
 */
public class EditCapacityForm extends javax.swing.JDialog {
private ReportForm parentDialog;
    /**
     * Creates new form EditCapacityForm
     */
    public EditCapacityForm(ReportForm parent, boolean modal) {
        super(parent, modal);
        initComponents();
        parentDialog = parent;
        setTitle("Alter product storage cap");
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewValue = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNewValue.setText("New value:");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNewValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConfirm))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewValue)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String userInput = txtValue.getText().trim();
        try {
            validateInput(userInput);
            changeTotalCap(userInput, parentDialog);
            parentDialog.setCapChanged(true);
            JOptionPane.showMessageDialog(this, "Total capacity edited successfully");
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(EditCapacityForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel lblNewValue;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables

    private void validateInput(String userInput) throws Exception {
        String errorLog = "";
        
        if(userInput == null || userInput.isEmpty()){
            errorLog += "Please input a valid numeric value.\n";
            throw new Exception(errorLog);
        }
        try{
            int inputNumber = Integer.parseInt(userInput);
            if(inputNumber<=0){
                errorLog += "The warehouse must house at least 1 unit for each product.\n";
            }
            List<Product> allProducts = Client.getInstance().getAllProducts();
            int maxValue = findMaxValueInStock(allProducts);
            if(inputNumber < maxValue){
                errorLog += "We have found items with higher stocks than inputted."
                        + " The highest found was " + maxValue + ". Please input a number greater than or same as "
                        + maxValue + ".";
            }
        }catch(NumberFormatException ex){
            errorLog += "Your input must contain a valid numeric value. Your input is either too large or not numeric.\n";
        }
        if(!"".equals(errorLog)){
            throw new Exception(errorLog);
        }
    }

    private int findMaxValueInStock(List<Product> allProducts) {
        if(allProducts == null || allProducts.isEmpty()){
            return Integer.MAX_VALUE;
        }
        int maxValue = allProducts.get(0).getAmount();
        if(maxValue == 0){
            return Integer.MAX_VALUE;
        }
        int listSize = allProducts.size();
        
        for(int i = 0;i<listSize;i++){
            if(allProducts.get(i).getAmount() > maxValue){
                maxValue = allProducts.get(i).getAmount();
            }
        }
        return maxValue;
    }

    private void changeTotalCap(String userInput, ReportForm parentDialog) {
        List<ReportItem> items = parentDialog.getReport().getReportItems();
        List<Product> products = new ArrayList<>();
        for(ReportItem reportItem : items){
            products.add(reportItem.getProduct());
        }
//        for(ReportItem item: items){
//            item.setTotalAvailableCapacity(Integer.valueOf(userInput));
//        }
          parentDialog.fillTable(products, Integer.valueOf(userInput));
          parentDialog.setCapChanged(true);
          parentDialog.fillTotalCapacity();
          parentDialog.adjustLabel();
    }

    public ReportForm getParentDialog() {
        return parentDialog;
    }

    public void setParentDialog(ReportForm parentDialog) {
        this.parentDialog = parentDialog;
    }

    public JLabel getLblNewValue() {
        return lblNewValue;
    }

    public void setLblNewValue(JLabel lblNewValue) {
        this.lblNewValue = lblNewValue;
    }

    public JTextField getTxtValue() {
        return txtValue;
    }

    public void setTxtValue(JTextField txtValue) {
        this.txtValue = txtValue;
    }

    public JButton getBtnConfirm() {
        return btnConfirm;
    }
    
}
