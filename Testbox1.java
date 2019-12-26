import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Testbox1 extends JFrame implements ActionListener
{
	
//int  mess[] ={1,2,3};

JLabel b1;

public static void main(String[] arg)
{
	Testbox1 t=new Testbox1();
	//CenterFrame(t);
	//MaximisiFrame(t);
	t.setVisible(true);
}
public Testbox1()
{
		setLayout(new FlowLayout());
	setSize(400,500);
	setTitle("Testbox");

b1 =new JLabel("akshy");

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JComboBox box =new JComboBox();
box.addItem("akshay");
box.addItem("akshay2");
box.addItem("akshay3");
	box.setSelectedIndex(0);
	box.addActionListener(this);
	box.setBounds(50,50,200,30);
	add(box);
	add(b1);
}

public void actionPerformed(ActionEvent e)
{
	
	
}
}  