/*-------------------------------FRAME 3--------------------------------------*/
/*----------------------------------------------------------------------------*/

package finalproject;
/*-------------------------------------------------------------------------------------------------*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*-------------------------------------------------------------------------------------------------*/

public class student extends javax.swing.JFrame 
{
   String roll,dpt,nm;

    public student() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(723,484);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jl0 = new javax.swing.JLabel();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jt1 = new javax.swing.JTextField();
        Jt2 = new javax.swing.JTextField();
        Jt3 = new javax.swing.JTextField();
        Jb1 = new javax.swing.JButton();
        Jb2 = new javax.swing.JButton();
        Jb3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl0.setText("        STUDENT");
        getContentPane().add(Jl0);
        Jl0.setBounds(240, 11, 205, 38);

        Jl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl1.setText("STUDENT ROLL_NO");
        getContentPane().add(Jl1);
        Jl1.setBounds(164, 111, 161, 31);

        Jl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl2.setText("DEPARTMENT");
        getContentPane().add(Jl2);
        Jl2.setBounds(164, 188, 161, 29);

        Jl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl3.setText("STUDENT NAME");
        getContentPane().add(Jl3);
        Jl3.setBounds(164, 268, 161, 31);

        Jt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(343, 111, 166, 31);

        Jt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jt2.setText(" ");
        getContentPane().add(Jt2);
        Jt2.setBounds(343, 188, 166, 29);

        Jt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jt3.setText(" ");
        getContentPane().add(Jt3);
        Jt3.setBounds(343, 268, 166, 31);

        Jb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jb1.setText("ADD");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(164, 369, 109, 33);

        Jb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jb2.setText("MODIFY");
        Jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb2);
        Jb2.setBounds(314, 369, 109, 33);

        Jb3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jb3.setText("DELETE");
        Jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb3);
        Jb3.setBounds(484, 369, 113, 33);

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
        jButton2.setBounds(638, 0, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[user-addd].jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
  /*-------------------------------------------------------------------------------------------------*/
        if(Jt1.getText().equals(" ") && Jt2.getText().equals(" ") )
     {JOptionPane.showMessageDialog(this, "PLEASE ENTER VALUES TO SUBMIT");}
     else
      {   
        try
       {
          roll=Jt1.getText();
          dpt=Jt2.getText();          
          nm=Jt3.getText();
          
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "insert into student values('"+roll+"','"+dpt+"','"+nm+"',curdate(),curtime())";
           Statement st=con.createStatement();
           st.execute(q);
           JOptionPane.showMessageDialog(this, "SUCCESSFULLY REGISTERED");
         
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
      }   
       /*-------------------------------------------------------------------------------------------------*/
    
    }//GEN-LAST:event_Jb1ActionPerformed

    private void Jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb2ActionPerformed
     new  modifystudent1().setVisible(true);
       dispose();
    }//GEN-LAST:event_Jb2ActionPerformed

    private void Jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb3ActionPerformed
       new delete_stu().setVisible(true);
       dispose();
    }//GEN-LAST:event_Jb3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new home().setVisible(true);
       dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new student().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JButton Jb2;
    private javax.swing.JButton Jb3;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl1;
    private javax.swing.JLabel Jl2;
    private javax.swing.JLabel Jl3;
    private javax.swing.JTextField Jt1;
    private javax.swing.JTextField Jt2;
    private javax.swing.JTextField Jt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
