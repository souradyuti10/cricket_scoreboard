/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketproj2021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Subhra CHOUDHURY
 */
public class tdsearched extends javax.swing.JFrame {

    /**
     * Creates new form tdsearched
     */
    public tdsearched() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ps1 = new javax.swing.JTextField();
        ps2 = new javax.swing.JTextField();
        ps6 = new javax.swing.JTextField();
        ps3 = new javax.swing.JTextField();
        ps4 = new javax.swing.JTextField();
        ps5 = new javax.swing.JTextField();
        ps8 = new javax.swing.JTextField();
        ps7 = new javax.swing.JTextField();
        ps11 = new javax.swing.JTextField();
        ps9 = new javax.swing.JTextField();
        ps10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("ENTER TEAM NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLAYER 1");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 45, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" THE PLAYER NAMES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 2, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PLAYER 2");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 82, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PLAYER 3");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 114, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLAYER 4");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 146, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PLAYER 5");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 178, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PLAYER 6");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PLAYER 7");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 242, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PLAYER 8");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 274, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PLAYER 9");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 311, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PLAYER 10");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 343, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PLAYER 11");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 375, -1, -1));

        ps1.setEditable(false);
        jPanel1.add(ps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 45, 220, -1));

        ps2.setEditable(false);
        ps2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps2ActionPerformed(evt);
            }
        });
        jPanel1.add(ps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 82, 220, -1));

        ps6.setEditable(false);
        jPanel1.add(ps6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 216, 220, -1));

        ps3.setEditable(false);
        jPanel1.add(ps3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 120, 220, -1));

        ps4.setEditable(false);
        jPanel1.add(ps4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 152, 220, -1));

        ps5.setEditable(false);
        jPanel1.add(ps5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 184, 220, -1));

        ps8.setEditable(false);
        jPanel1.add(ps8, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 280, 220, -1));

        ps7.setEditable(false);
        jPanel1.add(ps7, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 248, 220, -1));

        ps11.setEditable(false);
        jPanel1.add(ps11, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 381, 220, -1));

        ps9.setEditable(false);
        jPanel1.add(ps9, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 311, 220, -1));

        ps10.setEditable(false);
        jPanel1.add(ps10, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 349, 220, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketproj2021/tdsearched.jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 510, 430));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 11, -1, -1));

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 170, -1, -1));

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 221, 65, -1));

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select team---" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 12, 180, -1));

        jLabel15.setBackground(new java.awt.Color(255, 227, 159));
        jLabel15.setForeground(new java.awt.Color(255, 227, 159));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 120, 100));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     mainframe mf1 =new mainframe();
    mf1.setVisible(true);    
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    cb.setSelectedIndex(0);    
    ps1.setText(" "); 
    ps2.setText(" "); 
    ps3.setText(" ");
    ps4.setText(" "); 
    ps5.setText(" "); 
    ps6.setText(" "); 
    ps7.setText(" "); 
    ps8.setText(" "); 
    ps9.setText(" "); 
    ps10.setText(" "); 
    ps11.setText(" "); 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try{
       Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cricket","root","1192002");
            Statement stmt=con.createStatement();
            String str="select*From teamdetails where t_name='"+ cb.getSelectedItem()+"';";
       ResultSet rs=stmt.executeQuery(str);
       if(rs.next())
       {
           String n1=rs.getString("player1");
           String n2=rs.getString("player2");
           String n3=rs.getString("player3");
           String n4=rs.getString("player4");
           String n5=rs.getString("player5");
           String n6=rs.getString("player6");
           String n7=rs.getString("player7");
           String n8=rs.getString("player8");
           String n9=rs.getString("player9");
           String n10=rs.getString("player10");
           String n11=rs.getString("player11");
           ps1.setText(""+n1);
           ps2.setText(""+n2);
           ps3.setText(""+n3);
           ps4.setText(""+n4);
           ps5.setText(""+n5);
           ps6.setText(""+n6);
           ps7.setText(""+n7);
           ps8.setText(""+n8);
           ps9.setText(""+n9);
           ps10.setText(""+n10);
           ps11.setText(""+n11);
          
           
       }
       
   }catch(Exception e)
   {
       JOptionPane.showMessageDialog(null,e);
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ps2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try{
    Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cricket","root","1192002");
            Statement stmt=con.createStatement();
            String team="select t_name from teamdetails";
             ResultSet rs=stmt.executeQuery(team);
             while(rs.next())
             {
                 
                     String s=rs.getString("t_name");
                     cb.addItem(s);
                 }
                 
                 
             
            
            
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_formWindowOpened

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

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
            java.util.logging.Logger.getLogger(tdsearched.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tdsearched.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tdsearched.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tdsearched.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tdsearched().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField ps1;
    private javax.swing.JTextField ps10;
    private javax.swing.JTextField ps11;
    private javax.swing.JTextField ps2;
    private javax.swing.JTextField ps3;
    private javax.swing.JTextField ps4;
    private javax.swing.JTextField ps5;
    private javax.swing.JTextField ps6;
    private javax.swing.JTextField ps7;
    private javax.swing.JTextField ps8;
    private javax.swing.JTextField ps9;
    // End of variables declaration//GEN-END:variables
}
