package com.gradle.test;

import java.io.File;

public class JniTest {
   
	static{
		System.loadLibrary("gnustl_shared");
		System.loadLibrary("icu_common");
		System.loadLibrary("jsc");
		System.loadLibrary("jsc_ns");
	}

	public native void start();
 
	public void runTest() {
		JniTest test=new JniTest();
		test.start();
	}
	
	@CppCallable
	public TestClass getTestClass() { 
		return new TestClass();
	}
}