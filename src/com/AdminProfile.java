/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy
 */
public class AdminProfile extends javax.swing.JFrame {
    public static int w=0,h=0;
    String filename = new String();
    String path = null;
    String Email;
    
    Connection conn = null;
    //OraclePreparedStatement pst = null;
    OracleResultSet rs = null;

    /**
     * Creates new form AdminProfile
     */
    public AdminProfile(String newEmail) {
     
        initComponents();
        Email = newEmail;
        refresh();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Admin_Name = new javax.swing.JTextField();
        Admin_Id = new javax.swing.JTextField();
        Admin_mobile = new javax.swing.JTextField();
        Admin_Address = new javax.swing.JTextField();
        Admin_Gender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Admin_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        C_pass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        N_pass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        picChoose = new javax.swing.JButton();
        imageAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Historytable = new javax.swing.JTable();
        upload = new javax.swing.JButton();
        propic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(723, 452));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Profile");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(281, 11, 132, 33);

        jButton1.setText("Update  Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(581, 76, 119, 23);

        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(581, 135, 119, 23);

        Admin_Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin_Name.setEnabled(false);
        Admin_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_NameActionPerformed(evt);
            }
        });
        jPanel1.add(Admin_Name);
        Admin_Name.setBounds(280, 60, 160, 30);

        Admin_Id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin_Id.setToolTipText("");
        Admin_Id.setEnabled(false);
        Admin_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_IdActionPerformed(evt);
            }
        });
        jPanel1.add(Admin_Id);
        Admin_Id.setBounds(280, 100, 160, 30);

        Admin_mobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin_mobile.setToolTipText("Update Mobile Number");
        jPanel1.add(Admin_mobile);
        Admin_mobile.setBounds(280, 140, 160, 30);

        Admin_Address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(Admin_Address);
        Admin_Address.setBounds(280, 180, 160, 30);

        Admin_Gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin_Gender.setEnabled(false);
        jPanel1.add(Admin_Gender);
        Admin_Gender.setBounds(280, 220, 160, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("     Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 70, 50, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("           Id:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 110, 50, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mobile No:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 150, 50, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("  Address:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 190, 50, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("   Gender:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 230, 50, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Mobile No", "Adress", "Gender", "Password", "Email", "PRO_PIC"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 200, 250, 100);

        Admin_Email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin_Email.setEnabled(false);
        Admin_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Admin_Email);
        Admin_Email.setBounds(280, 260, 160, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("       Email:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 270, 50, 20);

        C_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(C_pass);
        C_pass.setBounds(280, 300, 160, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Current Password:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 300, 90, 20);

        N_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        N_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_passActionPerformed(evt);
            }
        });
        jPanel1.add(N_pass);
        N_pass.setBounds(280, 340, 160, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("New Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(190, 340, 74, 20);

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(630, 20, 120, 23);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(470, 20, 120, 23);

        picChoose.setText("Choose Profile Picture");
        picChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picChooseActionPerformed(evt);
            }
        });
        jPanel1.add(picChoose);
        picChoose.setBounds(20, 260, 137, 23);

        imageAddress.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(imageAddress);
        imageAddress.setBounds(20, 240, 140, 0);

        Historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ROOM_NO", "CUSTOMER_NAME", "CUSTOMER_MOB", "CHECK_IN_TIME", "CHECK_OUT_TIME"
            }
        ));
        jScrollPane2.setViewportView(Historytable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(520, 320, 250, 90);

        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel1.add(upload);
        upload.setBounds(60, 290, 65, 23);

        propic.setBackground(new java.awt.Color(204, 204, 255));
        propic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        propic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jPanel1.add(propic);
        propic.setBounds(10, 50, 2, 2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_IdActionPerformed

    private void Admin_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_NameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        conn = JavaConnectivity.ConnecrDb();
        
        PreparedStatement pst = conn.prepareStatement("UPDATE ADMIN SET MOBILE_NO = ?, ADMIN_ADDRESS = ? WHERE ADMIN_ID = ?");
        
        
        pst.setString(1,Admin_mobile.getText());
        pst.setString(2,Admin_Address.getText());
        pst.setInt(3,Integer.parseInt(Admin_Id.getText()));
        
        pst.executeUpdate();
        
        pst.close();
        conn.close();
        
        
        
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULL!");
        refresh();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "UPDATE FAILED");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void N_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        conn = JavaConnectivity.ConnecrDb();
        
        PreparedStatement pst = conn.prepareStatement("UPDATE ADMIN SET PASSWORD = ? WHERE ADMIN_ID = ? AND PASSWORD = ?");
        
        
        pst.setString(1,N_pass.getText());
        pst.setString(2,Admin_Id.getText());
        pst.setString(3,C_pass.getText());
        
        
        
        if(N_pass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Blank Password Field!");
        }
        else if(N_pass.getText().length() < 6)
        {
            JOptionPane.showMessageDialog(null, "Minimum Password Length: 6");
        }
        else if(jTable1.getValueAt(0, 2).toString().equals(C_pass.getText()))
        {
            pst.executeUpdate();
        
             pst.close();
             conn.close();
            JOptionPane.showMessageDialog(null, "PASSWORD UPDATED!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry! Current Password Wrong!");
        }
        
        refresh();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.status = 0;
        WellCome_Window wd = new WellCome_Window();
        wd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Choice c = new Choice(Admin_Email.getText());
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void Admin_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_EmailActionPerformed

    public static ImageIcon resize(ImageIcon im, int w, int h)
    {
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        Graphics2D gd = (Graphics2D)bi.createGraphics();
        gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        gd.drawImage(im.getImage(), 0, 0, w, h, null);
        gd.dispose();
        return new ImageIcon(bi);
    }
    void setPic()
    {
        System.out.println(filename);
            ImageIcon icon = new ImageIcon(filename);
            icon.getImage().flush();
            propic.setIcon(icon);
     
    }
    private void picChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picChooseActionPerformed
        // TODO add your handling code here:
        w=0; h=0;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        imageAddress.setText(filename);

        Image getAbsolutePath = null;

        ImageIcon icon = new ImageIcon(filename);
        Dimension imgSize = new Dimension(icon.getImage().getWidth(chooser), icon.getImage().getHeight(chooser));
        Dimension boundary = new Dimension(171, 220);
        getScaledDimension(imgSize, boundary);

        Image img1 = resize(new ImageIcon(filename),w, h).getImage();
        Image img2 = img1.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        ImageIcon icon1 = new ImageIcon(img2);

        propic.setBounds(10, 25, w, h);
        //propic.setIcon(icon1);
        propic.setIcon(icon1);

        //writing

        BufferedImage bi = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bi.createGraphics();
        // Draw img into bi so we can write it to file.
        g2.drawImage(img2, 0, 0, null);
        g2.dispose();

        // Now bi contains the img.
        // Note: img may have transparent pixels in it; if so, okay.
        // If not and you can use TYPE_INT_RGB you will get better
        // performance with it in the jvm.
        try {

            /*
            //delete previous image
            Path imagesPath = Paths.get(filename);

            try {
                Files.delete(imagesPath);

            } catch (IOException e) {
                System.err.println("Unable to delete "+ imagesPath.toAbsolutePath().toString()+ " due to...");
                e.printStackTrace();
            }
            */
            ImageIO.write(bi, "jpg", new File(path = ("C:\\Users\\Joy\\Documents\\NetBeansProjects\\DatabaseProject\\ProfilePictures\\"+Admin_Id.getText()+".jpg")));

                filename = path;
                imageAddress.setText(filename);

            } catch (IOException ex) {
                Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_picChooseActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        try{

            conn = JavaConnectivity.ConnecrDb();

            PreparedStatement pst = conn.prepareStatement("UPDATE ADMIN SET PRO_PIC = ? WHERE ADD_EMAIL = ?");

            pst.setString(1,imageAddress.getText());
            pst.setString(2,Admin_Email.getText());
            pst.executeUpdate();

            pst.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Picture Uploaded!");

            //setPic();
            refresh();
            HistoryRefresh();
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_uploadActionPerformed

    public static void getScaledDimension(Dimension imgSize, Dimension boundary) {

    int original_width = imgSize.width;
    int original_height = imgSize.height;
    int bound_width = boundary.width;
    int bound_height = boundary.height;
    int new_width = original_width;
    int new_height = original_height;

    // first check if we need to scale width
    if (original_width > bound_width) {
        //scale width to fit
        new_width = bound_width;
        //scale height to maintain aspect ratio
        new_height = (new_width * original_height) / original_width;
    }

    // then check if we need to scale even with the new height
    if (new_height > bound_height) {
        //scale height to fit instead
        new_height = bound_height;
        //scale width to maintain aspect ratio
        new_width = (new_height * original_width) / original_height;
    }
    w= new_width;
    h= new_height;
    //return new Dimension(new_width, new_height);
     
    }
    
   
    private void refresh(){
        setPic();                                    
        try {
            conn = JavaConnectivity.ConnecrDb();
            //Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MISHU;integratedSecurity=true");

            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery("select * from admin where ADD_EMAIL='" + Email + "'");
            
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            jTable1.setModel(dtm);
            
            
            
            Admin_Name.setText(jTable1.getValueAt(0, 1).toString());
            Admin_Id.setText(jTable1.getValueAt(0, 0).toString());
            Admin_mobile.setText(jTable1.getValueAt(0, 3).toString());
            Admin_Address.setText(jTable1.getValueAt(0, 4).toString());
            Admin_Gender.setText(jTable1.getValueAt(0, 5).toString());
            Admin_Email.setText(jTable1.getValueAt(0, 6).toString());
            
            filename = jTable1.getValueAt(0, 7).toString();
            
            if(filename.equals(""))
            {
                filename = "C:\\Users\\Joy\\Documents\\NetBeansProjects\\DatabaseProject\\ProfilePictures\\default.png";
                propic.setBounds(10, 25, 171, 220);
                //System.out.println(filename);
            }
            System.out.println(filename);
            imageAddress.setText(filename);
            setPic();
 
            
            //pst.executeUpdate();
        
        //pst.close();
        conn.close();
        //TableColumn column = jTable1.getColumnModel().getColumn(0);
        //jTable1.removeAll();
        //jTable1.setTableHeader(null);
        //jTable1.setColumnModel(null);
        //jTable1.removeColumnSelectionInterval(0, 7);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void HistoryRefresh(){
                                             
        try {
            conn = JavaConnectivity.ConnecrDb();
            //Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MISHU;integratedSecurity=true");

            //history
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery("select * from History where CUSTOMER_MOB = '" + Admin_mobile.getText()+ "' ");
            
            ResultSetMetaData  rsmetadata = rs.getMetaData();
            int  columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name=new Vector();
            Vector data_rows=new Vector();
            for(int  i= 1; i < columns+1; i++)
            {
                columns_name.addElement (rsmetadata.getColumnLabel(i));
            }

            dtm.setColumnIdentifiers(columns_name);
            while (rs.next())
            {
                data_rows = new Vector();
                for (int j = 1; j <columns+1; j++)
                {
                    data_rows.addElement(rs.getString(j)) ;
                }
                dtm.addRow(data_rows);

            }
            Historytable.setModel(dtm);
            
            
            //pst.executeUpdate();
        
        //pst.close();
        conn.close();
        

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin_Address;
    private javax.swing.JTextField Admin_Email;
    private javax.swing.JTextField Admin_Gender;
    private javax.swing.JTextField Admin_Id;
    private javax.swing.JTextField Admin_Name;
    private javax.swing.JTextField Admin_mobile;
    private javax.swing.JButton Back;
    private javax.swing.JTextField C_pass;
    private javax.swing.JTable Historytable;
    private javax.swing.JTextField N_pass;
    private javax.swing.JLabel imageAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton picChoose;
    private javax.swing.JLabel propic;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
