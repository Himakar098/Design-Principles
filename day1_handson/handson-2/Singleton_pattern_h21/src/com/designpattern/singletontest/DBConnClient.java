package com.designpattern.singletontest;

import com.designpattern.singleton.DBConn;

public class DBConnClient {

	public static void main(String[] args) {
        
		// since it is a singleton pattern it only creates one object despite of the no of times the function is calleed
		
		System.out.println(DBConn.caller());
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(DBConn.caller());
		
	}

}
