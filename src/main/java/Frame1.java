import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Frame1 extends javax.swing.JFrame {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/ATMSimulator";

    // Database credentials
    static final String USER = "postgres";
    static final String PASS = "pr33tu";
    
    public Frame1() {
        initComponents();
        this.setTitle("Login Page");
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\ATM Simulator\\bankLogo.png");
        this.setIconImage(img.getImage());
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bankLogo.png")));
    }
    
    public void close(){

        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Sign = new javax.swing.JButton();
        card_noL = new javax.swing.JLabel();
        pinL = new javax.swing.JLabel();
        card_no = new javax.swing.JTextField();
        acc_no = new javax.swing.JTextField();
        pin = new javax.swing.JPasswordField();
        acc_noL2 = new javax.swing.JLabel();
        WhiteB = new javax.swing.JLabel();
        WhiteB1 = new javax.swing.JLabel();
        BlueB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        Welcome.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("WELCOME TO THE ATM");
        jPanel1.add(Welcome);
        Welcome.setBounds(280, 70, 450, 42);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(670, 450, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\ATM Simulator\\bankLogoF1.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 140, 350, 340);

        Sign.setText("Sign In");
        Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignActionPerformed(evt);
            }
        });
        jPanel1.add(Sign);
        Sign.setBounds(520, 450, 140, 40);

        card_noL.setText("PLEASE ENTER YOUR CARD NUMBER :");
        jPanel1.add(card_noL);
        card_noL.setBounds(520, 270, 320, 20);

        pinL.setText("PLEASE ENTER YOUR PIN NUMBER :");
        jPanel1.add(pinL);
        pinL.setBounds(520, 360, 320, 20);

        card_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                card_noKeyPressed(evt);
            }
        });
        jPanel1.add(card_no);
        card_no.setBounds(520, 310, 270, 26);

        acc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_noKeyPressed(evt);
            }
        });
        jPanel1.add(acc_no);
        acc_no.setBounds(520, 220, 270, 26);

        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinKeyPressed(evt);
            }
        });
        jPanel1.add(pin);
        pin.setBounds(520, 400, 110, 26);

        acc_noL2.setText("PLEASE ENTER YOUR ACCOUNT NUMBER :");
        jPanel1.add(acc_noL2);
        acc_noL2.setBounds(520, 180, 320, 20);

        WhiteB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\texture.png")); // NOI18N
        jPanel1.add(WhiteB);
        WhiteB.setBounds(310, 150, 580, 360);

        WhiteB1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\texture.png")); // NOI18N
        jPanel1.add(WhiteB1);
        WhiteB1.setBounds(110, 150, 580, 360);

        BlueB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\Bckground.png")); // NOI18N
        BlueB.setText("jLabel1");
        jPanel1.add(BlueB);
        BlueB.setBounds(10, 10, 980, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        close();
    }//GEN-LAST:event_CancelActionPerformed

    private void SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignActionPerformed
        Connection conn = null;
        Statement stmt = null;
        try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Select cardno,pin from customer where accno="+Long.parseLong(acc_no.getText());
           //PreparedStatement pstmt = conn.prepareStatement(sql);
           //pstmt.setLong(1,Integer.parseInt(acc_no.getText()) );
           //pstmt.setInt(1,Integer.parseInt(acc_no.getText()));
           //pstmt.executeQuery();
           ResultSet rs = stmt.executeQuery(sql);
          
           while(rs.next()){
           //String accc = String.valueOf(rs.getLong("accno"));
           String card = String.valueOf(rs.getLong("cardno"));
           String ppin = String.valueOf(rs.getInt("pin"));
           if(Long.parseLong(card)==Long.parseLong(card_no.getText()) && 
                   Integer.parseInt(ppin)==Integer.parseInt(pin.getText()) /*&& 
                   Long.parseLong(accc)==Long.parseLong(acc_no.getText())*/)
           {
            JOptionPane.showMessageDialog(this, "Signed In Successfully"); 
            Frame2 s= new Frame2();
            s.setVisible(true);
            this.setVisible(false);
           }
           else{
           JOptionPane.showMessageDialog(this,"Invalid pin or card number!");
           }
           }
           
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
       
    }//GEN-LAST:event_SignActionPerformed
    public int getpin() {
        int a=1234;
        
        String ppin;
        Connection conn = null;
        Statement stmt = null;
        try{
           
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Select pin from customer where accno=" + Long.parseLong(acc_no.getText());
 
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
           ppin = String.valueOf(rs.getInt("pin"));
           return Integer.parseInt(ppin);
           }
           stmt.close();
           conn.close();   
        }
        catch(Exception e){
        System.out.println(e);
        }
        return a;
    }
    //public void setpin(String password) {
    //  this.password = this.passwordTextField.getText();
    //}
    private void acc_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_noKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            acc_no.setEditable(false);
        }
        else
        {
            acc_no.setEditable(true);
        }
        //final long a= Long.parseLong(acc_no.getText());
    }//GEN-LAST:event_acc_noKeyPressed

    private void card_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_card_noKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            card_no.setEditable(false);
        }
        else
        {
            card_no.setEditable(true);
        }
    }//GEN-LAST:event_card_noKeyPressed

    private void pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            pin.setEditable(false);
        }
        else
        {
            pin.setEditable(true);
        }
    }//GEN-LAST:event_pinKeyPressed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
                Frame1 f = new Frame1();
                f.setPreferredSize(new Dimension(1000, 600));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlueB;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Sign;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel WhiteB;
    private javax.swing.JLabel WhiteB1;
    private javax.swing.JTextField acc_no;
    private javax.swing.JLabel acc_noL2;
    private javax.swing.JTextField card_no;
    private javax.swing.JLabel card_noL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pin;
    private javax.swing.JLabel pinL;
    // End of variables declaration//GEN-END:variables
}
