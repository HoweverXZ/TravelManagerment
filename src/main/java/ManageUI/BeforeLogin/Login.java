package ManageUI.BeforeLogin;

import DAO.JDBC;
import DBUtils.Druid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static ManageUI.BeforeLogin.start.welcomeAdmin;

public class Login extends JFrame {   //登入界面
    JLabel j1, j2, j3;
    JTextField jt1, jt2;
    JButton jb;
    JPanel jp;

    public Login() {
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.white);

        Font f = new Font("Blackadder ITC", Font.BOLD, 27);

        j1 = new JLabel("Admin Login");
        j2 = new JLabel("Username");
        j3 = new JLabel("Password");
        j1.setBounds(120, 100, 150, 20);
        j1.setForeground(Color.red);
        j1.setFont(new Font("Blackadder ITC", Font.BOLD, 25));
        j2.setBounds(50, 150, 100, 20);
        j2.setForeground(Color.MAGENTA);
        j2.setFont(new Font("Blackadder ITC", Font.BOLD, 25));
        j3.setBounds(50, 200, 100, 20);
        j3.setForeground(Color.MAGENTA);
        j3.setFont(new Font("Blackadder ITC", Font.BOLD, 25));
        jp.add(j1);
        jp.add(j2);
        jp.add(j3);

        jb = new JButton("Submit");

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    ResultSet res = JDBC.login("select * from user where username = ? and password = ?", Druid.getConnection(), jt1.getText(), jt2.getText());
                    if (res.next()) {
                        welcomeAdmin.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(jp, "Wrong Username or password!");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jb.setBackground(Color.WHITE);
        jb.setForeground(Color.BLACK);
        jb.setBounds(120, 300, 120, 30);
        jp.add(jb);
        jb.setFont(f);
        jb.setOpaque(false);

        jt1 = new JTextField();
        jt1.setFont(new Font("Blackadder ITC", Font.BOLD, 25));
        jt1.setBounds(180, 150, 150, 30);
        jt1.setOpaque(false);
        jt2 = new JPasswordField();
        jt2.setFont(new Font("Blackadder ITC", Font.BOLD, 25));
        jt2.setBounds(180, 200, 150, 30);
        jt2.setOpaque(false);
        jp.add(jt1);
        jp.add(jt2);


        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("1.jpg"));
        JLabel imgLabel=new JLabel(img);
        jp.add(imgLabel ,new Integer(Integer.MIN_VALUE ));
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        Container cp=getContentPane();
        cp.setLayout(new BorderLayout());
        jp.setOpaque(false );

        getContentPane().setVisible(true);
        add(jp);
        setSize(390, 395);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}
