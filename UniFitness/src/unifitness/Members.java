/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unifitness;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import unifitness.Coachs;
/**
 *
 * @author Sergazy
 */
public class Members extends javax.swing.JFrame {
    public String CON = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    /**
     * Creates new form Members
     */
    public Members() {
        initComponents();
        DisplayMembers();
        GetCoachs();
    }
    Connection dbcon = null;
    PreparedStatement pdt = null;
    ResultSet rs = null, rs1 = null;
    PreparedStatement st = null, st1 = null;
    private void DisplayMembers() {
        try {
            dbcon = DriverManager.getConnection(CON, "hr","hr");
            st = dbcon.prepareStatement("select * from MEMBERS");
            rs = st.executeQuery();
            
            MEMBERS.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch(SQLException ex) {     
            System.out.println("displayMembers error: "+ex.getMessage());
        }
    }
    
    int coach_num = 0;
    private void GetCoachs() {
        try {
            dbcon = DriverManager.getConnection(CON, "hr", "hr");
            st = dbcon.prepareStatement("select * from COACHS");
            rs = st.executeQuery();
            while(rs.next()) {
                String CoachName = rs.getString("COACH_NAME");
                MEMBER_COACH.addItem(CoachName);
            }
        } catch(SQLException ex) {     
            System.out.println("getCoachs error: "+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MEMBER_NAME = new javax.swing.JTextField();
        MEMBER_PHONE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MEMBER_AGE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MEMBER_AMOUNT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MEMBER_GENDER = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        MEMBER_COACH = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        MEMBER_TIMING = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEMBERS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Git\\DB2-FinalProject\\UniFitness\\pics\\gymicon.png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logout");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Coachs");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Manage Members");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Member Name");

        MEMBER_NAME.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        MEMBER_PHONE.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Phone");

        MEMBER_AGE.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Age");

        MEMBER_AMOUNT.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Amount");

        MEMBER_GENDER.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        MEMBER_GENDER.setForeground(new java.awt.Color(255, 153, 0));
        MEMBER_GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        MEMBER_GENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMBER_GENDERActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Gender");

        MEMBER_COACH.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        MEMBER_COACH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        MEMBER_COACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMBER_COACHActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Coach");

        MEMBER_TIMING.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        MEMBER_TIMING.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00-8:00", "10:00-12:00", "14:00-16:00", "18:00-20:00", "22:00-00:00" }));
        MEMBER_TIMING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEMBER_TIMINGActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Timing");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Member List");

        EditBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        AddBtn.setText("ADD\n");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        MEMBERS.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        MEMBERS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MEMBERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEMBERSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MEMBERS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(MEMBER_NAME)
                            .addComponent(jLabel7)
                            .addComponent(MEMBER_PHONE)
                            .addComponent(jLabel8)
                            .addComponent(MEMBER_AGE)
                            .addComponent(jLabel9)
                            .addComponent(MEMBER_AMOUNT)
                            .addComponent(jLabel10)
                            .addComponent(MEMBER_GENDER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MEMBER_COACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MEMBER_TIMING, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114)
                                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGap(92, 92, 92)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MEMBER_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_TIMING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MEMBER_COACH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MEMBER_GENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMBER_GENDERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEMBER_GENDERActionPerformed

    private void MEMBER_COACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMBER_COACHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEMBER_COACHActionPerformed

    private void MEMBER_TIMINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEMBER_TIMINGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEMBER_TIMINGActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Coachs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Payments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
int member_num = 0;
    private void CountMembers() {
        try {
            dbcon = DriverManager.getConnection(CON, "hr", "hr");
            st1 = dbcon.prepareStatement("select MAX(MEMBER_ID) from MEMBERS");
            rs1 = st1.executeQuery();
            rs1.next();
            member_num = rs1.getInt(1)+1;
        } catch(SQLException ex) { 
            System.out.println(ex.getMessage());
        }    
        
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(MEMBER_NAME.getText().isEmpty() || MEMBER_PHONE.getText().isEmpty() || MEMBER_AGE.getText().isEmpty() || MEMBER_AMOUNT.getText().isEmpty() || MEMBER_GENDER.getSelectedIndex() == -1 || MEMBER_COACH.getSelectedIndex() == -1 || MEMBER_TIMING.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "MISSING INFO");
        }
        else {
            try {
                CountMembers();
                dbcon = DriverManager.getConnection(CON, "hr", "hr");
                PreparedStatement Add = dbcon.prepareStatement("INSERT INTO MEMBERS values(?,?,?,?,?,?,?,?)");
                Add.setInt(1, member_num);
                Add.setString(2, MEMBER_NAME.getText());
                Add.setString(3, MEMBER_PHONE.getText());
                Add.setInt(4, Integer.valueOf(MEMBER_AGE.getText()));
                Add.setInt(5, Integer.valueOf(MEMBER_AMOUNT.getText()));
                Add.setString(6, MEMBER_COACH.getSelectedItem().toString());
                Add.setString(7, MEMBER_TIMING.getSelectedItem().toString());
                Add.setString(8, MEMBER_GENDER.getSelectedItem().toString());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Member saved!");
                dbcon.close();
                DisplayMembers();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key == 0) {
            JOptionPane.showMessageDialog(this, "Select the MEMBER to edit!");
        } else {
            try {
               dbcon = DriverManager.getConnection(CON, "hr", "hr");
               String query = "Update MEMBERS set   MEMBER_NAME=?, MEMBER_PHONE=?, MEMBER_AGE=?, MEMBER_AMOUNT=?, MEMBER_COACH=?, MEMBER_TIMING=?, MEMBER_GENDER=? where MEMBER_ID=?";
               PreparedStatement edit = dbcon.prepareStatement(query);
               //edit.setInt(1, member_num);
               edit.setString(1, MEMBER_NAME.getText());
               edit.setString(2, MEMBER_PHONE.getText());
               edit.setInt(3, Integer.valueOf(MEMBER_AGE.getText()));
               edit.setInt(4, Integer.valueOf(MEMBER_AMOUNT.getText()));
               edit.setString(5, MEMBER_COACH.getSelectedItem().toString());
               edit.setString(6, MEMBER_TIMING.getSelectedItem().toString());
               edit.setString(7, MEMBER_GENDER.getSelectedItem().toString());
               edit.setInt(8,Key);
               int row = edit.executeUpdate();
               JOptionPane.showMessageDialog(this, "Member Updated!");
               dbcon.close();
               DisplayMembers();
            } catch(HeadlessException | NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked
int Key = 0;
    private void MEMBERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEMBERSMouseClicked
        DefaultTableModel model = (DefaultTableModel)MEMBERS.getModel();
        int MyIndex = MEMBERS.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        MEMBER_NAME.setText(model.getValueAt(MyIndex, 1).toString());
        MEMBER_PHONE.setText(model.getValueAt(MyIndex, 2).toString());
        MEMBER_AGE.setText(model.getValueAt(MyIndex, 3).toString());
        MEMBER_AMOUNT.setText(model.getValueAt(MyIndex, 4).toString());
        MEMBER_COACH.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        MEMBER_TIMING.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
        MEMBER_GENDER.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
    }//GEN-LAST:event_MEMBERSMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == 0) {
           JOptionPane.showMessageDialog(this, "Select the Member to DELETE");
        } else {
            try {
               dbcon = DriverManager.getConnection(CON, "hr", "hr");
               String query = "DELETE from MEMBERS where MEMBER_ID="+Key;
               PreparedStatement delete =  dbcon.prepareStatement(query);
               delete.executeQuery();
               JOptionPane.showMessageDialog(this, "Member DELETED");
               DisplayMembers();
            } catch(HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Members().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTable MEMBERS;
    private javax.swing.JTextField MEMBER_AGE;
    private javax.swing.JTextField MEMBER_AMOUNT;
    private javax.swing.JComboBox<String> MEMBER_COACH;
    private javax.swing.JComboBox<String> MEMBER_GENDER;
    private javax.swing.JTextField MEMBER_NAME;
    private javax.swing.JTextField MEMBER_PHONE;
    private javax.swing.JComboBox<String> MEMBER_TIMING;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
