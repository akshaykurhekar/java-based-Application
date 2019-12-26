import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Testbox extends JFrame implements ActionListener
{
	
String  mess[] ={"m1","2","3"};
JComboBox box =new JComboBox(mess);
JLabel b1;

public static void main(String[] arg)
{
	Testbox t=new Testbox();
	//CenterFrame(t);
	//MaximisiFrame(t);
	t.setVisible(true);
}
public Testbox()
{
		setLayout(new FlowLayout());
	setSize(400,500);
	setTitle("Testbox");

b1 =new JLabel();

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	box.setSelectedIndex(1);
	box.addActionListener(this);
	add(box);
	add(b1);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==mess){
		Testbox cd =(Testbox)e.getSource();
		String msg =(String)cd.getSelectedItem(); 

		switch(msg){
			case "1":b1.setText("hii babs");
			break;
			case "2":b1.setText("hii baby");
			break;
			case "3":b1.setText("hii dogy");
			break;
			default:b1.setText("oops error...");
		}
	}
}
}  