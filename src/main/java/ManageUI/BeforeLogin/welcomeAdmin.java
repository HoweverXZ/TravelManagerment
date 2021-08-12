package ManageUI.BeforeLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ManageUI.BeforeLogin.start.*;


public class welcomeAdmin extends JFrame implements ActionListener {
    JPanel jp;
    JLabel jl;
    JButton j1, j2, j3, j4;

    public welcomeAdmin() {
        jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(Color.white);

        jl = new JLabel("Welcome Admin");
        jl.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        jl.setBounds(50, 100, 250, 40);
        jp.add(jl);

        j1 = new JButton("Logout");
        j1.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        j1.setBackground(new Color(100, 100, 200));
        j1.setBounds(400, 100, 150, 40);
        j1.addActionListener(this);
        j1.setOpaque(false);
        jp.add(j1);

        j2 = new JButton("Tour Packages");
        j2.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        j2.setBackground(new Color(238, 248, 248));
        j2.setBounds(220, 250, 200, 40);
        j2.addActionListener(this);
        j2.setOpaque(false);
        jp.add(j2);

        j3 = new JButton("Tourist Record");
        j3.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        j3.setBackground(new Color(238, 238, 246));
        j3.setBounds(220, 320, 200, 40);
        j3.addActionListener(this);
        j3.setOpaque(false);
        jp.add(j3);

        j4 = new JButton("View Records");
        j4.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        j4.setBackground(new Color(231, 231, 238));
        j4.setBounds(220, 390, 200, 40);
        j4.addActionListener(this);
        j4.setOpaque(false);
        jp.add(j4);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("2.jpg"));
        JLabel imgLabel=new JLabel(img);
        jp.add(imgLabel ,new Integer(Integer.MIN_VALUE ));
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        Container cp=getContentPane();
        cp.setLayout(new BorderLayout());
        jp.setOpaque(false );

        add(jp);
        setSize(600, 600);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Tour Packages") {
            //进入行李界面
            setVisible(false);
            packagesEdit.setVisible(true);
        }
        if (e.getActionCommand() == "Tourist Record") {
            //进入人员信息界面
            setVisible(false);
            touristInfomationEdit.setVisible(true);
        }
        if (e.getActionCommand() == "View Records") {
            //查看界面
            setVisible(false);
            informationShowSelect.setVisible(true);
        }
        if (e.getActionCommand() == "Logout") {
            //返回登入界面
            setVisible(false);
            login.setVisible(true);
        }
    }
}
