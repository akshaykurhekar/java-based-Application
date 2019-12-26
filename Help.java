import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help extends JFrame implements ActionListener
{
   TextField t1,t2;
   JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5;
   int a,b,c,d;

public Help()
{ 
   setTitle(" IRCTC ");
  
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("14.jpg"));

//ImageIcon bb=new ImageIcon("clouds.jpg");
	b1=new JButton("Help");
	b2=new JButton("Forget password");
	b3=new JButton("Creat account");
	b4=new JButton("Help");
	b5=new JButton("Exit");
	t1=new TextField(30);
	t2=new TextField(30);	
			
	l1=new JLabel("Help");
	l2=new JLabel("Enter proper ditales .");	
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

l1.setBounds(250,10,100,40);

l2.setBounds(100,100,150,30);
t1.setBounds(250,100,200,30);
t2.setBounds(250,150,200,30);
l3.setBounds(100,150,150,30);
b1.setBounds(100,250,100,30);
b2.setBounds(250,250,200,30);
b3.setBounds(150,350,300,30);
b4.setBounds(10,500,100,30);
b5.setBounds(450,500,100,30);

Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
Font f1=new Font("Arial",Font.ITALIC,30);
l1.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t2.setFont(f2);
t1.setFont(f2);
}

public static void main (String arg[])
{
	Help f = new Help();
}

public void actionPerformed(ActionEvent ae)
{
	
repaint();
}
}