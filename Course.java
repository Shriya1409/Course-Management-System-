import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JComboBox;

class MyFrame1  extends JFrame
        implements ActionListener {



    // Components of the Form
    private Container c1;
    private JLabel title1;
    private JLabel name1;
    private JTextField tname1;
    private JLabel mno1;
    private JTextField tmno1;
    private JLabel gender1;
    private JRadioButton male1;
    private JRadioButton female1;
    private ButtonGroup gengp1;
    private JLabel dob1;
    private JComboBox CName;
    private JComboBox Months;

    private JLabel add1;
    private JTextArea tadd1;
    private JCheckBox term1;
    private JButton sub1;
    private JButton reset1;
    private JTextArea tout1;
    private JLabel res1;
    private JTextArea resadd1;

    private String Course_Name[]
            = { "Intro to Java ", "Intro to php ", "Intro to Python", "Intro to Ruby", "Intro to Machine learning",
            "JS", "Intro to deep learning ", "Intro to C", "Intro to C++"
    };
    public String No_of_Months[]
            = { "1 Month", "2 Months", "3 Months", "6 Months",
            "8 Months" };


    // constructor, to initialize the components
    // with default values.
    public MyFrame1()
    {
        setTitle("Course Registration ");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JComboBox jComboBox1 = new JComboBox<>();
        c1 = getContentPane();
        c1.setLayout(null);

        title1 = new JLabel("Course Registration Form");
        title1.setFont(new Font("Arial", Font.PLAIN, 30));
        title1.setSize(300, 30);
        title1.setLocation(300, 30);
        c1.add(title1);

        name1 = new JLabel("Gmail ID :");
        name1.setFont(new Font("Arial", Font.PLAIN, 20));
        name1.setSize(100, 20);
        name1.setLocation(100, 100);
        c1.add(name1);

        tname1 = new JTextField();
        tname1.setFont(new Font("Arial", Font.PLAIN, 15));
        tname1.setSize(190, 20);
        tname1.setLocation(200, 100);
        c1.add(tname1);

        mno1 = new JLabel("State name ");
        mno1.setFont(new Font("Arial", Font.PLAIN, 20));
        mno1.setSize(100, 20);
        mno1.setLocation(100, 150);
        c1.add(mno1);

        tmno1 = new JTextField();
        tmno1.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno1.setSize(150, 20);
        tmno1.setLocation(200, 150);
        c1.add(tmno1);

        gender1 = new JLabel("profession");
        gender1.setFont(new Font("Arial", Font.PLAIN, 20));
        gender1.setSize(100, 20);
        gender1.setLocation(100, 200);
        c1.add(gender1);

        male1 = new JRadioButton("Student ");
        male1.setFont(new Font("Arial", Font.PLAIN, 15));
        male1.setSelected(true);
        male1.setSize(75, 20);
        male1.setLocation(200, 200);
        c1.add(male1);

        female1 = new JRadioButton("Faculty");
        female1.setFont(new Font("Arial", Font.PLAIN, 15));
        female1.setSelected(false);
        female1.setSize(80, 20);
        female1.setLocation(275, 200);
        c1.add(female1);

        gengp1 = new ButtonGroup();
        gengp1.add(male1);
        gengp1.add(female1);

        dob1 = new JLabel("Courses:");
        dob1.setFont(new Font("Arial", Font.PLAIN, 20));
        dob1.setSize(100, 30);
        dob1.setLocation(100, 250);
        c1.add(dob1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(Course_Name));
        jComboBox1.setSize(200, 40);
        jComboBox1.setLocation(200, 250);
        c1.add(jComboBox1);

       /* CName  = new JComboBox((ComboBoxModel) CName);
        CName.setFont(new Font("Arial", Font.PLAIN, 15));
        CName.setSize(50, 20);
        CName.setLocation(200, 250);
        c1.add(CName);

        Months = new JComboBox((ComboBoxModel) Months);
        Months.setFont(new Font("Arial", Font.PLAIN, 15));
        Months.setSize(60, 20);
        Months.setLocation(250, 250);
        c1.add(Months);
*/


        add1 = new JLabel("Comment ");
        add1.setFont(new Font("Arial", Font.PLAIN, 20));
        add1.setSize(100, 20);
        add1.setLocation(100, 300);
        c1.add(add1);

        tadd1 = new JTextArea();
        tadd1.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd1.setSize(200, 75);
        tadd1.setLocation(200, 300);
        tadd1.setLineWrap(true);
        c1.add(tadd1);

        term1 = new JCheckBox("Accept Terms And Conditions.");
        term1.setFont(new Font("Arial", Font.PLAIN, 15));
        term1.setSize(250, 20);
        term1.setLocation(150, 400);
        c1.add(term1);

        sub1 = new JButton("Submit");
        sub1.setFont(new Font("Arial", Font.PLAIN, 15));
        sub1.setSize(100, 20);
        sub1.setLocation(150, 450);
        sub1.addActionListener(this);
        c1.add(sub1);

        reset1 = new JButton("Reset");
        reset1.setFont(new Font("Arial", Font.PLAIN, 15));
        reset1.setSize(100, 20);
        reset1.setLocation(270, 450);
        reset1.addActionListener(this);
        c1.add(reset1);

        tout1 = new JTextArea();
        tout1.setFont(new Font("Arial", Font.PLAIN, 15));
        tout1.setSize(300, 400);
        tout1.setLocation(500, 100);
        tout1.setLineWrap(true);
        tout1.setEditable(false);
        c1.add(tout1);

        res1 = new JLabel("");
        res1.setFont(new Font("Arial", Font.PLAIN, 20));
        res1.setSize(500, 25);
        res1.setLocation(100, 500);
        c1.add(res1);

        resadd1 = new JTextArea();
        resadd1.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd1.setSize(200, 75);
        resadd1.setLocation(580, 175);
        resadd1.setLineWrap(true);
        c1.add(resadd1);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    { Connection connection;

        {int count1=0;
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course","root","Ruby@1970");
                PreparedStatement Add = connection.prepareStatement("insert into course_page values(?,?,?,?)");
                Statement stmt = connection.createStatement();
                ResultSet rsr = stmt.executeQuery("select * from course_page");
                while (rsr.next())
                {
                    count1++;
                }
                Add.setInt(1,count1);
                Add.setString(2,tname1.getText());
                Add.setString(3,tmno1.getText());
                Add.setString(4, tadd1.getText());
                Add.executeUpdate();
                connection.close();

            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        if (e.getSource() == sub1) {
            if (term1.isSelected()) {
                String data1;
                String data
                        = "Gmail ID: "
                        + tname1.getText() + "\n"
                        + "State name : "
                        + tmno1.getText() + "\n";
                if (male1.isSelected())
                    data1 = " profession : Student"
                            + "\n";
                else
                    data1 = "profession : Faculty "
                            + "\n";
                String data2
                        = "DOB : "
                        + (String)CName.getSelectedItem()
                        + "/" + (String)Months.getSelectedItem()

                        + "\n";

                String data3 = "Comment : " + tadd1.getText();
                tout1.setText(data + data1 + data2 + data3);
                tout1.setEditable(false);
                res1.setText("Registration Successfully..");
            }
            else {
                tout1.setText("");
                resadd1.setText("");
                res1.setText("Please accept the"
                        + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset1) {
            String def = "";
            tname1.setText(def);
            tadd1.setText(def);
            tmno1.setText(def);
            res1.setText(def);
            tout1.setText(def);
            term1.setSelected(false);
            CName.setSelectedIndex(0);
            Months.setSelectedIndex(0);

            resadd1.setText(def);
        }
    }
} }

// Driver Code
class Course{

    public static void main(String[] args)
    {
        MyFrame1 f1 = new MyFrame1();
        f1.setBackground(Color.magenta);
        f1.setVisible(true);
    }
}