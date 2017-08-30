
package finalproject;
/*------------------------------------------------------------------------------------------*/  
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
/*------------------------------------------------------------------------------------------*/  


public class modifyte extends javax.swing.JFrame 
{
   String tn,dpt,des,id;
   
    public modifyte() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(755,493);
       try {
            String id="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from teacher";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                
               
                id=rs.getString("id");              
                
                jComboBox1.addItem(id);
               
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

        Jt1 = new javax.swing.JTextField();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jt2 = new javax.swing.JTextField();
        Jt3 = new javax.swing.JTextField();
        Jl4 = new javax.swing.JLabel();
        Jl0 = new javax.swing.JLabel();
        Jb1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(286, 141, 196, 31);

        Jl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl2.setText("NAME OF TEACHER");
        getContentPane().add(Jl2);
        Jl2.setBounds(131, 139, 137, 35);

        Jl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl3.setText("DEPARTMENT");
        getContentPane().add(Jl3);
        Jl3.setBounds(131, 213, 137, 35);

        Jt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jt2.setText(" ");
        getContentPane().add(Jt2);
        Jt2.setBounds(286, 213, 196, 35);

        Jt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jt3.setText(" ");
        Jt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jt3ActionPerformed(evt);
            }
        });
        getContentPane().add(Jt3);
        Jt3.setBounds(286, 296, 196, 37);

        Jl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl4.setText("DESIGNATION");
        getContentPane().add(Jl4);
        Jl4.setBounds(131, 296, 106, 37);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl0.setText("       MODIFY ");
        getContentPane().add(Jl0);
        Jl0.setBounds(265, 0, 114, 37);

        Jb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jb1.setText("OK");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(131, 440, 97, 31);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(522, 59, 189, 20);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(655, 0, 90, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 30, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[modi_teac].jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jt3ActionPerformed

    }//GEN-LAST:event_Jt3ActionPerformed

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed

        try{             
             tn=Jt1.getText();
             dpt=Jt2.getText();
             des=Jt3.getText();
                   
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
             String qq="update teacher set name='"+tn+"',department='"+dpt+"',designation='"+des+"' where id='"+jComboBox1.getSelectedItem()+"' ";
             Statement st=con.createStatement();
             st.execute(qq);
             JOptionPane.showMessageDialog(this, "UPDATED");
          }
        catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(this, ex);
         }  
      /*--------------------------------------------------------------*/  

    }//GEN-LAST:event_Jb1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    try {
            String id="",nm="",dpt="",des="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from teacher where id="+jComboBox1.getSelectedItem().toString()+"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                               
                nm=rs.getString("name");              
                dpt=rs.getString("department");
                des=rs.getString("designation"); 
                Jt1.setText(nm);
                Jt2.setText(dpt);
                Jt3.setText(des);
                
              }   
        
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(modifyte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new modifyte().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl2;
    private javax.swing.JLabel Jl3;
    private javax.swing.JLabel Jl4;
    private javax.swing.JTextField Jt1;
    private javax.swing.JTextField Jt2;
    private javax.swing.JTextField Jt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
