package Selinium.Selinium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class browser_launch 
{
 public void handlebrowser()
 {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti.chhabra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver cd= new ChromeDriver();
	cd.get("https://demowebshop.tricentis.com");
	 Options op =cd.manage();//manage is the inbuilt method of Remotewebdriver class with returntype option
	 Window w= op.window(); // window is the method of options class of window returntype. 
	 w.maximize();//maximize is the method of window class
	 WebElement reg= cd.findElement(By.cssSelector("a[class='ico-register']"));
	 reg.click();
	 WebElement chkbox= cd.findElement(By.cssSelector("label[for='gender-female']"));
	 chkbox.click();
	 	 WebElement fname=cd.findElement(By.name("FirstName"));
	 fname.sendKeys("Preeti");
	 WebElement sname=cd.findElement(By.id("LastName"));
	 sname.sendKeys("Chhabra");
	 WebElement email=cd.findElement(By.cssSelector("input#Email"));
	 email.sendKeys("preeti.chhabra08@gmail.com");
	 WebElement pwd=cd.findElement(By.name("Password"));
	 pwd.sendKeys("hello@123");
	 WebElement cpwd=cd.findElement(By.name("ConfirmPassword"));
	 cpwd.sendKeys("hello@123");
	 WebElement button=cd.findElement(By.id("register-button"));
	 button.click();
	 WebElement cont=cd.findElement(By.cssSelector("input[value='Continue']"));
	 cont.click();
	 }
 public static void main(String[] args)
 {
	 browser_launch br= new browser_launch();
	 br.handlebrowser();
}
}
