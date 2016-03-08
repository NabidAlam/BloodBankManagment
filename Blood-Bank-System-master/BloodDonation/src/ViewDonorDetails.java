
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class ViewDonorDetails extends javax.swing.JFrame
{
    DateTextField viewDonorDetailsDateOfBirthText;
    int id;
    public ViewDonorDetails(int id)
    {
        initComponents();
        
        this.id = id;
        viewDonorDetailsDateOfBirthText = new DateTextField();
        viewDonorDetailsDateOfBirthText.setBounds(670, 335, 185, 35);
        this.add(viewDonorDetailsDateOfBirthText);
        try
        {
            Connection con = DataBaseConnection.open();
            com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement)con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from donor where donor_id="+id);
            rs.next();
            String name = rs.getString("donor_name");
            String fathername = rs.getString("father_name");
            String mothername =rs.getString("mother_name");
            String occupation = rs.getString("donor_occupation");
            String gender = rs.getString("donor_sex");
//            String phone = rs.getString("donor_phone");
            String email = rs.getString("email");
            String address = rs.getString("present_address");
            String bloodGroup = rs.getString("donor_blood_group");
            String BPS = rs.getString("bp_systolic");
            String BPD = rs.getString("bp_diastolic");
            String weight = rs.getString("donor_weight");
            String dateOfBirth = rs.getString("donor_dob");
//            String lastDonation = rs.getString("last_donation_date");
//            Timestamp lastDonationTimeStamp = rs.getTimestamp("donor_last_donation_date");
//            int numberOfDonations = rs.getInt("donor_total_donations");
            
            UpdateTextFieldName.setText(name);
            UpdateTextFieldFathersName.setText(fathername);
            UpdateTextFieldMothersName.setText(mothername);
            UpdateTextFieldOccupation.setText(occupation);
            UpdateTextFieldEmail.setText(email);
            UpdateTextFieldPresentAddress.setText(address);
            UpdateTextFieldBloodGroup.setText(bloodGroup);
            UpdateTextFieldBPSys.setText(BPS);
            UpdateTextFieldBPDia.setText(BPD);
            UpdateTextFieldWeight.setText(weight);
//            UpdateTextFieldNoOfDonation.setText(""+numberOfDonations);
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateInString = dateOfBirth;
            Date date = formatter.parse(dateInString);
            viewDonorDetailsDateOfBirthText.setDate(date);
            
            int genderId = 0;
            switch(gender)
            {
                case "Male":
                    genderId = 0;
                    break;
                case "Female":
                    genderId = 1;
                    break;
            }
            viewDonorDetailsGenderCombo.setSelectedIndex(genderId);
            
//            Date d = new Date(lastDonationTimeStamp.getTime());
//            String lastDate = new SimpleDateFormat("dd/MM/yyyy").format(d);
//            UpdateTextFieldLastDonation.setText(lastDate);
            
            DataBaseConnection.close(con);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        
        UpdateTextFieldMothersName.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e) 
            {
                char ch = e.getKeyChar();
                if(!isNumeric(ch) || UpdateTextFieldMothersName.getText().length()>9)
                {
                    e.consume();
                }
            }
        });   
    }

    boolean isNumeric(char c)
    {
        try 
        {
            Integer.parseInt(""+c);
            return true;
        }
        catch (Exception e) 
        {
           return false; 
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newEmployeeNameLable = new javax.swing.JLabel();
        UpdateTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        newEmployeeDesignationLable = new javax.swing.JLabel();
        UpdateTextFieldMothersName = new javax.swing.JTextField();
        newEmployeePhoneLable = new javax.swing.JLabel();
        newEmployeeAgeLable = new javax.swing.JLabel();
        UpdateTextFieldLastDonation = new javax.swing.JTextField();
        newEmployeeEmailLable = new javax.swing.JLabel();
        UpdateTextFieldEmail = new javax.swing.JTextField();
        newEmployeeDateOfJoiningLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpdateTextFieldPresentAddress = new javax.swing.JTextArea();
        newEmployeeAddresslLable = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        viewDonorDetailsCancelButton = new javax.swing.JButton();
        UpdateTextFieldBloodGroup = new javax.swing.JTextField();
        viewDonorDetailsGenderCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        UpdateTextFieldFathersName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UpdateTextFieldOccupation = new javax.swing.JTextField();
        UpdateTextFieldBPSys = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UpdateTextFieldBPDia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        UpdateTextFieldWeight = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        newEmployeeNameLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeNameLable.setText("Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donor Details");

        newEmployeeDesignationLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeDesignationLable.setText("Blood Group");

        newEmployeePhoneLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeePhoneLable.setText("Mother's Name");

        newEmployeeAgeLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeAgeLable.setText("Last Donation");

        UpdateTextFieldLastDonation.setEditable(false);

        newEmployeeEmailLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeEmailLable.setText("Email");

        newEmployeeDateOfJoiningLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeDateOfJoiningLable.setText("Date Of Birth");

        UpdateTextFieldPresentAddress.setColumns(16);
        UpdateTextFieldPresentAddress.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        UpdateTextFieldPresentAddress.setRows(5);
        jScrollPane1.setViewportView(UpdateTextFieldPresentAddress);

        newEmployeeAddresslLable.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        newEmployeeAddresslLable.setText("Present Address");

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        viewDonorDetailsCancelButton.setText("Cancel");
        viewDonorDetailsCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonorDetailsCancelButtonActionPerformed(evt);
            }
        });

        UpdateTextFieldBloodGroup.setEditable(false);

        viewDonorDetailsGenderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("Occupation");

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setText("BP(Systolic)");

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("BP(Diastolic)");

        UpdateTextFieldBPDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTextFieldBPDiaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("Weight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateTextFieldOccupation))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmployeeNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmployeeAddresslLable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(newEmployeeEmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateTextFieldEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateTextFieldFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmployeePhoneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateTextFieldMothersName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDonorDetailsGenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmployeeDesignationLable, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateTextFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(viewDonorDetailsCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newEmployeeDateOfJoiningLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UpdateTextFieldWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UpdateTextFieldBPDia))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newEmployeeAgeLable, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UpdateTextFieldBPSys)
                                .addComponent(UpdateTextFieldLastDonation, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewDonorDetailsGenderCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newEmployeeNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newEmployeeDesignationLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateTextFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpdateTextFieldFathersName, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newEmployeeAgeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateTextFieldLastDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UpdateTextFieldMothersName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newEmployeePhoneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UpdateTextFieldBPSys))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UpdateTextFieldBPDia, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UpdateTextFieldOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateTextFieldWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newEmployeeDateOfJoiningLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newEmployeeEmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewDonorDetailsCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(newEmployeeAddresslLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(101, 101, 101))
        );

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        try {
            String name = UpdateTextFieldName.getText();
            String fname = UpdateTextFieldFathersName.getText();
            String mname = UpdateTextFieldMothersName.getText();
            String occ = UpdateTextFieldOccupation.getText();
            String gender = viewDonorDetailsGenderCombo.getSelectedItem().toString();
           // String address = UpdateTextFieldPresentAddress.getText();
            String email = UpdateTextFieldEmail.getText();
            String dateOfBirth = viewDonorDetailsDateOfBirthText.getText();
            String address = UpdateTextFieldPresentAddress.getText();
            String blood = UpdateTextFieldBloodGroup.getText();
            String bpS = UpdateTextFieldBPSys.getText();
            String bpD = UpdateTextFieldBPDia.getText();
            String weight = UpdateTextFieldWeight.getText();
            if (name.equals("") || fname.equals("") || mname.equals("") || occ.equals("") || gender.equals("") || email.equals("") || address.equals("") || dateOfBirth.equals("") || blood.equals("") || bpS.equals("") || bpD.equals("") || weight.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "All fields are mandotory !!");
            } 
            else 
            {
                 
                
                    Connection con = DataBaseConnection.open();
                    Statement stmt = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from donor where donor_id="+id);
                    rs.next();
                    rs.updateString("donor_name", name);
                    rs.updateString("father_name", fname);
                    rs.updateString("mother_name", mname);
                    rs.updateString("donor_occupation", occ);
                    rs.updateString("donor_weight", weight);
                    rs.updateString("bp_systolic", bpS);
                    rs.updateString("bp_diastolic", bpD);
                    rs.updateString("email", email);
                    rs.updateString("present_address", address);
                    rs.updateString("donor_dob", dateOfBirth);
                    rs.updateString("donor_sex", gender);
                    rs.updateRow();
                    DataBaseConnection.close(con);

                    JOptionPane.showMessageDialog(this, "Donor Data Updated successfully !!");

                
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void viewDonorDetailsCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonorDetailsCancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_viewDonorDetailsCancelButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Global.mainForm.setVisible(true);
        Global.currentForm.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void UpdateTextFieldBPDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTextFieldBPDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateTextFieldBPDiaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewDonorDetails(1).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UpdateTextFieldBPDia;
    private javax.swing.JTextField UpdateTextFieldBPSys;
    private javax.swing.JTextField UpdateTextFieldBloodGroup;
    private javax.swing.JTextField UpdateTextFieldEmail;
    private javax.swing.JTextField UpdateTextFieldFathersName;
    private javax.swing.JTextField UpdateTextFieldLastDonation;
    private javax.swing.JTextField UpdateTextFieldMothersName;
    private javax.swing.JTextField UpdateTextFieldName;
    private javax.swing.JTextField UpdateTextFieldOccupation;
    private javax.swing.JTextArea UpdateTextFieldPresentAddress;
    private javax.swing.JTextField UpdateTextFieldWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newEmployeeAddresslLable;
    private javax.swing.JLabel newEmployeeAgeLable;
    private javax.swing.JLabel newEmployeeDateOfJoiningLable;
    private javax.swing.JLabel newEmployeeDesignationLable;
    private javax.swing.JLabel newEmployeeEmailLable;
    private javax.swing.JLabel newEmployeeNameLable;
    private javax.swing.JLabel newEmployeePhoneLable;
    private javax.swing.JButton viewDonorDetailsCancelButton;
    private javax.swing.JComboBox viewDonorDetailsGenderCombo;
    // End of variables declaration//GEN-END:variables
}
