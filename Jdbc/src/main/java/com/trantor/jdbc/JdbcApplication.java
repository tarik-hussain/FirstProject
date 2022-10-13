package com.trantor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

	static final String DB_URL = "jdbc:mysql://localhost/mydb";
	static final String USER = "root";
	static final String PASS = "12345";

//	static final String QUERY1 = "INSERT INTO tbl_contact(cid, cname, address) values(6, 'Anubhav', 'Pune')";

//	static final String QUERY = 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Which column do you want");

		String columnName = scan.nextLine();
		String columnName1 = scan.nextLine();
		String columnName2 = scan.nextLine();
		// Read user input
		System.out.println("Coulumn Name is: " + columnName); // Output user input
		System.out.println("Coulumn Name is: " + columnName1);
		System.out.println("Coulumn Name is: " + columnName2);
		final String QUERY = "SELECT " + columnName + "," + columnName1 + "," + columnName2 + " FROM tbl_contact";

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery(QUERY);) {

			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("CID: " + rs.getInt("cid"));
				System.out.print(", Cname: " + rs.getString("cname"));
				System.out.println(", Address: " + rs.getString("address"));

			}

			System.out.println("Enter Table you want");
			String tableName = scan.nextLine();
			String cidValue = scan.nextLine();
			String cnameValue = scan.nextLine();
			String addressValue = scan.nextLine();

			System.out.println("Table Name is: " + tableName);
			System.out.println("Cid value is: " + cidValue);
			System.out.println("Cname is: " + cnameValue);
			System.out.println("Address is: " + addressValue);
			String sql = "INSERT INTO " + tableName + " VALUES " +"( "+ cidValue + "," + "'"+cnameValue+ "'" + "," + "'" +addressValue+ "'" +" )";
			System.out.println(sql);

//			String sql = "INSERT INTO tbl_contact VALUES (13, 'Akash', 'Punjab')";

			stmt.executeUpdate(sql);
			
			System.out.println("Enter Table you want");
			String tableName2 = scan.nextLine();
			String columnId = scan.nextLine();
			String columnfirstname = scan.nextLine();
			
			System.out.println("Table Name is: " + tableName2);
			System.out.println("Column ID is: " + columnId);
			System.out.println("Column Name is: " + columnfirstname);
			
			
			String sql2 = "CREATE TABLE " + tableName2+ " ("
            + columnId + " int"+ "," 
            +  columnfirstname + " VARCHAR(255)"+ " )";
			
			System.out.println(sql2);
//			String sql2 = "CREATE TABLE CUSTOMER_TBL " +
//	                   "(id INTEGER not NULL, " +
//	                   " first VARCHAR(255), " + 
//	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql2);
	         System.out.println("Created table in given database...");
			

		} catch (SQLException e) {
			e.printStackTrace();
		}scan.close();
	}

}
