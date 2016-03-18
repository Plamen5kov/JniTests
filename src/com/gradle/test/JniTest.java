package com.gradle.test;

public class JniTest {
   
	static{
		System.load("D:/work/test_java/libs/JniTest.dll");
	}

	public native void start();
 
	public static void main(String[] args) {
		JniTest test=new JniTest();
		test.start();
	}
	
	public TestClass getTestClass() { 
		return new TestClass();
	}
}