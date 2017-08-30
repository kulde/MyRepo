
package finalproject;
/*----------------------------------------------------*/
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/*----------------------------------------------------*/
public class addroom extends javax.swing.JFrame 
 {
  String roomno="";
    public addroom() 
     {
           setUndecorated(true);
           setBounds(300,100,300,400);
      
           initComponents();
           setSize(673,337);
          
       //    Dimension d=getToolkit().getScreenSize();
         //  setSize(d);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Jl0 = new javax.swing.JLabel();
        Jb8 = new javax.swing.JButton();
        Jb0 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Jp1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Jb9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl0.setText("         ADD ROOM");
        getContentPane().add(Jl0);
        Jl0.setBounds(220, 20, 206, 31);

        Jb8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb8.setText("ALLOTMENT");
        Jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb8);
        Jb8.setBounds(420, 250, 167, 30);

        Jb0.setText("HOME");
        Jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb0ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb0);
        Jb0.setBounds(0, 0, 80, 23);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(187, 157, 0, 0);

        Jp1.setBackground(new java.awt.Color(204, 204, 204));
        Jp1.setLayout(null);
        getContentPane().add(Jp1);
        Jp1.setBounds(191, 111, 0, 0);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(244, 53, 0, 0);

        Jb9.setText("EXIT");
        Jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb9ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb9);
        Jb9.setBounds(590, 0, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ROOM_NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 110, 117, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText(" ");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 110, 104, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 110, 105, 31);

        jLabel1.setText("Ex -->1 or 2 or 3..........");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 160, 140, 14);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("EMPTY ROOMS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 280, 167, 31);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[add_room].jpg"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 337);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb8ActionPerformed
       new allot_student().setVisible(true); 
       dispose();
    }//GEN-LAST:event_Jb8ActionPerformed

    private void Jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb0ActionPerformed
           new home().setVisible(true);
           dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Jb0ActionPerformed

    private void Jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb9ActionPerformed
      int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);}
    }//GEN-LAST:event_Jb9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    /*----------------------------------------------------------------------------------*/  
        try
        {
            roomno="room"+jTextField1.getText();
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
        
            String q="insert into demo values('"+roomno+"')";
            Statement st=con.createStatement();
            st.execute(q);
        
           String q1="create table "+roomno+"(sno int primary key auto_increment,seat int ) ";
           st.execute(q1);
           for(int a=1;a<=60;a++)
           {
               String q3="insert into "+roomno+" values(null,0)"; 
               st.execute(q3);
           }
            JOptionPane.showMessageDialog(this,"Room Added");            
        }
        
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(this,ex);
        }   
    /*----------------------------------------------------------------------------------*/  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new empty_rooms().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
        
    /*----------------------------------------------------*/  
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
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>   
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new addroom().setVisible(true);
            }
        });
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb0;
    private javax.swing.JButton Jb8;
    private javax.swing.JButton Jb9;
    private javax.swing.JLabel Jl0;
    private javax.swing.JPanel Jp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
