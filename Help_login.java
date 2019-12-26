import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help_login extends JFrame implements ActionListener
{
   JTextField t1;
   JLabel l1,l2,l3;
   JButton b1;
   int a,b,c,d;

public Help_login()
{ 
   setTitle(" IRCTC ");
  
   setVisible(true);
  // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  
  	b1=new JButton("Back");
				
	l1=new JLabel("Help for Loging");
	l2=new JLabel("Enter proper ditales .");	
	l3=new JLabel("Psassword:");	
	t1=new JTextField();


 setSize(500,600);
 //this stement is use to get frame in center
//setLocationRelativeTo(null);
  
b1.addActionListener(this);
t1.addActionListener(this);
l1.setBounds(100,20,300,40);

l2.setBounds(50,100,400,30);
l3.setBounds(100,150,150,30);
t1.setBounds(100,200,300,20);
b1.setBounds(100,250,100,30);

t1.setText("use proper user name and password");
t1.setEditable(false);
		
add(l3);
add(l1);
add(l2);
add(b1);
add(t1);

Font f1=new Font("Arial",Font.ITALIC,25);
l1.setFont(f1);
}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		new Login();
	}
repaint();
}

public static void main (String arg[])
{
	Help_login f = new Help_login();
}

}