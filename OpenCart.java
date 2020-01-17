import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart 
{
    public static void main(String[] args) 
	{
    	int ob;
    	System.setProperty("webdriver.chrome.driver", "c:/Users/admin/downloads//chromedriver_win32//chromedriver.exe"); 
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("Open cart page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the Page"+var1);
		WebElement Obj1 = ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=checkout/cart']"));
		Obj1.click();
		WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id='content']/div/div/a"));
		Obj2.click();
	    WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[4]/a"));
		Obj3.click();
		WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]"));
		Obj4.click();
		WebElement Obj5 = ObjDriver.findElement(By.xpath("//*[@id='top-links']/ul/li[4]/a"));
		Obj5.click();
		WebElement Obj9 = ObjDriver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[6]"));
		Obj9.click();
		System.out.println("In Dollars"+Obj9.getText());
		WebElement Obj6 = ObjDriver.findElement(By.xpath("//*[@id='form-currency']/div/button"));
		Obj6.click();
		WebElement Obj7 = ObjDriver.findElement(By.xpath("//*[@id='form-currency']/div/ul/li[1]/button"));
		Obj7.click();
		WebElement Ob1 = ObjDriver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[6]"));
	    Ob1.click();
	    System.out.println("In Euros"+Ob1.getText());
		Scanner sc = new Scanner(System.in);
		ob = sc.nextInt();
		System.out.println("rupees="+(71*ob));
		
	}

}
