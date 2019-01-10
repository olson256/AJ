package jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class jdbc_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root",""); 
			
			Statement st= con.createStatement();
			
			int rn,a;
			String n,b;
			
			
			Scanner sc=new Scanner(System.in);
			

			System.out.println("Enter no. of choices to be enter:");
			a=sc.nextInt();
			
			while(a!=0)
			{
			System.out.println("Enter rollno");
			rn=sc.nextInt();
			System.out.println("Enter name");
			
			n=sc.next();
			
			System.out.println("Enter branch");
			b=sc.next();
			
			int x=st.executeUpdate("insert into stu values("+rn+",'"+n+"','"+b+"')");

			a--;
			}
			ResultSet rs =st.executeQuery("select * from stu" );
			
			while(rs.next())
			{
				System.out.println("id "+rs.getInt(1)+" name "+rs.getString(2)+" branch "+rs.getString(3));
			}
			
			}
			catch(ClassNotFoundException e)
			{	
				e.printStackTrace();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		
	}


