
package myapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Login_Enterform extends javax.swing.JFrame {

    
    public Login_Enterform() {
        initComponents();
        setSize(865,685);
        setLocation(280,80);
        setVisible(true);
        setResizable(false);
        timer.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b_Exit = new javax.swing.JButton();
        b_Login = new javax.swing.JButton();
        b_signup = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_employeename = new javax.swing.JTextField();
        t_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_forgotpw = new javax.swing.JLabel();
        checkbox_pw = new javax.swing.JCheckBox();
        b_enterlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 25, 100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 0, -1, -1));

        b_Exit.setText("Exit");
        b_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ExitActionPerformed(evt);
            }
        });

        b_Login.setText("Sign in");
        b_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LoginActionPerformed(evt);
            }
        });

        b_signup.setText("Sign up");
        b_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(b_Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(b_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addComponent(b_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, -1, 540));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 125, -1, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        t_employeename.setBackground(new java.awt.Color(255, 255, 255));
        t_employeename.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(t_employeename, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 290, 30));

        t_password.setBackground(new java.awt.Color(255, 255, 255));
        t_password.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 290, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SIGN IN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jl_forgotpw.setBackground(new java.awt.Color(255, 255, 255));
        jl_forgotpw.setFont(new java.awt.Font("Helvetica Neue", 2, 15)); // NOI18N
        jl_forgotpw.setForeground(new java.awt.Color(255, 255, 255));
        jl_forgotpw.setText("Forgot password ?");
        jl_forgotpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_forgotpwMouseClicked(evt);
            }
        });
        getContentPane().add(jl_forgotpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        checkbox_pw.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_pw.setText("Save password");
        getContentPane().add(checkbox_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        b_enterlogin.setBackground(new java.awt.Color(255, 255, 255));
        b_enterlogin.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        b_enterlogin.setForeground(new java.awt.Color(0, 0, 0));
        b_enterlogin.setText("Sign in");
        b_enterlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enterloginActionPerformed(evt);
            }
        });
        getContentPane().add(b_enterlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Sing in.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 125, 708, 523));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ExitActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Do you want exit?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_b_ExitActionPerformed

    int z = 0;
    Timer timer = new Timer(2000 ,new ActionListener () {
        public void actionPerformed(ActionEvent evt) { 
        z ++;
        switch(z) 
        { 
            case 1:
            { 
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg1.png")));
                break;
            }
            case 2: 
            { 
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg2.png")));
                break;
            }
            case 3: 
            { 
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg3.png")));
                break;
            }
            case 4: 
            { 
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg4.png")));
                break;
            }
            case 5: 
            { 
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Top_Bg.png")));
                break;
            }
        }
        if (z == 5)
            z = 0;
            
        }
    });
    
    private void b_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LoginActionPerformed

    }//GEN-LAST:event_b_LoginActionPerformed

    private void b_enterloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enterloginActionPerformed
        if (t_employeename.getText().length() == 0 || t_password.getText().length() == 0) { 
            JOptionPane.showMessageDialog(null, "Please enter information","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else { 
            Loading loading = new Loading();
            loading.setVisible(true);
        }
    }//GEN-LAST:event_b_enterloginActionPerformed

    private void jl_forgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_forgotpwMouseClicked
        Login_Confirm lg_c = new Login_Confirm();
        lg_c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jl_forgotpwMouseClicked

    private void b_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_signupActionPerformed
        Signup_Main signup = new Signup_Main();
        signup.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_b_signupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Enterform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Exit;
    private javax.swing.JButton b_Login;
    private javax.swing.JButton b_enterlogin;
    private javax.swing.JButton b_signup;
    private javax.swing.JCheckBox checkbox_pw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jl_forgotpw;
    private javax.swing.JTextField t_employeename;
    private javax.swing.JPasswordField t_password;
    // End of variables declaration//GEN-END:variables
}
