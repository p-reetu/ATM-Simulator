import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.*;
import java.util.Calendar;
import static org.jooq.impl.DSL.date;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
//LocalDateTime dt=LocalDateTime.now();
//System.out.println(dt);
public class Frame3 extends javax.swing.JFrame {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/ATMSimulator";

    // Database credentials
    static final String USER = "postgres";
    static final String PASS = "pr33tu";
    
    
    public Frame3() {
        initComponents();
        this.setTitle("Operations");
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\ATM Simulator\\bankLogo.png");
        this.setIconImage(img.getImage());
        jSP.setVisible(false);
    }
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Select = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Dept = new javax.swing.JLabel();
        DAmount = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        Enter = new javax.swing.JButton();
        Dpin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Dept1 = new javax.swing.JLabel();
        WAmount = new javax.swing.JTextField();
        Enter1 = new javax.swing.JButton();
        Cancel1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Wpin = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Dept3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Enter3 = new javax.swing.JButton();
        Cancel3 = new javax.swing.JButton();
        Reenter = new javax.swing.JPasswordField();
        Old = new javax.swing.JPasswordField();
        New = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        Dept2 = new javax.swing.JLabel();
        Enter2 = new javax.swing.JButton();
        Cancel2 = new javax.swing.JButton();
        BalanceL = new javax.swing.JLabel();
        Bpin = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        miniSL = new javax.swing.JLabel();
        Enter4 = new javax.swing.JButton();
        Cancel4 = new javax.swing.JButton();
        Mpin = new javax.swing.JPasswordField();
        jSP = new javax.swing.JScrollPane();
        mini = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel3.setLayout(null);

        Select.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        Select.setForeground(new java.awt.Color(255, 255, 255));
        Select.setText("SELECT THE OPERATION YOU WANT TO PERFORM");
        jPanel3.add(Select);
        Select.setBounds(40, 10, 700, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrutika\\Documents\\ITB309\\Bckground.png")); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 110);

        jTabbedPane1.setBackground(new java.awt.Color(204, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Dept.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dept.setForeground(new java.awt.Color(0, 0, 51));
        Dept.setText("                                   PLEASE ENTER THE AMOUNT TO DEPOSIT :");
        Dept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAmountActionPerformed(evt);
            }
        });
        DAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DAmountKeyPressed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(102, 204, 255));
        Cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Enter.setBackground(new java.awt.Color(102, 204, 255));
        Enter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Dpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DpinKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Amount :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Pin :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dpin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DAmount)
                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(Dept, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dpin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("               Deposit                ", jPanel2);

        jPanel4.setBackground(java.awt.Color.white);

        Dept1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dept1.setForeground(new java.awt.Color(0, 0, 51));
        Dept1.setText("                                 PLEASE ENTER THE AMOUNT TO WITHDRAW :");
        Dept1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        WAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WAmountKeyPressed(evt);
            }
        });

        Enter1.setBackground(new java.awt.Color(102, 204, 255));
        Enter1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Enter1.setText("Enter");
        Enter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter1ActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Pin :");

        Wpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WpinKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Amount :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dept1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Wpin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(Dept1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Wpin, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("              Withdraw              ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Dept3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dept3.setForeground(new java.awt.Color(0, 0, 51));
        Dept3.setText("                                  PLEASE ENTER THE FOLLOWING DETAILS :");
        Dept3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("New Pin :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Re-enter Pin :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Old Pin :  ");

        Enter3.setBackground(new java.awt.Color(102, 204, 255));
        Enter3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Enter3.setText("Enter");
        Enter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter3ActionPerformed(evt);
            }
        });

        Cancel3.setBackground(new java.awt.Color(102, 204, 255));
        Cancel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancel3.setText("Cancel");
        Cancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel3ActionPerformed(evt);
            }
        });

        Reenter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReenterKeyPressed(evt);
            }
        });

        Old.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dept3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(Enter3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Reenter)
                            .addComponent(Cancel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Old)
                            .addComponent(New, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Dept3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("            Change pin            ", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Dept2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Dept2.setForeground(new java.awt.Color(0, 0, 51));
        Dept2.setText("                             PLEASE ENTER YOUR PIN TO CHECK BALANCE :");
        Dept2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Enter2.setBackground(new java.awt.Color(102, 204, 255));
        Enter2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Enter2.setText("Enter");
        Enter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter2ActionPerformed(evt);
            }
        });

        Cancel2.setBackground(new java.awt.Color(102, 204, 255));
        Cancel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancel2.setText("Cancel");
        Cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel2ActionPerformed(evt);
            }
        });

        BalanceL.setBackground(new java.awt.Color(0, 0, 153));
        BalanceL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Bpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BpinKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dept2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(Bpin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalanceL, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Enter2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Dept2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Bpin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BalanceL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("          Balance check          ", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        miniSL.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        miniSL.setForeground(new java.awt.Color(0, 0, 51));
        miniSL.setText("                        PLEASE ENTER YOUR PIN TO CREATE MINI STATEMENT :");
        miniSL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.add(miniSL);
        miniSL.setBounds(0, 20, 765, 32);

        Enter4.setBackground(new java.awt.Color(102, 204, 255));
        Enter4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Enter4.setText("Enter");
        Enter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter4ActionPerformed(evt);
            }
        });
        jPanel7.add(Enter4);
        Enter4.setBounds(236, 238, 140, 50);

        Cancel4.setBackground(new java.awt.Color(102, 204, 255));
        Cancel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cancel4.setText("Cancel");
        Cancel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel4ActionPerformed(evt);
            }
        });
        jPanel7.add(Cancel4);
        Cancel4.setBounds(394, 238, 140, 50);

        Mpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MpinKeyPressed(evt);
            }
        });
        jPanel7.add(Mpin);
        Mpin.setBounds(317, 114, 140, 40);

        mini.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Date", "Operation", "Amount"
            }
        ));
        mini.setGridColor(new java.awt.Color(0, 153, 204));
        jSP.setViewportView(mini);

        jPanel7.add(jSP);
        jSP.setBounds(139, 58, 492, 148);

        jTabbedPane1.addTab("          Mini statement          ", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DAmountKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            DAmount.setEditable(false);
        }
        else
        {
            DAmount.setEditable(true);
        }
    }//GEN-LAST:event_DAmountKeyPressed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        close();
    }//GEN-LAST:event_CancelActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        //deposit
        Connection conn = null;
        Statement stmt = null;
        try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Update customer set balance = balance + ? where pin=?";
           
                   
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           pstmt.setInt(1,Integer.parseInt(DAmount.getText()));
           //pstmt.setInt(2,Integer.parseInt(Frame1.pin.getText()));
           
           pstmt.setInt(2,Integer.parseInt(Dpin.getText()));
            //String text;
            //text = Frame1.pin.getText();
           pstmt.executeUpdate();

           stmt.close();
           conn.close();
           JOptionPane.showMessageDialog(this, "Amount deposited Successfully");
        }
        catch(Exception e){
        System.out.println(e);
        }
        try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Insert into operation (ttime,tdate,type,tamount,opin) values (?,?,?,?,?)";
           
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           pstmt.setInt(4,Integer.parseInt(DAmount.getText()));
           pstmt.setInt(5,Integer.parseInt(Dpin.getText()));
           pstmt.setString(3,"Deposit");
           /*Date date;
            date = new Date();
           java.sql.Date sqldate=new java.sql.Date(date.getTime());*/
           java.util.Date adate = Calendar.getInstance().getTime();
           SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
            //Object date = null;
           String strDate = formatter.format(adate);
           //LocalDate a = LocalDate.now();
           pstmt.setString(2,strDate);   
           java.util.Date atime = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");  
           String strtime = dateFormat.format(atime);
           pstmt.setString(1,strtime);
           
           pstmt.executeUpdate();
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void WAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WAmountKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            WAmount.setEditable(false);
        }
        else
        {
            WAmount.setEditable(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_WAmountKeyPressed

    private void Enter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter1ActionPerformed
        //withdraw
        Connection conn = null;
        Statement stmt = null;
        try{
            Frame1 fr=new Frame1();
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Select balance from customer where pin="+Integer.parseInt(Wpin.getText());
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           //pstmt.setInt(1,Integer.parseInt(WAmount.getText()));
           
           
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
            String bal = String.valueOf(rs.getInt("balance"));
            if(Integer.parseInt(bal)>=Integer.parseInt(WAmount.getText())){
            try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String ssql = "Update customer set balance = balance - ? where pin=?";
           
           PreparedStatement ppstmt = conn.prepareStatement(ssql);
           
           ppstmt.setInt(1,Integer.parseInt(WAmount.getText()));
           
           ppstmt.setInt(2,Integer.parseInt(Wpin.getText()));
           ppstmt.executeUpdate();
           
           JOptionPane.showMessageDialog(this, "Amount withdrawn Successfully");
           stmt.close();
           conn.close();
           
        }
        catch(Exception e){
        System.out.println(e);
        }
            }
            else{
            JOptionPane.showMessageDialog(this, "No suffiecient balance !!");
            }
           }
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        
        }
        
        try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Insert into operation (ttime,tdate,type,tamount,opin) values (?,?,?,?,?)";
           
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           pstmt.setInt(4,Integer.parseInt(WAmount.getText()));
           pstmt.setInt(5,Integer.parseInt(Wpin.getText()));
           pstmt.setString(3,"Withdraw");
           /*Date date;
            date = new Date();
           java.sql.Date sqldate=new java.sql.Date(date.getTime());*/
           java.util.Date adate = Calendar.getInstance().getTime();
           SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
            //Object date = null;
           String strDate = formatter.format(adate);
           //LocalDate a = LocalDate.now();
           pstmt.setString(2,strDate);   
           java.util.Date atime = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");  
           String strtime = dateFormat.format(atime);
           pstmt.setString(1,strtime);
           
           pstmt.executeUpdate();
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
    }//GEN-LAST:event_Enter1ActionPerformed

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_Cancel1ActionPerformed

    private void Enter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter2ActionPerformed
        //BALANCE CHECK
        Connection conn = null;
        Statement stmt = null;
        try{
           
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Select balance from customer where pin="+Integer.parseInt(Bpin.getText());

           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
           String bal = String.valueOf(rs.getInt("balance"));
           BalanceL.setText("Your account balance is : "+bal);}
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
    }//GEN-LAST:event_Enter2ActionPerformed

    private void Cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel2ActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_Cancel2ActionPerformed

    private void Enter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter3ActionPerformed
        //change pin 
        
        if(Integer.parseInt(New.getText())==Integer.parseInt(Reenter.getText())){
            Connection conn = null;
            Statement stmt = null;
            try{

               conn = DriverManager.getConnection(DB_URL, USER, PASS);
               stmt = conn.createStatement();
               String sql = "Update customer set pin = ? where pin=?";

               PreparedStatement pstmt = conn.prepareStatement(sql);


               pstmt.setInt(2,Integer.parseInt(Old.getText()));

               pstmt.setInt(1,Integer.parseInt(Reenter.getText())); 
               pstmt.executeUpdate();

               stmt.close();
               conn.close();
               JOptionPane.showMessageDialog(this, "Pin changed Successfully");        
            }
            catch(Exception e){
            System.out.println(e);
            }
            
        }
        else{
        JOptionPane.showMessageDialog(this, "Incorrect Pin !");        
        }
        try{
           Connection conn = null;
           Statement stmt = null;
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Insert into operation (ttime,tdate,type,tamount,opin) values (?,?,?,?,?)";
           
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setInt(5,Integer.parseInt(New.getText()));
           pstmt.setInt(4,0000);
 
           pstmt.setString(3,"Pin changed");
           /*Date date;
            date = new Date();
           java.sql.Date sqldate=new java.sql.Date(date.getTime());*/
           java.util.Date adate = Calendar.getInstance().getTime();
           SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
            //Object date = null;
           String strDate = formatter.format(adate);
           //LocalDate a = LocalDate.now();
           pstmt.setString(2,strDate);   
           java.util.Date atime = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");  
           String strtime = dateFormat.format(atime);
           pstmt.setString(1,strtime);
           
           pstmt.executeUpdate();
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }

    }//GEN-LAST:event_Enter3ActionPerformed

    private void Cancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel3ActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_Cancel3ActionPerformed

    private void Enter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter4ActionPerformed
        //mini statement
        jSP.setVisible(true);
        miniSL.setVisible(false);
        Mpin.setVisible(false);
        Connection conn = null;
        Statement stmt = null;
        try{
            
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
           String sql = "Select ttime,tdate,type,tamount from operation where opin=" +Integer.parseInt(Mpin.getText())+"order by ttime desc limit 7";
           ResultSet rs = stmt.executeQuery(sql);
           while(rs.next()){
           String ttime = rs.getString("ttime");
           String tdate = rs.getString("tdate");
           String type = rs.getString("type");
           String aamount = String.valueOf(rs.getInt("tamount"));
           
           String tdata[] = {ttime,tdate,type,aamount};
           DefaultTableModel tbmodel1 = (DefaultTableModel)mini.getModel(); 
           tbmodel1.addRow(tdata);
           }
           stmt.close();
           conn.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
    }//GEN-LAST:event_Enter4ActionPerformed

    private void Cancel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel4ActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_Cancel4ActionPerformed

    private void DAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DAmountActionPerformed

    private void ReenterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReenterKeyPressed
    char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            Reenter.setEditable(false);
        }
        else
        {
            Reenter.setEditable(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ReenterKeyPressed

    private void DpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DpinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DpinKeyPressed

    private void WpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WpinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_WpinKeyPressed

    private void BpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BpinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BpinKeyPressed

    private void MpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MpinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MpinKeyPressed

    private void OldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
                Frame3 f = new Frame3();
                f.setPreferredSize(new Dimension(800, 500));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceL;
    private javax.swing.JPasswordField Bpin;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cancel1;
    private javax.swing.JButton Cancel2;
    private javax.swing.JButton Cancel3;
    private javax.swing.JButton Cancel4;
    private javax.swing.JTextField DAmount;
    private javax.swing.JLabel Dept;
    private javax.swing.JLabel Dept1;
    private javax.swing.JLabel Dept2;
    private javax.swing.JLabel Dept3;
    private javax.swing.JPasswordField Dpin;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Enter1;
    private javax.swing.JButton Enter2;
    private javax.swing.JButton Enter3;
    private javax.swing.JButton Enter4;
    private javax.swing.JPasswordField Mpin;
    private javax.swing.JPasswordField New;
    private javax.swing.JPasswordField Old;
    private javax.swing.JPasswordField Reenter;
    private javax.swing.JLabel Select;
    private javax.swing.JTextField WAmount;
    private javax.swing.JPasswordField Wpin;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jSP;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable mini;
    private javax.swing.JLabel miniSL;
    // End of variables declaration//GEN-END:variables
}