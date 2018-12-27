package prac;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

class TestSwing extends JFrame
{
	private static final Object String = null;
	private static final Object Object = null;
	JButton jb;
	JTextField tf;
	JPasswordField tf1;
	JRadioButton rb;
	JComboBox cb;
	JScrollBar sb;
	JPanel jp;
	JLabel jl,jl1; 
	
	TestSwing()
	{
		setSize(400,400);
		setTitle("Hello");
		//setVisible(true);
		jb = new JButton("Login");
		
		tf =new JTextField("Email");
		tf1=new JPasswordField("Password");
		rb = new JRadioButton("select");
		cb= new JComboBox();
		sb= new JScrollBar();
		jl= new JLabel("User Name:");
		jl1= new JLabel("Password:");
		//this.add(jb);
		Container c=this.getContentPane();
		

		cb.addItem("first");
		cb.addItem("second");
		/*c.add(jb,"South");
		c.add(rb,"East");
		c.add(tf,"North");
		c.add(cb,"Center");
		c.add(sb,"West");*/
		
		jp =new JPanel();
		/*jp.add(rb);
		jp.add(jb);
		jp.add(cb);
		jp.add(sb);*/
		jp.add(jl);
		jp.add(tf);
		jp.add(jl1);
		jp.add(tf1);
		jp.add(jb);
		jp.setLayout(new GridLayout(3,2));
		c.add(jp,"North");
	}
}

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSwing a=new TestSwing();
		a.setVisible(true);
		System.out.println("Hello World");
	}
}
