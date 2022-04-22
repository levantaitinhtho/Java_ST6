
package Login_Register.main;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Login_Register extends javax.swing.JFrame {
    public Login_Register() {
        initComponents();
        
        setLocationRelativeTo(null);
        login_Lable.setBackground(new Color(58,52,52));
        login_Lable.setForeground(Color.red);
        register_Lable.setForeground(Color.white);
        login_Lable.setBorder(new MatteBorder(0, 0, 3 , 0, Color.CYAN));
        register_Lable.setBorder(new MatteBorder(0, 0, 0, 0, Color.GREEN));
        register_Lable.setBackground(new Color(58,52,52));
        panel_DangNhap.setVisible(true);
        panel_DangKy.setVisible(false);
        hide.setVisible(false);
        hide1_Lable.setVisible(false);
        hidePassDn_Lable.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        panel_DangNhapDangKy = new javax.swing.JPanel();
        panel_TrangThai = new javax.swing.JPanel();
        login_Lable = new javax.swing.JLabel();
        register_Lable = new javax.swing.JLabel();
        panel_DangNhap = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tenDn_textField = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        matKhauDn_passWordField = new javax.swing.JPasswordField();
        showPassDn_Lable = new javax.swing.JLabel();
        hidePassDn_Lable = new javax.swing.JLabel();
        panel_DangKy = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tenTaiKhoan_textField = new javax.swing.JTextField();
        email_textField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        taoMoi_btn = new javax.swing.JButton();
        matKhau_PasswordField = new javax.swing.JPasswordField();
        nhapLaiMatKhau_PasswordField = new javax.swing.JPasswordField();
        show_Lable = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        showPass1_Lable1 = new javax.swing.JLabel();
        hide1_Lable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        panel_DangNhapDangKy.setBackground(new java.awt.Color(58, 52, 52));

        panel_TrangThai.setBackground(new java.awt.Color(58, 52, 52));
        panel_TrangThai.setDoubleBuffered(false);
        panel_TrangThai.setLayout(new java.awt.GridLayout(1, 2));

        login_Lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_Lable.setText("ĐĂNG NHẬP");
        login_Lable.setAlignmentY(0.0F);
        login_Lable.setOpaque(true);
        login_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_LableMouseClicked(evt);
            }
        });
        panel_TrangThai.add(login_Lable);

        register_Lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        register_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_Lable.setText("ĐĂNG KÝ");
        register_Lable.setOpaque(true);
        register_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                register_LableMousePressed(evt);
            }
        });
        panel_TrangThai.add(register_Lable);

        panel_DangNhap.setBackground(new java.awt.Color(58, 52, 52));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/user.png"))); // NOI18N
        jLabel2.setText(" TÊN TÀI KHOẢN:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/padlock.png"))); // NOI18N
        jLabel3.setText(" MẬT KHẨU:");

        tenDn_textField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tenDn_textField.setText("  ");
        tenDn_textField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        login_button.setBackground(new java.awt.Color(102, 255, 255));
        login_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        login_button.setText("Đăng Nhập");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        matKhauDn_passWordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        matKhauDn_passWordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        showPassDn_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/show.png"))); // NOI18N
        showPassDn_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassDn_LableMousePressed(evt);
            }
        });

        hidePassDn_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/showPass.png"))); // NOI18N
        hidePassDn_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePassDn_LableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_DangNhapLayout = new javax.swing.GroupLayout(panel_DangNhap);
        panel_DangNhap.setLayout(panel_DangNhapLayout);
        panel_DangNhapLayout.setHorizontalGroup(
            panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DangNhapLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapLayout.createSequentialGroup()
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapLayout.createSequentialGroup()
                        .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tenDn_textField)
                            .addComponent(matKhauDn_passWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassDn_Lable)
                            .addComponent(hidePassDn_Lable))
                        .addGap(19, 19, 19))))
        );
        panel_DangNhapLayout.setVerticalGroup(
            panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DangNhapLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenDn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DangNhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matKhauDn_passWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_DangNhapLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassDn_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hidePassDn_Lable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panel_DangKy.setBackground(new java.awt.Color(58, 52, 52));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/user.png"))); // NOI18N
        jLabel4.setText(" TÊN TÀI KHOẢN:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/email.png"))); // NOI18N
        jLabel5.setText(" EMAIL:");

        tenTaiKhoan_textField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tenTaiKhoan_textField.setText("  ");
        tenTaiKhoan_textField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        email_textField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email_textField.setText("  ");
        email_textField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/padlock.png"))); // NOI18N
        jLabel6.setText(" MẬT KHẨU:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/padlock.png"))); // NOI18N
        jLabel7.setText(" NHẬP LẠI MẬT KHẨU:");

        taoMoi_btn.setBackground(new java.awt.Color(51, 255, 255));
        taoMoi_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        taoMoi_btn.setText("Đăng Ký");
        taoMoi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taoMoi_btnActionPerformed(evt);
            }
        });

        matKhau_PasswordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        matKhau_PasswordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        nhapLaiMatKhau_PasswordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nhapLaiMatKhau_PasswordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        show_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/show.png"))); // NOI18N
        show_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_LableMousePressed(evt);
            }
        });

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/showPass.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });

        showPass1_Lable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/show.png"))); // NOI18N
        showPass1_Lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPass1_Lable1MousePressed(evt);
            }
        });

        hide1_Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Register/main/image/showPass.png"))); // NOI18N
        hide1_Lable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1_LableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_DangKyLayout = new javax.swing.GroupLayout(panel_DangKy);
        panel_DangKy.setLayout(panel_DangKyLayout);
        panel_DangKyLayout.setHorizontalGroup(
            panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DangKyLayout.createSequentialGroup()
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangKyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taoMoi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(panel_DangKyLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(matKhau_PasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_textField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenTaiKhoan_textField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapLaiMatKhau_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_Lable)
                    .addComponent(hide)
                    .addComponent(showPass1_Lable1)
                    .addComponent(hide1_Lable))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel_DangKyLayout.setVerticalGroup(
            panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DangKyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenTaiKhoan_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matKhau_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showPass1_Lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hide1_Lable)))
                .addGap(18, 18, 18)
                .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DangKyLayout.createSequentialGroup()
                        .addComponent(show_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_DangKyLayout.createSequentialGroup()
                        .addGroup(panel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapLaiMatKhau_PasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hide, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(taoMoi_btn))))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KÝ TÚC XÁ");

        javax.swing.GroupLayout panel_DangNhapDangKyLayout = new javax.swing.GroupLayout(panel_DangNhapDangKy);
        panel_DangNhapDangKy.setLayout(panel_DangNhapDangKyLayout);
        panel_DangNhapDangKyLayout.setHorizontalGroup(
            panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panel_DangNhapDangKyLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapDangKyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_DangNhapDangKyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
            .addGroup(panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapDangKyLayout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(panel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panel_DangNhapDangKyLayout.setVerticalGroup(
            panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DangNhapDangKyLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panel_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapDangKyLayout.createSequentialGroup()
                    .addContainerGap(183, Short.MAX_VALUE)
                    .addComponent(panel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
            .addGroup(panel_DangNhapDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DangNhapDangKyLayout.createSequentialGroup()
                    .addContainerGap(141, Short.MAX_VALUE)
                    .addComponent(panel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_DangNhapDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_DangNhapDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        
        String a = tenDn_textField.getText();
        String ten = a.substring(2);
        String matKhau = new String(matKhauDn_passWordField.getPassword());
        StringBuilder sb = new StringBuilder();
        if(ten.equals(""))
            sb.append("You need to enter your account name");
        if(matKhau.equals(""))
            sb.append("\nYou need to enter password");
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Login error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_login_buttonActionPerformed

    private void login_LableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_LableMouseClicked
        register_Lable.setBorder(null);
        login_Lable.setBackground(new Color(58,52,52));
        login_Lable.setForeground(Color.red);
        register_Lable.setForeground(Color.white);
        login_Lable.setBorder(new MatteBorder(0, 0, 3, 0, Color.CYAN));
        register_Lable.setBackground(new Color(58,52,52));
        panel_DangNhap.setVisible(true);
        panel_DangKy.setVisible(false);
    }//GEN-LAST:event_login_LableMouseClicked

    private void register_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_LableMousePressed
        login_Lable.setBorder(null);
        register_Lable.setBorder(new MatteBorder(0, 0, 3, 0, Color.CYAN));
        panel_DangNhap.setVisible(false);
        panel_DangKy.setVisible(true);
        login_Lable.setBackground(new Color(58,52,52));
        login_Lable.setForeground(Color.white);
        register_Lable.setBackground(new Color(58,52,52));
        register_Lable.setForeground(Color.red);
    }//GEN-LAST:event_register_LableMousePressed

    private void taoMoi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taoMoi_btnActionPerformed
        String a = tenTaiKhoan_textField.getText();
        String ten = a.substring(2);
        String b = email_textField.getText();
        KiemTraEmail validator = new KiemTraEmail();
        String email = b.substring(2);
        StringBuilder sb = new StringBuilder();
        String pass = new String(matKhau_PasswordField.getPassword());
        String passRetype = new String(nhapLaiMatKhau_PasswordField.getPassword());
        if(validator.validate(email)==false)
            sb.append("Invalid email");
        if(ten.equals(""))
            sb.append("You have not entered your name");
        if(email.equals(""))
            sb.append("\nYou have not entered your email");
        if(pass.equals(""))
            sb.append("\nYou have not entered password");
        if(passRetype.equals(""))
            sb.append("\nYou have not re-entered the password");
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Lỗi đăng ký", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            JOptionPane.showMessageDialog(this, "Tuyet vơi");
        }
    }//GEN-LAST:event_taoMoi_btnActionPerformed

    private void show_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_LableMousePressed
        hide.setVisible(true);
        nhapLaiMatKhau_PasswordField.setEchoChar((char) 0);
        show_Lable.setVisible(false);
    }//GEN-LAST:event_show_LableMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        nhapLaiMatKhau_PasswordField.setEchoChar('*');
        show_Lable.setVisible(true);
        hide.setVisible(false);
    }//GEN-LAST:event_hideMousePressed

    private void showPass1_Lable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1_Lable1MousePressed
        hide1_Lable.setVisible(true);
        matKhau_PasswordField.setEchoChar((char) 0);
        showPass1_Lable1.setVisible(false);
    }//GEN-LAST:event_showPass1_Lable1MousePressed

    private void hide1_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1_LableMousePressed
       matKhau_PasswordField.setEchoChar('*');
        showPass1_Lable1.setVisible(true);
        hide1_Lable.setVisible(false);
    }//GEN-LAST:event_hide1_LableMousePressed

    private void showPassDn_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassDn_LableMousePressed
        hidePassDn_Lable.setVisible(true);
        matKhauDn_passWordField.setEchoChar((char) 0);
        showPassDn_Lable.setVisible(false);
    }//GEN-LAST:event_showPassDn_LableMousePressed

    private void hidePassDn_LableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassDn_LableMousePressed
         matKhauDn_passWordField.setEchoChar('*');
        showPassDn_Lable.setVisible(true);
        hidePassDn_Lable.setVisible(false);
    }//GEN-LAST:event_hidePassDn_LableMousePressed

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
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_textField;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide1_Lable;
    private javax.swing.JLabel hidePassDn_Lable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel login_Lable;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField matKhauDn_passWordField;
    private javax.swing.JPasswordField matKhau_PasswordField;
    private javax.swing.JPasswordField nhapLaiMatKhau_PasswordField;
    private javax.swing.JPanel panel_DangKy;
    private javax.swing.JPanel panel_DangNhap;
    private javax.swing.JPanel panel_DangNhapDangKy;
    private javax.swing.JPanel panel_TrangThai;
    private javax.swing.JLabel register_Lable;
    private javax.swing.JLabel showPass1_Lable1;
    private javax.swing.JLabel showPassDn_Lable;
    private javax.swing.JLabel show_Lable;
    private javax.swing.JButton taoMoi_btn;
    private javax.swing.JTextField tenDn_textField;
    private javax.swing.JTextField tenTaiKhoan_textField;
    // End of variables declaration//GEN-END:variables
}
