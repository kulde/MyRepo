
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class delete_stu extends javax.swing.JFrame {


    public delete_stu()
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(729,447);
         try {
            String rol="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from student";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                
               
                rol=rs.getString("rollno");              
                
                Jc1.addItem(rol);
               
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

        Jl0 = new javax.swing.JLabel();
        Jc1 = new javax.swing.JComboBox();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Jl4 = new javax.swing.JLabel();
        Jl5 = new javax.swing.JLabel();
        Jl6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl0.setText("        DELETE STUDENT");
        getContentPane().add(Jl0);
        Jl0.setBounds(220, 10, 271, 23);

        Jc1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jc1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jc1ItemStateChanged(evt);
            }
        });
        getContentPane().add(Jc1);
        Jc1.setBounds(10, 41, 106, 28);

        Jl1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        Jl1.setText(" ");
        getContentPane().add(Jl1);
        Jl1.setBounds(493, 130, 203, 36);

        Jl2.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        Jl2.setText(" ");
        getContentPane().add(Jl2);
        Jl2.setBounds(493, 184, 203, 35);

        Jl3.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        Jl3.setText(" ");
        getContentPane().add(Jl3);
        Jl3.setBounds(493, 237, 203, 37);

        Jb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb1.setText("DELETE");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(139, 341, 121, 31);

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
        jButton2.setBounds(639, 0, 90, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 0, 90, 23);

        Jl4.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        Jl4.setText("ROLL_NO");
        getContentPane().add(Jl4);
        Jl4.setBounds(139, 130, 171, 36);

        Jl5.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        Jl5.setText("DEPARTMENT");
        getContentPane().add(Jl5);
        Jl5.setBounds(139, 184, 171, 35);

        Jl6.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        Jl6.setText("STUDENT NAME");
        getContentPane().add(Jl6);
        Jl6.setBounds(139, 237, 171, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[delete_stu].jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jc1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jc1ItemStateChanged
        try {
            String rol="",dpt="",nm="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from student where rollno="+Jc1.getSelectedItem().toString()+"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                               
                rol=rs.getString("rollno");              
                dpt=rs.getString("department");
                nm=rs.getString("name"); 
                Jl1.setText(rol);
                Jl2.setText(dpt);
                Jl3.setText(nm);                        
              }
        }  
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
    }//GEN-LAST:event_Jc1ItemStateChanged

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
           try {
              String rol="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="delete  from student where rollno='"+Jc1.getSelectedItem().toString()+"' ";
              Statement st=con.createStatement();
              st.execute(q);            
               JOptionPane.showMessageDialog(this, "STUDENT RECORD DELETED");
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
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
      new student().setVisible(true);
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
            java.util.logging.Logger.getLogger(delete_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new delete_stu().setVisible(true);
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
    private javax.swing.JLabel Jl4;
    private javax.swing.JLabel Jl5;
    private javax.swing.JLabel Jl6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
