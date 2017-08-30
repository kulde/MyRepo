
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*----------------------------------------------------------------------------*/
public class allot_teacher extends javax.swing.JFrame 
 {
      String nm="",dpt="",des="",id="";

    public allot_teacher() 
    {
        setUndecorated(true);
        setBounds(300,90,300,400);
        
        initComponents();
        setSize(675,510);
        
          for(int i=1; i<=31 ; i++)
         {
            jComboBox9.addItem(i);
         }
         
           for(int j=1; j<=12 ; j++)
         {
            jComboBox10.addItem(j);
         }
           
           for(int k=2016; k<=2020 ; k++)
         {
            jComboBox11.addItem(k);
         } 
           
       try {
            String a;
            Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from demo ";
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
               a=rs.getString("roomno");
               jComboBox8.addItem(a+"");            
            }
          }
       catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }   
             
       /*----------------------------------------------------------*/
              
       /*---------------------------------------------------------------*/
             try {
     
            String sem=""; 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from years"  ;
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
              sem=  rs.getString("sems");     
              jComboBox13.addItem(sem);
            }           
          }
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(this, ex);
            }    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ALLOT TEACHER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(263, 11, 118, 26);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("TEACHER_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(141, 79, 120, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText(" ");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(279, 79, 124, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("GET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 75, 90, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(141, 127, 120, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DEPARTMENT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(141, 170, 120, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DESIGNATION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(141, 219, 120, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(" ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(279, 127, 124, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(279, 170, 124, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(" ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(279, 219, 128, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText(" DUTY [ in exam ]");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 270, 120, 31);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ROOM_NO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(140, 460, 130, 30);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Room No" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(290, 470, 100, 20);

        jButton2.setText("ALLOT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 470, 73, 23);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(585, 0, 90, 23);

        jButton4.setText("HOME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 0, 90, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("TIME");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 410, 110, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("DATE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 350, 100, 30);

        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(290, 350, 60, 20);

        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(370, 350, 60, 20);

        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(450, 350, 90, 20);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9:00   AM to 12:00 PM", "10:00 Am to 1:00   PM", "2:00   PM to 5:00   PM" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox12);
        jComboBox12.setBounds(290, 410, 170, 20);

        jComboBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox13ItemStateChanged(evt);
            }
        });
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox13);
        jComboBox13.setBounds(278, 277, 190, 20);

        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox14);
        jComboBox14.setBounds(498, 277, 156, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[allot_teach].jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 680, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       /*-------------------------------------------------------------------*/
        try{
           
            id=jTextField1.getText();
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from teacher where id= '"+id+"'   ";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              
               while(rs.next())
                {  
                   nm=rs.getString("name"); 
                   dpt=rs.getString("department"); 
                   des=rs.getString("designation"); 
                   
                   jLabel6.setText(nm);
                   jLabel7.setText(dpt);
                   jLabel8.setText(des);
                 }           
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
/*-------------------------------------------------------------------*/              

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     /*-----------------------------------------------------------------------------------------*/
        try
       {
           String id,nm,dpt,des,exmduty,d,m,y,dt,tym,rm; 
         
           id=jTextField1.getText();
           nm =jLabel6.getText();                     
           dpt=jLabel7.getText();          
           des=jLabel8.getText();
           exmduty=jComboBox14.getSelectedItem().toString();
                   
           d=jComboBox9.getSelectedItem().toString();
           m=jComboBox10.getSelectedItem().toString();
           y=jComboBox11.getSelectedItem().toString();        
           dt=d+"/"+m+"/"+y;
           tym=jComboBox12.getSelectedItem().toString();
           rm=jComboBox8.getSelectedItem().toString();        
                   
            
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "insert into allotteacher values('"+id+"','"+nm+"','"+dpt+"','"+des+"','"+exmduty+"','"+dt+"','"+tym+"','"+rm+"')";
           Statement st=con.createStatement();
           st.execute(q);
           JOptionPane.showMessageDialog(this, "SUCCESSFULLY ALLOTED");
         
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
        
     /*-----------------------------------------------------------------------------------------*/
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new home().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox13ItemStateChanged
        try {
           jComboBox14.removeAllItems();
            String a=""; 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from "+jComboBox13.getSelectedItem()+"  ";
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
              a=rs.getString("subjects");     
              jComboBox14.addItem(a);
            }           
        }
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(this, ex);
            }  
    }//GEN-LAST:event_jComboBox13ItemStateChanged

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed


    

    
/*----------------------------------------------------------------------------*/    
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
            java.util.logging.Logger.getLogger(allot_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allot_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allot_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allot_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new allot_teacher().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
