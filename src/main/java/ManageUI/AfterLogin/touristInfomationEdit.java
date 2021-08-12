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


//人员信息界面(增删改的界面)
public class touristInfomationEdit extends JFrame {

    static Connection conn_tour;

    static {
        try {
            conn_tour = Druid.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    JPanel jp;
    JLabel name, no, address, passport, nation;
    JTextField tname, tno, tadd, nameText;
    JButton submit, reset, logout;
    JComboBox jnation, jpassport;
    JTabbedPane tab;
    JPanel add, edit, delete;

    //edit中的组件声明
    JLabel ename, eno, eaddress, epassport, enation;
    JTextField etname, etno, etadd;
    JComboBox ejnation, ejpassport;
    JButton esubmit, ereset, elogout;

    //delete中的组件声明
    JLabel dname, dpassport;
    JTextField dtname;
    JButton dbutton, dreset, dlogout;
    JComboBox djpassport;

    public touristInfomationEdit() {

        jp = new JPanel();
        jp.setLayout(null);

        //选项卡组件
        add = new JPanel();
        add.setLayout(null);
        edit = new JPanel();
        edit.setLayout(null);
        delete = new JPanel();
        delete.setLayout(null);

        //add中的组件
        passport = new JLabel("Passport No");
        passport.setBounds(50, 100, 100, 20);
        passport.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        passport.setOpaque(false);
        add.add(passport);

        name = new JLabel("Name");
        name.setBounds(50, 150, 100, 20);
        name.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        name.setOpaque(false);
        add.add(name);

        address = new JLabel("Address");
        address.setBounds(50, 200, 100, 20);
        address.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        address.setOpaque(false);
        add.add(address);

        nation = new JLabel("Nationlity");
        nation.setBounds(50, 250, 100, 20);
        nation.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        nation.setOpaque(false);
        add.add(nation);

        no = new JLabel("Contact No");
        no.setBounds(50, 300, 100, 20);
        no.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        no.setOpaque(false);
        add.add(no);

        nameText = new JTextField();
        nameText.setBounds(200, 100, 120, 25);
        nameText.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        nameText.setOpaque(false);
        add.add(nameText);

        tname = new JTextField();
        tname.setBounds(200, 150, 120, 25);
        tname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tname.setOpaque(false);
        add.add(tname);

        tadd = new JTextField();
        tadd.setBounds(200, 200, 120, 25);
        tadd.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tadd.setOpaque(false);
        add.add(tadd);

        jnation = new JComboBox();
        jnation.setBounds(200, 250, 120, 25);
        jnation.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        jnation.addItem("Chinese");
        jnation.addItem("American");
        jnation.addItem("British");
        jnation.addItem("Japan");
        jnation.addItem("German");
        jnation.addItem("Russia");
        jnation.setBackground(new Color(0xF4F4FE));
        add.add(jnation);

        tno = new JTextField();
        tno.setBounds(200, 300, 120, 25);
        tno.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        tno.setOpaque(false);
        add.add(tno);

        //add的submit按钮
        submit = new JButton("Submit");
        submit.setBounds(70, 350, 100, 30);
        submit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (!nameText.getText().matches("^1[45][0-9]{7}|([P|p|S|s]\\d{7})|([S|s|G|g]\\d{8})|([Gg|Tt|Ss|Ll|Qq|Dd|Aa|Ff]\\d{8})|([H|h|M|m]\\d{8,10})$")) {
                        throw new Exception("Passport Wrong");
                    }
                    if (!tno.getText().matches("^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$")) {
                        throw new Exception("Wrong Contact No");
                    }
                    JDBC.addAndUpdateInformation("insert into tourists_information(passport_no,name,contact_no,address,nationality)values (?,?,?,?,?)", (String) nameText.getText(), tname.getText(), tno.getText(), tadd.getText(), (String) jnation.getSelectedItem());
                    JOptionPane.showMessageDialog(jp, "Succeed");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jp, e.getMessage());
                }

            }
        });
        submit.setBackground(new Color(100, 100, 150));
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
                tname.setText(null);
                tno.setText(null);
                tadd.setText(null);
                jnation.setSelectedIndex(0);
            }
        });
        reset.setBackground(new Color(100, 100, 150));
        reset.setOpaque(false);
        add.add(reset);

        //add中的logout组件
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
        epassport = new JLabel("Passport No");
        epassport.setBounds(50, 100, 100, 20);
        epassport.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        epassport.setOpaque(false);
        edit.add(epassport);

        ename = new JLabel("Name");
        ename.setBounds(50, 150, 100, 20);
        ename.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ename.setOpaque(false);
        edit.add(ename);

        eaddress = new JLabel("Address");
        eaddress.setBounds(50, 200, 100, 20);
        eaddress.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        eaddress.setOpaque(false);
        edit.add(eaddress);

        enation = new JLabel("Nationlity");
        enation.setBounds(50, 250, 100, 20);
        enation.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        enation.setOpaque(false);
        edit.add(enation);

        eno = new JLabel("Contact No");
        eno.setBounds(50, 300, 100, 20);
        eno.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        eno.setOpaque(false);
        edit.add(eno);


        etname = new JTextField();
        etname.setBounds(200, 150, 120, 25);
        etname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etname.setOpaque(false);
        edit.add(etname);

        etadd = new JTextField();
        etadd.setBounds(200, 200, 120, 25);
        etadd.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etadd.setOpaque(false);
        edit.add(etadd);

        ejnation = new JComboBox();
        ejnation.setBounds(200, 250, 120, 25);
        ejnation.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ejnation.addItem("Chinese");
        jnation.addItem("American");
        ejnation.addItem("British");
        jnation.addItem("Japan");
        ejnation.addItem("German");
        jnation.addItem("Russia");
        ejnation.setBackground(new Color(0xF6F7FC));
        edit.add(ejnation);

        etno = new JTextField();
        etno.setBounds(200, 300, 120, 25);
        etno.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        etno.setOpaque(false);
        edit.add(etno);

        ejpassport = new JComboBox();
        ejpassport.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ejpassport.setBounds(200, 100, 120, 25);
        ejpassport.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    ResultSet res = null;
                    try {
                        res = JDBC.selectOne("select * from tourists_information where passport_no = ?", conn_tour, (String) itemEvent.getItem());
                        while (res.next()) {
                            etname.setText(res.getString(1));
                            etno.setText(res.getString(2));
                            etadd.setText(res.getString(3));
                            ejnation.setSelectedItem(res.getString(4));
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
        ejpassport.setBackground(new Color(0xD7DBF8));
        edit.add(ejpassport);


        //edit的submit按钮
        esubmit = new JButton("Submit");
        esubmit.setBounds(70, 350, 100, 30);
        esubmit.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        esubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (!etno.getText().matches("^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$")) {
                        throw new Exception("Wrong Contact No");
                    }
                    JDBC.addAndUpdateInformation("update tourists_information set name=?,address=?,nationality=?,contact_no=? where passport_no =?",
                            etname.getText(), etadd.getText(), (String) ejnation.getSelectedItem(), etno.getText(), (String) ejpassport.getSelectedItem());
                    JOptionPane.showMessageDialog(edit, "Edit Succeed");
                    setInformation();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(edit, e.getMessage());
                }
            }
        });
        esubmit.setBackground(new Color(100, 100, 150));
        esubmit.setOpaque(false);
        edit.add(esubmit);

        //edit的reset按钮
        ereset = new JButton("Reset");
        ereset.setBounds(200, 350, 100, 30);
        ereset.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        ereset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ejpassport.setSelectedIndex(0);
            }
        });
        ereset.setBackground(new Color(100, 100, 150));
        ereset.setOpaque(false);
        edit.add(ereset);

//        edit中的back按钮
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
        dpassport = new JLabel("Passport No:");
        dpassport.setBounds(80, 160, 150, 30);
        dpassport.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dpassport.setOpaque(false);
        delete.add(dpassport);

        djpassport = new JComboBox();
        djpassport.setBounds(260, 160, 150, 30);
        djpassport.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        djpassport.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                ResultSet res = null;
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    res = JDBC.selectOne("select name from tourists_information where passport_no = ?", conn_tour, (String) itemEvent.getItem());
                    try {
                        while (res.next()) {
                            dtname.setText(res.getString(1));
                        }
                    } catch (Exception throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        });
        djpassport.setBackground(new Color(0xDADEFB));
        delete.add(djpassport);

        dtname = new JTextField();
        dtname.setBounds(260, 220, 150, 30);
        dtname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dtname.setEnabled(false);
        dtname.setOpaque(false);
        delete.add(dtname);


        dname = new JLabel("Name");
        dname.setBounds(80, 220, 150, 30);
        dname.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dname.setOpaque(false);
        delete.add(dname);


        //delete按钮
        dbutton = new JButton("Delete");
        dbutton.setBounds(120, 320, 100, 30);
        dbutton.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dbutton.setBackground(new Color(100, 100, 200));
        dbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //删除提交操作
                try {
                    JDBC.addAndUpdateInformation("delete from tourists_information where passport_no = ?", (String) djpassport.getSelectedItem());
                    JOptionPane.showMessageDialog(delete, "Delete Succeed");
                    setInformation();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(delete, "Something Wrong");
                }
            }
        });
        dbutton.setOpaque(false);
        delete.add(dbutton);
        //reset按钮
        dreset = new JButton("Reset");
        dreset.setBounds(255, 320, 100, 30);
        dreset.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        dreset.setBackground(new Color(100, 100, 200));
        dreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                djpassport.setSelectedIndex(0);
            }
        });
        dreset.setOpaque(false);
        delete.add(dreset);

        //logout按钮
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

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("5.jpg"));
        JLabel imgLabel1 = new JLabel(img1);
        add.add(imgLabel1, new Integer(Integer.MIN_VALUE));
        imgLabel1.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        Container cp1 = getContentPane();
        cp1.setLayout(new BorderLayout());
        add.setOpaque(false);

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("5.jpg"));
        JLabel imgLabel2 = new JLabel(img2);
        edit.add(imgLabel2, new Integer(Integer.MIN_VALUE));
        imgLabel2.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        Container cp2 = getContentPane();
        cp2.setLayout(new BorderLayout());
        edit.setOpaque(false);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("5.jpg"));
        JLabel imgLabel3 = new JLabel(img3);
        delete.add(imgLabel3, new Integer(Integer.MIN_VALUE));
        imgLabel3.setBounds(0, 0, img3.getIconWidth(), img3.getIconHeight());
        Container cp3 = getContentPane();
        cp3.setLayout(new BorderLayout());
        delete.setOpaque(false);

        //选项卡
        tab = new JTabbedPane(JTabbedPane.TOP);
        tab.add("add", add);
        tab.add("edit", edit);
        tab.add("delete", delete);
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
        djpassport.removeAllItems();
        ejpassport.removeAllItems();
        ResultSet res = null;
        try {
            res = JDBC.selectAll("tourists_information");
            while (res.next()) {
                djpassport.addItem(res.getString(5));
                ejpassport.addItem(res.getString(5));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

