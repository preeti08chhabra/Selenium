package Selinium.Selinium_java;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Login_junit 
{
	ChromeDriver drive;
	
	@Before
	public void browse()
	{
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti.chhabra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		drive =new ChromeDriver();
		drive.get("https://www.amazon.in/");
		Options op =drive.manage();
		Window w= op.window(); 
			w.maximize();
	}
@Test
	public void signup()
	{
			WebElement sign=drive.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
			sign.click();
			//WebElement signin=drive.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
			//signin.click();	
			WebElement create=drive.findElement(By.id("createAccountSubmit"));
			create.click();	
			WebElement c_name=drive.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
			c_name.sendKeys("Preeti");
			WebElement ph_no=drive.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
			ph_no.sendKeys("9416452180");	
			WebElement pwd=drive.findElement(By.xpath("//*[@id=\"ap_password\"]"));
			pwd.sendKeys("Hello@123");	
			WebElement cont=drive.findElement(By.xpath("//*[@id=\"continue\"]"));
			cont.click();	
		
	}		
@After
	public void close()
	{
	drive.close();
	}

}
	

