/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import plugin.Data;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import plugin.PanDateAlwaysOnTop;

/**
 *
 * @author MacBookPro
 */
public class CreateHolidayEvent extends javax.swing.JFrame {

    /**
     * Creates new form CreateMovie
     */
    public CreateHolidayEvent() {
        initComponents();
        txtHolidayEventID.setForeground(Color.DARK_GRAY);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHolidayEventID = new javax.swing.JTextField();
        txtDescription = new textfieldformajorcineplex.TextFieldForMajorCineplex();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new tableformajorcineplex.TableForMajorCineplex();
        btnSave = new javax.swing.JButton();
        btnSelectDate = new javax.swing.JButton();
        txtHolidayDate = new textfieldformajorcineplex.TextFieldForMajorCineplex();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Holiday Event");
        setAlwaysOnTop(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtHolidayEventID.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtHolidayEventID.setForeground(new java.awt.Color(153, 153, 153));
        txtHolidayEventID.setText("Holiday Event ID");
        txtHolidayEventID.setCaretColor(new java.awt.Color(51, 51, 51));
        txtHolidayEventID.setFocusable(false);
        txtHolidayEventID.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txtHolidayEventID.setPreferredSize(new java.awt.Dimension(200, 45));
        txtHolidayEventID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHolidayEventIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHolidayEventIDFocusLost(evt);
            }
        });
        txtHolidayEventID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHolidayEventIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHolidayEventIDKeyTyped(evt);
            }
        });

        txtDescription.setText("Description");
        txtDescription.setPreferredSize(new java.awt.Dimension(200, 45));
        txtDescription.setTxtLabel("Description");
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyTyped(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusable(false);
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 50));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 51, 51));
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusable(false);
        btnClear.setPreferredSize(new java.awt.Dimension(100, 50));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusable(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 50));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Holiday Event ID", "Holiday Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFocusable(false);
        table.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table.setRowHeight(25);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        btnSave.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 51));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusable(false);
        btnSave.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSelectDate.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnSelectDate.setForeground(new java.awt.Color(51, 51, 51));
        btnSelectDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconScheduleBlack.png"))); // NOI18N
        btnSelectDate.setContentAreaFilled(false);
        btnSelectDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectDate.setFocusable(false);
        btnSelectDate.setPreferredSize(new java.awt.Dimension(45, 45));
        btnSelectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDateActionPerformed(evt);
            }
        });

        txtHolidayDate.setText("Holiday Date");
        txtHolidayDate.setPreferredSize(new java.awt.Dimension(200, 45));
        txtHolidayDate.setTxtLabel("Holiday Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtHolidayEventID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtHolidayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHolidayEventID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHolidayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean holidayEventIDDetector = false;
    private boolean showDateDetector = false;
    private boolean descriptionDetector = false;
    private int counter = 0;
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Form Logo.png")));
        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
        defaultTableCellRenderer.setHorizontalAlignment(0);
        for (int i=0; i<table.getColumnCount(); i++)
            table.getColumnModel().getColumn(i).setCellRenderer(defaultTableCellRenderer);
        try {
            Statement statement = Data.getDataConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM dbmajorcineplex.tblholiday ORDER BY HolidayID DESC LIMIT 1;");
            String heIDString = "";
            int heID = 0;
            if (resultSet.first()){
                do {
                    heIDString = resultSet.getString(1);
                } while (resultSet.next());
                heID = 1+Integer.valueOf(heIDString);
            } else 
                heID = 1;
            txtHolidayEventID.setText(""+heID);
            counter = heID;
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtHolidayEventIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHolidayEventIDFocusGained
        if (!holidayEventIDDetector){
            txtHolidayEventID.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtHolidayEventIDFocusGained

    private void txtHolidayEventIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHolidayEventIDFocusLost
        String text = txtHolidayEventID.getText().trim();
        if (text.isEmpty()){
            txtHolidayEventID.setForeground(new Color(153,153,153));
            txtHolidayEventID.setText("Show Date");
            holidayEventIDDetector = false;
        }
    }//GEN-LAST:event_txtHolidayEventIDFocusLost

    private void txtHolidayEventIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHolidayEventIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtHolidayEventID.grabFocus();
        }
    }//GEN-LAST:event_txtHolidayEventIDKeyPressed

    private void txtHolidayEventIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHolidayEventIDKeyTyped
        txtHolidayEventID.setForeground(Color.DARK_GRAY);
        if (holidayEventIDDetector == false){
            txtHolidayEventID.setText("");
            holidayEventIDDetector = true;
        }
    }//GEN-LAST:event_txtHolidayEventIDKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!txtHolidayEventID.getText().trim().equals("Holiday Event ID")){
            if (!txtHolidayDate.getText().trim().equals("Holiday Event Date")){
                if (!txtDescription.getText().trim().equals("Description")){
                    String id = txtHolidayEventID.getText().trim();
                    String date = txtHolidayDate.getText().trim();
                    String description = txtDescription.getText().trim();
                    DefaultTableModel defaultTableModel = (DefaultTableModel)table.getModel();
                    String st[] = {id,date,description};
                    defaultTableModel.addRow(st);
                    counter++;
                    btnClearActionPerformed(null);
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (counter != 0)
            txtHolidayEventID.setText(""+counter);
        else {
            try {
                Statement statement = Data.getDataConnection().createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM dbmajorcineplex.tblholiday ORDER BY HolidayID DESC LIMIT 1;");
                String heIDString = "";
                int heID = 0;
                if (resultSet.first()){
                    do {
                        heIDString = resultSet.getString(1);
                    } while (resultSet.next());
                    heID = 1+Integer.valueOf(heIDString);
                } else 
                    heID = 1;
                txtHolidayEventID.setText(""+heID);
                counter = heID;
                resultSet.close();
                statement.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        txtHolidayDate.setText("");
        txtDescription.setText("");
        txtHolidayDate.grabFocus();
        txtDescription.grabFocus();
        txtHolidayDate.grabFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (table.getRowCount() > 0){
                Statement statement = Data.getDataConnection().createStatement();
                for (int i=0; i<table.getRowCount(); i++){
                    statement.execute("INSERT INTO dbmajorcineplex.tblholiday(HolidayDate,HolidayDescription) VALUES ('"+table.getValueAt(i, 1)+"','"+table.getValueAt(i, 2)+"');");
                }
                statement.close();
                table.setRowCount(0);
                btnClearActionPerformed(null);
                JOptionPane.showMessageDialog(this, "Saved!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        txtDescription.setForeground(Color.DARK_GRAY);
        if (descriptionDetector == false){
            txtDescription.setText("");
            descriptionDetector = true;
        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void txtDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDescription.grabFocus();
        }
    }//GEN-LAST:event_txtDescriptionKeyPressed

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        String text = txtDescription.getText().trim();
        if (text.isEmpty()){
            txtDescription.setForeground(new Color(153,153,153));
            txtDescription.setText("Description");
            descriptionDetector = false;
        }
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        if (!descriptionDetector){
            txtDescription.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtDescriptionFocusGained
    PanDateAlwaysOnTop dob;
    private void btnSelectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDateActionPerformed
        long millCurrent1 = System.currentTimeMillis();
        dob = new PanDateAlwaysOnTop(null, true);
        dob.setLocation(btnSelectDate);
        dob.setVisible(true);
        long millDOB = dob.getDate().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        txtHolidayDate.setForeground(Color.DARK_GRAY);
        showDateDetector = true;
        txtHolidayDate.setText(simpleDateFormat.format(dob.getDate()));
    }//GEN-LAST:event_btnSelectDateActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        table.clearSelection();
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(CreateHolidayEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateHolidayEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateHolidayEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateHolidayEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CreateHolidayEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelectDate;
    private javax.swing.JScrollPane jScrollPane1;
    private tableformajorcineplex.TableForMajorCineplex table;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtDescription;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtHolidayDate;
    private javax.swing.JTextField txtHolidayEventID;
    // End of variables declaration//GEN-END:variables
}
