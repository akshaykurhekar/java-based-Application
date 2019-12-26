import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
   TextField t1,t2;
   JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5;
   int a,b,c,d;

public Login()
{ 
   setTitle(" IRCTC ");
  
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("14.jpg"));

//ImageIcon bb=new ImageIcon("clouds.jpg");
	b3=new JButton("Login");
	b2=new JButton("Forget password");
	b1=new JButton("Creat account");
	b4=new JButton("Help");
	b5=new JButton("Exit");
	t1=new TextField(30);
	t2=new TextField(30);	
			
	l1=new JLabel("* Login *");
	l2=new JLabel("User Name:");	
	l3=new JLabel("Psassword:");	

	t2.setEchoChar('*');

	//setBackground(bb);
add(background);	
background.add(l3);
background.add(l1);
background.add(t1);
background.add(l2);
background.add(t2);
background.add(b1);
background.add(b2);
background.add(b3);
background.add(b4);
background.add(b5);

 setSize(600,650);
 //this stement is use to get frame in center
setLocationRelativeTo(null);
        //t1.setEditable(false);
        //t2.setEditable(false);

b3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

l1.setBounds(200,10,200,40);

l2.setBounds(100,100,150,30);
t1.setBounds(250,100,200,30);
t2.setBounds(250,150,200,30);
l3.setBounds(100,150,150,30);
b1.setBounds(80,250,200,40);
b2.setBounds(330,250,200,40);
b3.setBounds(150,350,300,50);
b4.setBounds(10,500,100,30);
b5.setBounds(450,500,100,30);

Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
b1.setFont(f3);
b2.setFont(f3);
Font f1=new Font("Algerian",Font.BOLD,30);
l1.setFont(f1);
b3.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t2.setFont(f2);
t1.setFont(f2);
}

public static void main (String arg[])
{
	Login f1 = new Login();
}

public void actionPerformed(ActionEvent ae)
{
	String aa="",bb="";
    String uname=t1.getText();
    String pass=t2.getText();
if(ae.getSource()==b3)
{     //login
 try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","system","root");

            PreparedStatement ps = con.prepareStatement("SELECT username,password FROM login");
            ResultSet rs = ps.executeQuery();

           while (rs.next()) {

         aa = rs.getString("username");
         bb = rs.getString("password");

		                     }

            if(uname.equals(aa) && pass.equals(bb))
	{
		JOptionPane.showMessageDialog(null,"WELLCOME...! Login successful");
		HomePage f =new HomePage();
		//setVisible(false);
	}
	else
	{
		JOptionPane.showMessageDialog(null,"LOGIN Failed... ");
	}
repaint();
	}
	catch(Exception e)
	{
		System.out.println("error" + e); 
		//JOptionPane.showMessageDialog(null,e);
	}
}

if(ae.getSource()==b2)
{
    //forgot password
    Forget_pass f1=new Forget_pass();
}

if(ae.getSource()==b1)
{
	//creat account
	Creat_account f2=new Creat_account();
}

if(ae.getSource()==b4)
{
	//help
}

if(ae.getSource()==b5)
{
System.exit(0);
}
repaint();
}
}