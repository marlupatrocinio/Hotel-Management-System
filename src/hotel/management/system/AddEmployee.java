
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddEmployee extends JFrame implements ActionListener{
    
    JTextField tfname, tfemail, tfphone, tfage, tfsalary, tfcpf;
    JRadioButton rbmale, rbfemale, rbnotSpecified;
    JButton submit;
    JComboBox cbjob;
    
    AddEmployee() {
        setLayout(null);
        
        JLabel lblname = new JLabel("NAME");
        lblname.setBounds(60, 30, 120, 30);
        lblname.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("AGE");
        lblage.setBounds(60, 80, 120, 30);
        lblage.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblage);
        
        tfage = new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);
        
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60, 130, 120, 30);
        lblgender.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lblgender);
        
        rbmale = new JRadioButton("M");
        rbmale.setBounds(200,130,70,30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbmale.setBackground(Color.white);
        add(rbmale);
        
        rbfemale = new JRadioButton("F");
        rbfemale.setBounds(280,130,70,30);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbfemale.setBackground(Color.white);
        add(rbfemale);
        
        rbnotSpecified = new JRadioButton("OTHER");
        rbnotSpecified.setBounds(360,130,70,30);
        rbnotSpecified.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rbnotSpecified.setBackground(Color.white);
        add(rbnotSpecified);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        bg.add(rbnotSpecified);
        
        JLabel lbljob = new JLabel("JOB");
        lbljob.setBounds(60, 180, 120, 30);
        lbljob.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbljob);
        
        String str[] = {"Front Desk Clerks", "Porters", "Housekeeping", 
            "Room Service", "Waitress", "Manager"};
        cbjob = new JComboBox(str);
        cbjob.setBounds(200,180,150,30);
        cbjob.setBackground(Color.white);
        add(cbjob);
        
        JLabel lbsalary = new JLabel("SALARY");
        lbsalary.setBounds(60, 230, 120, 30);
        lbsalary.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(200,230,150,30);
        add(tfsalary);
        
        JLabel lbphone = new JLabel("PHONE");
        lbphone.setBounds(60, 280, 120, 30);
        lbphone.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200,280,150,30);
        add(tfphone);
        
        JLabel lbemail = new JLabel("E-MAIL");
        lbemail.setBounds(60, 330, 120, 30);
        lbemail.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,330,150,30);
        add(tfemail);
        
        JLabel lbcpf = new JLabel("CPF");
        lbcpf.setBounds(60, 380, 120, 30);
        lbcpf.setFont(new Font("tahoma", Font.PLAIN, 17));
        add(lbcpf);
        
        tfcpf = new JTextField();
        tfcpf.setBounds(200,380,150,30);
        add(tfcpf);
        
        submit = new JButton ("SUBMIT");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.black);
        submit.setBounds(200,430,150,30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);
        
        getContentPane().setBackground(Color.white);
        setBounds(350, 200, 850, 540);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String name = tfname.getText();
        String age = tfage.getText();
        String salary = tfsalary.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String cpf = tfcpf.getText();
        
        String gender = null;
        
        if (rbmale.isSelected()) {
        gender = "Male";
        } else if (rbfemale.isSelected()) {
        gender = "Female";
        } else if (rbnotSpecified.isSelected()) {
        gender = "Not Specified";
        }
        
        String job = (String) cbjob.getSelectedItem();
        
        try {
            Conn conn = new Conn();
            
            String str = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', '"+email+"', '"+cpf+"')";
            conn.s.executeUpdate(str);
            
            JOptionPane.showMessageDialog(null, "Employee added successfully!");
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new AddEmployee();
    }
}
