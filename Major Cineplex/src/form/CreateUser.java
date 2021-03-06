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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static form.CreateMovie.status;
import java.util.ArrayList;
import plugin.Data;

/**
 *
 * @author MacBookPro
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Creates new form CreateMovie
     */
    public CreateUser() {
        initComponents();
        txtStaffID.setForeground(new Color(153,153,153));
        txtPassword.setForeground(new Color(153,153,153));
        txtCPassword.setForeground(new Color(153,153,153));
        txtUsername.setForeground(new Color(153,153,153));
        //cbSelectStaff.setForeground(new Color(153,153,153));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStaffID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new textfieldformajorcineplex.TextFieldForMajorCineplex();
        cbSelectRole = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        cbSelectStaff = new javax.swing.JComboBox<>();
        txtCPassword = new textfieldformajorcineplex.TextFieldForMajorCineplex();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create User");
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

        txtStaffID.setEditable(false);
        txtStaffID.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtStaffID.setForeground(new java.awt.Color(153, 153, 153));
        txtStaffID.setText("Staff ID");
        txtStaffID.setCaretColor(new java.awt.Color(51, 51, 51));
        txtStaffID.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txtStaffID.setPreferredSize(new java.awt.Dimension(200, 45));
        txtStaffID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStaffIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStaffIDFocusLost(evt);
            }
        });
        txtStaffID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStaffIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStaffIDKeyTyped(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Username");
        txtUsername.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUsername.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txtUsername.setPreferredSize(new java.awt.Dimension(200, 45));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        txtPassword.setText("Password");
        txtPassword.setPreferredSize(new java.awt.Dimension(125, 45));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        cbSelectRole.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cbSelectRole.setForeground(new java.awt.Color(51, 51, 51));
        cbSelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   Role" }));
        cbSelectRole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSelectRole.setFocusable(false);
        cbSelectRole.setPreferredSize(new java.awt.Dimension(200, 45));

        btnClear.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 51, 51));
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusable(false);
        btnClear.setPreferredSize(new java.awt.Dimension(100, 45));
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
        btnCreate.setPreferredSize(new java.awt.Dimension(100, 45));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnClear2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnClear2.setForeground(new java.awt.Color(51, 51, 51));
        btnClear2.setText("New Staff");
        btnClear2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear2.setFocusable(false);
        btnClear2.setPreferredSize(new java.awt.Dimension(100, 45));
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        cbSelectStaff.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cbSelectStaff.setForeground(new java.awt.Color(51, 51, 51));
        cbSelectStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   Staff Name" }));
        cbSelectStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSelectStaff.setFocusable(false);
        cbSelectStaff.setPreferredSize(new java.awt.Dimension(200, 45));
        cbSelectStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectStaffActionPerformed(evt);
            }
        });

        txtCPassword.setText("Confirm Password");
        txtCPassword.setPreferredSize(new java.awt.Dimension(125, 45));
        txtCPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPasswordFocusLost(evt);
            }
        });
        txtCPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPasswordKeyTyped(evt);
            }
        });

        try {
            String query = "SELECT rolename FROM tblrole";
            Statement st = Data.getDataConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.first())
            do {
                cbSelectRole.addItem(rs.getString(1));
            }
            while (rs.next());
            rs.close();
            st.close();
        } catch (Exception e) {
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSelectStaff, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean staffIDDetector = false;
    private boolean staffNameDetector = false;
    private boolean passwordDetector = false;
    private boolean cpasswordDetector = false;
    private boolean userNameDetector = false;
    private boolean roleDetector = false;
    
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
    
    private ArrayList<String> staffIDs = new ArrayList<>();
    
    private void getUser(){
        try {
            staffIDs.clear();
            Statement statement = Data.getDataConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT StaffID FROM dbmajorcineplex.tbluser;");
            if (resultSet.first()){
                do {
                    staffIDs.add(resultSet.getString(1));
                } while (resultSet.next());
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
        }
    }
    
    
    private void getStaff(){
        try {
            cbSelectStaff.removeAllItems();
            cbSelectStaff.addItem("   Staff Name");
            Statement statement = Data.getDataConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT StaffID, StaffName FROM dbmajorcineplex.tblstaff;");
            if (resultSet.first()){
                do {
                    if (!staffIDs.contains(resultSet.getString(1))){
                        cbSelectStaff.addItem("   "+resultSet.getString(2));
                    }
                } while (resultSet.next());
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
        }

    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Form Logo.png")));
        getUser();
        getStaff();
    }//GEN-LAST:event_formWindowOpened

    private void txtStaffIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStaffIDFocusGained
        if (!staffIDDetector){
            txtStaffID.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtStaffIDFocusGained

    private void txtStaffIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStaffIDFocusLost
        String text = txtStaffID.getText().trim();
        if (text.isEmpty()){
            txtStaffID.setForeground(new Color(153,153,153));
            txtStaffID.setText("Staff ID");
            staffIDDetector = false;
        }
    }//GEN-LAST:event_txtStaffIDFocusLost

    private void txtStaffIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStaffIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtStaffID.grabFocus();
        }
    }//GEN-LAST:event_txtStaffIDKeyPressed

    private void txtStaffIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStaffIDKeyTyped
        txtStaffID.setForeground(Color.DARK_GRAY);
        if (staffIDDetector == false){
            txtStaffID.setText("");
            staffIDDetector = true;
        }
    }//GEN-LAST:event_txtStaffIDKeyTyped

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (!txtStaffID.getText().equals("Staff ID")){
            if (!txtUsername.getText().equals("Username")){
                if(txtPassword.getText().equals(txtCPassword.getText())){
                    if (!cbSelectRole.getSelectedItem().equals("   Role")){
                        try {
                            Statement statement = Data.getDataConnection().createStatement();
                            statement.execute("INSERT INTO dbmajorcineplex.tbluser (StaffID,Username,Password,RoleID) VALUES "
                                    + "                                             ("+txtStaffID.getText().trim()+",'"+txtUsername.getText().trim()+"','"+txtPassword.getText().trim()+"',"+cbSelectRole.getSelectedIndex()+");");
                            statement.close();
                            JOptionPane.showMessageDialog(this, "User Created");
                            btnClearActionPerformed(null);
                        } catch (Exception e) {
                        }
                    } else
                        JOptionPane.showMessageDialog(this, "Please Select Role.");
                } else
                    JOptionPane.showMessageDialog(this, "Password Doesn't Match.");
            } else
                JOptionPane.showMessageDialog(this, "Please Insert Username.");
        } else
            JOptionPane.showMessageDialog(this, "Please Select Staff.");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
//        try {
//            Image image = ImageIO.read(getClass().getReposition("/poster/Captain America - Civil War.png"));
//            lbMoviePoster.setIcon(new ImageIcon(image));
//        } catch (Exception e) {
//        }
        
        txtStaffID.setText("");
        txtStaffIDFocusLost(null);
        cbSelectStaff.setSelectedItem("   Staff Name");
        txtPassword.setText("");
        txtPasswordFocusLost(null);
        txtUsername.setText("");
        txtUsernameFocusLost(null);
        txtPassword.setText("");
        txtPasswordFocusLost(null);
        txtCPassword.setText("");
        txtCPasswordFocusLost(null);
        cbSelectRole.setSelectedItem("   Role");
        staffIDDetector = false;
        txtStaffID.grabFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        txtUsername.setForeground(Color.DARK_GRAY);
        if (userNameDetector == false){
            txtUsername.setText("");
            userNameDetector = true;
        }
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtUsername.grabFocus();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        String text = txtUsername.getText().trim();
        if (text.isEmpty()){
            txtUsername.setForeground(new Color(153,153,153));
            txtUsername.setText("Username");
            userNameDetector = false;
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (!userNameDetector){
            txtUsername.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        txtPassword.setForeground(Color.DARK_GRAY);
        if (passwordDetector == false){
            txtPassword.setText("");
            passwordDetector = true;
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPassword.grabFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        String text = txtPassword.getText().trim();
        if (text.isEmpty()){
            txtPassword.setForeground(new Color(153,153,153));
            txtPassword.setText("Password");
            passwordDetector = false;
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (!passwordDetector){
            txtPassword.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        CreateStaff.main(null);
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void txtCPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPasswordFocusGained
        if (!cpasswordDetector){
            txtCPassword.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtCPasswordFocusGained

    private void txtCPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPasswordFocusLost
        String text = txtCPassword.getText().trim();
        if (text.isEmpty()){
            txtCPassword.setForeground(new Color(153,153,153));
            txtCPassword.setText("Confirm Password");
            cpasswordDetector = false;
        }
    }//GEN-LAST:event_txtCPasswordFocusLost

    private void txtCPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPassword.grabFocus();
        }
    }//GEN-LAST:event_txtCPasswordKeyPressed

    private void txtCPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPasswordKeyTyped
        txtCPassword.setForeground(Color.DARK_GRAY);
        if (cpasswordDetector == false){
            txtCPassword.setText("");
            cpasswordDetector = true;
        }
    }//GEN-LAST:event_txtCPasswordKeyTyped

    private void cbSelectStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectStaffActionPerformed
        try {
            if (cbSelectStaff.getSelectedIndex() == 0){
                txtStaffID.setText("");
                txtStaffIDFocusLost(null);
            } else {
                Statement statement = Data.getDataConnection().createStatement();
                String staffName = cbSelectStaff.getSelectedItem().toString().trim();
                ResultSet resultSet = statement.executeQuery("SELECT StaffID FROM dbmajorcineplex.tblstaff WHERE tblstaff.StaffName = '"+staffName+"';");
                if (resultSet.first()){
                    do {
                        txtStaffID.setText(resultSet.getString(1));
                        txtStaffID.setForeground(Color.DARK_GRAY);
                    } while (resultSet.next());
                }
                resultSet.close();
                statement.close();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbSelectStaffActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        getUser();
        getStaff();
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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cbSelectRole;
    private javax.swing.JComboBox<String> cbSelectStaff;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtCPassword;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
