package com.company;

// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel div;
    private JTextField tdiv;
    private JLabel roll;
    private JTextField troll;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel branch;
    private JComboBox tbranch;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

    private String months[]
            = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December" };

    private String years[]
            = {" ", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
            "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};

    private String tbranchs[]
            = {" ", "Comps", "IT", "EXTC", "AI/DS", "Electrical", "Mechanical", "Robotics"};

    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.black);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setForeground(Color.red);
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setForeground(Color.red);
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setForeground(Color.blue);
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 24);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setForeground(Color.red);
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setForeground(Color.blue);
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 24);
        tmno.setLocation(200, 150);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setForeground(Color.red);
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setForeground(Color.blue);
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 24);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setForeground(Color.blue);
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 24);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setForeground(Color.red);
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);

        date = new JComboBox(dates);
        date.setForeground(Color.blue);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 24);
        date.setLocation(200, 250);
        c.add(date);

        month = new JComboBox(months);
        month.setForeground(Color.blue);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(110, 24);
        month.setLocation(250, 250);
        c.add(month);

        year = new JComboBox(years);
        year.setForeground(Color.blue);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 24);
        year.setLocation(360, 250);
        c.add(year);

        branch = new JLabel("Branch");
        branch.setForeground(Color.red);
        branch.setFont(new Font("Arial", Font.PLAIN, 20));
        branch.setSize(100, 20);
        branch.setLocation(100, 300);
        c.add(branch);

        tbranch = new JComboBox(tbranchs);
        tbranch.setForeground(Color.blue);
        tbranch.setFont(new Font("Arial", Font.PLAIN, 15));
        tbranch.setSize(150, 24);
        tbranch.setLocation(200, 300);
        c.add(tbranch);

        div = new JLabel("Division : ");
        div.setForeground(Color.red);
        div.setFont(new Font("Arial", Font.PLAIN, 20));
        div.setSize(100, 20);
        div.setLocation(100, 350);
        c.add(div);

        tdiv = new JTextField();
        tdiv.setForeground(Color.blue);
        tdiv.setFont(new Font("Arial", Font.PLAIN, 15));
        tdiv.setSize(150, 24);
        tdiv.setLocation(200, 350);
        c.add(tdiv);

        roll = new JLabel("Roll No : ");
        roll.setForeground(Color.red);
        roll.setFont(new Font("Arial", Font.PLAIN, 20));
        roll.setSize(100, 20);
        roll.setLocation(100, 400);
        c.add(roll);

        troll = new JTextField();
        troll.setForeground(Color.blue);
        troll.setFont(new Font("Arial", Font.PLAIN, 15));
        troll.setSize(150, 24);
        troll.setLocation(200, 400);
        c.add(troll);

//        term = new JCheckBox("Accept Terms And Conditions.");
//        term.setFont(new Font("Arial", Font.PLAIN, 15));
//        term.setSize(250, 20);
//        term.setLocation(150, 400);
//        c.add(term);

        sub = new JButton("Submit");
        sub.setForeground(Color.blue);
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 24);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setForeground(Color.blue);
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 24);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 20));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String data1;
                String data
                        = "Name â†’ "
                        + tname.getText() + "\n\n"
                        + "Mobile â†’ "
                        + tmno.getText() + "\n\n";
                if (male.isSelected())
                    data1 = "Gender â†’ Male"
                            + "\n\n";
                else
                    data1 = "Gender â†’ Female"
                            + "\n\n";
                String data2
                        = "DOB â†’ "
                        + (String)date.getSelectedItem()
                        + " / " + (String)month.getSelectedItem()
                        + " / " + (String)year.getSelectedItem()
                        + "\n\n";

                String data3 = "Branch â†’ " + (String)tbranch.getSelectedItem();

                String data4 = "\n\nDivision â†’ "+tdiv.getText()+"\n\n"+"Roll Number â†’ "+troll.getText()+"\n";

                tout.setText(data + data1 + data2 + data3 + data4);
                tout.setForeground(Color.green);
                tout.setEditable(false);
                res.setForeground(Color.green);
                res.setText("Submitted Successfully ...");
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tbranch.setSelectedIndex(0);
            tmno.setText(def);
            tdiv.setText(def);
            troll.setText(def);
            res.setText(def);
            tout.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

public class Registration_form_awt
{
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}
