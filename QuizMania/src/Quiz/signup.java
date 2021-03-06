package Quiz;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;


public class signup implements ActionListener, FocusListener {

	JFrame f;
	JButton b4,b5,b1,b2,b3;
	JPasswordField pf1,pf2;
	JTextField tuserid, tfname, tlname, tdd, tmm, tyy, tcountry;
	ButtonGroup bg;
	JRadioButton female, male;
	int day, month, year, flag=1;
	
	public signup()
	{
		f = new JFrame("Sign Up");
		f.setLayout(null);
		
		ImageIcon logo = new ImageIcon("quizmania.jpg");
		JLabel l1 = new JLabel();
		l1.setIcon(logo);
		l1.setBounds(30,10,300,170);
	
		JPanel p2 = new JPanel();
		p2.setBackground(Color.black);
		p2.setLayout(null);
		p2.setBounds(20,100,980,50);
		
		b1 = new JButton("Home");
		b2 = new JButton("Login");
		b3 = new JButton("SignUp");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b1.setBounds(470,8,90,30);
		b2.setBounds(670,8,90,30);
		b3.setBounds(870,8,90,30);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(150,220,730,450);
		p3.setBackground(Color.cyan);
		ImageIcon icon = new ImageIcon("download.jpg");
		p3.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, icon));
		
		
		JLabel l2 = new JLabel("Sign Up");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,32));
		l2.setForeground(Color.red);
		l2.setBounds(320,10,300,50);
		p3.add(l2);
		
		JLabel l3 = new JLabel("UserId :");
		l3.setBounds(40,130,100,30); 
		tuserid = new JTextField("");
		tuserid.setBounds(150,130,200,30);
		JLabel l4 = new JLabel("Enter Password :");
		l4.setBounds(40,180,100,30);
		pf1 = new JPasswordField("");
		pf1.setBounds(150,180,200,30);
		
		JLabel l5 = new JLabel("Confirm Pwd :");
		l5.setBounds(40,230,100,30);
		pf2 = new JPasswordField("");
		pf2.setBounds(150,230,200,30);
		JLabel l6 = new JLabel("Name :");
		l6.setBounds(410,130,100,30);
		tfname = new JTextField("First Name");
		tfname.setBounds(475,130,90,30);
		tlname = new JTextField("Last Name");
		tlname.setBounds(585,130,90,30);
		JLabel l7 = new JLabel("D.O.B :");
		l7.setBounds(410,180,100,30);
		tdd = new JTextField("DD");
		tdd.setBounds(475,180,50,30);
		tmm = new JTextField("MM");
		tmm.setBounds(535,180,50,30);
		tyy = new JTextField("YYYY");
		tyy.setBounds(595,180,65,30);
		JLabel l8 = new JLabel("Country :");
		l8.setBounds(410,230,100,30);
		tcountry = new JTextField("");
		tcountry.setBounds(475,230,150,30);
		JLabel l9 = new JLabel("Gender :");
		l9.setBounds(40,280,100,30);
		JLabel tfemale = new JLabel("Female");
		JLabel tmale = new JLabel("Male");
		female = new JRadioButton("Female");
		female.setBounds(150,280,20,30);
		tfemale.setBounds(180,280,100,30);
		male = new JRadioButton("Male");
		male.setBounds(240,280,20,30);
		tmale.setBounds(270,280,100,30);
		bg = new ButtonGroup();
		bg.add(female);
		bg.add(male);
	
		
		
		b4 = new JButton("Reset");
		b5 = new JButton("Submit");
		b4.setBackground(Color.red);
		b5.setBackground(Color.red);
		b4.setForeground(Color.white);
		b5.setForeground(Color.white);
		b4.setBounds(60,380,280,40);
		b5.setBounds(410,380,280,40);
		
		
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		p3.add(l5); p3.add(pf2); p3.add(l6); p3.add(tuserid); p3.add(tfname);
		p3.add(l7); p3.add(l8); p3.add(tlname); p3.add(tdd); p3.add(tmm);
		p3.add(tyy); p3.add(b4); p3.add(b5);
		p3.add(l9); p3.add(female); p3.add(male);
		p3.add(tfemale); p3.add(tmale);
		p3.add(l3);
		p3.add(l4);
		p3.add(tcountry);
		p3.add(pf1);
		
		
		tfname.addFocusListener(this);
		tlname.addFocusListener(this);
		tdd.addFocusListener(this);
		tmm.addFocusListener(this);
		tyy.addFocusListener(this);
		pf2.addFocusListener(this);
		
		
		
		f.add(l1);
		f.add(p2);
		f.add(p3);
		f.setVisible(true);
		f.setSize(1025,750);
	}
	
	
	
	public void focusGained (FocusEvent e)
	{
		if (e.getSource()==tfname)
		{
			if (tfname.getText().toString().equals("First Name"))
			{
				tfname.setText("");
			}
		}
		
		else if (e.getSource()==tlname)
		{
			if (tlname.getText().toString().equals("Last Name"))
			{
				tlname.setText("");
			}
		}
		
		else if (e.getSource()==tdd)
		{
			if (tdd.getText().toString().equals("DD"))
			{
				tdd.setText("");
			}
		}
		
		else if (e.getSource()==tmm)
		{
			if (tmm.getText().toString().equals("MM"))
			{
				tmm.setText("");
			}
		}
		
		else if (e.getSource()==tyy)
		{
			if (tyy.getText().toString().equals("YYYY"))
			{
				tyy.setText("");
			}
		}
		
	}
	
	public void focusLost (FocusEvent e)
	{
		if (e.getSource()==tfname)
		{
			if (tfname.getText().toString().equals(""))
			{
				tfname.setText("First Name");
			}
			
			else if (!tfname.getText().matches("[a-zA-Z]*"))
			{
				JOptionPane.showMessageDialog(null, "First Name Can Only Have Alphabets");
				tfname.setText("First Name");
			}
		}
		
		else if (e.getSource()==tlname)
		{
			if (tlname.getText().toString().equals(""))
			{
				tlname.setText("Last Name");
			}
			
			else if (!tlname.getText().matches("[a-zA-Z]*")) 
			{
				JOptionPane.showMessageDialog(null, "Last Name Can Only Have Alphabets");
				tlname.setText("Last Name");
			}
		}
		
		else if (e.getSource()==tdd)
		{
			if (tdd.getText().toString().equals(""))
			{
				tdd.setText("DD");
			}
			
			else if (!tdd.getText().matches("[0-9]*"))
			{
				JOptionPane.showMessageDialog(null, "Enter Only Numbers");
				tdd.setText("DD");
			}
		}
		
		else if (e.getSource()==tmm)
		{
			if (tmm.getText().toString().equals(""))
			{
				tmm.setText("MM");
			}
			
			else if (!tmm.getText().matches("[0-9]*"))
			{
				JOptionPane.showMessageDialog(null, "Enter Only Numbers");
				tmm.setText("MM");
			}
		}
		
		else if (e.getSource()==tyy)
		{
			if (tyy.getText().toString().equals(""))
			{
				tyy.setText("YYYY");
			}
			
			else if (!tyy.getText().matches("[0-9]*"))
			{
				JOptionPane.showMessageDialog(null, "Enter Only Numbers");
				tyy.setText("YYYY");
			}
			
			else if (Integer.parseInt(tyy.getText().toString())<1930 || Integer.parseInt(tyy.getText().toString())>2010)
			{
				JOptionPane.showMessageDialog(null, "Enter Year Between 1990 to 2010");
				tyy.setText("YYYY");
			}
			
		}
		
		else if (e.getSource()==pf2)
		{
			if (pf1.getText().toString().equals(pf2.getText().toString())==false)
					{
						JOptionPane.showMessageDialog(null, "Passwords Don't Match");
						pf1.setText("");
						pf2.setText("");
					}
		}
	}
	
	
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource()==b1)
		{
			f.dispose();
			new home();
		}
		
		else if (e.getSource()==b2)
		{
			f.dispose();
			login obj = new login();
			obj.loginn();
		}
		
		else if (e.getSource()==b4 || e.getSource()==b3)
		{
			tuserid.setText("");
			pf1.setText("");
			pf2.setText("");
			tfname.setText("First Name");
			tlname.setText("Last Name");
			tcountry.setText("");
			tdd.setText("MM");
			tmm.setText("DD");
			tyy.setText("YYYY");
			return;
		}
		
		
		else if (e.getSource()==b5)
		{
			// Everything Is Entered
			if ( tuserid.getText().toString().equals("") || pf1.getText().toString().equals("") || 
				 pf2.getText().toString().equals("") || tfname.getText().toString().equals("First Name") ||
				 tfname.getText().toString().equals("") || tlname.getText().toString().equals("") ||
				 tlname.getText().toString().equals("Last Name") )
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Form Is Incomplete");
			}
			
			else if ( (tuserid.getText().toString().contains(" ")) || tuserid.getText().toString().contains(","))
			{
				JOptionPane.showMessageDialog(null,"Username Can't Have Comma(,) or Blank Space( )");
				flag=0;
			}
			
			else if ( pf1.getText().toString().equals(pf2.getText().toString())==false )
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Passwords Don't Match");
			}
			
			else 
			{
				try {
				day = Integer.parseInt(tdd.getText());
				month = Integer.parseInt(tmm.getText());
				year = Integer.parseInt(tyy.getText());
								
				if ( month==2 )
				{	if ( day==29 )
				    {	if (year%4==0)
				    	{	JOptionPane.showMessageDialog(null,"Incorrect DOB");
				    		flag=0;
				    	}
				    }
				    else if (day>29)
				    {	JOptionPane.showMessageDialog(null,"Incorrect DOB");
				    	flag=0;
				    }
				} 
				
				if ( (day==31) && (month==2 || month==4 || month==6 || month==8 || month==9 || month==11))
				{	JOptionPane.showMessageDialog(null,"Incorrect DOB");
					flag=0;
				}
				
				else if ( (day<1 || day>31) || (month<1 || month>12) )
				{ 	JOptionPane.showMessageDialog(null,"Incorrect DOB");
					flag=0;
				}
			  } catch (Exception ex)
				{	JOptionPane.showMessageDialog(null,"Incorrect DOB"); 
					flag=0;
				}
			  
			  
			//  flag=0;
			}
			
			
			if (flag==1) //Connecting To Database
			{
				try 
				{	Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
					
					Statement st = con.createStatement();
				
					ResultSet check = st.executeQuery("select USERNO from userlist");
					while (check.next())
					{
						String checkname = check.getString("USERNO");
						if (tuserid.getText().toString().equals(checkname))
						{
							JOptionPane.showMessageDialog(null,"UserName Already Exists");
							flag=0;
							st.close();
							con.close(); 
							return;
						}
					}
					
					if (flag==1)
					{	String birth = tdd.getText()+"-"+tmm.getText()+"-"+tyy.getText();
					
						if (male.isSelected()) 
						{			
							ResultSet rs = st.executeQuery("insert into userlist (userno, fname, lname, dob, gender, country, password) values('"+ tuserid.getText()  + "','" + tfname.getText() + "','" + tlname.getText() + "',TO_DATE('" + birth + "','DD-MM-YYYY'),'" +  "M','"+  tcountry.getText() + "','" + pf1.getText().toString() + "')");
						
							JOptionPane.showMessageDialog(null,"Data Has Been Save Successfully"); 
						
						}
						else
						{
							ResultSet rs = st.executeQuery("insert into userlist (userno, fname, lname, dob, gender, country, password) values('"+ tuserid.getText()  + "','" + tfname.getText() + "','" + tlname.getText() + "',TO_DATE('" + birth + "','DD-MM-YYYY'),'" +  "F','"+  tcountry.getText() + "','" + pf1.getText().toString() + "')");
							
							JOptionPane.showMessageDialog(null,"Data Has Been Save Successfully");
						}
						
						
						con.commit();
						st.close();
						con.close(); 
					}
				} catch (Exception ae) 
					{ JOptionPane.showMessageDialog(null, ae.getMessage()); }
				
				
				//connect to database
				if (flag==1)
				{ f.dispose();
					//new login().loginn();
				  login ob = new login();
				  ob.loginn();
				}
			}
			
		}
				
		
	}
	
	
	public static void main (String a[])
	{
		new signup();
		//signup obj = new signup();
		//obj.sign_up();
	}
	
}
