import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class Frame2 extends javax.swing.JFrame {

    public Frame2() {
        initComponents();
        this.setTitle("Account");
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\ATM Simulator\\bankLogo.png");
        this.setIconImage(img.getImage());
        //this.setIconImage(new java.setIconImage("C:\\Users\\Shrutika\\Documents\\ITB309\\ATM Simulator\\bankLogo.png"));
    }
    public void close(){

        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Select = new javax.swing.JLabel();
        BlueB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Sav = new javax.swing.JButton();
        Curr = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Cancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Select.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Select.setForeground(new java.awt.Color(255, 255, 255));
        Select.setText("SELECT YOUR ACCOUNT TYPE");
        jPanel1.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 470, -1));

        BlueB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\Bckground.png")); // NOI18N
        BlueB.setText("jLabel1");
        jPanel1.add(BlueB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Sav.setText("Saving account");
        Sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavActionPerformed(evt);
            }
        });

        Curr.setText("Current account");
        Curr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(102, 204, 255));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Go Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Cancel1.setBackground(new java.awt.Color(102, 204, 255));
        Cancel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancel1.setText("Cancel");
        Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Cancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Curr, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sav, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Sav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Curr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 780, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CurrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrActionPerformed
        Frame4 s= new Frame4();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CurrActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Frame1 s= new Frame1();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void SavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavActionPerformed
        
        
        Frame3 s= new Frame3();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SavActionPerformed

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
        close();
    }//GEN-LAST:event_Cancel1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
                Frame2 f = new Frame2();
                f.setPreferredSize(new Dimension(800, 500));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BlueB;
    private javax.swing.JButton Cancel1;
    private javax.swing.JButton Curr;
    private javax.swing.JButton Sav;
    private javax.swing.JLabel Select;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}