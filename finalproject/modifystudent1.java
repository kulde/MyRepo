
package finalproject;
/*-------------------------------------------------------------------------*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
/*-------------------------------------------------------------------------*/

public class modifystudent1 extends javax.swing.JFrame 
{


    public modifystudent1() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(702,430);
        /*-------------------------------------------------------------------------*/  
        try {
            String roll="",dpt="",nm="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from student";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                          
                roll=rs.getString("rollno");              
              //  dpt=rs.getString("department");              
               // nm=rs.getString("name");              
                
                Jc1.addItem(roll);                              
              }           
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
        /*-------------------------------------------------------------------------*/
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jl0 = new javax.swing.JLabel();
        Jc1 = new javax.swing.JComboBox();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jt1 = new javax.swing.JTextField();
        Jt2 = new javax.swing.JTextField();
        Jt3 = new javax.swing.JTextField();
        Jb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl0.setText("MODIFY STUDENT");
        getContentPane().add(Jl0);
        Jl0.setBounds(236, 0, 206, 25);

        Jc1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        Jc1.setBounds(10, 59, 131, 28);

        Jl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl1.setText("ROLL_NO");
        getContentPane().add(Jl1);
        Jl1.setBounds(185, 87, 152, 27);

        Jl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl2.setText("DEPARTMENT");
        getContentPane().add(Jl2);
        Jl2.setBounds(185, 160, 152, 28);

        Jl3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl3.setText("STUDENT NAME");
        getContentPane().add(Jl3);
        Jl3.setBounds(185, 240, 152, 22);

        Jt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(355, 86, 137, 27);

        Jt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt2.setText(" ");
        getContentPane().add(Jt2);
        Jt2.setBounds(355, 160, 137, 28);

        Jt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt3.setText(" ");
        getContentPane().add(Jt3);
        Jt3.setBounds(355, 237, 137, 29);

        Jb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb1.setText("MODIFY");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(185, 319, 122, 33);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 70, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(622, 4, 80, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 0, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[modi_stu].jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
         try{ 
             String rol="",dpt="",nm=""; 
             
             rol=Jt1.getText();
             dpt=Jt2.getText();
             nm=Jt3.getText();
                   
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
             String qq="update student set rollno='"+rol+"',department='"+dpt+"',name='"+nm+"' where rollno='"+Jc1.getSelectedItem().toString()+"' ";
             Statement st=con.createStatement();
             st.execute(qq);
             JOptionPane.showMessageDialog(this, "UPDATED");
           }
        catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(this, ex);
         }  
            
    }//GEN-LAST:event_Jb1ActionPerformed

    private void Jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jc1ActionPerformed

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
               
                Jt1.setText(rol);
                Jt2.setText(dpt);
                Jt3.setText(nm);
                
              }   
        
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
            // TODO add your handling code here:
    }//GEN-LAST:event_Jc1ItemStateChanged

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
            java.util.logging.Logger.getLogger(modifystudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifystudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifystudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifystudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new modifystudent1().setVisible(true);
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
    private javax.swing.JTextField Jt1;
    private javax.swing.JTextField Jt2;
    private javax.swing.JTextField Jt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
