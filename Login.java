/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import plugin.DataConnection;

/**
 *
 * @author MacBookPro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form jfLogin
     */
    public Login() throws IOException{
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("Image\\Background\\Log In\\backgroundLogIn.jpg")));
        setLayout(new FlowLayout());
        initComponents();
        
        
        //passwordfieldPassword.setEchoChar('•');
        textfieldUsername.setForeground(new Color(153,153,153));
        passwordfieldPassword.setForeground(new Color(153,153,153));
        passwordfieldPassword.setEchoChar((char)0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textfieldUsername = new javax.swing.JTextField();
        passwordfieldPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Major Cineplex - Log In");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        textfieldUsername.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        textfieldUsername.setForeground(new java.awt.Color(153, 153, 153));
        textfieldUsername.setText("Username");
        textfieldUsername.setCaretColor(new java.awt.Color(51, 51, 51));
        textfieldUsername.setCaretPosition(0);
        textfieldUsername.setMargin(new java.awt.Insets(2, 10, 2, 2));
        textfieldUsername.setPreferredSize(new java.awt.Dimension(300, 40));
        textfieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldUsernameFocusLost(evt);
            }
        });
        textfieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textfieldUsernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldUsernameKeyTyped(evt);
            }
        });

        passwordfieldPassword.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        passwordfieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        passwordfieldPassword.setText("Password");
        passwordfieldPassword.setCaretColor(new java.awt.Color(51, 51, 51));
        passwordfieldPassword.setMargin(new java.awt.Insets(2, 10, 2, 2));
        passwordfieldPassword.setPreferredSize(new java.awt.Dimension(300, 40));
        passwordfieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfieldPasswordFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldPasswordFocusGained(evt);
            }
        });
        passwordfieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordfieldPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordfieldPasswordKeyTyped(evt);
            }
        });

        cbShowPassword.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(204, 204, 204));
        cbShowPassword.setText("Show Password");
        cbShowPassword.setContentAreaFilled(false);
        cbShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbShowPassword.setFocusable(false);
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });
        cbShowPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbShowPasswordKeyPressed(evt);
            }
        });

        btnLogIn.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(191, 143, 0));
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.setFocusable(false);
        btnLogIn.setPreferredSize(new java.awt.Dimension(150, 50));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogInMousePressed(evt);
            }
        });
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        btnLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogInKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordfieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textfieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbShowPassword)
                        .addGap(76, 76, 76)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(textfieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String usernameForLabel = "";
    private String passwordForLabel = "";
    public static String userIDForLabel = "";
    public static String staffID = "";
    private boolean userDetector = false;
    private boolean pwDetector = false;
    private boolean wrongUser = false;
    private boolean userF = false;
    private boolean pwF = false;
    private String userID = "";
    
    
    
    private void wrongUser(){
        if (wrongUser){
            textfieldUsername.setForeground(new Color(255,102,102));
            textfieldUsername.setText("Wrong Username");
            userDetector = false;
            passwordfieldPassword.setForeground(new Color(255,102,102));
            passwordfieldPassword.setEchoChar((char)0);
            passwordfieldPassword.setText("Wrong Password");
            pwDetector = false;
            textfieldUsername.grabFocus();
            textfieldUsername.setCaretPosition(0);
        }
    }
    
    private void LogIn(){
        try {
            String username = textfieldUsername.getText().trim();
            String password = String.valueOf(passwordfieldPassword.getPassword());
            username = "root";
            password = "root";
            String server = "localhost:3306";
            String dbName = "dbmajorcineplex";
            DataConnection.connectionDB(username, password, dbName, server);
            usernameForLabel = textfieldUsername.getText().trim();
            passwordForLabel = String.valueOf(passwordfieldPassword.getPassword());
            if (!userDetector){
                usernameForLabel = "Manet";
                passwordForLabel = "Manet";
            }
            usernameDetector();
        } catch (Exception e){
        }
    }
    
    private void usernameDetector(){
        try {
            Statement statement = DataConnection.getDataConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dbmajorcineplex.tbluser;");
            if (resultSet.first()){
                do {
                    String username = resultSet.getString(2);
                    userID = resultSet.getString(1);
                    if (usernameForLabel.equals(username)){
                        userIDForLabel = resultSet.getString(4);
                        staffID = resultSet.getString("StaffID");
                        passwordDetector();
                        break;
                    } else {
                        wrongUser = true;
                        wrongUser();
                    }
                } while (resultSet.next());
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
        }
    }
    private void passwordDetector(){
        try {
            Statement statement = DataConnection.getDataConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dbmajorcineplex.tbluser;");
            if (resultSet.first()){
                do {
                    String password = resultSet.getString(3);
                    String userIDCompare = resultSet.getString(1);
//                    System.out.println("User ID "+userID);
//                    System.out.println("Compare "+userIDCompare);
                    if (passwordForLabel.equals(password) && userID.equals(userIDCompare)){
                        wrongUser = false;
                        MainMenu.main(null);
                        this.dispose();
                        //roleDetector();
                        break;
                    } else {
                        wrongUser = true;
                        wrongUser();
                    }
                } while (resultSet.next());
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
        }
    }
    
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        LogIn();
    }//GEN-LAST:event_btnLogInActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        if (pwDetector){
            if (cbShowPassword.isSelected()){
                passwordfieldPassword.setEchoChar((char)0);
            } else {
                passwordfieldPassword.setEchoChar('•');
            }
        }
        if (userF)
            textfieldUsername.grabFocus();
        else if (pwF)
            passwordfieldPassword.grabFocus();
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void textfieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldUsernameFocusGained
        userF = true;
        pwF = false;
        if (!userDetector){
            textfieldUsername.setCaretPosition(0);
        }
    }//GEN-LAST:event_textfieldUsernameFocusGained

    private void passwordfieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldPasswordFocusGained
        pwF = true;
        userF = false;
        if (!pwDetector){
            passwordfieldPassword.setCaretPosition(0);
        }
    }//GEN-LAST:event_passwordfieldPasswordFocusGained

    private void passwordfieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordfieldPasswordKeyTyped
        passwordfieldPassword.setForeground(Color.DARK_GRAY);
        if (!pwDetector){
            passwordfieldPassword.setText("");
            if (cbShowPassword.isSelected())
                passwordfieldPassword.setEchoChar((char)0);
            else
                passwordfieldPassword.setEchoChar('•');
            pwDetector = true;
        }
    }//GEN-LAST:event_passwordfieldPasswordKeyTyped

    private void textfieldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldUsernameKeyTyped
        textfieldUsername.setForeground(Color.DARK_GRAY);
        if (userDetector == false){
            textfieldUsername.setText("");
            userDetector = true;
        }
    }//GEN-LAST:event_textfieldUsernameKeyTyped

    private void textfieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldUsernameFocusLost
        String text = textfieldUsername.getText().trim();
        if (text.isEmpty() && wrongUser == false){
            textfieldUsername.setForeground(new Color(153,153,153));
            textfieldUsername.setText("Username");
            userDetector = false;
        } else if (text.isEmpty() && wrongUser == true){
            textfieldUsername.setForeground(new Color(255,102,102));
            textfieldUsername.setText("Wrong Username");
            userDetector = false;
        }
    }//GEN-LAST:event_textfieldUsernameFocusLost

    private void passwordfieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldPasswordFocusLost
        String text = String.valueOf(passwordfieldPassword.getPassword());
        if (text.isEmpty() && wrongUser == false){
            passwordfieldPassword.setForeground(new Color(153,153,153));
            passwordfieldPassword.setEchoChar((char)0);
            passwordfieldPassword.setText("Password");
            pwDetector = false;
        } else if (text.isEmpty() && wrongUser == true){
            passwordfieldPassword.setForeground(new Color(255,102,102));
            passwordfieldPassword.setEchoChar((char)0);
            passwordfieldPassword.setText("Wrong Password");
            pwDetector = false;
        }
    }//GEN-LAST:event_passwordfieldPasswordFocusLost

    private void textfieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            passwordfieldPassword.grabFocus();
        }
    }//GEN-LAST:event_textfieldUsernameKeyPressed

    private void passwordfieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordfieldPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            LogIn();
        }
    }//GEN-LAST:event_passwordfieldPasswordKeyPressed

    private void btnLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogInKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            LogIn();
        }
    }//GEN-LAST:event_btnLogInKeyPressed

    private void cbShowPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbShowPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(pwDetector){
                if (cbShowPassword.isSelected()){
                    cbShowPassword.setSelected(false);
                    cbShowPasswordActionPerformed(null);
                } else {
                    cbShowPassword.setSelected(true);
                    cbShowPasswordActionPerformed(null);
                }
            }
        }
    }//GEN-LAST:event_cbShowPasswordKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Form Logo.png")));
        try {
            btnLogIn.setContentAreaFilled(false);
            Image iconLogIn = ImageIO.read(getClass().getResource("/icon/iconLogIn.png"));
            btnLogIn.setIcon(new ImageIcon(iconLogIn));
            
        } catch (Exception e) {}
    }//GEN-LAST:event_formWindowOpened

    private void btnLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMousePressed
        try {
            btnLogIn.setContentAreaFilled(false);
            Image iconLogIn = ImageIO.read(getClass().getResource("/icon/iconLogIn-Pressed.png"));
            btnLogIn.setIcon(new ImageIcon(iconLogIn));
        } catch (Exception e) {}
    }//GEN-LAST:event_btnLogInMousePressed

    private void btnLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseEntered
        try {
            btnLogIn.setContentAreaFilled(false);
            Image iconLogIn = ImageIO.read(getClass().getResource("/icon/iconLogIn-Hovered.png"));
            btnLogIn.setIcon(new ImageIcon(iconLogIn));
        } catch (Exception e) {}
    }//GEN-LAST:event_btnLogInMouseEntered

    private void btnLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseExited
        try {
            btnLogIn.setContentAreaFilled(false);
            Image iconLogIn = ImageIO.read(getClass().getResource("/icon/iconLogIn.png"));
            btnLogIn.setIcon(new ImageIcon(iconLogIn));
        } catch (Exception e) {}
    }//GEN-LAST:event_btnLogInMouseExited

        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JPasswordField passwordfieldPassword;
    private javax.swing.JTextField textfieldUsername;
    // End of variables declaration//GEN-END:variables
}