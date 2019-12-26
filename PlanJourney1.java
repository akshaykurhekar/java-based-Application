import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class PlanJourney1 extends JFrame implements ActionListener 
{

    JLabel background,l,l1,l2,l3,l4,l5,l6,l7;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JTextField tf1, tf2, tf3, tf4 ,tf5,t1,t2,t3,t4,tp1,tp2,tp3,tp4;
    JComboBox bx,bx1;
    String str,str1,str2;

    JMenuBar mbar;
JMenu i,j;
JMenuItem i1,i2,i3,i4,i5,j1;


    PlanJourney1() {

        setVisible(true);
        setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("IRCTC-PlanJourney1");

mbar=new JMenuBar();
  setJMenuBar(mbar);
  i=new JMenu("List");
  j=new JMenu("Exit");
  // aa=new JMenu("Exit");
   i1=new JMenuItem("Logout");
   i2=new JMenuItem("Home Page");
   i3=new JMenuItem(" Booking Page ");
    i4=new JMenuItem(" File TDR ");
    i5=new JMenuItem("Help");
    j1=new JMenuItem(" Close ");
  i.add(i1);
   i.add(i2);
   i.add(i3);
   i.add(i4);
   i.add(i5);
   j.add(j1);
   //add(x);
   mbar.add(i); 
   mbar.add(j);
   //mbar.add(aa);
   mbar.setBounds(10,10,100,40);

    i1.addActionListener(this);
    i2.addActionListener(this);
    i3.addActionListener(this);
  i4.addActionListener(this);
  i5.addActionListener(this);
  j1.addActionListener(this);

setSize(new Dimension(300,200));

        l = new JLabel("Source    -    Distenation");
        l6 = new JLabel("Plan My Journey");
        l7 = new JLabel("Date :");

        b = new JButton("Show Trains");
        b6 = new JButton("Back");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
       tp1 = new JTextField();
        tp2 = new JTextField();
        tp3 = new JTextField();
        tp4 = new JTextField();
 

        l.setBounds(200, 150, 300, 20);
        l6.setBounds(160, 30, 370, 40);
        l7.setBounds(200, 250, 100, 40);

        tf2.setEditable(false);
        b.setBounds(250, 400, 200, 30);
        b6.setBounds(50, 600, 100, 30);

Font f1=new Font("Algerian",Font.ITALIC,40);
l6.setFont(f1);

Font f2=new Font("Arial",Font.BOLD,20);
l.setFont(f2);
l7.setFont(f2);

b.setFont(f2);
b6.setFont(f2);

        add(l);
        add(l6);
        add(l7);
        add(b);
        add(b6);

        tf1.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);

        b.addActionListener(this);
        b6.addActionListener(this);

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
            PreparedStatement ps = con.prepareStatement("select source from readdata");
            
             PreparedStatement ps1 = con.prepareStatement("select jdate from traindata");

            ResultSet rs = ps.executeQuery();

            ResultSet rs1 = ps1.executeQuery();

            Vector v = new Vector();
            
            Vector v1 = new Vector();

            while (rs.next()) {

                String s = rs.getString(1);

                 v.add(s);
            }

            bx = new JComboBox(v);

            bx.setBounds(200, 180, 300, 30);

            add(bx);
            bx.setFont(f2);
 
        while (rs1.next()) {

                String s1 = rs1.getString(1);

                 v1.add(s1);

            }

            bx1 = new JComboBox(v1);

            bx1.setBounds(340, 250, 150, 30);

            add(bx1);
            bx1.setFont(f2);
 

         setSize(700,800);
setLocationRelativeTo(null);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null,"Plz Try again ! Error..");

        }

     }

    public void showData() {

        JFrame f1 = new JFrame();

        f1.setVisible(true);
        f1.setSize(700,800);
       f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setTitle("IRCTC");

        l5 = new JLabel("Train Data:");       
        l5.setForeground(Color.green);
        l5.setFont(new Font("Algerian",Font.ITALIC,40));

        l1 = new JLabel("Place             :");
        l2 = new JLabel("Train Name        :");
        l3 = new JLabel("Journey Time      :");
        l4 = new JLabel("Days of Train     :");
        l6 = new JLabel("Train ticket Rate:");

b1 = new JButton("Book Now");
b7 = new JButton("Back");

        Font f2=new Font("Lucida Calligraphy",Font.BOLD,20);
l1.setFont(f2);
l2.setFont(f2);
 l3.setFont(f2);
 l4.setFont(f2);
 l6.setFont(f2);
  b1.setFont(f2);
  b7.setFont(f2);

        l5.setBounds(150, 30, 300, 40);

        l1.setBounds(20, 110, 250, 20);

        l2.setBounds(20, 150, 250, 20);

        l3.setBounds(20, 190, 250, 20);

        l4.setBounds(20, 230, 250, 20);

        l6.setBounds(20, 270, 250, 20);
        b1.setBounds(150,340,200,30); 
         b7.setBounds(50,600,200,30);    

        tf1.setBounds(250, 110, 300, 30);

        tf2.setBounds(250, 150, 300, 30);

        tf3.setBounds(250, 190, 300, 30);

        tf4.setBounds(250, 230, 300, 30);

        tf5.setBounds(250, 270, 300, 30);
 

       f1.add(l5);
        f1.add(l1);
        f1.add(tf1);
        f1.add(l2);
        f1.add(tf2);
        f1.add(l3);
        f1.add(tf3);
        f1.add(l4);
        f1.add(tf4);
        f1.add(l6);
        f1.add(tf5);
        f1.add(b1);
        f1.add(b7);
 b1.addActionListener(this);
 b7.addActionListener(this);

        str = (String) bx.getSelectedItem();
       str1 = (String) bx1.getSelectedItem();

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

            PreparedStatement ps = con.prepareStatement("select * from readdata where source=?");
            PreparedStatement ps1 = con.prepareStatement("select * from traindata where jdate=?");
         //PreparedStatement ps2 = con.prepareStatement("select * from readdata where source=?");

            ps.setString(1, str);
            ps1.setString(1, str1);
             //ps2.setString(1, str); 

            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();
            //ResultSet rs2 = ps2.executeQuery();

            while (rs.next()) {

               tf1.setText(rs.getString(1));
                //tf2.setText(rs.getString(1));
                tf3.setText(rs.getString(2));
                tf4.setText(rs.getString(3));
                tf5.setText(rs.getString(4));
            }

             while (rs1.next()) {

                tf2.setText(rs1.getString(2));
            
            }
             
                      
tf1.setFont(f2);
tf2.setFont(f2);
tf3.setFont(f2);
tf4.setFont(f2);
tf5.setFont(f2);

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }


public void Payment()
{ 
JFrame p = new JFrame();

   p.setTitle(" IRCTC Payment ");
   p.setVisible(true);
   p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   p.setSize(700,800);
   p.setLayout(null);
   p.setLocationRelativeTo(null);

  // background =new JLabel(new ImageIcon("14.jpg"));
//ImageIcon bb=new ImageIcon("clouds.jpg");
    b3=new JButton("Payment");
    b8=new JButton("Back");

    l1=new JLabel("Payment");
    l2=new JLabel("Card No :");    
    l3=new JLabel("Expiry Date :");
    l4=new JLabel("CVV:");
    l5=new JLabel("Ticket Amount :");
    l6=new JLabel("Do not Refresh the Page ");    

    //t2.setEchoChar('*');
    //setBackground(bb);
//p.add(background);    

//JOptionPane.showMessageDialog(null,"1");
p.add(l3);
p.add(l1);
p.add(t1);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(l6);
p.add(t2);
p.add(t3);
p.add(t4);

p.add(b3);
p.add(b8);
 //JOptionPane.showMessageDialog(null,"2");
 //this stement is use to get frame in center

        //t1.setEditable(false);
        //t2.setEditable(false);
b3.addActionListener(this);
b8.addActionListener(this);
t1.addActionListener(this);
t2.addActionListener(this);
t3.addActionListener(this);
t4.addActionListener(this);

l1.setBounds(250,10,250,40);
l2.setBounds(100,150,150,30);
l3.setBounds(100,210,150,30);
l4.setBounds(100,260,70,30);
l5.setBounds(300,260,150,30);
l6.setBounds(300,600,300,30);

t1.setBounds(250,150,200,30);
t2.setBounds(250,210,200,30);
t3.setBounds(180,260,80,30);
t4.setBounds(460,260,200,30);

b3.setBounds(250,400,100,30);
b8.setBounds(50,600,100,30);
Font f3=new Font("Arial",Font.BOLD,20);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f3);
l5.setFont(f3);
Font f1=new Font("Algerian",Font.ITALIC,40);
l1.setFont(f1);
Font f2=new Font("Arial",Font.BOLD,20);


 //JOptionPane.showMessageDialog(null,"3");

//str = (String)bx.getSelectedItem();
  
try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

            PreparedStatement ps2 = con.prepareStatement("select * from readdata where source=?");
           
            ps2.setString(1, str);
           
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                t4.setText(rs2.getString(4));
            }

        } catch (Exception ex) {

            System.out.println(ex);
JOptionPane.showMessageDialog(null,"EXCEPTION");
        }

t2.setFont(f2);
t1.setFont(f2);
t3.setFont(f2);
t4.setFont(f2);
}

public void PassengerData() {

        JFrame h = new JFrame();

        h.setVisible(true);
        h.setSize(700,800);
       h.setLocationRelativeTo(null);
        h.setLayout(null);
        h.setTitle("IRCTC");

           l5 = new JLabel("Passenger ditals");       

        l5.setForeground(Color.red);
        l5.setFont(new Font("Algerian",Font.ITALIC,40));

        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Gender");
        l4 = new JLabel("No.oF Passenger");

       b5 = new JButton("Next");
       b4 = new JButton("Back");

        Font f2=new Font("Lucida Calligraphy",Font.BOLD,20);
      l1.setFont(f2);
      l2.setFont(f2);
      l3.setFont(f2);
      l4.setFont(f2);
    //l6.setFont(f2);
      b5.setFont(f2);
      b4.setFont(f2);

        l5.setBounds(200, 50, 300, 40);
        l1.setBounds(50, 150, 250, 30);
        l2.setBounds(50, 220, 100, 30);
        l3.setBounds(350, 220,100,30);
        l4.setBounds(50, 290, 250, 30);

   //     l6.setBounds(20, 270, 250, 20);
        b4.setBounds(50,700,100,30); 
        b5.setBounds(550,700,100,30);     

        tp1.setBounds(300, 150, 250, 30);
        tp2.setBounds(200, 220, 100, 30);
        tp3.setBounds(450, 220, 100, 30);
        tp4.setBounds(300, 290, 300, 30);


       h.add(l5);

        h.add(l1);
        h.add(tp1);

         h.add(l2);
        h.add(tp2);

        h.add(l3);
        h.add(tp3);

        h.add(l4);
        h.add(tp4);

        h.add(b5);
        h.add(b4);
 b5.addActionListener(this);
 b4.addActionListener(this);

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

            PreparedStatement ps = con.prepareStatement("select * from readdata where source=?");
            PreparedStatement ps1 = con.prepareStatement("select * from traindata where jdate=?");
         
            ps.setString(1, str);
            ps1.setString(1, str1);
         
            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();
         
            while (rs.next()) {

               tf1.setText(rs.getString(1));

                tf3.setText(rs.getString(2));

                tf4.setText(rs.getString(3));

                tf5.setText(rs.getString(4));
            }

             while (rs1.next()) {

                tf2.setText(rs1.getString(2));
            
            }
         
          
tp1.setFont(f2);
tp2.setFont(f2);
tp3.setFont(f2);
tp4.setFont(f2);

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void main(String arr[]) {

       PlanJourney1 p = new PlanJourney1();

    }

    public void actionPerformed(ActionEvent ae) 
    {



if(ae.getSource()==i1)
{
new Login();
}

if(ae.getSource()==i2)
{
//  System.exit(0);
new HomePage();
}

if(ae.getSource()==i3)
{
new My_Bookings();
}

if(ae.getSource()==i4)
{
new File_TDR();
}

if(ae.getSource()==i5)
{
  new Help1();
}


if(ae.getSource()==j1)
{
System.exit(0);
}




      
       String aa="",bb="",cc="";
       String cardno=t1.getText();
       String edate=t2.getText();
       String cvv=t3.getText(); 
   
if(ae.getSource()==b3)
{ 
      
//Payment
 try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

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

    }
    catch(Exception ab)
    {
        JOptionPane.showMessageDialog(null,"ERROR In process...");
    }
}
if(ae.getSource()==b)
        {
        showData();
           
         }

 if(ae.getSource()==b1)
        {

           PassengerData();
        }

 if(ae.getSource()==b4)
        {
        showData();
           
         }        

if(ae.getSource()==b6)
        {
        new HomePage();
                 }

if(ae.getSource()==b7)
        {
        new PlanJourney1();
                 }

if(ae.getSource()==b8)
        {
         PassengerData();
                 }


    String name=tp1.getText();
    String age=tp2.getText();
    String gender=tp3.getText();
    String passenger=tp4.getText();
 try {

          PreparedStatement pst;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","system","root");


        if(ae.getSource()==b5)
   {            
        if(name.equals("")||age.equals("")||gender.equals("")||passenger.equals(""))
        {
            JOptionPane.showMessageDialog(null," Enter Passenger Data Properly ");
        }
        else{
            pst=con.prepareStatement("insert into passengerdata values(?,?,?,?)");
        String name1=tp1.getText();
        String age1=tp2.getText();
        String gender1=tp3.getText();
        String passenger1=tp4.getText();
        pst.setString(1,name1);
        pst.setString(2,age1);
        pst.setString(3,gender1);
        pst.setString(4,passenger1);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(null," Data Incerted Sucessfully");
        tp1.setText("");
        tp2.setText("");
        tp3.setText("");
        tp4.setText("");

         Payment();

        }
}
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"ERROR In process...");
    }

        repaint();
    }
}