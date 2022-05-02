
package myapp;


import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Trailer extends javax.swing.JFrame {

    
    public Trailer()  {
        initComponents();
        setLocation(350,150);
        setVisible(true);
        setResizable(false);
        timer.start();
    
    }
   
    int z = 0;
    Timer timer = new Timer(6000 ,new ActionListener () {
        public void actionPerformed(ActionEvent evt) { 
        z ++;
        switch(z) 
        { 
            case 1:
            { 
                setVisible(false);
                Login_Main lg_main = new Login_Main();
                lg_main.setVisible(true);
            }
            
        }
            
        }
    });
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 25, 100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Trailer 03.24.04.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trailer().setVisible(true);
               
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
