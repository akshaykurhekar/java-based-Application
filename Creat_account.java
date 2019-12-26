import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Creat_account extends JFrame implements ActionListener
{
   TextField t1,t2,t3,t4,t5;
   JLabel l1,l2,l3,l4,l5,l6;
   JButton b1,b2,b3;
   int a,b,c,d;

public Creat_account()
{ 
   setTitle(" IRCTC ");
  
   setVisible(true);
   //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("10.jpg"));

//ImageIcon bb=new ImageIcon("clouds.jpg");
	b1=new JButton("Submit");
	b2=new JButton("Back");
	b3=new JButton("RESET");

	t1=new TextField(30);
	t2=new TextField(30);	
	t3=new TextField(30);
	t4=new TextField(30);
	t5=new TextField(30);
			
	l1=new JLabel("Create NEW Account");
	l2=new JLabel("User Name:");	
	l3=new JLabel("Set password:");
	l4=new JLabel("comform password:");	
	l5=new JLabel("Age");
	l6=new JLabel("Gender");

	add(background);	
background.add(l3);
background.add(l1);
background.add(t1);
background.add(l2);
background.add(l4);
background.add(l5);
background.add(l6);
background.add(t2);
background.add(t3);
background.add(t4);
background.add(t5);
background.add(b1);
background.add(b2);
background.add(b3);

 setSize(600,650);
setLocationRelativeTo(null);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
t4.addActionListener(this);
t5.addActionListener(this);

l1.setBounds(100,10,500,40);

l2.setBounds(100,100,150,30);
t1.setBounds(250,100,200,30);
t2.setBounds(250,150,200,30);
l3.setBounds(100,150,150,30);
l4.setBounds(100,200,150,30);
t3.setBounds(250,200,200,30);
l5.setBounds(100,250,50,30);
t4.setBounds(200,250,50,30);
l6.setBounds(300,250,80,30);
t5.setBounds(400,250,50,30);
b1.setBounds(200,350,200,50);
b2.setBounds(50,500,100,30);
b3.setBounds(400,500,100,30);

t3.setEchoChar('*');
Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f3);
l5.setFont(f3);
l6.setFont(f3);
Font f1=new Font("Algerian",Font.BOLD,30);
l1.setFont(f1);
b1.setFont(f3);
Font f2=new Font("Arial",Font.BOLD,20);
t2.setFont(f2);
t1.setFont(f2);
t3.setFont(f2);
t4.setFont(f2);
t5.setFont(f2);
}

public static void main (String arg[])
{
	Creat_account f1 = new Creat_account();
}

public void actionPerformed(ActionEvent ae)
{

	if(ae.getSource()==b2)
	 {
	 	new Login();
	 }

if(ae.getSource()==b3)
	 {
	 	t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		
	 }

	String uname=t1.getText();
    String pass=t2.getText();
 try {

          PreparedStatement pst;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","system","root");


		if(ae.getSource()==b1)
   { 			
		if(uname.equals("")||pass.equals(""))
		{
			JOptionPane.showMessageDialog(null," Enter username and password ");
		}
		else{
			pst=con.prepareStatement("insert into login values(?,?)");
		String username=t1.getText();
		String password=t2.getText();
		pst.setString(1,username);
		pst.setString(2,password);
		pst.executeUpdate();
         JOptionPane.showMessageDialog(null," Account Created Sucessfully");
		t1.setText("");
		t2.setText("");
		}
}
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"ERROR In process...");
	}


repaint();
}
}