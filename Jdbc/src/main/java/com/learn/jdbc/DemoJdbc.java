package com.learn.jdbc;

import java.sql.*;

import org.postgresql.core.ConnectionFactory;

public class DemoJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//import package
		//import java.sql.*;
		
		//Load driver
		String driverName = "org.postgresql.Driver";
		//used to call the class we gave in paranthesis
		Class.forName(driverName);
		
		//Register Driver
		//Create Connection
		String url = "jdbc:postgresql://localhost:5432/jdbcdatabase";
		String username = "postgres";
		String password = "Tharun@2001@171";
		
		//Connection is an interface
		Connection con = DriverManager.getConnection(url,username,password);
		
		//Create statement
		//Statement is an interface
		Statement st = con.createStatement();
		String query1 = "select * from studenttable";
		
		//execute(query1); = execute new rows and update existing row,new column
		//Execute Statement
		//fecth data - executequery()
		System.out.println("get all students");
		ResultSet rs = st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		System.out.println("--------------------");
		System.out.println("get name as tharun");
		String query2 = "select * from studenttable where studentname='tarun'";
		rs = st.executeQuery(query2);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		//CRUD
		//Create
		/*
		System.out.println("------------------");
		String query3 = "insert into studenttable values (?,?,?)";
		PreparedStatement ps1 = con.prepareStatement(query3);
		ps1.setInt(3,4);
		ps1.setString(2,"rajesh");
		ps1.setInt(3,32);
		int noOfRowsUpdated = ps1.executeUpdate();
		System.out.println("no of rows updated "+noOfRowsUpdated);
		*/
		
		//Get All
		System.out.println("--------------------");
		System.out.println("get all students");
		rs = st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		//READ
		//get student id 3
		System.out.println("--------------------");
		rs = st.executeQuery("select * from studenttable where studentid=3");
		rs = st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		//UPDATE
		//id: 2,name: kumar,marks: 23 -> marks 43
		String query4 = "update studenttable set marks=43 where studentname='kumar'";
		int noOfRowsUpdated1 = st.executeUpdate(query4);
		System.out.println("no of rows updated "+noOfRowsUpdated1);
		
		//Get All
		System.out.println("--------------------");
		System.out.println("get all students");
		rs = st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		//delete
		String query5 = "delete from studenttable where studentid=3";
		int noOfRowsUpdated2 = st.executeUpdate(query5);
		System.out.println("no of rows updated "+noOfRowsUpdated2);
		
		//Get All
		System.out.println("--------------------");
		System.out.println("get all students");
		rs = st.executeQuery(query1);
		while(rs.next())
		{
			System.out.println("id: "+rs.getInt(1)+",name: "+
			rs.getString(2)+",marks: "+rs.getInt(3));
		}
		
		System.out.println("connection established");
		
		con.close();
		
		
		
	}

}
