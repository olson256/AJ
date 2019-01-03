package prac1;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TestSwing extends JFrame implements ActionListener
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
	JLabel jl,jl1,jl2; 
	
	TestSwing()
	{
		setSize(400,400);
		setTitle("Hello");
		//setVisible(true);
		jb = new JButton("Login");
		
		tf =new JTextField("Enter Username");
		tf1=new JPasswordField("1234");
		rb = new JRadioButton("select");
		cb= new JComboBox();
		sb= new JScrollBar();
		jl= new JLabel("User Name:");
		jl1= new JLabel("Password:");
		jl2= new JLabel();
		//this.add(jb);
		Container c=this.getContentPane();
		

		cb.addItem("first");
		cb.addItem("olson");
		/*c.add(jb,"South");
		c.add(rb,"East");
		c.add(tf,"North");
		c.add(cb,"Center");*/
		c.add(sb,"East");
		
		jp =new JPanel();
		/*jp.add(rb);
		jp.add(jb);
		jp.add(cb);
		*/
		jp.add(jl);
		jp.add(tf);
		jp.add(jl1);
		jp.add(tf1);
		jp.add(cb);
		jp.add(jl2);
		jp.add(jb);
		jp.setLayout(new GridLayout(4,2));
		c.add(jp,"North");
		
		jb.addActionListener(this);
		cb.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e.getSource();
		
		String v1,v2,v3;
		if(e.getSource()==jb)
		{
			 v1=tf.getText();
			   v2=tf1.getText();
			   
			   
			   if (v1.equals("olson") & v2.equals("1234"))
			   {
				   jl2.setText("Login Sucessfully");
			  
			   }
			   else{
				   jl2.setText("Login Failed");
			   }
		}
		else
		{
			v3=(java.lang.String) cb.getSelectedItem();
			   tf.setText(v3);
		}
	}
	}


public class pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSwing a=new TestSwing();
		a.setVisible(true);
		System.out.println("Hello World");
}
}