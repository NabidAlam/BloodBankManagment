
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class AddDonor extends javax.swing.JFrame 
{
    DateTextField DoB;
    DateTextField lastDonationDate;
    
    public AddDonor() 
    {
        initComponents();
        DoB = new DateTextField();
        DoB.setBounds(220, 200, 180, 30);
        this.add(DoB);
        lastDonationDate = new DateTextField();
        lastDonationDate.setBounds(220, 560, 180, 30);
        this.add(lastDonationDate);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        DonorNameLabel = new javax.swing.JLabel();
        FathersNameLabel = new javax.swing.JLabel();
        SexLabel = new javax.swing.JLabel();
        donorNameTextField = new javax.swing.JTextField();
        RegisterDonorButton = new javax.swing.JButton();
        MothersNameLabel = new javax.swing.JLabel();
        DoBLabel = new javax.swing.JLabel();
        MotherNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FathersNameTextfield = new javax.swing.JTextField();
        OccupationLabel = new javax.swing.JLabel();
        OccupationTextField = new javax.swing.JTextField();
        WeightLabel = new javax.swing.JLabel();
        BPSysLabel = new javax.swing.JLabel();
        BPDiaLabel = new javax.swing.JLabel();
        PresentAddLabel = new javax.swing.JLabel();
        PermaAddLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        LastDonationLabel = new javax.swing.JLabel();
        RegularDonorLabel = new javax.swing.JLabel();
        WeightTextField = new javax.swing.JTextField();
        BPSysTextField = new javax.swing.JTextField();
        BPDiaTextField = new javax.swing.JTextField();
        PATextField = new javax.swing.JTextField();
        PA2TextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BloodGroupCombo = new javax.swing.JComboBox<>();
        RegDonorRadioY = new javax.swing.JRadioButton();
        RegDonorRadioN = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        GenderRadioButtonMale = new javax.swing.JRadioButton();
        GenderRadioButtonFemale = new javax.swing.JRadioButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        DonorNameLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        DonorNameLabel.setText("Donor Name");
        getContentPane().add(DonorNameLabel);
        DonorNameLabel.setBounds(60, 80, 82, 33);

        FathersNameLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        FathersNameLabel.setText("Father's Name");
        getContentPane().add(FathersNameLabel);
        FathersNameLabel.setBounds(60, 120, 100, 33);

        SexLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        SexLabel.setText("Sex");
        getContentPane().add(SexLabel);
        SexLabel.setBounds(60, 240, 82, 33);
        getContentPane().add(donorNameTextField);
        donorNameTextField.setBounds(220, 80, 180, 30);

        RegisterDonorButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegisterDonorButton.setText("Register Donor");
        RegisterDonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterDonorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterDonorButton);
        RegisterDonorButton.setBounds(170, 720, 140, 40);

        MothersNameLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        MothersNameLabel.setText("Mother's Name");
        getContentPane().add(MothersNameLabel);
        MothersNameLabel.setBounds(60, 160, 100, 33);

        DoBLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        DoBLabel.setText("Date of Birth");
        getContentPane().add(DoBLabel);
        DoBLabel.setBounds(60, 200, 82, 33);

        MotherNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MotherNameTextField);
        MotherNameTextField.setBounds(220, 160, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 43, 52));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Donor");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 0, 290, 70);

        FathersNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathersNameTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(FathersNameTextfield);
        FathersNameTextfield.setBounds(220, 120, 180, 30);

        OccupationLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        OccupationLabel.setText("Occupation");
        getContentPane().add(OccupationLabel);
        OccupationLabel.setBounds(60, 280, 90, 30);
        getContentPane().add(OccupationTextField);
        OccupationTextField.setBounds(220, 280, 180, 30);

        WeightLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        WeightLabel.setText("Weight(KG)");
        getContentPane().add(WeightLabel);
        WeightLabel.setBounds(60, 320, 100, 30);

        BPSysLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        BPSysLabel.setText("Blood Pressure (Systolic)");
        getContentPane().add(BPSysLabel);
        BPSysLabel.setBounds(60, 360, 150, 30);

        BPDiaLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        BPDiaLabel.setText("Blood Pressure (Diastolic)");
        getContentPane().add(BPDiaLabel);
        BPDiaLabel.setBounds(60, 400, 160, 30);

        PresentAddLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PresentAddLabel.setText("Present Address");
        getContentPane().add(PresentAddLabel);
        PresentAddLabel.setBounds(60, 440, 140, 30);

        PermaAddLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        PermaAddLabel.setText("Permanent Address");
        getContentPane().add(PermaAddLabel);
        PermaAddLabel.setBounds(60, 480, 140, 30);

        EmailLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(60, 520, 90, 30);

        LastDonationLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        LastDonationLabel.setText("Last Donation Date");
        getContentPane().add(LastDonationLabel);
        LastDonationLabel.setBounds(60, 560, 140, 30);

        RegularDonorLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        RegularDonorLabel.setText("Regular Donor? ");
        getContentPane().add(RegularDonorLabel);
        RegularDonorLabel.setBounds(60, 600, 130, 40);
        getContentPane().add(WeightTextField);
        WeightTextField.setBounds(220, 320, 180, 30);
        getContentPane().add(BPSysTextField);
        BPSysTextField.setBounds(220, 360, 180, 30);
        getContentPane().add(BPDiaTextField);
        BPDiaTextField.setBounds(220, 400, 180, 30);
        getContentPane().add(PATextField);
        PATextField.setBounds(220, 440, 180, 30);
        getContentPane().add(PA2TextField);
        PA2TextField.setBounds(220, 480, 180, 30);

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField);
        EmailTextField.setBounds(220, 520, 180, 30);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Blood Group");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 650, 110, 30);

        BloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Blood Group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        BloodGroupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupComboActionPerformed(evt);
            }
        });
        getContentPane().add(BloodGroupCombo);
        BloodGroupCombo.setBounds(220, 650, 180, 30);

        RegDonorRadioY.setText("Yes");
        getContentPane().add(RegDonorRadioY);
        RegDonorRadioY.setBounds(210, 610, 43, 23);

        RegDonorRadioN.setText("No");
        getContentPane().add(RegDonorRadioN);
        RegDonorRadioN.setBounds(310, 610, 39, 23);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        GenderRadioButtonMale.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        GenderRadioButtonMale.setText("Male");
        GenderRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderRadioButtonMaleActionPerformed(evt);
            }
        });
        jPanel1.add(GenderRadioButtonMale);

        GenderRadioButtonFemale.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        GenderRadioButtonFemale.setText("Female");
        jPanel1.add(GenderRadioButtonFemale);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 240, 170, 30);

        setSize(new java.awt.Dimension(484, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterDonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterDonorButtonActionPerformed
        String name = donorNameTextField.getText();
        String father_name = FathersNameTextfield.getText();
        String mother_name = MotherNameTextField.getText();
        String DateofBirth = DoB.getText();
        String sex = null;
        if(GenderRadioButtonMale.isSelected())
            sex = "Male";
        else
            sex = "Female";
        
        String occupation = OccupationTextField.getText();
        String weight = WeightTextField.getText();
        String bpsys = BPSysTextField.getText();
        String bpdia = BPDiaTextField.getText();
        String presentAdd = PATextField.getText();
        String permanentAdd = PA2TextField.getText();
        String email = EmailTextField.getText();
        String lastDonation = lastDonationDate.getText();
        String regular = null;
        if(RegDonorRadioY.isSelected())
            regular = "Yes";
        else
            regular = "No";
        int bloodGroupNum = BloodGroupCombo.getSelectedIndex();
        String bloodGroup = "";
                switch(bloodGroupNum)
                {
                   
                    case 1:
                        bloodGroup = "A+";
                        break;
                    case 2:
                        bloodGroup = "A-";
                        break;
                    case 3:
                        bloodGroup = "B+";
                        break;
                    case 4:
                        bloodGroup = "B-";
                        break;
                    case 5:
                        bloodGroup = "O+";
                        break;
                    case 6:
                        bloodGroup = "O-";
                        break;
                    case 7:
                        bloodGroup = "AB+";
                        break;
                    case 8:
                        bloodGroup = "AB-";
                        break;
                    
                        
                }
        
        if(name.isEmpty() || father_name.isEmpty()  || sex.isEmpty() || occupation.isEmpty() || weight.isEmpty() || bpsys.isEmpty() || bpdia.isEmpty() || presentAdd.isEmpty() || permanentAdd.isEmpty() || email.isEmpty() || regular.isEmpty()  || bloodGroup=="")
        {
            JOptionPane.showMessageDialog(this, "All fields mandatory !!");
        }
        else if(getAge(DateofBirth)<18)
        {
            JOptionPane.showMessageDialog(this, "Age not valid less than 18");
        }
        
        else
        {
            try
            {
                boolean isNotExist = true;
                
                Connection testCon = DataBaseConnection.open();
                Statement testStmt = (Statement)testCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet testRs = testStmt.executeQuery("select * from donor where donor_name='"+name+"' and donor_dob='"+DateofBirth+"' and donor_blood_group='"+bloodGroup+"'");
                if(testRs.next())
                {
                    JOptionPane.showMessageDialog(this, "Entry already exist !!");
                    isNotExist = false;
                }
                DataBaseConnection.close(testCon);
                if(isNotExist)
                {
                    
                    Connection con = DataBaseConnection.open();
                    Statement stmt = (Statement)con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from donor");
                    rs.moveToInsertRow();
                    rs.updateString("donor_name", name);
                    rs.updateString("father_name", father_name);
                    rs.updateString("mother_name", mother_name);
                    rs.updateString("donor_dob", DateofBirth);
                    rs.updateString("donor_sex", sex);
                    rs.updateString("donor_occupation", occupation);
                    rs.updateString("donor_weight", weight);
                    rs.updateString("bp_systolic", bpsys);
                    rs.updateString("bp_diastolic", bpdia);
                    rs.updateString("present_address", presentAdd);
                    rs.updateString("permanent_address", permanentAdd);
                    rs.updateString("email", email);
                    rs.updateString("last_donation_date", lastDonation);
                    rs.updateString("regular_donor", regular);
                    rs.updateString("donor_blood_group", bloodGroup);
                    //rs.updateInt("donor_total_donations", 1);
                    rs.insertRow();
                    rs.last();
//                    int donorId = rs.getInt("donor_id");
                    DataBaseConnection.close(con);
                    JOptionPane.showMessageDialog(this, "Donor Registered Succesfully");
                    this.dispose();
                    
                   // new RegistrationControl().setVisible(true);
                    
                   // Connection con2 = DataBaseConnection.open();
                    //Statement stmt2 = (Statement)con2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    //ResultSet rs2 = stmt2.executeQuery("select * from donors_in_camp");
                    //rs2.moveToInsertRow();
                    //rs2.updateInt("camp_id", campId);
                    //rs2.updateInt("donor_id", donorId);
                    //rs2.insertRow();
                    //DataBaseConnection.close(con2);
//                    generateDonorList();
//                    new Thread(new WorkingCamp.UpdateDonorTable(workingCampNewDonorTable,workingCampNewDonorScrollPane)).start();
//                    new Thread(new WorkingCamp.UpdateDonorTable(workingCampExistingDonorTable,workingCampExistingDonorScrollPane)).start();
//                    new Thread(new WorkingCamp.DataSetBloodCollection(bloodGroup)).start();
//                    JOptionPane.showMessageDialog(workingCampNewDonorPanel, "Entery Saved !!");
//                    clearEntry();
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }
        
     
    }//GEN-LAST:event_RegisterDonorButtonActionPerformed

       int getAge(String dateOfBirth)
    {
        Calendar dob = Calendar.getInstance(); 
        Date d = null;
        try
        {
            d = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        dob.setTime(d);  
        Calendar today = Calendar.getInstance();  
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);  
        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) 
        {
            age--;  
        } 
        else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) 
        {
            age--;  
        }
        return age;
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Global.mainForm.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void FathersNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathersNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathersNameTextfieldActionPerformed

    private void MotherNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotherNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotherNameTextFieldActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void GenderRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderRadioButtonMaleActionPerformed

    private void BloodGroupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupComboActionPerformed

    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddDonor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPDiaLabel;
    private javax.swing.JTextField BPDiaTextField;
    private javax.swing.JLabel BPSysLabel;
    private javax.swing.JTextField BPSysTextField;
    private javax.swing.JComboBox<String> BloodGroupCombo;
    private javax.swing.JLabel DoBLabel;
    private javax.swing.JLabel DonorNameLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel FathersNameLabel;
    private javax.swing.JTextField FathersNameTextfield;
    private javax.swing.JRadioButton GenderRadioButtonFemale;
    private javax.swing.JRadioButton GenderRadioButtonMale;
    private javax.swing.JLabel LastDonationLabel;
    private javax.swing.JTextField MotherNameTextField;
    private javax.swing.JLabel MothersNameLabel;
    private javax.swing.JLabel OccupationLabel;
    private javax.swing.JTextField OccupationTextField;
    private javax.swing.JTextField PA2TextField;
    private javax.swing.JTextField PATextField;
    private javax.swing.JLabel PermaAddLabel;
    private javax.swing.JLabel PresentAddLabel;
    private javax.swing.JRadioButton RegDonorRadioN;
    private javax.swing.JRadioButton RegDonorRadioY;
    private javax.swing.JButton RegisterDonorButton;
    private javax.swing.JLabel RegularDonorLabel;
    private javax.swing.JLabel SexLabel;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JTextField donorNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
