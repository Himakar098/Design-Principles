package com.designpattern.singleton;

public class DBConn {

	// object attribute(instance)
	private static DBConn dbconn;
	
	// constructor is private so that no other classes can use it for object creation
	private DBConn(){}
	
	// getter method to fetch the created DBConn object
	public static DBConn getDbconn() {
		System.out.println("this is getDbconn() method");
		return dbconn;
	}
	
	// static block to create a object using constructor and assign to the instance created
	static{
	        try{
	            dbconn = new DBConn();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	 
	// caller method to invoke the getter method whose scope is public so that any class can fetch the DBConn
    // object through the getter method.
	public static DBConn caller() {
		System.out.println("this is caller() method");
		System.out.println("caller() method is calling the getDbconn() method");
		return getDbconn();
		
	}
	
	
}
