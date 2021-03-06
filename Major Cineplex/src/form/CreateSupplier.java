/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static form.CreateMovie.status;
import java.sql.Statement;
import plugin.PanDateAlwaysOnTop;
import plugin.Data;

/**
 *
 * @author MacBookPro
 */
public class CreateSupplier extends javax.swing.JFrame {

    /**
     * Creates new form CreateMovie
     */
    public CreateSupplier() {
        initComponents();
        txtTelephone.setForeground(new Color(153,153,153));
        txtEmail.setForeground(new Color(153,153,153));
        //txtActor.setForeground(new Color(153,153,153));
        //txtSource.setForeground(new Color(153,153,153));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        txtTelephone = new textfieldformajorcineplex.TextFieldForMajorCineplex();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtSupplierName = new textfieldformajorcineplex.TextFieldForMajorCineplex();
        txtContactName = new textfieldformajorcineplex.TextFieldForMajorCineplex();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Staff");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Email");
        txtEmail.setCaretColor(new java.awt.Color(51, 51, 51));
        txtEmail.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txtEmail.setPreferredSize(new java.awt.Dimension(636, 45));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtTelephone.setText("Telephone ");
        txtTelephone.setToolTipText("");
        txtTelephone.setNumber(true);
        txtTelephone.setPreferredSize(new java.awt.Dimension(125, 45));
        txtTelephone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelephoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelephoneFocusLost(evt);
            }
        });
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtAddress.setLineWrap(true);
        txtAddress.setRows(1);
        txtAddress.setTabSize(4);
        txtAddress.setText("Address");
        txtAddress.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txtAddress.setPreferredSize(new java.awt.Dimension(636, 112));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        btnClear.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 51, 51));
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusable(false);
        btnClear.setPreferredSize(new java.awt.Dimension(150, 50));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(51, 51, 51));
        btnCreate.setText("Create");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.setFocusable(false);
        btnCreate.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtSupplierName.setText("Supplier Name");
        txtSupplierName.setPreferredSize(new java.awt.Dimension(200, 45));
        txtSupplierName.setTxtLabel("Supplier Name");

        txtContactName.setText("Contact Name");
        txtContactName.setPreferredSize(new java.awt.Dimension(200, 45));
        txtContactName.setTxtLabel("Contact Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean nameDetector = false;
    private boolean genderDetector = false;
    private boolean telephoneDetector = false;
    private boolean emailDetector = false;
    private boolean dateofbirthDetector = false;
    private boolean positionDetector = false;
    private boolean addressDetector = false;
    public static boolean created = false;
    
    
    public static String profilePhotoPath = "";
    public static String name = "";
    public static String gender = "";
    public static String telephone = "";
    public static String email = "";
    public static String dateofbirth = "";
    public static String position = "";
    public static String status = "";
    public static String salary = "";
    public static String address = "";
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Form Logo.png")));
    }//GEN-LAST:event_formWindowOpened

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            String supplierName = txtSupplierName.getText().trim();
            String contactName = txtContactName.getText().trim();
            String tel = txtTelephone.getText().trim();
            String email = txtEmail.getText().trim();
            String address = txtAddress.getText().trim();
            Statement statement = Data.getDataConnection().createStatement();
            statement.execute("INSERT INTO dbmajorcineplex.tblsupplier (SupplierName, ContactName, Telephone, Address, Email) VALUES ('"+supplierName+"','"+contactName+"',"+tel+",'"+address+"','"+email+"');");
            statement.close();
            JOptionPane.showMessageDialog(this, "Supplier Created.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
//        try {
//            Image image = ImageIO.read(getClass().getReposition("/poster/Captain America - Civil War.png"));
//            lbMoviePoster.setIcon(new ImageIcon(image));
//        } catch (Exception e) {
//        }
        txtContactName.setText("");
        txtContactName.grabFocus();
        txtTelephone.setText("");
        txtTelephoneFocusLost(null);
        txtEmail.setText("");
        txtEmailFocusLost(null);
        txtAddress.setText("");
        txtAddressFocusLost(null);
        nameDetector = false;
        txtSupplierName.setText("");
        txtSupplierName.grabFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTelephoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelephoneFocusLost
        String text = txtTelephone.getText().trim();
        if (text.isEmpty()){
            txtTelephone.setForeground(new Color(153,153,153));
            txtTelephone.setText("Telephone");
            telephoneDetector = false;
        }
    }//GEN-LAST:event_txtTelephoneFocusLost

    private void txtTelephoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelephoneFocusGained
        if (!telephoneDetector){
            txtTelephone.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtTelephoneFocusGained

    private void txtTelephoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtTelephone.grabFocus();
        }
    }//GEN-LAST:event_txtTelephoneKeyPressed

    private void txtTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped
        txtTelephone.setForeground(Color.DARK_GRAY);
        if (telephoneDetector == false){
            txtTelephone.setText("");
            telephoneDetector = true;
        }
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        txtEmail.setForeground(Color.DARK_GRAY);
        if (emailDetector == false){
            txtEmail.setText("");
            emailDetector = true;
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEmail.grabFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String text = txtEmail.getText().trim();
        if (text.isEmpty()){
            txtEmail.setForeground(new Color(153,153,153));
            txtEmail.setText("Email");
            emailDetector = false;
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (!emailDetector){
            txtEmail.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        if (!addressDetector){
            txtAddress.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        String text = txtAddress.getText().trim();
        if (text.isEmpty()){
            txtAddress.setForeground(new Color(153,153,153));
            txtAddress.setText("Address");
            addressDetector = false;
        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtAddress.grabFocus();
        }
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        txtAddress.setForeground(Color.DARK_GRAY);
        if (addressDetector == false){
            txtAddress.setText("");
            addressDetector = true;
        }
    }//GEN-LAST:event_txtAddressKeyTyped

    PanDateAlwaysOnTop dob;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (created)
            btnClearActionPerformed(null);
        created = false;
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtContactName;
    private javax.swing.JTextField txtEmail;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtSupplierName;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtTelephone;
    // End of variables declaration//GEN-END:variables
}
