//package com.trantor.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCMain {
//
//	static final String DB_URL = "jdbc:mysql://localhost/mydb";
//	static final String USER = "root";
//	static final String PASS = "12345";
////	static final String QUERY1 = "INSERT INTO tbl_contact(cid, cname, address) values(6, 'Anubhav', 'Pune')";
//	public static void main(String[] args) {
//		
//		
//
//		
////		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
////				Statement stmt = conn.createStatement();
////
////				ResultSet rs = stmt.executeQuery();) {
//
//			// Extract data from result set
//			while (rs.next()) {
//				// Retrieve by column name
//				System.out.print("CID: " + rs.getInt("cid"));
//				System.out.print(", Cname: " + rs.getString("cname"));
//				System.out.println(", Address: " + rs.getString("address"));
//
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Table you want");
//		String tableName2 = scan.nextLine();
//		String columnId = scan.nextLine();
//		String columnfirstname = scan.nextLine();
//		
//		System.out.println("Table Name is: " + tableName2);
//		System.out.println("Column ID is: " + columnId);
//		System.out.println("Column Name is: " + columnfirstname);
//		String sql2 = "CREATE TABLE " + tableName2 + columnId +","+ columnfirstname;
//		System.out.println(sql2);
////		String sql2 = "CREATE TABLE CUSTOMER_TBL " +
////                   "(id INTEGER not NULL, " +
////                   " first VARCHAR(255), " + 
////                   " PRIMARY KEY ( id ))"; 
//
//         stmt.executeUpdate(sql2);
//         System.out.println("Created table in given database...");
//
//	}
//		
//		
//	}
//		// TODO Auto-generated method stub
//		
//
//
//}
