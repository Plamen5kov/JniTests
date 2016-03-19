package com.gradle.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JniTest {
   
	static{
		String currentDir = System.getProperty("user.dir");
//		String pathToNativeLib = Paths.get(currentDir, "libs", "JniTest.dll").toString(); //run in windows x64
		String pathToNativeLib = Paths.get(currentDir, "libs", "libJniTest.so").toString(); //run in linux x64
		System.load(pathToNativeLib);
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