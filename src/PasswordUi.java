import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PasswordUi extends JFrame  {
    PasswordUi() {
        NewPassword password = new NewPassword();
        JFrame frame = new JFrame("      password is unpredictable");
        JPanel panel = new JPanel();
        JTextField field = new JTextField();
JLabel head = new JLabel("Password is unpredictable");
        JButton btn = new JButton("click to get password");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
frame.add(panel);
panel.add(head);
     panel.add(field,BorderLayout.CENTER);
     panel.add(btn,BorderLayout.CENTER);
        head.setFont(new Font("", Font.ITALIC, 50)); // set font+ text size
field.setPreferredSize(new Dimension(300,30));
panel.setBackground(Color.gray);
   btn.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
      field.setText(password.NewPasswords());
       }
   });
    }
    public static void main(String[] args)
    {
        PasswordUi passwordUi = new PasswordUi() ;
    }



}


