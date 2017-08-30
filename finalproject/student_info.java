
package finalproject;

import java.sql.*;
import javax.swing.JOptionPane;
/*--------------------------------------------------------------------*/
public class student_info extends javax.swing.JFrame 
 {
     String a="";

    public student_info(String x) 
    {
        setUndecorated(true);
        setBounds(300,90,300,400);
      
        initComponents();
        setSize(708, 489);
         a=x;
        /*-------------------------------------------------------------------*/
      try
       {
           String roll,nm,dpt,exm,dt,tym,rm,seatn; 
                                    
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "select * from allotment where rollno='"+a+"' ";
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(q);
            while(rs.next())
             { 
                roll =rs.getString("rollno");
                  nm =rs.getString("name");                                               
                  dpt=rs.getString("department");                                
                  exm=rs.getString("exam");                   
                   dt=rs.getString("examdate");
                  tym=rs.getString("examtime");
                   rm=rs.getString("roomno");        
                seatn=rs.getString("seatno");        
             
                jLabel9.setText(roll);                
                jLabel10.setText(nm);
                jLabel11.setText(dpt);
                jLabel12.setText(exm);
                jLabel13.setText(dt);
                jLabel14.setText(tym);
                jLabel15.setText(rm);               
                jLabel17.setText(seatn);
                
             //  JOptionPane.showMessageDialog(this, "SUCCESSFULLY ALLOTED");
             }
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
     
        /*-------------------------------------------------------------------*/              

    }

    public student_info() 
    {
         setUndecorated(true);
        setBounds(300,90,300,400);
      
            initComponents();
            setSize(708, 489);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("YOUR SITTING DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(188, 11, 239, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ROLL_NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(188, 84, 143, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(188, 135, 143, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DEPARTMENT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(188, 181, 143, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EXAM");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(188, 227, 143, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(188, 272, 143, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TIME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(188, 319, 143, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ROOM_NO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(188, 365, 143, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(349, 84, 320, 33);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(349, 135, 320, 28);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(349, 181, 330, 28);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(349, 227, 330, 27);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(349, 272, 330, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(349, 319, 330, 28);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(349, 365, 330, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("SEAT_NO");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(188, 413, 143, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(349, 413, 340, 30);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 0, 55, 23);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 80, 23);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[stu_info].png"))); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 700, 490);

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(500, 100, 40, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);}     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new check_student_rollno().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    
    
    
    
    
    /*--------------------------------------------------------------------*/    
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
            java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new student_info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
