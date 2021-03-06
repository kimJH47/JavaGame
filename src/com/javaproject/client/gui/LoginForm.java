package com.javaproject.client.gui;

import com.javaproject.protocol.LoginData;
import com.javaproject.client.main.Main;
import com.javaproject.protocol.*;

public class LoginForm extends java.awt.Frame {


    /**
     * Creates new form LoginForm
     */
    public LoginForm() {

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        exit_label = new javax.swing.JLabel();
        pw_field = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        id_filed = new javax.swing.JTextField();
        signInPanel = new javax.swing.JPanel();
        signIn = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        signUp = new javax.swing.JLabel();
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        loginPanel.setBackground(new java.awt.Color(102, 102, 102));
        loginPanel.setForeground(new java.awt.Color(255, 255, 255));

        subPanel.setBackground(new java.awt.Color(0, 0, 0));

        exit_label.setFont(new java.awt.Font("�޸տ�����", 0, 24)); // NOI18N
        exit_label.setForeground(new java.awt.Color(255, 255, 255));
        exit_label.setText("X");
        exit_label.setToolTipText("");
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addContainerGap(233, Short.MAX_VALUE).addComponent(exit_label).addContainerGap()));
        subPanelLayout.setVerticalGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(subPanelLayout.createSequentialGroup().addContainerGap().addComponent(exit_label)
                        .addContainerGap(274, Short.MAX_VALUE)));

        pw_field.setBackground(new java.awt.Color(102, 102, 102));
        pw_field.setBorder(null);
        pw_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw_fieldActionPerformed(evt);
            }
        });

        id_filed.setBackground(new java.awt.Color(102, 102, 102));
        id_filed.setColumns(10);
        id_filed.setBorder(null);
        id_filed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_filedActionPerformed(evt);
            }
        });

        signInPanel.setBackground(new java.awt.Color(102, 102, 102));
        signInPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signInPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInPanelMouseClicked(evt);
            }
        });

        signIn.setFont(new java.awt.Font("���� ���", 0, 14)); // NOI18N
        signIn.setText("Sign IN");

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout
                .setHorizontalGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signInPanelLayout.createSequentialGroup().addContainerGap().addComponent(signIn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        signInPanelLayout
                .setVerticalGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signInPanelLayout.createSequentialGroup().addContainerGap().addComponent(signIn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        signUpPanel.setBackground(new java.awt.Color(102, 102, 102));
        signUpPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signUpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpPanelMouseClicked(evt);
            }
        });

        signUp.setFont(new java.awt.Font("���� ���", 0, 14)); // NOI18N
        signUp.setText("Sign UP");

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(signUpPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signUpPanelLayout.createSequentialGroup().addContainerGap().addComponent(signUp,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()));
        signUpPanelLayout
                .setVerticalGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpPanelLayout.createSequentialGroup().addContainerGap().addComponent(signUp)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(loginPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup().addGap(48, 48, 48).addGroup(loginPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(loginPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pw_field, javax.swing.GroupLayout.PREFERRED_SIZE, 191,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(id_filed, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGroup(loginPanelLayout.createSequentialGroup().addGap(2, 2, 2)
                                        .addGroup(loginPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(loginPanelLayout.createSequentialGroup()
                                                        .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18).addComponent(signUpPanel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 193,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        loginPanelLayout.setVerticalGroup(loginPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup().addGap(82, 82, 82)
                        .addComponent(id_filed, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pw_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        loginPanelLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(subPanel,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void id_filedActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void pw_fieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void signInPanelMouseClicked(java.awt.event.MouseEvent evt) {
        String pw = "";
        char[] secret_pw = pw_field.getPassword(); // secret_pw
        for (char cha : secret_pw) {
            Character.toString(cha);
            pw += (pw.equals("")) ? "" + cha + "" : "" + cha + "";
        }
        Main.client.sendData(new LoginData(id_filed.getText(), pw, LoginData.LOGIN_REQUEST));
    }


    private void signUpPanelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new SignUpForm().setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel exit_label;
    private javax.swing.JTextField id_filed;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField pw_field;
    private javax.swing.JLabel signIn;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel signUp;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPanel subPanel;
    // End of variables declaration
}