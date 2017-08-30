/*-------------------------------FRAME 5--------------------------------------*/
/*----------------------------------------------------------------------------*/

package finalproject;
/*---------------------------------------------------------------------------*/
import javax.swing.JOptionPane;
import java.sql.*;

/*---------------------------------------------------------------------------*/

public class admin extends javax.swing.JFrame 
 {
    String un,pw,dun,dpw,lld,llt;    
   
    public admin() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(690,490);
        /*---------------------------------------------------------------------------------------*/        
        try {              
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from usersignup  ";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                
                lld=rs.getString("lldate");
                llt=rs.getString("lltime");
               
                Jl5.setText(lld);
                Jl6.setText(llt);                
               }
            }
           catch(SQLException ex)
            {
               JOptionPane.showMessageDialog(this, ex);                       
            }
    }         
        /*---------------------------------------------------------------------------------------*/            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Jl0 = new javax.swing.JLabel();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jl4 = new javax.swing.JLabel();
        Jt1 = new javax.swing.JTextField();
        Jb1 = new javax.swing.JButton();
        Jp1 = new javax.swing.JPasswordField();
        Jl5 = new javax.swing.JLabel();
        Jl6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl0.setText("         ADMIN");
        getContentPane().add(Jl0);
        Jl0.setBounds(243, 11, 145, 37);

        Jl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl1.setText("USER NAME");
        getContentPane().add(Jl1);
        Jl1.setBounds(176, 103, 129, 41);

        Jl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl2.setText("PASSWORD");
        getContentPane().add(Jl2);
        Jl2.setBounds(176, 181, 129, 36);

        Jl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl3.setText("LAST LOGIN DATE");
        getContentPane().add(Jl3);
        Jl3.setBounds(176, 261, 129, 35);

        Jl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl4.setText("LAST LOGIN TIME");
        getContentPane().add(Jl4);
        Jl4.setBounds(176, 340, 129, 35);

        Jt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(323, 108, 137, 31);

        Jb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jb1.setText("OK");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(176, 450, 149, 32);

        Jp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Jp1);
        Jp1.setBounds(323, 188, 137, 23);

        Jl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl5.setText("  ");
        getContentPane().add(Jl5);
        Jl5.setBounds(323, 261, 137, 35);

        Jl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jl6.setText(" ");
        getContentPane().add(Jl6);
        Jl6.setBounds(323, 340, 137, 35);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 0, 55, 23);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[login2].png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
   /*---------------------------------------------------------------------------------------*/
     if(Jt1.getText().equals(" ") && Jp1.getText().equals(" "))
      { JOptionPane.showMessageDialog(this, "PLEASE GIVE INPUT");  }
     
     else
      { 
          try {
                un=Jt1.getText();
                pw=Jp1.getText();
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from usersignup where username ='"+un+"' ";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              while(rs.next())
              {                                
                dun=rs.getString("username");
                dpw=rs.getString("password");
                lld=rs.getString("lldate");
                llt=rs.getString("lltime");
               
              
                if(dun.equalsIgnoreCase(un) && dpw.equalsIgnoreCase(pw))
                 {
                     String qq="update usersignup set lldate=curdate(),lltime=curtime() where username='"+un+"'"; 
                     Statement st2=con.createStatement();
                     st2.execute(qq);
                     
                     JOptionPane.showMessageDialog(this, " LOGGEDIN","WELCOME",JOptionPane.DEFAULT_OPTION);                     
                     new home().setVisible(true);
                     dispose();
                 }  
                else
                 {
                     JOptionPane.showMessageDialog(this, "INVALID USER NAME OR PASSWORD");                   
                 }  
              }   
        
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
     /*----------------------------------------------------------------------------------------*/   
    }          
 
    }//GEN-LAST:event_Jb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);}       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new admin_or_student().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new admin().setVisible(true);
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl1;
    private javax.swing.JLabel Jl2;
    private javax.swing.JLabel Jl3;
    private javax.swing.JLabel Jl4;
    private javax.swing.JLabel Jl5;
    private javax.swing.JLabel Jl6;
    private javax.swing.JPasswordField Jp1;
    private javax.swing.JTextField Jt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
