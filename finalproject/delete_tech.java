
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

public class delete_tech extends javax.swing.JFrame 
{


    public delete_tech() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(675,426);
    
         try {
            String id="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from teacher";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                
               
                id=rs.getString("id");              
                
                Jc1.addItem(id);
               
              }   
        
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jc1 = new javax.swing.JComboBox();
        Jl0 = new javax.swing.JLabel();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jc1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jc1ItemStateChanged(evt);
            }
        });
        Jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jc1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jc1);
        Jc1.setBounds(25, 102, 98, 28);

        Jl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl0.setText("DELETE TEACHER");
        getContentPane().add(Jl0);
        Jl0.setBounds(248, 11, 158, 26);

        Jl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl1.setText(" ");
        getContentPane().add(Jl1);
        Jl1.setBounds(248, 99, 136, 35);

        Jl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl2.setText(" ");
        getContentPane().add(Jl2);
        Jl2.setBounds(248, 152, 136, 34);

        Jl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl3.setText(" ");
        getContentPane().add(Jl3);
        Jl3.setBounds(248, 204, 136, 31);

        Jb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jb1.setText("DELETE");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(44, 384, 112, 31);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 90, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(595, 0, 80, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 30, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[delete_teac].jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jc1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jc1ItemStateChanged
    /*--------------------------------------------------------------------------*/
        try {
            String id="",nm="",dpt="",des="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from teacher where id="+Jc1.getSelectedItem().toString()+"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                               
                nm=rs.getString("name");              
                dpt=rs.getString("department");
                des=rs.getString("designation"); 
                Jl1.setText(nm);
                Jl2.setText(dpt);
                Jl3.setText(des);                        
              }
        }  
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
    /*--------------------------------------------------------------------------*/
    }//GEN-LAST:event_Jc1ItemStateChanged

    private void Jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jc1ActionPerformed

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
     /*--------------------------------------------------------------------------*/
        try {
            String id="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="delete  from teacher where id='"+Jc1.getSelectedItem().toString()+"' ";
              Statement st=con.createStatement();
              st.execute(q);
              JOptionPane.showMessageDialog(this, "TEACHER RECORD DELETED");            
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
 /*--------------------------------------------------------------------------*/
    }//GEN-LAST:event_Jb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new home().setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new teacherframe().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) 
    {

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
            java.util.logging.Logger.getLogger(delete_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new delete_tech().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JComboBox Jc1;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl1;
    private javax.swing.JLabel Jl2;
    private javax.swing.JLabel Jl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
