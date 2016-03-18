package com.gradle.test;

public class JniTest {
   
	static{
		System.load("JniTest");
	}

	public native void start();
 
	public static void main(String[] args) {
		JniTest test=new JniTest();
		test.start();
	}
}