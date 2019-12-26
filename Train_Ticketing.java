import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame implements ActionListener
{   
   JLabel l1,l2,l3;
   JButton b1,b2,b3,b4,b5,b6,b7,b8;
   int a,b,c,d;

public HomePage()
{ 
   setTitle(" HomePage_page ");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   setLayout(new BorderLayout());
   JLabel background =new JLabel(new ImageIcon("10.jpg"));
   JLabel image =new JLabel(new ImageIcon("10.jpg"));
    
    b1=new JButton("Plan_My_Journey");
	b2=new JButton("My_Bookings");
	b3=new JButton("PNR_Status");
	b4=new JButton("Failed_Transaction");
	b5=new JButton("File_TDR");
	b6=new JButton("Refund_History");
	b7=new JButton("Back");
	b8=new JButton("Exit");
		
	l1=new JLabel("Train Ticketing");
    l2=new JLabel("Plan_My_Journey");	
	//l3=new JLabel("Psassword:");	
//	JComboBox x=new JComboBox("check me");

add(background);	
background.add(l1);
background.add(b1);
background.add(b2);
background.add(b3);
background.add(b4);
background.add(b5);
background.add(b6);
background.add(b7);
background.add(b8);
b1.add(image);
image.add(l2);

b3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
//x.addActionListener(this);
setSize(900,1000);
l1.setBounds(250,10,200,40);
l2.setBounds(50,50,100,40);
//x.setBounds(100,200,100,30);

b1.setBounds(100,150,300,250);
b2.setBounds(400,150,300,250);
b3.setBounds(100,400,300,250);
b4.setBounds(400,400,300,250);
b5.setBounds(100,650,300,250);
b6.setBounds(400,650,300,250);
b7.setBounds(50,50,100,40);
b8.setBounds(650,50,100,40);
//Font f3=new Font("Arial",Font.BOLD,20);
//l2.setFont(f3);
//l3.setFont(f3);

Font f1=new Font("Arial",Font.ITALIC,30);
l1.setFont(f1);
l2.setFont(f1);

//Font f2=new Font("Arial",Font.BOLD,20);
//t2.setFont(f2);
//t1.setFont(f2);
}



public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{ 
	
//JOptionPane.showMessageDialog(null,"Data Saved sucessfully..");
PlanJourney1 f1 = new PlanJourney1();
}
if(ae.getSource()==b2)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
//ImageIcon aa=new ImageIcon("15.png");
//	b6=new JButton(aa);
	My_Bookings f1 = new My_Bookings();
}

if(ae.getSource()==b3)
{
//t1.requestFocus();
//setBackground(ImageIcon("2.jpg"));
	PNR_Status f1 = new PNR_Status();
}

if(ae.getSource()==b4)
{
//t1.requestFocus();
//setBackground(ImageIcon("21.jpg"));
	Failed_Transaction f1 = new Failed_Transaction();
}

if(ae.getSource()==b5)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
	File_TDR f1 = new File_TDR();

}
if(ae.getSource()==b6)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
 Refund_History f1 = new Refund_History();
}
if(ae.getSource()==b7)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
 Login f1 = new Login();
}
if(ae.getSource()==b8)
{
//t1.requestFocus();
//setBackground(ImageIcon("clouds.jpg"));
 System.exit(0);
}

repaint();
}

public static void main (String arg[])
{
	HomePage f =new HomePage();
}

}