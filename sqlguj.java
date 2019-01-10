package jd;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.*;

class TestSwing extends JFrame implements ActionListener
{
	private static final Object String = null;
	private static final Object Object = null;
	JButton jb,jb1,jb2,jb3;
	JTextField tf,tff,tf1;
	JRadioButton rb;
	JScrollBar sb;
	JPanel jp;
	JLabel jl,jl1,jl2,jj; 
	
	TestSwing()
	{
		setSize(400,400);
		setTitle("Hello");
		//setVisible(true);
		jb = new JButton("Add");

		jb1 = new JButton("Display");

		jb2 = new JButton("Update");

		jb3 = new JButton("Delete");
		
		tff =new JTextField("");
		tf =new JTextField("");
		tf1=new JTextField("");
		rb = new JRadioButton("select");
		sb= new JScrollBar();
		jj=new JLabel("Roll No.:");
		jl= new JLabel("Name:");
		jl1= new JLabel("Branch:");
		jl2= new JLabel();
		//this.add(jb);
		Container c=this.getContentPane();
		

		//cb.addItem("first");
		//cb.addItem("olson");
		/*c.add(jb,"South");
		c.add(rb,"East");
		c.add(tf,"North");
		c.add(cb,"Center");*/
		//c.add(sb,"East");
		
		jp =new JPanel();
		/*jp.add(rb);
		jp.add(jb);
		jp.add(cb);
		*/
		jp.add(jj);
		jp.add(tff);
		jp.add(jl);
		jp.add(tf);
		jp.add(jl1);
		jp.add(tf1);
		//jp.add(jl2);
		jp.add(jb);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.setLayout(new GridLayout(6,2));
		c.add(jp,"North");
		
		jb.addActionListener(this);
		jb1.addActionListener(this);
		//jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e.getSource();
		int v;
		String v1,v2,v3;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); 
			
			Statement st= con.createStatement();
			
			int rn,a;
			String n,b;
			
			
			Scanner sc=new Scanner(System.in);
			

			
			
			if(e.getSource()==jb)
			{
				v=Integer.parseInt(tff.getText());
				v1=tf.getText();
				 v2=tf1.getText();
				   int x=st.executeUpdate("insert into stu values("+v+",'"+v1+"','"+v2+"')");

				   
			}
			
			else if(e.getSource()==jb1)
			{
				ResultSet rs =st.executeQuery("select * from stu" );
				
				while(rs.next())
				{
					System.out.println("id "+rs.getInt(1)+" name "+rs.getString(2)+" branch "+rs.getString(3));
				}
				
			}
			
			else if(e.getSource()==jb3)
			{
				v=Integer.parseInt(tff.getText());
				int x =st.executeUpdate("DELETE FROM stu WHERE roll_no ="+v);
				System.out.println(x+"deleted");
				
			}
			
			
			}
			catch(ClassNotFoundException r)
			{	
				r.printStackTrace();
				
			}
			catch(SQLException r)
			{
				r.printStackTrace();
			}
			}
		
		
		
	}
	



public class sqlguj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSwing a=new TestSwing();
		a.setVisible(true);
	}

}
