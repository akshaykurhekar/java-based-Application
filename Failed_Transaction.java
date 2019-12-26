import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Failed_Transaction extends JFrame implements ActionListener
{
 
JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5;
 
public Failed_Transaction()
{ 
   setTitle(" Failed_Transaction ");
  
   setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("11.jpg"));

	b1=new JButton("Plan My Jounery");
	b2=new JButton("My Bookings");
	b3=new JButton("File TDR");
	b4=new JButton("Creat Account");
	b5=new JButton("Back");

	l1=new JLabel(" HELP !");
add(background);	

background.add(l1);
background.add(b1);
background.add(b2);
background.add(b3);
background.add(b4);
background.add(b5);

 setSize(600,650);
 setLocationRelativeTo(null);

b3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

l1.setBounds(200,10,200,40);
b1.setBounds(100,100,200,30);
b2.setBounds(100,200,200,30);
b3.setBounds(100,300,200,30);
b4.setBounds(100,400,200,30);
b5.setBounds(100,500,100,30);


Font f1=new Font("Arial",Font.ITALIC,30);
l1.setFont(f1);

}


public static void main (String arg[])
{
	Failed_Transaction f1 = new Failed_Transaction();
}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{ 

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
new HomePage();
}
repaint();
}
}