
package hotel.management.system;

import javax.swing.*;
import java.awt.*;


public class AddEmployee extends JFrame{
    
    AddEmployee() {
        setLayout(null);
        
        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60, 30, 120, 30);
        lblname.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblname);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("AGE");
        lblage.setBounds(60, 80, 120, 30);
        lblage.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblage);
        
        JTextField tfage = new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60, 130, 120, 30);
        lblgender.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblgender);
        
        JRadioButton rbmale = new JRadioButton("M");
        rbmale.setBounds(200,130,70,30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbmale.setBackground(Color.white);
        add(rbmale);
        
        JRadioButton rbfemale = new JRadioButton("F");
        rbfemale.setBounds(280,130,70,30);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbfemale.setBackground(Color.white);
        add(rbfemale);
        
        JRadioButton rbnotSpecified = new JRadioButton("OTHER");
        rbnotSpecified.setBounds(360,130,70,30);
        rbnotSpecified.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbnotSpecified.setBackground(Color.white);
        add(rbnotSpecified);
        
        JLabel lbljob = new JLabel("JOB");
        lbljob.setBounds(60, 180, 120, 30);
        lbljob.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbljob);
        
        String str[] = {"Front Desk Clerks", "Porters", "Housekeeping", 
            "Room Service", "Waitress", "Manager"};
        JComboBox cbjob = new JComboBox(str);
        cbjob.setBounds(200,180,150,30);
        cbjob.setBackground(Color.white);
        add(cbjob);
        
        JLabel lbsalary = new JLabel("SALARY");
        lbsalary.setBounds(60, 230, 120, 30);
        lbsalary.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbsalary);
        
        JTextField tfsalary = new JTextField();
        tfsalary.setBounds(200,230,150,30);
        add(tfsalary);
        
        JLabel lbphone = new JLabel("PHONE");
        lbphone.setBounds(60, 280, 120, 30);
        lbphone.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbphone);
        
        JTextField tfphone = new JTextField();
        tfphone.setBounds(200,280,150,30);
        add(tfphone);
        
        JLabel lbemail = new JLabel("E-MAIL");
        lbemail.setBounds(60, 330, 120, 30);
        lbemail.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbemail);
        
        JTextField tfemail = new JTextField();
        tfemail.setBounds(200,330,150,30);
        add(tfemail);
        
        JButton submit = new JButton ("SUBMIT");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.black);
        submit.setBounds(200,430,150,30);
        add(submit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,450);
        add(image);
        
        getContentPane().setBackground(Color.white);
        setBounds(350, 330, 850, 540);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AddEmployee();
    }
}
