
package finalproject;
/*-------------------------------------------------------------------*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*-------------------------------------------------------------------*/
public class allot_student extends javax.swing.JFrame
 {

    public allot_student() 
    {
          setUndecorated(true);
          setBounds(300,100,300,400);
      
          initComponents();
          setSize(701,570);
          
          for(int i=1; i<=31; i++)
          {
            Jc1.addItem(i+"");
          }
         
          for(int j=1; j<=12; j++)
          {
            Jc2.addItem(j+"");
          }
          
          for(int k=2016; k<=2020; k++)
          {
            Jc3.addItem(k+"");
          }
          
         
          
      /*    for(int m=1; m<=21; m++)
          {
            jComboBox5.addItem(m+"");
          }*/

     try {
            String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
            Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from demo ";
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
               a=rs.getString("roomno");
               jComboBox6.addItem(a+"");            
            }
         }
       catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }            
      
    
    /*---------------------------------------------------------------------------------*/
    
    try {
     
            String sem=""; 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from years"  ;
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
              sem=  rs.getString("sems");     
              jComboBox1.addItem(sem);
            }           
          }
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(this, ex);
            } 
    }      
    /*---------------------------------------------------------------------------------*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        Jl0 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jt1 = new javax.swing.JTextField();
        Jl9 = new javax.swing.JLabel();
        Jl10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Jc1 = new javax.swing.JComboBox();
        Jc2 = new javax.swing.JComboBox();
        Jc3 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        Jb1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jb4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DATE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jl0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jl0.setText("ALLOT STUDENT");
        getContentPane().add(Jl0);
        Jl0.setBounds(250, 10, 140, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ROLL NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(102, 85, 117, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DEPARTMENT ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(102, 136, 117, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("STUDENT NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(102, 185, 117, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("EXAM");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(102, 234, 117, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("TIME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(102, 341, 66, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ROOM_NO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(102, 391, 66, 27);

        Jt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jt1.setText(" ");
        getContentPane().add(Jt1);
        Jt1.setBounds(240, 85, 144, 33);

        Jl9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jl9.setText(" ");
        getContentPane().add(Jl9);
        Jl9.setBounds(240, 136, 237, 31);

        Jl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jl10.setText(" ");
        getContentPane().add(Jl10);
        Jl10.setBounds(229, 192, 237, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SEMS" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(240, 234, 144, 20);

        Jc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Jc1);
        Jc1.setBounds(243, 291, 50, 23);

        Jc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Jc2);
        Jc2.setBounds(310, 290, 60, 23);

        Jc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Jc3);
        Jc3.setBounds(380, 290, 100, 23);

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(240, 391, 95, 23);

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(370, 391, 93, 23);

        Jb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jb1.setText("ALLOT");
        Jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb1);
        Jb1.setBounds(102, 459, 136, 37);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 90, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(611, 0, 90, 23);

        Jb4.setText("GET");
        Jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(Jb4);
        Jb4.setBounds(426, 92, 90, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 20, 80, 23);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9:00   AM to 12:00 PM", "10:00 Am to 1:00   PM", "2:00   PM to 5:00   PM" }));
        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(240, 344, 135, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("DATE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(102, 291, 90, 22);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(483, 234, 169, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/image[allot_studt].jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 700, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 new home().setVisible(true);
       dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int x=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT ??", "Confirmation", JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {System.exit(0);}          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb4ActionPerformed
/*-------------------------------------------------------------------*/
        try{
            String dpt="",nm="";
              Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
              String q="select * from student where rollno="+Jt1.getText()+"";
              Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(q);
              
               while(rs.next())
                {                                                                          
                   dpt=rs.getString("department");            
                   nm=rs.getString("name");              
               
                
                   Jl9.setText(dpt);
                   Jl10.setText(nm);                
                 }           
            }
          catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(this, ex);
           }
/*-------------------------------------------------------------------*/              
    }//GEN-LAST:event_Jb4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new addroom().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
    
   /*-------------------------------------------------------------------*/
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
    /*--------------------------------------------------------------------------*/
        try {
            jComboBox7.removeAllItems();
            String a=""; 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from "+jComboBox6.getSelectedItem().toString()+" where seat=0";
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
              a=  rs.getString("sno");     
              jComboBox7.addItem(a);
            }           
          }
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(this, ex);
            }     
    /*--------------------------------------------------------------------------*/
 
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void Jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb1ActionPerformed
      /*--------------------------------------------------------------------------*/
     if(Jt1.getText().equals(" ") )
      { JOptionPane.showMessageDialog(this, "PLEASE GIVE INPUT");  }

     else{   try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            String q1 = "update  "+jComboBox6.getSelectedItem().toString()+" set seat=1 where sno="+jComboBox7.getSelectedItem()+"";
            Statement St = con.createStatement();
            St.execute(q1);        
           JOptionPane.showMessageDialog(this, "Seat Allotted");
           }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
      /*-----------------------------------------------------------------------------*/
        try
       {
           String roll,dpt,nm,exm,d,m,y,dt,tym,rm,setno; 
         
           roll=Jt1.getText();
           dpt =Jl9.getText();          
           nm  =Jl10.getText();
           exm=jComboBox2.getSelectedItem().toString();
                           
            d=Jc1.getSelectedItem().toString();
            m=Jc2.getSelectedItem().toString();
            y=Jc3.getSelectedItem().toString();
            dt=d+"/"+m+"/"+y;
            tym=jComboBox10.getSelectedItem().toString();
            rm=jComboBox6.getSelectedItem().toString();
            setno=jComboBox7.getSelectedItem().toString();
            
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           String q;   
           q = "insert into allotment values('"+roll+"','"+dpt+"','"+nm+"','"+exm+"','"+dt+"','"+tym+"','"+rm+"','"+setno+"')";
           Statement st=con.createStatement();
           st.execute(q);
           JOptionPane.showMessageDialog(this, "SUCCESSFULLY ALLOTED");
         
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
     }   
     /*-----------------------------------------------------------------------------------------*/
         
    }//GEN-LAST:event_Jb1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
     try {
            jComboBox2.removeAllItems();
            String a=""; 
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

            String q1 = "Select * from "+jComboBox1.getSelectedItem()+"  ";
            Statement St = con.createStatement();
            ResultSet rs = St.executeQuery(q1);
            while (rs.next()) 
            {
              a=rs.getString("subjects");     
              jComboBox2.addItem(a);
            }           
        }
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(this, ex);
            }       
               
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

  /*-----------------------------------------------------------------------------------------*/
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
            java.util.logging.Logger.getLogger(allot_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allot_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allot_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allot_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new allot_student().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jb1;
    private javax.swing.JButton Jb4;
    private javax.swing.JComboBox Jc1;
    private javax.swing.JComboBox Jc2;
    private javax.swing.JComboBox Jc3;
    private javax.swing.JLabel Jl0;
    private javax.swing.JLabel Jl10;
    private javax.swing.JLabel Jl9;
    private javax.swing.JTextField Jt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
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
