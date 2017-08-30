
package finalproject;
/*-------------------------------------------------------------------------------------------------*/
       
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*-------------------------------------------------------------------------------------------------*/
       
public class teacherframe extends javax.swing.JFrame 
 {

  String tn,dpt,des,id;
    public teacherframe() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        setSize(657,511);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
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
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl0.setText("ADD  TEACHER ");
        getContentPane().add(Jl0);
        Jl0.setBounds(250, 50, 221, 35);

        Jl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl1.setText("NAME OF TEACHER");
        getContentPane().add(Jl1);
        Jl1.setBounds(139, 153, 171, 39);

        Jl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl2.setText("DEPARTMENT");
        getContentPane().add(Jl2);
        Jl2.setBounds(139, 210, 171, 36);

        Jl3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jl3.setText("DESIG");
        getContentPane().add(Jl3);
        Jl3.setBounds(139, 264, 171, 36);

        Jt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(328, 153, 159, 39);

        Jt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt2.setText(" ");
        getContentPane().add(Jt2);
        Jt2.setBounds(328, 210, 159, 36);

        Jt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jt3.setText(" ");
        getContentPane().add(Jt3);
        Jt3.setBounds(328, 264, 159, 36);

        Jb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb1.setText("ADD");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(139, 396, 127, 37);

        Jb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb2.setText("MODIFY");
        Jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb2);
        Jb2.setBounds(139, 451, 127, 39);

        Jb3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jb3.setText("DELETE");
        Jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb3);
        Jb3.setBounds(330, 450, 127, 36);

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
        jButton2.setBounds(1076, 0, 55, 23);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 0, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[home2].jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -60, 780, 630);

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
          tn=Jt1.getText();
          dpt=Jt2.getText();          
          des=Jt3.getText();
      //    id= Jt4.getText();
          
          
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "insert into teacher values('"+tn+"','"+dpt+"','"+des+"',null,curdate(),curtime())";
           Statement st=con.createStatement();
           st.execute(q);
           JOptionPane.showMessageDialog(this, "SUCCESSFULLY REGISTERED");
            
           // dispose();
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
      }   
       /*-------------------------------------------------------------------------------------------------*/
       
    }//GEN-LAST:event_Jb1ActionPerformed

    private void Jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb2ActionPerformed
          new modifyte().setVisible(true);
          dispose();
      /*-------------------------------------------------------------------------------------------------*/ 
        
       
    }//GEN-LAST:event_Jb2ActionPerformed

    private void Jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb3ActionPerformed
      new delete_tech().setVisible(true);
        dispose();
    }//GEN-LAST:event_Jb3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new home().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
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
            java.util.logging.Logger.getLogger(teacherframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new teacherframe().setVisible(true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
