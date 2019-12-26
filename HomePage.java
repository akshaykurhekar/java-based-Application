import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame implements ActionListener
{   
   JLabel l1,l2,l3,l4,l5;
   JButton b1,b2,b3,b4,b5,b6,b7,b8;
   int a,b,c,d;

public HomePage()
{ 
   setTitle(" HomePage_page ");

   setVisible(true);
   setLayout(new BorderLayout());
   JLabel background =new JLabel(new ImageIcon("11.jpg"));

   JLabel image =new JLabel(new ImageIcon("b.jpg"));
   JLabel image1 =new JLabel(new ImageIcon("b1.jpg"));
   JLabel image2 =new JLabel(new ImageIcon("b2.jpg"));
   JLabel image3 =new JLabel(new ImageIcon("b4.jpg"));
    
    b1=new JButton("Plan_My_Journey");
	b2=new JButton("My_Bookings");
	b3=new JButton("");
	b4=new JButton("Failed_Transaction");
	b5=new JButton("File_TDR");
	b6=new JButton("");
	b7=new JButton("Back");
	b8=new JButton("Exit");
		
	l1=new JLabel("Train Ticketing");
    l2=new JLabel("Plan_My_Journey");	

add(background);	
background.add(l1);
background.add(b1);
background.add(b2);

background.add(b4);
background.add(b5);

background.add(b7);
background.add(b8);

b1.add(image);
b2.add(image1);
b5.add(image2);
b4.add(image3);


b3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
//x.addActionListener(this);
setSize(820,900);
setLocationRelativeTo(null);
l1.setBounds(250,10,800,40);
l2.setBounds(30,80,170,20);
//x.setBounds(100,200,100,30);

b1.setBounds(100,250,300,250);
b2.setBounds(400,250,300,250);
b3.setBounds(100,500,300,250);
b4.setBounds(400,500,300,250);
b5.setBounds(100,500,300,250);
b6.setBounds(400,750,300,250);
b7.setBounds(50,100,100,40);
b8.setBounds(650,100,100,40);

Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
Font f1=new Font("Algerian",Font.ITALIC,30);
l1.setFont(f1);
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{ 
	
PlanJourney1 f1 = new PlanJourney1();
}
if(ae.getSource()==b2)
{
	My_Bookings f1 = new My_Bookings();
}

if(ae.getSource()==b3)
{
	PNR_Status f1 = new PNR_Status();
}

if(ae.getSource()==b4)
{
	HowToUse f1 = new HowToUse();
}

if(ae.getSource()==b5)
{
	File_TDR f1 = new File_TDR();

}
if(ae.getSource()==b6)
{
 Refund_History f1 = new Refund_History();
}
if(ae.getSource()==b7)
{
 Login f1 = new Login();
}
if(ae.getSource()==b8)
{
 System.exit(0);
}

repaint();
}

public static void main (String arg[])
{
	HomePage f =new HomePage();
}

}