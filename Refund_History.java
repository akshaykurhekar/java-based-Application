import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Refund_History extends JFrame implements ActionListener
{
   JTextField t1,t2;
JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5;
   int a,b,c,d;

public Refund_History()
{ 
   setTitle(" Refund_History ");
  
   setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("14.jpg"));
  JLabel bb =new JLabel(new ImageIcon("1.jpg"));

//ImageIcon bb=new ImageIcon("clouds.jpg");
	b1=new JButton("Login");
	b2=new JButton("Forget password");
	b3=new JButton("Creat account");
	b4=new JButton("Help");
	b5=new JButton("Exit");
	t1=new JTextField(20);
	t2=new JTextField(20);	
			
	l1=new JLabel("Login");
	l2=new JLabel("User Name:");	
	l3=new JLabel("Psassword:");	
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
b4.add(bb);

 setSize(600,650);

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
b4.setBounds(10,500,300,300);
b5.setBounds(500,500,100,30);

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
	//Refund_History f1 = new Refund_History();
}


public void actionPerformed(ActionEvent ae)
{
String aa=t1.getText();
String bb=t2.getText();

if(ae.getSource()==b1)
{ 
	d=a+b+c;
t2.setText(Integer.toString(d));
JOptionPane.showMessageDialog(null,"Data Saved sucessfully..");

}
if(ae.getSource()==b2)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
}

if(ae.getSource()==b3)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
}

if(ae.getSource()==b4)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
}

if(ae.getSource()==b5)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
}
repaint();
}
}