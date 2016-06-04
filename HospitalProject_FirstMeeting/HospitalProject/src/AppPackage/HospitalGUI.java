/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author JD
 */
public class HospitalGUI extends javax.swing.JFrame {

    /**
     * Creates new form HospitalGUI
     */
    public HospitalGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sampleId = new javax.swing.JTextField();
        signOut = new javax.swing.JRadioButton();
        returnSample = new javax.swing.JRadioButton();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sample Tracker v1.0");
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Please fill in your information below and scan your sample");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 40));

        jLabel2.setText("Sample ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 20));

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 230, -1));

        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 20));

        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel1.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, -1));

        jLabel5.setText("Department:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });
        jPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, -1));

        jLabel6.setText("Please select the one that applies:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 20));

        sampleId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sampleIdActionPerformed(evt);
            }
        });
        jPanel1.add(sampleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, -1));

        buttonGroup1.add(signOut);
        signOut.setText("Sign out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jPanel1.add(signOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 100, 20));

        buttonGroup1.add(returnSample);
        returnSample.setText("Return");
        jPanel1.add(returnSample, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 20));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 70, -1));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 20));

        emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressActionPerformed(evt);
            }
        });
        jPanel1.add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, -1));

        jTabbedPane1.addTab("User", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("This tab is for administrator use only");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, 50));

        jButton2.setText("View .csv File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, 50));

        jTabbedPane1.addTab("Admin", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 320));

        setSize(new java.awt.Dimension(455, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void sampleIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sampleIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sampleIdActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        JFrame frame = new JFrame();
        int reset = JOptionPane.showConfirmDialog(frame, "Are you sure you want to reset?", "Reset", JOptionPane.YES_NO_CANCEL_OPTION);
        if (reset == JOptionPane.YES_OPTION) {
            firstName.setText("");
            lastName.setText("");
            sampleId.setText("");        
            dept.setText("");
        }

    }//GEN-LAST:event_resetActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signOutActionPerformed

    private static String chompLastChar(String str) {
        return str.substring(0,str.length()-1);
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String first = firstName.getText();
        String last = lastName.getText();
        String department = dept.getText();
        String sample = sampleId.getText();
        String email = emailAddress.getText();
        String radioText = "";
        if (signOut.isSelected()){
           radioText = signOut.getText(); 
        }else if (returnSample.isSelected()){
            radioText = returnSample.getText();
        }
        ArrayList<String> errors = new ArrayList<String>();
        if (!first.matches("(?i)^[a-z ]+$")){
            errors.add("The first name field contains invalid characters or is empty\n");
        }
        if (!last.matches("(?i)^[a-z ]+$")){
            errors.add("The last name field contains invalid characters or is empty\n");
        }
        if (!department.matches("(?i)^[a-z ]+$")){
            errors.add("The department field contains invalid characters or is empty\n");
        }
        if (!email.matches("(?i)^[a-z,0-9,.,_,%,+,-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$")){
            errors.add("The e-mail field contains invalid characters or is empty\n");
        }
        if (!sample.matches("(?i)^[a-z, 1-9]+$")){
            errors.add("The sample ID field contains invalid characters or is empty\n");
        }
        if (!radioText.matches("(?i)^Sign out|Return$")){
            errors.add("Please select Sign out or Return");
        }
        
        if(errors.isEmpty()){
            //Removes the last character of the sample ID input (will be a comma), then splits by commas
            String sampleChomped = chompLastChar(sample);
            ArrayList sampleIDs= new ArrayList(Arrays.asList(sampleChomped.split(",")));
            
            //stores the Date and Time
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            
            try{
                String headers = "First name,Last name,Department,Sample ID,E-mail address,Transaction type,Date and Time\n";
    		File file = new File("Sample Records.csv");
    		//if file doesnt exists, then create it
    		if(!file.exists()){
    			file.createNewFile();
                        FileWriter fileWrite = new FileWriter(file.getName(),true);
                        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
                        bufferWrite.write(headers);
                        bufferWrite.close();
                        System.out.println("Created file and added headers!");
    		}
    		//true = append file
    		FileWriter fileWritter = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                //bufferWritter.write(headers);
                for(int z = 0; z < sampleIDs.size(); z++){
                    String data = first+','+last+','+department+','+sampleIDs.get(z)+','+email+','+radioText+','+dateFormat.format(date)+"\n";
                    bufferWritter.write(data);
                }
    	        bufferWritter.close();
	        System.out.println("Done appending yoooo");
            }catch(IOException e){
    		e.printStackTrace();
            }
        }else{
            String errorList = "";
            for (int i = 0; i < errors.size(); i++) {
	    errorList = errorList + errors.get(i);
            }
            JOptionPane.showMessageDialog(null, errorList,
					    "Input error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void emailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChangePass changePassFrame = new ChangePass();
        changePassFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ViewCsv csvFrame = new ViewCsv();
        csvFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton returnSample;
    private javax.swing.JTextField sampleId;
    private javax.swing.JRadioButton signOut;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
