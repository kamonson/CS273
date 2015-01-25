/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Custom Variables Year, Month, Day, Title, Body final DATE_FORMAT to check for
 * correct date if not throw exception handled with popup window with nice text
 *
 * @author kamonson17
 */
public class GUIEventTracker extends javax.swing.JDialog {

    EventManagerStreamManager EM = new EventManagerStreamManager();
    String Year;
    String Month;
    String Day;
    String Title;
    String Body;
    final static String DATE_FORMAT = "dd-MM-yyyy";

    /**
     * Creates new form GUIEventTracker
     */
    public GUIEventTracker(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTableLUTable.setAutoCreateRowSorter(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSpinnerAddMonth = new javax.swing.JSpinner();
        jSpinnerAddDay = new javax.swing.JSpinner();
        jSpinnerAddYear = new javax.swing.JSpinner();
        jTextFieldAddTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddBody = new javax.swing.JTextArea();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSpinnerLUMonth = new javax.swing.JSpinner();
        jSpinnerLUDay = new javax.swing.JSpinner();
        jSpinnerLUYear = new javax.swing.JSpinner();
        jButtonLU = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLUTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSpinnerAddMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerAddDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerAddYear.setModel(new javax.swing.SpinnerNumberModel(15, 15, 20, 1));

        jTextFieldAddTitle.setText("<Event Title>");

        jTextAreaAddBody.setColumns(20);
        jTextAreaAddBody.setRows(5);
        jTextAreaAddBody.setText("<Event Body\nFree text area to add addtional details about event>");
        jTextAreaAddBody.setToolTipText("");
        jScrollPane1.setViewportView(jTextAreaAddBody);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel1.setText("20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSpinnerAddMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerAddDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldAddTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerAddMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAddDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add", jPanel2);

        jSpinnerLUMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinnerLUDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerLUYear.setModel(new javax.swing.SpinnerNumberModel(15, 15, 20, 1));

        jButtonLU.setText("Look Up");
        jButtonLU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLUActionPerformed(evt);
            }
        });

        jTableLUTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Title", "Event Body (Time, Location, Details, etc)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableLUTable);

        jLabel2.setText("20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpinnerLUMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerLUDay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerLUYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButtonLU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerLUMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLUDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLUYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLU, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Look Up", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
     Add rows to table
     */

    //PT -- I'm not seeing new events. -10
    public void addRow(String C1, String C2) {
        DefaultTableModel model = (DefaultTableModel) jTableLUTable.getModel();
        model.addRow(new Object[]{C1, C2});
    }
    /*
     Clear table so that events don't stack up
     not used because it was not working correctly
     */

    public void ClearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableLUTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
        }
    }

    public void ZeroRow() {
        DefaultTableModel model = (DefaultTableModel) jTableLUTable.getModel();
        model.setRowCount(0);
    }

    /*
     Popup to handle wrong date exception
     */
    public static void Popup(String MSG) {
        JFrame popup = new JFrame("");
        JOptionPane.showMessageDialog(popup, MSG);
    }
    /*
     Checks to see if date correct if not throw exception
     */

    public static boolean CheckDate(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            Popup("That's not right!");
            return false;
        }
    }

    /*
     Add Events, check date accuracy 
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        EM.setRunningNumber();
        Year = "20" + String.valueOf(jSpinnerAddYear.getValue());
        Month = String.valueOf(jSpinnerAddMonth.getValue());
        Day = String.valueOf(jSpinnerAddDay.getValue());
        Title = jTextFieldAddTitle.getText();
        Body = jTextAreaAddBody.getText();
        if (CheckDate(Day + "-" + Month + "-" + Year)) {
            EM.addEvent(Year, Month, Day, Title, Body);
            EM.writeToStream();
        }
        this.jTextAreaAddBody.setText("");
        this.jTextFieldAddTitle.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed
    /*
     LookUp events, check date for accuracy
     known issue table does not clear after switching dates...could not get to correct
     */
    private void jButtonLUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLUActionPerformed
        this.ClearTable();
        EM.clearHM();
        Year = "20" + String.valueOf(jSpinnerLUYear.getValue());
        Month = String.valueOf(jSpinnerLUMonth.getValue());
        Day = String.valueOf(jSpinnerLUDay.getValue());
        if (CheckDate(Day + "-" + Month + "-" + Year)) {
            EM.readFromStream();
            this.ZeroRow();
            for (int i = 0; i < EM.getDaysEvents(Year, Month, Day).size(); i++) {
                addRow(EM.getDaysEvents(Year, Month, Day).get(i).getEventTitle(),
                        EM.getDaysEvents(Year, Month, Day).get(i).getEventBody());
            }
        }
// 
//        //jTextAreaAddBody.removeAll();
//        int i = jComboBoxLUTitle.getSelectedIndex();
//        Events e = EM.getDaysEvents(Year, Month, Day).get(i);
//        String b = e.getEventBody();
//        jTextAreaLUBody.setText(b);
    }//GEN-LAST:event_jButtonLUActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIEventTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEventTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEventTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEventTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIEventTracker dialog = new GUIEventTracker(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonLU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerAddDay;
    private javax.swing.JSpinner jSpinnerAddMonth;
    private javax.swing.JSpinner jSpinnerAddYear;
    private javax.swing.JSpinner jSpinnerLUDay;
    private javax.swing.JSpinner jSpinnerLUMonth;
    private javax.swing.JSpinner jSpinnerLUYear;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableLUTable;
    private javax.swing.JTextArea jTextAreaAddBody;
    private javax.swing.JTextField jTextFieldAddTitle;
    // End of variables declaration//GEN-END:variables
}
