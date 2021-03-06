
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
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
public class BankSystemLogin extends javax.swing.JFrame {

    //instance variables for all of the necessary information to be gathered from the text file 
    private static String accountNumberEntered;
    private static String passwordEntered;
    private static boolean accessible;
    private static String address;
    private static String phoneNumber;
    private static String username;
    private static String initialDeposit;
    private static String infoArray[] = new String[5];

    /**
     * Creates new form BankLogin
     */
    public BankSystemLogin() {
        initComponents();
        //set the location to the center of the screen
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
        accountNumberTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 58, 147));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Login Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(30, 139, 195));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Account Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Password:");

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jButton1.setText("Submit Information");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Main Menu");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Click here to make an account!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountNumberTxt)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(accountNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
        //UNUSED 
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        //if the user clicks on the register label
        //make a new register object/GUI
        BankSystemRegister rgf = new BankSystemRegister();
        //set it visible
        rgf.setVisible(true);
        //make it the correct dimensions based on the size of the layout
        rgf.pack();
        //center the GUI to the center to the screen
        rgf.setLocationRelativeTo(null);
        //close the application and when they exit the window
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //destroy the frame
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //when the user clicks login

        //initialize the accountNumberEntered instance variable to the account number the user had input
        BankSystemLogin.accountNumberEntered = accountNumberTxt.getText();
        //initialize the passwordEntered instance variable to the password the user had input
        BankSystemLogin.passwordEntered = passwordTxt.getText();
        //Set a basic string variable to the instance variable for accountNumberEntered
        String accountNumber = BankSystemLogin.accountNumberEntered;
        //Set a basic string variable to the instance variable for passwordEntered
        String password = BankSystemLogin.passwordEntered;
        //create a string with the address of all the account info
        String info = "bank.Txt";
        //create a string with the address for the text file with just the passwords and Account number. THis text file is only used for when a user logs in.
        String data = "bankCheck.Txt";
        //initialize my instance variable to false, even tho netbeans compiler does this automatically, a different compiler may not
        this.accessible = false;
        //create an empty string 
        String checkAccountNumber = "";
        //create an empty string
        String checkPassword = "";
        //try catch to see if user input corresponds with an account
        try {
            //create a scanner to read through the file and see if the user input matches whats in the bankCheck text file
            Scanner dataScan = new Scanner(new File(data));
            dataScan.useDelimiter("[,\n]");
            //create a while loop and strings that are equivalent to the line the scanner is on
            while (dataScan.hasNext() && !this.accessible) {
                checkAccountNumber = dataScan.next();
                checkPassword = dataScan.next();
                //if what the strings being the current file line match what the user inputs, make the accessible boolean true
                if (checkAccountNumber.trim().equals(accountNumber.trim()) && checkPassword.trim().equals(password.trim())) {
                    this.accessible = true;

                }

            }
            //close the scanner
            dataScan.close();
            //incase there was some issue in reading in the file, let an error appear in the output
        } catch (Exception e) {
            System.out.println("Error Found");
        }
        //if it turns out that the user input matches a line, and this accessible is true, we now can redirect the user to the Account Page.
        if (this.accessible) {
            //create a new account pafe
            AccountPage lgf = new AccountPage();
            //set it visible
            lgf.setVisible(true);
            //make it the correct dimensions based on the size of the layout
            lgf.pack();
            //center the GUI to the center to the screen
            lgf.setLocationRelativeTo(null);
            //close the application and when they exit the window
            lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //destroy the frame
            this.dispose();
            // if accessible is still flase, let the user know that they have nput invalid information
        } else {
            JOptionPane.showMessageDialog(rootPane, "The information given does not correspond to an account.");
        }
        //run the update method if accessible is true
        if (this.accessible) {
            update();
        }
    }//GEN-LAST:event_jButton1MouseClicked
    //make classes to return all of the user's information
    //this method returns the user's account number
    public static String returnAccountNumber() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.accountNumberEntered;
        } else {
            return null;
        }
    }

    //this method returns the users password
    public static String returnPassword() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.passwordEntered;
        } else {
            return null;
        }
    }

    //this method returns the user's address
    public static String returnAddress() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.address;
        } else {
            return null;
        }
    }

    //this method returns the user's phone number
    public static String returnPhoneNumber() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.phoneNumber;
        } else {
            return null;
        }
    }

    ////this method returns the user's username
    public static String returnUsername() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.username;
        } else {
            return null;
        }
    }

    //this method returns the user's deposit
    public static String returnInitialDeposit() {
        if (BankSystemLogin.accessible) {
            return BankSystemLogin.initialDeposit;
        } else {
            return null;
        }
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //create a new main page class
        MainPage mgf = new MainPage();
        //set it visible
        mgf.setVisible(true);
        //make it the correct dimensions based on the size of the layout
        mgf.pack();
        //set the location to the center of the screen
        mgf.setLocationRelativeTo(null);
        //close the application and when they exit the window
        mgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //destroy the frame
        this.dispose();

    }//GEN-LAST:event_jButton2MouseClicked
    public void checkInfo(String username, String password, String data) {

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
            java.util.logging.Logger.getLogger(BankSystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankSystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankSystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankSystemLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankSystemLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordTxt;
    // End of variables declaration//GEN-END:variables
    //method to update the user information when they change their
    public static void update() {
        //go through the bank text file which stores all user info not just account number and password
        try {
            //change make a variable to represent the current line in the text file
            Scanner storer = new Scanner(new File("bank.Txt"));
            while (storer.hasNextLine()) {
                String line = storer.nextLine();
                //if the account number used to login is found, store the next five lines
                if (line.trim().equals(BankSystemLogin.accountNumberEntered.trim())) {
                    for (int i = 0; i < 5; i++) {
                        infoArray[i] = storer.nextLine();
                    }
                }
            }

        } catch (Exception e) {
            //if an error is found, output the following message
            System.out.println("Error Founf");
        }
        //set the line right after the account number the username
        BankSystemLogin.username = infoArray[0];
        //set the second line after the account number the password
        BankSystemLogin.passwordEntered = infoArray[1];
        //set the third line after the account number as the address
        BankSystemLogin.address = infoArray[2];
        //set the fourth line after the account number as the phone number
        BankSystemLogin.phoneNumber = infoArray[3];
        //set the fifth line after the account number as the initial deposit amount
        BankSystemLogin.initialDeposit = infoArray[4];
        //make a double out of what the user entered
        double deposit = Double.valueOf(BankSystemLogin.initialDeposit);
        //round that double to the nearest 2 decimal places
        deposit = Math.round(deposit * 100);
        deposit = deposit / 100;
        //turn it back into a string and set the initial deposit equal to that 
        //this is for the user inputting 12.343443 into their initial deposit in the register page for example
        String depositText = Double.toString(deposit);
        BankSystemLogin.initialDeposit = depositText;

    }
}
