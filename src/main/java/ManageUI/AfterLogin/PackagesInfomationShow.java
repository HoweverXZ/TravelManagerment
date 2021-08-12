package ManageUI.AfterLogin;

import tools.Render;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ManageUI.BeforeLogin.start.informationShowSelect;


public class PackagesInfomationShow extends JFrame {
    DefaultTableModel model = new DefaultTableModel();
    JLabel jl, j1;
    JTable jtbl = new JTable(model);
    JPanel jp;
    JButton jb;

    //显示信息的地方
    public PackagesInfomationShow() {
        model.addColumn("Package Name");
        model.addColumn("Package code");
        model.addColumn("Country");
        model.addColumn("No of Days");
        model.addColumn("Ltinerary");

        jl = new JLabel();
        jl.setLayout(null);

        //框
        jp = new JPanel();
        jp.setLayout(new FlowLayout());
        jp.setSize(400, 200);

        j1 = new JLabel("Tour Packages Record");
        j1.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        j1.setForeground(new Color(100, 100, 200));
        j1.setBounds(160, 160, 120, 24);
        jp.add(j1);

        jb = new JButton("Back");
        jb.setFont(new Font("Blackadder ITC", Font.BOLD, 20));
        jb.setBackground(new Color(100, 200, 188));
        jb.setBounds(400, 80, 60, 24);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                informationShowSelect.setVisible(true);
            }
        });
        jp.add(jb);

        JScrollPane pg = new JScrollPane(jtbl);
        jtbl.setEnabled(false);
        this.pack();
        pg.setVisible(true);
        pg.setSize(400, 400);
        jp.add(pg);
        jtbl.setDefaultRenderer(Object.class,new Render());
        setSize(500, 500);
        add(jp);
    }
}
