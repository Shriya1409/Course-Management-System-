import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserLogin {
    public static void main(String[ ] args){
        JFrame frame =new JFrame("User Login");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents(frame);
        frame.setBackground(Color.PINK);
        frame.setVisible(true);
       
    }
    

    private static void placeComponents(JFrame frame) {
        frame.setLayout(null);
        
        JLabel userLabel = new JLabel( " User name : ");
        userLabel.setBounds(10,10,80,25);
        frame.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,10,160,25);
        frame.add(userText);
        
        JLabel password = new JLabel("Password :");
        password.setBounds(10,40,80,25);
        frame.add(password);
        
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100,40,160,25);
        frame.add(passwordField);
        
        JButton button = new JButton("Login ");
        button.setFocusable(false);
        button.setBounds(10,80,80,25);
        frame.add(button);


        JButton button1 = new JButton("Registration");
        button1.setFocusable(false);
        button1.setBounds(10,80,80,25);
        frame.add(button1);

        ActionListener buttonListener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                JOptionPane.showMessageDialog(source,source.getText() + "Success");
            //    Registration register = new Registration();
              //  register.setVisibility(true);
                MyFrame f1 = new MyFrame();
                f1.setVisible(true);
            }
        };
        button.addActionListener(buttonListener);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component) e.getSource(), "success1");

            }

        });}



    ;
}


            

        
        



