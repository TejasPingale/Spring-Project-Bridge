package com.tejaspractice.SpringProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public class InfrastructureDao {

	
	ArrayList<Bridge> fetchBridgesInfo() {
		ArrayList<Bridge> albridgeList=new ArrayList<Bridge>();
	//System.out.println(1);
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Charlie@25");
		//System.out.println(3);
		Statement statement=connection.createStatement();
		//System.out.println(4);
		String sql="select * from Bridge";
		//System.out.println(5);
		ResultSet resultset=statement.executeQuery(sql);
		//System.out.println(6);
		
		while(resultset.next()) 
		{
		int bridgeNumber=	resultset.getInt(1);
	String bridgeCity=	resultset.getString(2);
	String bridgeLength=	resultset.getString(3);
	String bridgeWeidth=	resultset.getString(4);
	Bridge bridge=new Bridge(bridgeNumber,bridgeCity,bridgeLength,bridgeWeidth);
	albridgeList.add(bridge);
		}
		//System.out.println(7);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
		return albridgeList;
}
}