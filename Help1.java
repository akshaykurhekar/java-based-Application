import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help1 extends JFrame implements ActionListener
{
   JTextField t1,t2;
   JButton b1,b2;
   int a,b,c,d;
   TextArea t;

public Help1()
{ 
   setTitle(" Help1 ");
  
   setVisible(true);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("11.jpg"));

  	TextArea t = new TextArea();
  	t.setText("\n 1 : Select Source & Destination of Journey \n   Select Date & Click ON Show Train \n\n 2 : Get Train Detials If you want to \n   Book train Click on BOOK NOW  "
      +"\n\n 3 : Then Enter Passenger Detials \n  -> NAME OF Passenger \n  -> Number of Passenger \n  -> Age of Passenger \n  & Click ON Next Button \n\n 4 : And Make Pament Enter Proper Pament Detials\n   TO Feach Ticket Go BACK in My Bookings");
  	
	b1=new JButton("Back");
	b2=new JButton("Exit");
	t2=new JTextField("HELP..");
	t1=new JTextField("         Fallow the given Instruction ");
	
add(background);	
background.add(t1);
background.add(b1);
background.add(b2);
background.add(t);
background.add(t1);
background.add(t2);

 setSize(700,700);
 setLocationRelativeTo(null);

b1.addActionListener(this);
b2.addActionListener(this);

t.setBounds(100,150,500,400);
t1.setBounds(20,70,650,40);
t2.setBounds(250,20,150,40);
b1.setBounds(20,600,100,30);
b2.setBounds(550,600,100,30);

 t1.setEditable(false);
t2.setEditable(false);
t.setEditable(false);

Font f1=new Font("Algerian",Font.ITALIC,30);
t2.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t.setFont(f2);
t1.setFont(f1);
}

public static void main (String arg[])
{
	Help1 f1 = new Help1();
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{
	new HowToUse();
}

if(ae.getSource()==b2)
{
System.exit(0);
}

repaint();
}
}