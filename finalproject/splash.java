/*----------------------FINAL PROJECT AFTER SUMMAR TRANING-------------------------------------*/                        
/*-------------------------------FRAME 1--------------------------------------------------------------*/

package finalproject;
import javax.swing.JOptionPane;


public class splash extends javax.swing.JFrame 
{

    int i;
    public splash()  
    {
        setUndecorated(true);
        setBounds(300,100,700,500);
        initComponents();
        
        setTitle("SPLASH");
        setSize(759,544);
  /*---------------------------------------------------------------------------------------------*/
          Thread t2=new Thread(new Runnable()
        {
           public void run()
           {
           
              for(i=140; i<=400; i=i+20)
                 { 
                     try{       
                             Thread.sleep(1000); 
                              if(i==400)
                              { 
                                 new admin_or_student().setVisible(true);
                                 dispose();                                                             
                              }
                               jPanel2.setBounds(i, 430, 11,20 );
                         }     
                     catch(Exception ex)                    
                      { System.out.println("PRESENCE OF AN ERROR HERE");
                      }                           
                 } 
                            
                dispose();   
           } 
        }                 
       );
        t2.start();
          dispose();
      /*--------------------------------------------------------------------------------------------*/    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("LOADING");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 430, 110, 20);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(11, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 430, 11, 20);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 0, 55, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("UNIVERSITY COLLEGE OF ENGINEERING  P.U.P.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 10, 600, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[university-college-of-engineering-ucoe-patiala].png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 550);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 90, 370, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);} 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
         {
            public void run() 
            {
                new splash().setVisible(true);
            }
         });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
