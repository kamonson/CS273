/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.lang.Exception;

/**
 * The user interface for reviews, can add and look up reviews throws exception
 * if no rating or no name entered
 *
 * @author Kyle
 */
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * The user interface for reviews, can add and look up reviews throws exception
 * if no rating or no name entered
 *
 * @author Kyle
 */
public class Restaurant_Reviewer_GUI extends javax.swing.JFrame {

    private boolean isgood = false;
    private ArrayList<Reviews> reviewsArrayList = new ArrayList<Reviews>();
    private ArrayList<javax.swing.JButton> buttons = new ArrayList<javax.swing.JButton>();
    private Restaurant_Reviewer reviews = new Restaurant_Reviewer();
    private String name = "None";
    private String address = "None";
    private String notes = "None";
    private String rating = "None";
    private Exception ReviewerException;

    /**
     * Creates new form Restaurant_Reviewer_GUI
     */
    public Restaurant_Reviewer_GUI() {
        initComponents();
        this.UpdateComboBox();
    }

    public static void Popup(String MSG) {
        JFrame popup = new JFrame("");
        JOptionPane.showMessageDialog(popup, MSG);
    }

    public void UpdateComboBox() {
        reviews.readReview(this.reviewsArrayList);
        this.jComboBoxLUName.removeAllItems();
        for (int i = 0; i < this.reviewsArrayList.size(); i++) {
            this.jComboBoxLUName.addItem(this.reviewsArrayList.get(i).getName());
        }
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
        jPanel1 = new javax.swing.JPanel();
        jTextFieldAddName = new javax.swing.JTextField();
        jTextFieldAddAddress = new javax.swing.JTextField();
        jButton1Star = new javax.swing.JButton();
        jButton2Star = new javax.swing.JButton();
        jButton3Star = new javax.swing.JButton();
        jButton4Star = new javax.swing.JButton();
        jButton5Star = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddNotes = new javax.swing.JTextArea();
        jButtonAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxLUName = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLUAddress = new javax.swing.JTextField();
        jButton1StarLU = new javax.swing.JButton();
        jButton2StarLU = new javax.swing.JButton();
        jButton3StarLU = new javax.swing.JButton();
        jButton4StarLU = new javax.swing.JButton();
        jButton5StarLU = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaLUNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Restaurant Reviews");

        jTextFieldAddName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddNameActionPerformed(evt);
            }
        });

        jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N
        jButton1Star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1StarActionPerformed(evt);
            }
        });

        jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N
        jButton2Star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2StarActionPerformed(evt);
            }
        });

        jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N
        jButton3Star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3StarActionPerformed(evt);
            }
        });

        jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N
        jButton4Star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4StarActionPerformed(evt);
            }
        });

        jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N
        jButton5Star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5StarActionPerformed(evt);
            }
        });

        jLabel1.setText("is what you think of it.");

        jLabel2.setText("What place did you go to?");

        jLabel3.setText("Where was it at?");

        jTextAreaAddNotes.setColumns(20);
        jTextAreaAddNotes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddNotes);

        jButtonAdd.setText("Add Review");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Your thoughts on it?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldAddName)
            .addComponent(jTextFieldAddAddress)
            .addComponent(jScrollPane1)
            .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1Star, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2Star, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3Star, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4Star, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5Star, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2Star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5Star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3Star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4Star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1Star))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jTextFieldAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Add", jPanel1);

        jComboBoxLUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLUNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Which place do you want to look up?");

        jLabel6.setText("It was located here:");

        jButton1StarLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N

        jButton2StarLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N

        jButton3StarLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N

        jButton4StarLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N

        jButton5StarLU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png"))); // NOI18N

        jLabel8.setText("is what you rated it");

        jLabel7.setText("Your thoghts on it were:");

        jTextAreaLUNotes.setColumns(20);
        jTextAreaLUNotes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaLUNotes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldLUAddress)
            .addComponent(jComboBoxLUName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1StarLU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2StarLU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3StarLU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4StarLU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5StarLU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxLUName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLUAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3StarLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4StarLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5StarLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2StarLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1StarLU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Look Up", jPanel2);

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

    private void jTextFieldAddNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddNameActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        this.name = this.jTextFieldAddName.getText();
        this.address = this.jTextFieldAddAddress.getText();
        this.notes = this.jTextAreaAddNotes.getText();
        if ((this.name == "None") || (this.name == "") || (this.address == "None") || (this.notes == "None") || (this.rating == "None")) {
            try {
                throw ReviewerException;
            } catch (Exception ReviewerException) {
                Popup("Please Fill in ALL feilds before adding");
            }
        } else {
            this.reviews.addReview(this.name, this.address, this.notes, this.rating);

            this.jTextFieldAddName.setText("");
            this.jTextFieldAddAddress.setText("");
            this.jTextAreaAddNotes.setText("");
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
        }
        this.UpdateComboBox();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton1StarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1StarActionPerformed
        if (this.isgood == false) {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.rating = "1";
            this.isgood = true;
        } else {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.rating = "None";
            this.isgood = false;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1StarActionPerformed

    private void jButton5StarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5StarActionPerformed
        if (this.isgood == false) {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.rating = "5";
            this.isgood = true;
        } else {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.rating = "None";
            this.isgood = false;
        }
    }//GEN-LAST:event_jButton5StarActionPerformed

    private void jButton4StarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4StarActionPerformed
        if (this.isgood == false) {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.rating = "4";
            this.isgood = true;
        } else {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.rating = "None";
            this.isgood = false;
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton4StarActionPerformed

    private void jButton3StarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3StarActionPerformed
        if (this.isgood == false) {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.rating = "3";
            this.isgood = true;
        } else {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.rating = "None";
            this.isgood = false;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3StarActionPerformed

    private void jButton2StarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2StarActionPerformed
        if (this.isgood == false) {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            this.rating = "2";
            this.isgood = true;
        } else {
            this.jButton5Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton4Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton3Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton2Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.jButton1Star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            this.rating = "None";
            this.isgood = false;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2StarActionPerformed

    private void jComboBoxLUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLUNameActionPerformed
        if (this.jComboBoxLUName.getSelectedIndex() < 0) {
        } else {
            buttons.add(this.jButton1StarLU);
            buttons.add(this.jButton2StarLU);
            buttons.add(this.jButton3StarLU);
            buttons.add(this.jButton4StarLU);
            buttons.add(this.jButton5StarLU);
            this.jTextFieldLUAddress.setText(this.reviewsArrayList.get(this.jComboBoxLUName.getSelectedIndex()).getAddress());
            for (int i = 0; i < 5; i++) {
                this.buttons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/BlankStar.png")));
            }
            for (int i = 0; i < Integer.parseInt(this.reviewsArrayList.get(this.jComboBoxLUName.getSelectedIndex()).getRating()); i++) {
                this.buttons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw4/GoldStar.png")));
            }
            this.jTextAreaLUNotes.setText(this.reviewsArrayList.get(this.jComboBoxLUName.getSelectedIndex()).getNotes());
        }
    }//GEN-LAST:event_jComboBoxLUNameActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant_Reviewer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Reviewer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Reviewer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Reviewer_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_Reviewer_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Star;
    private javax.swing.JButton jButton1StarLU;
    private javax.swing.JButton jButton2Star;
    private javax.swing.JButton jButton2StarLU;
    private javax.swing.JButton jButton3Star;
    private javax.swing.JButton jButton3StarLU;
    private javax.swing.JButton jButton4Star;
    private javax.swing.JButton jButton4StarLU;
    private javax.swing.JButton jButton5Star;
    private javax.swing.JButton jButton5StarLU;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox jComboBoxLUName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaAddNotes;
    private javax.swing.JTextArea jTextAreaLUNotes;
    private javax.swing.JTextField jTextFieldAddAddress;
    private javax.swing.JTextField jTextFieldAddName;
    private javax.swing.JTextField jTextFieldLUAddress;
    // End of variables declaration//GEN-END:variables
}
