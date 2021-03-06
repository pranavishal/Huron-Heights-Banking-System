
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ron Vishal
 */
public class BankSystemRegister extends javax.swing.JFrame {

    /**
     * Creates new form BankSystemRegister
     */
    //create instance variables for all of the informaiton the user is going to put in
    private static String password;
    private static String username;
    private static String address;
    private static String initialDeposit;
    private static String phoneNumber;
    private static String accountNumberString;
    private static long accountNumber;
   

    public BankSystemRegister() {
        initComponents();
        this.setLocationRelativeTo(null);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        initialDepositTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 58, 147));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(30, 139, 195));

        jLabel2.setBackground(new java.awt.Color(236, 240, 241));
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Enter Account Username");

        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Enter Account Address");

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Enter Account Phone Number");

        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Enter Initial Deposit Amount");

        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Create Password");

        jButton1.setText("Submit Information");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Already a User? Click here to login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jButton2.setText("Main Menu");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(usernameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(initialDepositTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneNumberTxt)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(initialDepositTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        //if the user clicks the label, create a new bank system login page
        BankSystemLogin lgf = new BankSystemLogin();
        //set it visible 
        lgf.setVisible(true);
        //make the dimesnsions based on the design layout
        lgf.pack();
        //center the frame on the screen
        lgf.setLocationRelativeTo(null);
        //stops the application when the window closes
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //destroy this frame, (bank system register
        this.dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //generate a random account number for the user that is 16 digits (most account numbers are 16 digits)
        this.accountNumber = (long) (Math.random() * 10000000000000000L);
        //convert this into a string
        this.accountNumberString = Long.toString(this.accountNumber);
        //get the text the user input for the username and convert it into a string
        this.username = usernameTxt.getText().toString();
        //get the text the user input for the address and convert it into a string
        this.address = addressTxt.getText().toString();
        //get the text the user input for the password and convert it into a string
        this.password = passwordTxt.getText().toString();
        //get the text the user input for the phone number and convert it into a string
        this.phoneNumber = phoneNumberTxt.getText().toString();
        ////get the text the user input for their initial deposit and convert it into a string
        this.initialDeposit = initialDepositTxt.getText().toString();

        //set a boolean called error to false. This will be used to determine the validity of the user's input
        boolean error = false;
        //try catch to see if the initial deposit can be stored as a double
        try {
            double deposit = Double.valueOf(this.initialDeposit);

            //round that double to the nearest 2 decimal places
            deposit = Math.round(deposit * 100);
            deposit = deposit / 100;
            //turn it back into a string and set the initial deposit equal to that 
            //this is for the user inputting 12.343443 into their initial deposit in the register page for example
            //if statement if the user inputs a negative number as their initial deposit
            if (deposit < 0) {
                error = true;
            }
            String depositText = Double.toString(deposit);
            this.initialDeposit = depositText;
            //if it can't (user input invalid info), change the value of error to true
        } catch (Exception e) {
            error = true;
        }

        //the following if statements are for if the user ended up not putting anything in the register information
        //username text field is empty
        if (this.username.length() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Username Is Required");
        }
        //address text field is empty
        if (this.address.length() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Address Is Required");
        }
        //password text field is empty
        if (this.password.length() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Password Is Required");
        }
        //phonenumber text field is empty
        if (this.phoneNumber.length() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Phone number is required. Letters may be typed as they appear on phones.");
        }//initital deposit text field is empty
        if (this.initialDeposit.length() < 1) {
            JOptionPane.showMessageDialog(rootPane, "You must place an initial deposit");
        }
        //if error ends up being true, let the user know their input is invalid
        if (error) {
            JOptionPane.showMessageDialog(rootPane, "Initial Deposit amount is invalid. Take out all special characters and letters");
            //if none of these conditions are met, we can now store the user's information into a text file
        } else {
            //try catch to create the bank check text file. This will only store the account number and password. this file is used to verify user login
            try {
                //create a file
                File loginInfo = new File("BankSystemCheck");
                //create a filewriter and call is BankCheck.Txt
                FileWriter writer = new FileWriter("bankCheck.Txt", true);
                //write the account number
                writer.write(accountNumberString);
                //sepeterate the account number and the password with a comma
                writer.write(",");
                //write the password 
                writer.write(password);
                //make a new line so the next registered input isn't put on the same line
                writer.write(System.getProperty("line.separator"));
                //close the file writer
                writer.close();

            } catch (Exception e) {
                //if an error occurs, show the user on a panel. An error shouldn't occur here due to user input however
                JOptionPane.showMessageDialog(rootPane, "Something went wrong. Please try again!");
            }
            //create a new try catch except this file would store all of the user's information instead of just the account number and password
            try {
                //create a file
                File mainInfo = new File("BankSystem");
                //create a file writer
                FileWriter writer2 = new FileWriter("bank.Txt", true);
                //write the account number
                writer2.write(this.accountNumberString);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //write the username
                writer2.write(this.username);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //write the password
                writer2.write(this.password);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //write the address
                writer2.write(this.address);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //write the phone number
                writer2.write(this.phoneNumber);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //write the initial deposit
                writer2.write(this.initialDeposit);
                //go to a new line
                writer2.write(System.getProperty("line.separator"));
                //close the file writer
                writer2.close();
                //let the user know they successfully created an account. Also let them know their account number
                JOptionPane.showMessageDialog(rootPane, "Congrats! You have successful created an account! Your account number is " + this.accountNumberString);
                //create a new bank system login page
                BankSystemLogin lgf = new BankSystemLogin();
                //set the login page visible
                lgf.setVisible(true);
                //set the preffered dimensions based on the design layout
                lgf.pack();
                //position the frame to the middle of the screen
                lgf.setLocationRelativeTo(null);
                //stop the application when the window closes
                lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //destroy this frame
                this.dispose();

            } catch (Exception e) {
                //let the user know their informaiton could not be stored for some reason. However this shouldn't be their fault
                JOptionPane.showMessageDialog(rootPane, "Something went wrong! Please try again");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        //nothing was done here
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        //go to the main page if the user clicks to go their
        MainPage mgf = new MainPage();
        //set it visible to the user
        mgf.setVisible(true);
        //make the dimensions based on the size
        mgf.pack();
        //set the location to the center of the screen
        mgf.setLocationRelativeTo(null);
        //close the frame when the window closes
        mgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //destroy this frame
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(BankSystemRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankSystemRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankSystemRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankSystemRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankSystemRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField initialDepositTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
