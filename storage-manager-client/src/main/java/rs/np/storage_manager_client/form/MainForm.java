//package form;
package rs.np.storage_manager_client.form;

import java.awt.event.ActionListener;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import rs.np.storage_manager_common.domain.User;

/**
 *
 * @author Milan
 */
public class MainForm extends javax.swing.JFrame {
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        super("Projektovanje softvera 2023");
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lblDisplay = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProduct = new javax.swing.JMenu();
        miCreateProduct = new javax.swing.JMenuItem();
        miSearchProducts = new javax.swing.JMenuItem();
        miDeleteProduct = new javax.swing.JMenuItem();
        miUpdateProduct = new javax.swing.JMenuItem();
        miShowAllProducts = new javax.swing.JMenuItem();
        menuNote = new javax.swing.JMenu();
        miCreateNote = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        miCreateReport = new javax.swing.JMenuItem();
        miSearchReport = new javax.swing.JMenuItem();
        menuBill = new javax.swing.JMenu();
        miCreateBill = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/np/storage_manager_client/image/image1.jpg"))); // NOI18N
        jLabel1.setAutoscrolls(true);

        lblDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDisplay.setText("Welcome to Storage Manager, ");

        menuProduct.setText("Product");

        miCreateProduct.setText("Create");
        miCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateProductActionPerformed(evt);
            }
        });
        menuProduct.add(miCreateProduct);

        miSearchProducts.setText("Search");
        miSearchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchProductsActionPerformed(evt);
            }
        });
        menuProduct.add(miSearchProducts);

        miDeleteProduct.setText("Delete");
        miDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteProductActionPerformed(evt);
            }
        });
        menuProduct.add(miDeleteProduct);

        miUpdateProduct.setText("Update");
        miUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUpdateProductActionPerformed(evt);
            }
        });
        menuProduct.add(miUpdateProduct);

        miShowAllProducts.setText("ShowAll");
        miShowAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miShowAllProductsActionPerformed(evt);
            }
        });
        menuProduct.add(miShowAllProducts);

        jMenuBar1.add(menuProduct);

        menuNote.setText("Goods received note");

        miCreateNote.setText("Create");
        miCreateNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateNoteActionPerformed(evt);
            }
        });
        menuNote.add(miCreateNote);

        jMenuBar1.add(menuNote);

        menuReport.setText("Report");

        miCreateReport.setText("Create");
        miCreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateReportActionPerformed(evt);
            }
        });
        menuReport.add(miCreateReport);

        miSearchReport.setText("Search");
        miSearchReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchReportActionPerformed(evt);
            }
        });
        menuReport.add(miSearchReport);

        jMenuBar1.add(menuReport);

        menuBill.setText("Bill of lading");

        miCreateBill.setText("Create");
        miCreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateBillActionPerformed(evt);
            }
        });
        menuBill.add(miCreateBill);

        jMenuBar1.add(menuBill);

        menuAbout.setText("About");

        miAbout.setText("About Software");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        menuAbout.add(miAbout);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(lblDisplay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblDisplay)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateProductActionPerformed
//        new ProductCreateForm(this, true).setVisible(true);
    }//GEN-LAST:event_miCreateProductActionPerformed

    private void miShowAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miShowAllProductsActionPerformed
        // TODO add your handling code here:
//        new ProductForm(this, true, FormMode.SELECT_ALL).setVisible(true);
    }//GEN-LAST:event_miShowAllProductsActionPerformed

    private void miSearchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchProductsActionPerformed
        // TODO add your handling code here:
//        new ProductForm(this, true, FormMode.SELECT).setVisible(true);
    }//GEN-LAST:event_miSearchProductsActionPerformed

    private void miDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteProductActionPerformed
        // TODO add your handling code here:
//        new ProductForm(this, true, FormMode.DELETE).setVisible(true);
    }//GEN-LAST:event_miDeleteProductActionPerformed

    private void miUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUpdateProductActionPerformed
        // TODO add your handling code here:
//        new ProductForm(this, true, FormMode.UPDATE).setVisible(true);
    }//GEN-LAST:event_miUpdateProductActionPerformed

    private void miCreateNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateNoteActionPerformed
        // TODO add your handling code here:
//        new GoodsReceivedNoteForm(this, true, FormMode.INSERT).setVisible(true);
    }//GEN-LAST:event_miCreateNoteActionPerformed

    private void miCreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateReportActionPerformed
        // TODO add your handling code here:
//        new ReportForm(this,true, FormMode.INSERT).setVisible(true);
    }//GEN-LAST:event_miCreateReportActionPerformed

    private void miCreateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateBillActionPerformed
        // TODO add your handling code here:
//        new BillOfLadingForm(this, true, FormMode.INSERT).setVisible(true);
    }//GEN-LAST:event_miCreateBillActionPerformed

    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "WIP");
    }//GEN-LAST:event_miAboutActionPerformed

    private void miSearchReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miSearchReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuBill;
    private javax.swing.JMenu menuNote;
    private javax.swing.JMenu menuProduct;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miCreateBill;
    private javax.swing.JMenuItem miCreateNote;
    private javax.swing.JMenuItem miCreateProduct;
    private javax.swing.JMenuItem miCreateReport;
    private javax.swing.JMenuItem miDeleteProduct;
    private javax.swing.JMenuItem miSearchProducts;
    private javax.swing.JMenuItem miSearchReport;
    private javax.swing.JMenuItem miShowAllProducts;
    private javax.swing.JMenuItem miUpdateProduct;
    // End of variables declaration//GEN-END:variables

    public void prepareForm(User user) {
        lblDisplay.setText(lblDisplay.getText() + user.getName() + ".");
    }

    public JMenuItem getMiCreateProduct() {
        return miCreateProduct;
    }

    public void setMiCreateProduct(JMenuItem miCreateProduct) {
        this.miCreateProduct = miCreateProduct;
    }

    public JMenu getMiCreateReport() {
        return menuReport;
    }

    public void setMiCreateReport(JMenu miCreateReport) {
        this.menuReport = miCreateReport;
    }

    public JMenuItem getMiDeleteProduct() {
        return miDeleteProduct;
    }

    public void setMiDeleteProduct(JMenuItem miDeleteProduct) {
        this.miDeleteProduct = miDeleteProduct;
    }

    public JMenuItem getMiSearchProducts() {
        return miSearchProducts;
    }

    public void setMiSearchProducts(JMenuItem miSearchProducts) {
        this.miSearchProducts = miSearchProducts;
    }

    public JMenuItem getMiShowAllProducts() {
        return miShowAllProducts;
    }

    public void setMiShowAllProducts(JMenuItem miShowAllProducts) {
        this.miShowAllProducts = miShowAllProducts;
    }

    public JMenuItem getMiUpdateProduct() {
        return miUpdateProduct;
    }

    public void setMiUpdateProduct(JMenuItem miUpdateProduct) {
        this.miUpdateProduct = miUpdateProduct;
    }
    
    public void miCreateProductActionListener(ActionListener al) {
        miCreateProduct.addActionListener(al);
    }
    
    public void miSelectProductActionListener(ActionListener al){
        miSearchProducts.addActionListener(al);
    }
    
    public void miUpdateProductActionListener(ActionListener al) {
        miUpdateProduct.addActionListener(al);
    }
    
    public void miDeleteProductActionListener(ActionListener al){
        miDeleteProduct.addActionListener(al);
    }
    
    public void miSelectAllProductsActionListener(ActionListener al){
        miShowAllProducts.addActionListener(al);
    }
    
    public void miCreateNoteActionListener(ActionListener al){
        miCreateNote.addActionListener(al);
    }
    
    public void miCreateReportActionListener(ActionListener al){
        miCreateReport.addActionListener(al);
    }
    
    public void miCreateBillActionListener(ActionListener al){
        miCreateBill.addActionListener(al);
    }
    
    public void miSearchReportActionListener(ActionListener al){
        miSearchReport.addActionListener(al);
    }
}