/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import plugin.Data;

/**
 *
 * @author MacBookPro
 */
public class ListStaff extends javax.swing.JFrame {

    /**
     * Creates new form MovieList
     */
    public ListStaff() {
        
        initComponents();
        addDocumentListener();
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

        btnCreateNew = new javax.swing.JButton();
        btnEditStaff = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new tableformajorcineplex.TableForMajorCineplex();
        txtSearch = new textfieldformajorcineplex.TextFieldForMajorCineplex();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List Staff");
        setAlwaysOnTop(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
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

        btnCreateNew.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnCreateNew.setForeground(new java.awt.Color(51, 51, 51));
        btnCreateNew.setText("Create New");
        btnCreateNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateNew.setFocusable(false);
        btnCreateNew.setPreferredSize(new java.awt.Dimension(150, 45));
        btnCreateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewActionPerformed(evt);
            }
        });

        btnEditStaff.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnEditStaff.setForeground(new java.awt.Color(51, 51, 51));
        btnEditStaff.setText("Edit");
        btnEditStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditStaff.setEnabled(false);
        btnEditStaff.setFocusable(false);
        btnEditStaff.setPreferredSize(new java.awt.Dimension(150, 45));
        btnEditStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStaffActionPerformed(evt);
            }
        });

        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Full Name", "Gender", "DoB", "Telephone", "Email", "Address", "Position", "Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
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
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtSearch.setText("Search");
        txtSearch.setTxtLabel("Search");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String staffIDSelected = "";
    
    Vector originalTableModel;
    DocumentListener documentListener;
    private void addDocumentListener() {
        documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                search();
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                search();
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                search();
            }

            private void search() {
                searchTableContents(txtSearch.getText());
            }
        };
    }

    
    public void searchTableContents(String searchString) {    
        try {
            DefaultTableModel currtableModel = (DefaultTableModel) table.getModel();
            //To empty the table before search
            currtableModel.setRowCount(0);
            //To search for contents from original table content
            for (Object rows : originalTableModel) {
                Vector rowVector = (Vector) rows;
                for (Object column : rowVector) {
                    if (column.toString().contains(searchString)) {
                        //content found so adding to table
                        currtableModel.addRow(rowVector);
                        break;
                    }
                }

            }
        } catch (Exception e) {
        }
    }
    
    private void tableColumn (){
        try {
            Statement statement = Data.getDataConnection().createStatement();
            ResultSet resultSetColumn = statement.executeQuery("DESCRIBE dbmajorcineplex.dbvListMovie");
            table.addRowResultSet(resultSetColumn);
            resultSetColumn.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void tableRow (){
        try {
            Statement statement = Data.getDataConnection().createStatement();
            ResultSet resultSetRow = statement.executeQuery("SELECT\n" +
            "tblstaff.StaffID,\n" +
            "tblstaff.StaffName,\n" +
            "tblstaff.Gender,\n" +
            "tblstaff.Birthdate,\n" +
            "tblstaff.Telephone,\n" +
            "tblstaff.Email,\n" +
            "tblstaff.Address,\n" +
            "tblposition.PositionName,\n" +
            "tblstaff.Salary,\n" +
            "tblstaff.`Status`\n" +
            "FROM\n" +
            "tblstaff\n" +
            "INNER JOIN tblposition ON tblstaff.PositionID = tblposition.PositionID");
            table.setRowCount(0);
            table.addRowResultSet(resultSetRow);
            resultSetRow.close();
            statement.close();
            originalTableModel = (Vector) ((DefaultTableModel) table.getModel()).getDataVector().clone();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Form Logo.png")));
        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer();
        defaultTableCellRenderer.setHorizontalAlignment(0);
        for (int i=0; i<table.getColumnCount(); i++)
            table.getColumnModel().getColumn(i).setCellRenderer(defaultTableCellRenderer);
        //tableColumn();
        tableRow();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCreateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewActionPerformed
        CreateStaff.main(null);
    }//GEN-LAST:event_btnCreateNewActionPerformed

    private void btnEditStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStaffActionPerformed
        EditStaff.main(null);
    }//GEN-LAST:event_btnEditStaffActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        table.clearSelection();
        btnEditStaff.setEnabled(false);
    }//GEN-LAST:event_formMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (txtSearch.getText().trim().equals("Search"))
            tableRow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if (txtSearch.getText().trim().equals("")){
            tableRow();
        } else
        txtSearch.getDocument().addDocumentListener(documentListener);
    }//GEN-LAST:event_txtSearchKeyTyped
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        staffIDSelected = table.getValueAt(table.getSelectedRow(), 0).toString();
        btnEditStaff.setEnabled(true);
        try {
            if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                evt.consume();
                EditStaff.main(null);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(ListStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNew;
    private javax.swing.JButton btnEditStaff;
    private javax.swing.JScrollPane jScrollPane1;
    private tableformajorcineplex.TableForMajorCineplex table;
    private textfieldformajorcineplex.TextFieldForMajorCineplex txtSearch;
    // End of variables declaration//GEN-END:variables
}
