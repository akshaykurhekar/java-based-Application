import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class My_Bookings extends JFrame implements ActionListener 
{

    JLabel background,l,l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JTextField tf1, tf2, tf3, tf4 ,tf5,tf6, tf7, tf8, tf9,tf10;
    JComboBox bx,bx1,bx2;
    String str,str1,str2;

     JMenuBar mbar;
JMenu i,j;
JMenuItem i1,i2,i3,i4,i5,j1;


    My_Bookings() {

        setVisible(true);
        setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("IRCTC My_Bookings");

 setSize(700,800);
setLocationRelativeTo(null);

mbar=new JMenuBar();
  setJMenuBar(mbar);
  i=new JMenu("List");
  j=new JMenu("Exit");
  // aa=new JMenu("Exit");
   i1=new JMenuItem("Logout");
   i2=new JMenuItem("Home Page");
   i3=new JMenuItem(" Plan Journey ");
    i4=new JMenuItem(" File TDR ");
    i5=new JMenuItem("");
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


        l = new JLabel("Select proper diltals to feach ticket.");
        l2 = new JLabel("Name of passenger");
        l3 = new JLabel("Date of Journey");
        l4 = new JLabel("Source    -    Distenation");

        b = new JButton("Show Ticket");
        b6 = new JButton("Back");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();


         tf2.setEditable(false);
 
        l.setBounds(50, 50, 650, 30);
        l2.setBounds(200, 150, 300, 30);
        l3.setBounds(200, 250, 300, 30);
        l4.setBounds(200, 350, 300, 30);

       
        b.setBounds(500, 600, 150, 30);
        b6.setBounds(50, 600, 100, 30);

        add(l);
        add(l2);
        add(l3);
        add(l4);
        add(b);
        add(b6);

Font f1=new Font("Algerian",Font.ITALIC,30);
l.setFont(f1);

Font f2=new Font("Arial",Font.BOLD,20);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);

b.setFont(f2);
b6.setFont(f2);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf1.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);
        tf8.setEditable(false);
        tf9.setEditable(false);
        tf10.setEditable(false);

        b.addActionListener(this);
        b6.addActionListener(this);
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
            PreparedStatement ps = con.prepareStatement("select source from readdata");
            
             PreparedStatement ps1 = con.prepareStatement("select jdate from traindata");
             PreparedStatement ps2 = con.prepareStatement("select name from passengerdata");

            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();
            ResultSet rs2 = ps2.executeQuery();            
            Vector v = new Vector();
           Vector v1 = new Vector();
           Vector v2 = new Vector();


            while (rs.next()) {

                String s = rs.getString(1);

                 v.add(s);
            }

            bx = new JComboBox(v);

            bx.setBounds(200, 400, 300, 30);

            add(bx);
            bx.setFont(f2);
 
        while (rs1.next()) {

                String s1 = rs1.getString(1);

                 v1.add(s1);

            }

            bx1 = new JComboBox(v1);

            bx1.setBounds(200, 300, 150, 30);

            add(bx1);
            bx1.setFont(f2);


          while (rs2.next()) {

                String s2 = rs2.getString(1);

                 v2.add(s2);

            }

            bx2 = new JComboBox(v2);

            bx2.setBounds(200, 200, 250, 30);

            add(bx2);
            bx2.setFont(f2);   
 

        
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null,"Plz Try again ! Error..");

        }

     }

    public void showTicket() {
        JFrame f1 = new JFrame();

        f1.setVisible(true);
        f1.setSize(800,900);
       f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setTitle("IRCTC ticket");

        l = new JLabel("Train Ticket");       
        l.setForeground(Color.blue);
        l.setFont(new Font("Algerian",Font.ITALIC,40));

        l1 = new JLabel("Name :");
        l2 = new JLabel("Age :");
        l3 = new JLabel("Gender :");
        l4 = new JLabel("Set No. :");
        l5 = new JLabel("No.Passenger :");
        l6 = new JLabel("Date :");
        l7 = new JLabel("Jtime :");
        l8 = new JLabel("Train ticket Rate :");
        
b10 = new JButton("Exit");
b7 = new JButton("Back");

        Font f2=new Font("Lucida Calligraphy",Font.BOLD,20);
l1.setFont(f2);
l2.setFont(f2);
 l3.setFont(f2);
 l4.setFont(f2);
 l6.setFont(f2);
 l5.setFont(f2);
 l7.setFont(f2);
l8.setFont(f2);
  //b1.setFont(f2);
  b7.setFont(f2);
  b10.setFont(f2);
 f1.add(l);
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
       f1.add(b10);
        f1.add(b7);
        f1.add(l5);
        f1.add(l6);
        f1.add(tf6);
        f1.add(l7);
        f1.add(tf7);
        f1.add(l8);
        f1.add(tf8);
        f1.add(tf9);
        f1.add(tf10);

        l.setBounds(270, 30, 300, 40);
        l1.setBounds(40, 110, 150, 30);
        l2.setBounds(40, 160, 100, 30);
        l3.setBounds(350, 160, 150, 30);
        l4.setBounds(40, 210, 150, 30);
        l5.setBounds(410, 210, 300, 30);
        l6.setBounds(40, 260, 100, 30);
        l7.setBounds(350, 260, 150, 30);
        l8.setBounds(40, 430, 250, 30);

        //l6.setBounds(20, 270, 250, 20);
         b10.setBounds(600,600,100,30); 
         b7.setBounds(50,600,100,30);    

        tf1.setBounds(200, 110, 300, 30);
        tf2.setBounds(200, 160, 100, 30);
        tf3.setBounds(500, 160, 100, 30);
        tf4.setBounds(200, 210, 150, 30);
        tf5.setBounds(600, 210, 130, 30);
        tf6.setBounds(180, 260, 150, 30);
        tf7.setBounds(450, 260, 250, 30);
        tf8.setBounds(150, 320, 400, 30);
        tf9.setBounds(320, 430, 200, 30);
        tf10.setBounds(150, 370, 400, 30);

        b10.addActionListener(this);
        b7.addActionListener(this);

        str = (String) bx.getSelectedItem();
       str1 = (String) bx1.getSelectedItem();
       str2 = (String) bx2.getSelectedItem();

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

            PreparedStatement ps2 = con.prepareStatement("select * from passengerdata where name=?");
            PreparedStatement ps = con.prepareStatement("select * from readdata where source=?");
            PreparedStatement ps1 = con.prepareStatement("select * from traindata where jdate=?");
          
            ps2.setString(1, str2); 
            ps.setString(1, str);
            ps1.setString(1, str1);

            ResultSet rs2 = ps2.executeQuery();             
            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();

             while (rs2.next()) {
                tf1.setText(rs2.getString(1));
                tf2.setText(rs2.getString(2));
                tf3.setText(rs2.getString(3));
                //tf4.setText(rs.getString(3));
                tf5.setText(rs2.getString(4));
            
            }

            while (rs.next()) {

               tf10.setText(rs.getString(1));
                //tf2.setText(rs.getString(1));
                tf7.setText(rs.getString(2));
                
                tf9.setText(rs.getString(4));
            }

             while (rs1.next()) {

                tf6.setText(rs1.getString(1));
                tf8.setText(rs1.getString(2));
                tf4.setText(rs1.getString(3));
            
            }
                          
tf1.setFont(f2);
tf2.setFont(f2);
tf3.setFont(f2);
tf4.setFont(f2);
tf5.setFont(f2);
tf6.setFont(f2);
tf7.setFont(f2);
tf8.setFont(f2);
tf9.setFont(f2);
tf10.setFont(f2);

        } catch (Exception ex) {
    	        JOptionPane.showMessageDialog(null,"Plz Try again ! Error..found");
    	        System.out.println(ex);
        }

    }

    public static void main(String arr[]) {

     My_Bookings p = new My_Bookings();

    }

    public void actionPerformed(ActionEvent ae) 
    {
        

if(ae.getSource()==i1)
{
new Login();
}

if(ae.getSource()==i2)
{
new HomePage();
}

if(ae.getSource()==i3)
{
new PlanJourney1();
}

if(ae.getSource()==i4)
{
new File_TDR();
}

if(ae.getSource()==i5)
{
//new Help();
}



if(ae.getSource()==b)
        {
        showTicket();
         }

if(ae.getSource()==b6)
     {
        new HomePage();
     }

if(ae.getSource()==b7)
        {
        new My_Bookings();
                 }
 if(ae.getSource()==b10)
        {
        System.exit(0);
                 }                
}
}