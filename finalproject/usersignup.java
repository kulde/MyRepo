
package finalproject;
/*-------------------------------------------------------------------------------------------------*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*-------------------------------------------------------------------------------------------------*/

public class usersignup extends javax.swing.JFrame
 {

    String un,pw,d,m,y,db,g;
    public usersignup()
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
        initComponents();
        
        for(int i=1; i<=31 ; i++)
        {
           Jc1.addItem(i+"");
        } 
       
        for(int j=1; j<=12 ; j++)
        {
           Jc2.addItem(j+"");
        }
      
        for(int k=1990; k<=2016 ; k++)
        {
           Jc3.addItem(k+"");
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jl0 = new javax.swing.JLabel();
        Jl1 = new javax.swing.JLabel();
        Jl2 = new javax.swing.JLabel();
        Jl3 = new javax.swing.JLabel();
        Jl4 = new javax.swing.JLabel();
        Jp1 = new javax.swing.JPasswordField();
        Jt1 = new javax.swing.JTextField();
        Jc1 = new javax.swing.JComboBox();
        Jc2 = new javax.swing.JComboBox();
        Jc3 = new javax.swing.JComboBox();
        Jr1 = new javax.swing.JRadioButton();
        Jr2 = new javax.swing.JRadioButton();
        Jb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jl0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl0.setText("           SIGN UP");

        Jl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl1.setText("USER NAME");

        Jl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl2.setText("PASSWORD");

        Jl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl3.setText("DATE OF BIRTH");

        Jl4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jl4.setText("GENDER");

        Jp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Jt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jt1.setText(" ");

        Jc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Jc2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Jc3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(Jr1);
        Jr1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jr1.setText("MALE");

        buttonGroup1.add(Jr2);
        Jr2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jr2.setText("FEMALE");

        Jb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jb1.setText("SUBMIT");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jl3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(Jl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Jt1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(Jp1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jr1)
                                .addGap(18, 18, 18)
                                .addComponent(Jr2)))))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(Jl0, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jl0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jt1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jr1)
                    .addComponent(Jr2))
                .addGap(55, 55, 55)
                .addComponent(Jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
       /*-------------------------------------------------------------------------------------------------*/
        if(Jt1.getText().equals(" ") && Jp1.getText().equals(" ") )
     {JOptionPane.showMessageDialog(this, "PLEASE ENTER VALUES TO SUBMIT");}
     else
      {   
        try
       {
          un=Jt1.getText();
          pw=Jp1.getText();          
          d=Jc1.getSelectedItem().toString();
          m=Jc2.getSelectedItem().toString();
          y=Jc3.getSelectedItem().toString();
          db=d+"/"+m+"/"+y;
          
          if(Jr1.isSelected())
           {
             g=Jr1.getText();
           }
          else
           {
             g=Jr2.getText();
           }  
          
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "insert into usersignup values( null,'"+un+"','"+pw+"','"+db+"','"+g+"',curdate(),curtime(),curdate(),curtime())";
           Statement st=con.createStatement();
           st.execute(q);
           JOptionPane.showMessageDialog(this, "SUCCESSFULLY REGISTERED");
           new admin().setVisible(true);
           dispose();
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
      }   
       /*-------------------------------------------------------------------------------------------------*/

       
    }//GEN-LAST:event_Jb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new usersignup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JComboBox Jc1;
    private javax.swing.JComboBox Jc2;
    private javax.swing.JComboBox Jc3;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl1;
    private javax.swing.JLabel Jl2;
    private javax.swing.JLabel Jl3;
    private javax.swing.JLabel Jl4;
    private javax.swing.JPasswordField Jp1;
    private javax.swing.JRadioButton Jr1;
    private javax.swing.JRadioButton Jr2;
    private javax.swing.JTextField Jt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
