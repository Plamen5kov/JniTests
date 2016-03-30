package com.gradle.test;

@CppCallable
public class TestClass implements TestInterface {
	private static TestClass tc;
	static {
		tc = new TestClass();	
	}
	
	public static final int S_CLASS_TEST_VAR = 43;

	public TestClass() { 
		System.out.println("JAVA: TestClass constructor called");
	}

	public void getStaticVariableFromInterface() { 
		System.out.println("JAVA: getStaticVariableFromInterface called with TestInterface.MI_INT:" + tc.S_INTERFACE_TEST_VAR);
	}
	
	public int getStaticVariableFromInterfaceInt() { 
		System.out.println("JAVA: getStaticVariableFromInterfaceInt called with TestInterface.MI_INT:" + tc.S_INTERFACE_TEST_VAR);
		return tc.S_INTERFACE_TEST_VAR;
	}
}
