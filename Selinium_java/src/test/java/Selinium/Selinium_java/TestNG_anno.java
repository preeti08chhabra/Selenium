package Selinium.Selinium_java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_anno 
{

	@Test
	public void test1()
	{
		System.out.println("Testng Annotation 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Testing Annotation2");
	}
	@AfterClass
	public void test3()
	{
		System.out.println("Afterclass");
	}
	@AfterSuite
	public void test4()
	{
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	public void test5()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void test6()
	{
		System.out.println("BeforeClass");
	}
}
