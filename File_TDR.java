import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class File_TDR extends JFrame implements ActionListener
{
   JTextField t1,t2;
//JLabel l1,l2,l3;
   JButton b1,b2,b3;
   int a,b,c,d;
   TextArea t;

public File_TDR()
{ 
   setTitle(" File_TDR ");
  
   setVisible(true);
  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("11.jpg"));
  //JLabel bb =new JLabel(new ImageIcon("1.jpg"));

  	TextArea t = new TextArea();
  	t.setText("\t plz Enter Your Feedback \n  :");
  	
	b1=new JButton("Back");
	b2=new JButton("Exit");
	b3=new JButton("SUBMIT");
			
	t2=new JTextField("File TDR");
	t1=new JTextField(" Plz Enter your Feedback and Any Query ");
	
add(background);	
//background.add(l1);
background.add(b1);
background.add(b2);
background.add(b3);
background.add(t);
background.add(t1);
background.add(t2);

//b1.add(bb);

 setSize(700,650);
 setLocationRelativeTo(null);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

t.setBounds(100,150,450,300);
t1.setBounds(20,70,650,40);
t2.setBounds(250,20,150,40);
b1.setBounds(20,500,100,30);
b2.setBounds(550,500,100,30);
b3.setBounds(300,500,100,30);

 t1.setEditable(false);
t2.setEditable(false);

Font f1=new Font("Algerian",Font.ITALIC,30);
t2.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t.setFont(f2);
t1.setFont(f1);
}


public static void main (String arg[])
{
	File_TDR f1 = new File_TDR();
}


public void actionPerformed(ActionEvent ae)
{
//String aa=t1.getText();
//String bb=t2.getText();

if(ae.getSource()==b1)
{
	new HomePage();
}

if(ae.getSource()==b2)
{
System.exit(0);
}

if(ae.getSource()==b3)
{

	JOptionPane.showMessageDialog(null," Thank You For Your Feedback ");
}

repaint();
}
}