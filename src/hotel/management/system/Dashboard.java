package hotel.management.system;

import java.awt.*;
import javax.swing.*;


public class Dashboard extends JFrame{
    Dashboard() {
        setBounds(0, 0, 1550, 1000);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setBounds(400, 80, 1000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");
        mb.add(admin);
        
        JMenuItem addEmployee = new JMenuItem("ADD EMPLOYEE");
        admin.add(addEmployee);
        
        JMenuItem addRooms = new JMenuItem("ADD ROOMS");
        admin.add(addRooms);
        
        JMenuItem addDrives = new JMenuItem("ADD DRIVES");
        admin.add(addDrives);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Dashboard();
        
        
    }
    
}
