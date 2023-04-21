package Selinium.Selinium_java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junit_auto 
{
	@Ignore
	@Test
	public void method1()
	{
		System.out.println("Executing without main ");
	}
	@Before
	public void method2()
	{
		System.out.println("I am executing before annotation");
	}
	@After
	public void method3()
	{
		System.out.println("Executing after");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Executing without main 4 ");
	}
	
	@BeforeClass
	public static void method5()
	{
		System.out.println("I am executing before class annotation 5");
	}
	@AfterClass
	public static void method6()
	{
		System.out.println("Executing afterclass 6");
	}
}
