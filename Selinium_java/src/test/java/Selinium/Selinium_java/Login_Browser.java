package Selinium.Selinium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Browser 
{
	public void loginbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti.chhabra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver cd= new ChromeDriver();
	cd.get("https://demowebshop.tricentis.com");
	 Options op =cd.manage();//manage is the inbuilt method of Remotewebdriver class with returntype option
	 Window w= op.window(); // window is the method of options class of window returntype. 
	 w.maximize();//maximize is the method of window class
	 WebElement log= cd.findElement(By.cssSelector("a[class='ico-login']"));
	 log.click();
	WebElement email=cd.findElement(By.name("Email"));
	email.sendKeys("preeti.chhabra09@gmail.com");
	 WebElement pwd=cd.findElement(By.name("Password"));
	 pwd.sendKeys("hello@123");
	 WebElement log1=cd.findElement(By.cssSelector("input[value='Log in']"));
	 log1.click();
	 Thread.sleep(5000);
	}
public static void main(String[] args) throws InterruptedException
{
	 Login_Browser br= new Login_Browser();
	 br.loginbrowser();
}
}