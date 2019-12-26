import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Forget_pass extends JFrame implements ActionListener
{
   TextField t1,t2,t3;
   JLabel l1,l2,l3,l4;
   JButton b1,b2;

public Forget_pass()
{ 
   setTitle(" IRCTC_Change Password");
  
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("IRCTC-logo.png"));

	b1=new JButton("Change Password");
	b2=new JButton("Back");

	t1=new TextField(30);
	t2=new TextField(30);	
	t3=new TextField(30);
			
	l1=new JLabel("Change Password");
	l2=new JLabel("Username:");	
	l3=new JLabel("New password:");
	l4=new JLabel("Comform password:");	

	add(background);	
background.add(l3);
background.add(l1);
background.add(t1);
background.add(l2);
background.add(l4);
background.add(t2);
background.add(t3);
background.add(b1);
background.add(b2);

 setSize(600,650);
 setLocationRelativeTo(null);

b1.addActionListener(this);
b2.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);

l1.setBounds(160,10,500,40);

l2.setBounds(100,100,150,30);
t1.setBounds(250,100,200,30);
t2.setBounds(250,150,200,30);
l3.setBounds(100,150,150,30);
l4.setBounds(100,200,150,30);
t3.setBounds(250,200,200,30);
b1.setBounds(200,300,200,30);
b2.setBounds(50,500,100,30);

Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f3);
Font f1=new Font("Algerian",Font.ITALIC,30);
l1.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t2.setFont(f2);
t1.setFont(f2);
t3.setFont(f2);
t2.setEchoChar('*');
t3.setEchoChar('*');
}

public static void main (String arg[])
{
	Forget_pass f1 = new Forget_pass();
}

public void actionPerformed(ActionEvent ae)
{

	if(ae.getSource()==b2)
	{
		new Login();
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
			JOptionPane.showMessageDialog(null," Enter Username and New password ");
		 }
		else{
			pst=con.prepareStatement("update login set password = ? where username = ?");
		String username=t1.getText();
		String password=t2.getText();
		pst.setString(1,password);
		pst.setString(2,username);
		pst.executeUpdate();
         JOptionPane.showMessageDialog(null," Password change Sucessfully");
		t1.setText("");
		t2.setText("");
		t3.setText("");
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