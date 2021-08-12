package ManageUI.AfterLogin;

import DAO.JDBC;
import DBUtils.Druid;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static ManageUI.BeforeLogin.start.welcomeAdmin;


public class packagesEdit extends JFrame {
    static Connection conne_pack;

    static {
        try {
            conne_pack = Druid.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  JScrollPane ejscp;

    private  JScrollPane jscp;

    //选项卡组件声明
    JPanel add, edit, delete;
    JTabbedPane tab;

    //add中的组件声明
    JLabel name, code, country, day, it;
    JTextField tname, tcode, tday, nameText;
    JList jit;
    JButton submit, reset, logout;
    JComboBox tcountry;
    //edit中的组件声明
    JLabel ename, ecode, ecountry, eday, eit;
    JTextField etcode;
    JComboBox etcountry;
    JTextField etday;
    JComboBox ejname;
    JList ejit;
    JButton esubmit, ereset, elogout;
    //delete中的组件声明
    JLabel dname, dcode;
    JTextField dtcode;
    JComboBox djname;
    JButton Delete, dreset, dlogout;

    public packagesEdit() {

        //选项卡组件
        add = new JPanel();
        add.setLayout(null);
        edit = new JPanel();
        edit.setLayout(null);
        delete = new JPanel();
        delete.setLayout(null);

        //选项卡
        tab = new JTabbedPane(JTabbedPane.TOP);
        tab.add("add", add);
        tab.add("edit", edit);
        tab.add("delete", delete);

        //add中的组件
        name = new JLabel("Package Name");
        name.setBounds(50, 100, 130, 20);
        name.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        name.setOpaque(false);
        add.add(name);

        code = new JLabel("Package Code");
        code.setBounds(50, 150, 120, 20);
        code.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        code.setOpaque(false);
        add.add(code);

        country = new JLabel("Country");
        country.setBounds(50, 200, 120, 20);
        country.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        country.setOpaque(false);
        add.add(country);

        day = new JLabel("No of Days");
        day.setBounds(50, 250, 120, 20);
        day.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        day.setOpaque(false);
        add.add(day);

        it = new JLabel("Itinerary");
        it.setBounds(50, 300, 120, 20);
        it.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        it.setOpaque(false);
        add.add(it);

        nameText = new JTextField();
        nameText.setBounds(200, 100, 120, 25);
        nameText.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
//        comboname.addItem();
        nameText.setOpaque(false);
        add.add(nameText);

        tcode = new JTextField();
        tcode.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tcode.setBounds(200, 150, 120, 25);
        tcode.setText(String.valueOf(JDBC.packageCode() + 1));
        tcode.setEnabled(false);
        tcode.setOpaque(false);
        add.add(tcode);


        tcountry = new JComboBox();
        tcountry.setBounds(200, 200, 120, 25);
        tcountry.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tcountry.addItem("Chinese");
        tcountry.addItem("American");
        tcountry.addItem("British");
        tcountry.addItem("Japan");
        tcountry.addItem("German");
        tcountry.addItem("Russia");
        tcountry.setBackground(new Color(0x308CDB));
        add.add(tcountry);

        tday = new JTextField();
        tday.setBounds(200, 250, 120, 25);
        tday.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tday.setOpaque(false);
        add.add(tday);

        String[] address = {"Asia","Europe","North","America","Europe","Africa","Oceania","Antarctica"};
        jit = new JList(address);
        jit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        jscp = new JScrollPane(jit);
        jscp.setBounds(200, 300, 120, 50);
        jit.setOpaque(false);
        jscp.setForeground(new Color(0x64A4E1));
        jscp.setOpaque(false);
        jscp.getViewport().setOpaque(false);
        add.add(jscp);

        //add的submit按钮
        submit = new JButton("Submit");
        submit.setBounds(70, 350, 100, 30);
        submit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    JDBC.addAndUpdateInformation("insert into tour_packages(package_name,package_code,country,no_of_days,itinerary)values (?,?,?,?,?)",
                            nameText.getText(), tcode.getText(), (String) tcountry.getSelectedItem(), tday.getText(), (String) jit.getSelectedValuesList().toString());
                    JOptionPane.showMessageDialog(add, "Add Succeed");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(add, "Something Wrong");
                }

            }
        });
        submit.setBackground(new Color(100, 100, 200));
        submit.setOpaque(false);
        add.add(submit);

        //add的reset按钮
        reset = new JButton("Reset");
        reset.setBounds(200, 350, 100, 30);
        reset.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nameText.setText(null);
                tcode.setText(null);
                tcountry.setSelectedIndex(0);
                tday.setText(null);
                jit.setSelectedIndex(0);
            }
        });
        reset.setBackground(new Color(100, 100, 200));
        reset.setOpaque(false);
        add.add(reset);

        //add中的back按钮
        logout = new JButton("Back");
        logout.setBounds(350, 80, 100, 30);
        logout.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        logout.setBackground(new Color(100, 100, 200));
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                welcomeAdmin.setVisible(true);
            }
        });
        logout.setOpaque(false);
        add.add(logout);

        //edit中的组件
        ename = new JLabel("Package Name");
        ename.setBounds(50, 100, 130, 20);
        ename.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ename.setOpaque(false);
        edit.add(ename);

        ecode = new JLabel("Package Code");
        ecode.setBounds(50, 150, 120, 20);
        ecode.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ecode.setOpaque(false);
        edit.add(ecode);

        ecountry = new JLabel("Country");
        ecountry.setBounds(50, 200, 100, 20);
        ecountry.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ecountry.setOpaque(false);
        edit.add(ecountry);

        eday = new JLabel("No of Days");
        eday.setBounds(50, 250, 100, 20);
        eday.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        eday.setOpaque(false);
        edit.add(eday);

        eit = new JLabel("Itinerary");
        eit.setBounds(50, 300, 100, 20);
        eit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        eit.setOpaque(false);
        edit.add(eit);

        ejname = new JComboBox();
        ejname.setBounds(200, 100, 120, 25);
        ejname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ejname.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    ResultSet res = null;
                    try {
                        res = JDBC.selectOne("select * from tour_packages where package_name=?", conne_pack, (String) itemEvent.getItem());
                        while (res.next()) {
                            etcode.setText(String.valueOf(res.getInt(2)));
                            etcountry.setSelectedItem(res.getString(3));
                            etday.setText(String.valueOf(res.getInt(4)));

                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
        ejname.setForeground(new Color(0x1064BE));
        ejname.setOpaque(false);
        edit.add(ejname);


        etcode = new JTextField();
        etcode.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etcode.setBounds(200, 150, 120, 25);
        etcode.setEnabled(false);
        etcode.setOpaque(false);
        edit.add(etcode);

        etcountry = new JComboBox();
        etcountry.setBounds(200, 200, 120, 25);
        etcountry.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etcountry.addItem("Chinese");
        etcountry.addItem("American");
        etcountry.addItem("British");
        etcountry.addItem("Japan");
        etcountry.addItem("German");
        etcountry.addItem("Russia");
        etcountry.setBackground(new Color(0x1B79D2));
        edit.add(etcountry);

        etday = new JTextField();
        etday.setBounds(200, 250, 120, 25);
        etday.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etday.setOpaque(false);
        edit.add(etday);

        ejit = new JList(address);
        ejit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ejscp = new JScrollPane(ejit);
        ejscp.setBounds(200, 300, 120, 50);
        ejit.setOpaque(false);
        ejscp.setForeground(new Color(0x64A4E1));
        ejscp.setOpaque(false);
        ejscp.getViewport().setOpaque(false);
        edit.add(ejscp);

        //edit的submit按钮
        esubmit = new JButton("Submit");
        esubmit.setBounds(70, 350, 100, 30);
        esubmit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        esubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    JDBC.addAndUpdateInformation("update tour_packages set package_code=?,country=?,no_of_days=?,itinerary=? where package_name =?",
                            etcode.getText(), (String) etcountry.getSelectedItem(), etday.getText(), (String) ejit.getSelectedValuesList().toString(), (String) ejname.getSelectedItem());
                    JOptionPane.showMessageDialog(edit, "Submit Succeed");
                    setInformation();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(edit, "Something Wrong");
                }
            }
        });
        esubmit.setBackground(new Color(100, 100, 200));
        esubmit.setOpaque(false);
        edit.add(esubmit);

        //edit的reset按钮
        ereset = new JButton("Reset");
        ereset.setBounds(200, 350, 100, 30);
        ereset.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ereset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ejname.setSelectedIndex(0);
            }
        });
        ereset.setBackground(new Color(100, 100, 200));
        ereset.setOpaque(false);
        edit.add(ereset);

        //edit中的Back按钮
        elogout = new JButton("Back");
        elogout.setBounds(350, 80, 100, 30);
        elogout.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        elogout.setBackground(new Color(100, 100, 200));
        elogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                welcomeAdmin.setVisible(true);
            }
        });
        elogout.setOpaque(false);
        edit.add(elogout);

        //delete中的组件
        dname = new JLabel("Package Name");
        dname.setBounds(80, 120, 120, 20);
        dname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dname.setOpaque(false);
        delete.add(dname);


        djname = new JComboBox();
        djname.setBounds(220, 120, 120, 30);
        djname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        djname.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                ResultSet res = null;
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    res = JDBC.selectOne("select package_code from tour_packages where package_name=?", conne_pack, (String) itemEvent.getItem());
                    try {
                        while (res.next()) {
                            dtcode.setText(res.getString(1));
                        }
                    } catch (Exception throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
        djname.setBackground(new Color(0x1576CE));
        delete.add(djname);

        dcode = new JLabel("Package code");
        dcode.setBounds(80, 180, 120, 30);
        dcode.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dcode.setOpaque(false);
        delete.add(dcode);

        dtcode = new JTextField();
        dtcode.setBounds(220, 180, 120, 30);
        dtcode.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dtcode.setEnabled(false);
        dtcode.setOpaque(false);
        delete.add(dtcode);

        //delete中的delete按钮
        Delete = new JButton("Delete");
        Delete.setBounds(100, 300, 100, 30);
        Delete.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        Delete.setBackground(new Color(100, 100, 200));
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //删除提交操作
                try {
                    JDBC.addAndUpdateInformation("delete from tour_packages where package_name = ?", (String) djname.getSelectedItem());
                    JOptionPane.showMessageDialog(delete, "Delete Succeed");
                    setInformation();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(delete, "Something Wrong");
                }
            }
        });
        Delete.setOpaque(false);
        delete.add(Delete);

        //delete中的reset按钮
        dreset = new JButton("Reset");
        dreset.setBounds(230, 300, 100, 30);
        dreset.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dreset.setBackground(new Color(100, 100, 200));
        dreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                djname.setSelectedIndex(0);
            }
        });
        dreset.setOpaque(false);
        delete.add(dreset);

        //delete中的Back按钮
        dlogout = new JButton("Back");
        dlogout.setBounds(350, 80, 100, 30);
        dlogout.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dlogout.setBackground(new Color(100, 100, 200));
        dlogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                welcomeAdmin.setVisible(true);
            }
        });
        dlogout.setOpaque(false);
        delete.add(dlogout);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("4.jpg"));
        JLabel imgLabel1 = new JLabel(img1);
        add.add(imgLabel1, new Integer(Integer.MIN_VALUE));
        imgLabel1.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        Container cp1 = getContentPane();
        cp1.setLayout(new BorderLayout());
        add.setOpaque(false);

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("4.jpg"));
        JLabel imgLabel2 = new JLabel(img2);
        edit.add(imgLabel2, new Integer(Integer.MIN_VALUE));
        imgLabel2.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        Container cp2 = getContentPane();
        cp2.setLayout(new BorderLayout());
        edit.setOpaque(false);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("4.jpg"));
        JLabel imgLabel3 = new JLabel(img3);
        delete.add(imgLabel3, new Integer(Integer.MIN_VALUE));
        imgLabel3.setBounds(0, 0, img3.getIconWidth(), img3.getIconHeight());
        Container cp3 = getContentPane();
        cp3.setLayout(new BorderLayout());
        delete.setOpaque(false);

        tab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setInformation();
            }
        });


        setContentPane(tab);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void setInformation() {
        djname.removeAllItems();
        ejname.removeAllItems();
        ResultSet res = null;
        try {
            res = JDBC.selectAll("tour_packages");
            while (res.next()) {
                djname.addItem(res.getString(1));
                ejname.addItem(res.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}

