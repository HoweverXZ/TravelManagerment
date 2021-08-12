package ManageUI.AfterLogin;

import DAO.JDBC;
import DBUtils.Druid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import static ManageUI.BeforeLogin.start.touristInformationShow;
import static ManageUI.BeforeLogin.start.*;

//查看信息
public class informationShowSelect extends JFrame {
    JPanel jp;
    JLabel view;
    JButton logout, pack, information;

    public informationShowSelect() {
        jp = new JPanel();
        jp.setLayout(null);


        view = new JLabel("View Records");
        view.setBounds(180, 150, 200, 40);
        view.setBackground(new Color(100, 100, 200));
        view.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        jp.add(view);

        //按钮
        logout = new JButton("Back");
        logout.setBounds(330, 100, 100, 30);
        logout.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        logout.setBackground(new Color(100, 100, 200));
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                welcomeAdmin.setVisible(true);
            }
        });
        logout.setOpaque(false);
        jp.add(logout);

        pack = new JButton("Tour packages Info");
        pack.setBounds(120, 220, 240, 40);
        pack.setBackground(new Color(100, 100, 200));
        pack.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        pack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ResultSet res = null;
                try {
                    packagesInfomationShow.model.setRowCount(0);
                    res = JDBC.selectAll("tour_packages");
                    while (res.next()) {
                        Object[] objects = {res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5)};
                        packagesInfomationShow.model.addRow(objects);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(packagesInfomationShow.jp, "Something Wrong");
                } finally {
                    Druid.closeResultSet(res);
                }
                setVisible(false);
                packagesInfomationShow.setVisible(true);
            }
        });
        pack.setOpaque(false);
        jp.add(pack);

        information = new JButton("Tourist Information");
        information.setBounds(120, 270, 240, 40);
        information.setBackground(new Color(100, 100, 200));
        information.setFont(new Font("Blackadder ITC", Font.BOLD, 27));
        information.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ResultSet res = null;
                try {
                    touristInformationShow.model.setRowCount(0);
                    res = JDBC.selectAll("tourists_information");
                    while (res.next()) {
                        Object[] objects = {res.getString(1), res.getString(2), res.getString(3), res.getString(3), res.getString(5)};
                        touristInformationShow.model.addRow(objects);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(touristInformationShow.jp, "Something wrong");
                } finally {
                    Druid.closeResultSet(res);
                }
                setVisible(false);
                touristInformationShow.setVisible(true);
            }
        });
        information.setOpaque(false);
        jp.add(information);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("3.jpg"));
        JLabel imgLabel=new JLabel(img);
        jp.add(imgLabel ,new Integer(Integer.MIN_VALUE ));
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        Container cp=getContentPane();
        cp.setLayout(new BorderLayout());
        jp.setOpaque(false );

        add(jp);
        setSize(500, 500);
    }

}
