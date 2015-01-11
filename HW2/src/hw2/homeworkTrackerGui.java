/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import javax.swing.DefaultListModel;

/**
 *
 * @author kamonson17
 */
public class homeworkTrackerGui extends javax.swing.JFrame {
private homeworkTracker h = new homeworkTracker();
    /**
     * Creates new form homeworkTracker
     */
    public homeworkTrackerGui() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listStudent = new javax.swing.JList();
        labelStudent = new javax.swing.JLabel();
        labelGrades = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textGrades = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelAddGrade = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textGrade = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listStudent.setModel(new DefaultListModel<String>() {
            public int getSize() { return h.getStudentCount(); }
            public String getElementAt(int i) { return h.getStudent(i); }
            //public void addElement(String s) {super.addElement(s);  h.addStudent(s); }
            public void add(int i, String s) { super.add(i, s); h.addStudentAt(i, s); }
        });
        listStudent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listStudent);

        labelStudent.setText("Student (click Name to view Max, Min and Avg grades)");

        labelGrades.setText("Grades");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Student Name");

        labelAddGrade.setText("Grade (seperated with comma)");

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(textGrade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(labelStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelGrades, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addComponent(textGrades, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAddGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(buttonAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStudent)
                    .addComponent(labelGrades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAdd)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        //((DefaultListModel)listGrades.getModel()).addElement(h.studentGrades.get(textName.getText()).getGrades().toString());
        
    }//GEN-LAST:event_textNameActionPerformed
    
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        student s = new student(textName.getText(), (textGrades.getText().split(",")));
        h.setStudentGrades(s.getName(), s);
        ((DefaultListModel)listStudent.getModel()).addElement(s.getName());
    }//GEN-LAST:event_buttonAddActionPerformed

    private void listStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStudentMouseClicked
       //listGrades.removeAll();
        String s1 = String.valueOf(h.studentGrades.get((String)listStudent.getModel().getElementAt(listStudent.getSelectedIndex())).getMax());
        String s2 = String.valueOf(h.studentGrades.get((String)listStudent.getModel().getElementAt(listStudent.getSelectedIndex())).getMin());
        String s3 = String.valueOf(h.studentGrades.get((String)listStudent.getModel().getElementAt(listStudent.getSelectedIndex())).getAvg());
        textGrade.setText("Max: " + " " + s1 + "\n" + ("Min: " + s2) + "\n" + "Avg: " + s3);
//((DefaultListModel)listGrades.getModel()).addElement(h.studentGrades.get((String)listStudent.getModel().getElementAt(listStudent.getSelectedIndex())).getMax());
       //((DefaultListModel)listGrades.getModel()).addElement(h.studentGrades.get(textName.getText()).getMin());
       //((DefaultListModel)listGrades.getModel()).addElement(h.studentGrades.get(textName.getText()).getAvg());
       //((DefaultListModel)listGrades.getModel()).addElement("Test");
    }//GEN-LAST:event_listStudentMouseClicked

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
            java.util.logging.Logger.getLogger(homeworkTrackerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeworkTrackerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeworkTrackerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeworkTrackerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeworkTrackerGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAddGrade;
    private javax.swing.JLabel labelGrades;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JList listStudent;
    private javax.swing.JTextPane textGrade;
    private javax.swing.JTextField textGrades;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}