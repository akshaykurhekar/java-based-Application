import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class Makepayment extends JFrame implements ActionListener 
{

    JLabel l, l1, l2, l3, l4, l5,l6;
    JButton b;
    JTextField tf1, tf2, tf3, tf4;
    JComboBox bx,bx1;
    String str,str1;

  Makepayment() {

       // JFrame f2 = new JFrame();
setTitle("IRCTC");
        setVisible(true);
        
       // setLayout(null);
        setLocationRelativeTo(null);
        
        
 

        l5 = new JLabel("* Make Payment *");       

        l5.setForeground(Color.orange);

        l5.setFont(new Font("Algerian",Font.BOLD,40));

        l1 = new JLabel("Card No.         :");

        l2 = new JLabel("Expiry Date      :");

        l3 = new JLabel("CVV :");

        l4 = new JLabel("Amount :");

        l6 = new JLabel(" Do not Refresh the page ");

b = new JButton("Pay");

  add(l5);

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(l3);
        add(tf3);

        add(l4);
        add(tf4);
       add(l6);
       
      add(b);

 b.addActionListener(this);

JOptionPane.showMessageDialog(null,"System 1");

        Font f=new Font("Lucida Calligraphy",Font.BOLD,20);
l1.setFont(f);
l2.setFont(f);
 l3.setFont(f);
 l4.setFont(f);
 l6.setFont(new Font("Arial",Font.BOLD,20));
  b.setFont(new Font("Lucida Calligraphy",Font.BOLD,30));

        l5.setBounds(150, 30, 300, 40);

        l1.setBounds(20, 110, 250, 20);

        l2.setBounds(20, 150, 250, 20);

        l3.setBounds(20, 200, 100, 20);

        l4.setBounds(260, 200, 150, 20);

        l6.setBounds(100, 700, 300, 20);

        b.setBounds(200,400,200,40); 

        tf1.setBounds(250, 110, 300, 30);

        tf2.setBounds(250, 150, 300, 30);

        tf3.setBounds(140, 200, 100, 30);

        tf4.setBounds(420, 200, 200, 30);

        setSize(700,800);     
      str = (String) bx.getSelectedItem();
  
     str1 = (String) bx1.getSelectedItem();

JOptionPane.showMessageDialog(null,"System 2.");

/*try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

            PreparedStatement ps = con.prepareStatement("select * from payment where cardno=?");
            //PreparedStatement ps1 = con.prepareStatement("select * from traindata where jdate=?");

            ps.setString(1, str);
           // ps1.setString(1, str1);

            ResultSet rs = ps.executeQuery();
            //ResultSet rs1 = ps1.executeQuery();

            while (rs.next()) {

                tf1.setText(rs.getString(1));

                //tf2.setText(rs.getString(1));

                tf3.setText(rs.getString(2));

                tf4.setText(rs.getString(3));

               // tf5.setText(rs.getString(4));
            }

             while (rs1.next()) {

                //tf1.setText(rs1.getString(1));

                tf2.setText(rs1.getString(2));

                //tf3.setText(rs1.getString(2));

                //tf4.setText(rs.getString(3));

                //tf5.setText(rs.getString(4));
            }

tf1.setFont(f);
tf2.setFont(f);
tf3.setFont(f);
tf4.setFont(f);
//tf5.setFont(f);


        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null,"System .");
            //System.out.println(ex);

        }*/

   }

    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b)
       {

       }
    }



   public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"System Error");
        Makepayment m = new Makepayment();
    }

}