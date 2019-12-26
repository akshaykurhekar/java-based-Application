import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener
{
   TextField t1,t2,t3,t4;
   JLabel l1,l2,l3,l4,l5,l6;
   JButton b1;
   int a,b,c,d;

public Payment()
{ 
   setTitle(" IRCTC 1 ");
  
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new BorderLayout());
  JLabel background =new JLabel(new ImageIcon("142.jpg"));

//ImageIcon bb=new ImageIcon("clouds.jpg");
    b1=new JButton("Payment");
   
    t1=new TextField(30);
    t2=new TextField(30);   
    t3=new TextField(30);   
    t4=new TextField(30);   
            
    l1=new JLabel("Payment");
    l2=new JLabel("Card No :");    
    l3=new JLabel("Expiry Date :");
    l4=new JLabel("CVV:");
    l5=new JLabel("Ticket Amount :");
    l6=new JLabel("Do not Refresh the Page :");    

    //t2.setEchoChar('*');

    //setBackground(bb);
add(background);    
background.add(l3);
background.add(l1);
background.add(t1);
background.add(l2);
background.add(l3);
background.add(l4);
background.add(l5);
background.add(l6);
background.add(t2);
background.add(t3);
background.add(t4);

background.add(b1);

 setSize(600,650);
 //this stement is use to get frame in center
setLocationRelativeTo(null);
        //t1.setEditable(false);
        //t2.setEditable(false);


b1.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
t4.addActionListener(this);

l1.setBounds(250,10,250,40);
l2.setBounds(100,150,150,30);
l3.setBounds(100,210,150,30);
l4.setBounds(100,260,70,30);
l5.setBounds(300,260,150,30);
l6.setBounds(100,600,300,30);

t1.setBounds(250,150,200,30);
t2.setBounds(250,210,200,30);
t3.setBounds(180,260,80,30);
t4.setBounds(470,260,100,30);

b1.setBounds(250,400,100,30);

Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f3);
l5.setFont(f3);
Font f1=new Font("Arial",Font.ITALIC,30);
l1.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);
t2.setFont(f2);
t1.setFont(f2);
t3.setFont(f2);
t4.setFont(f2);
}

public static void main (String arg[])
{
    Payment f1 = new Payment();
}

public void actionPerformed(ActionEvent ae)
{
    String aa="",bb="",cc="";
    String cardno=t1.getText();
    String edate=t2.getText();
    String cvv=t3.getText();
    
if(ae.getSource()==b1)
{     //Payment
 try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","system","root");

            PreparedStatement ps = con.prepareStatement("SELECT cardno,edate,cvv FROM Payment");
            ResultSet rs = ps.executeQuery();

           while (rs.next()) {

         aa = rs.getString("cardno");
         bb = rs.getString("edate");
         cc = rs.getString("cvv");
               }

            if(cardno.equals(aa) && edate.equals(bb) && cvv.equals(cc))
    {
        JOptionPane.showMessageDialog(null,"Payment successful");
        HomePage f =new HomePage();
        setVisible(false);
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Payment is not successful");
    }
repaint();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR In process...");
    }
}

repaint();
}
}