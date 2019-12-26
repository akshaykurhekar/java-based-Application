import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HowToUse extends JFrame implements ActionListener
{
 
JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5;
 
public HowToUse()
{ 
   setTitle(" HowToUse ");
  
   setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("11.jpg"));

	b1=new JButton("PlanJounery");
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
b1.setBounds(100,100,200,50);
b2.setBounds(100,200,200,50);
b3.setBounds(100,300,200,50);
b4.setBounds(100,400,200,50);
b5.setBounds(100,500,100,50);


Font f1=new Font("Arial",Font.ITALIC,30);
l1.setFont(f1);

Font f2=new Font("Arial",Font.BOLD,20);
b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);

}

public static void main (String arg[])
{
	HowToUse f1 = new HowToUse();
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{ 
	new Help1();
}
if(ae.getSource()==b2)
{
	new Help2();
}

if(ae.getSource()==b3)
{
	new Help3();
}

if(ae.getSource()==b4)
{	
	new Help4();
}

if(ae.getSource()==b5)
{
new HomePage();
}
repaint();
}
}