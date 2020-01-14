import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart 
{

	public static void main(String[] args) 
	{
		Properties objProp = new Properties();
    	try
    	{
    		objProp.load(new FileInputStream("C://Users/admin/Desktop/prasanna/data1.properties"));
    	}
    	catch(FileNotFoundException ex)
    	{
    		ex.printStackTrace();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	System.out.println("login name" + objProp.getProperty("login"));
    	System.out.println("password" + objProp.getProperty("pwd"));
    	System.setProperty("webdriver.chrome.driver","C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
    	WebDriver ObjDriver = new ChromeDriver();
    	ObjDriver.get("http://demo.opencart.com");
    	System.out.println("opencart page loaded");
    	String var1 = ObjDriver.getTitle();
    	System.out.println("Title of the page"+var1);
    	WebElement Obj1 = ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']"));
    	Obj1.click();
    	WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
    	Obj2.click();
    	WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id='input-email']"));
    	Obj3.sendKeys(objProp.getProperty("login"));
    	WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input"));
    	Obj4.click();
    	WebElement Obj5 = ObjDriver.findElement(By.xpath("//*[@id='account-login']/div[1]"));
    	System.out.println(Obj5);
	}

}
