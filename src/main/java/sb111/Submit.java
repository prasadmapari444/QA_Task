package sb111;
//package testConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://selectorshub.com/xpath-practice-page/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    try {
			Thread.sleep(3000);
			}
	    catch (InterruptedException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    String emailID="prasad.mapari444@gmail.com";
	    String password="11223344";
	    String company="Softra Solutions";
	    String mob_number="7788669955";
	    String SubButton="//button[@value='Submit']";
	    
	    driver.findElement(By.name("email")).sendKeys(emailID);
	    //by xpath
	    //driver.findElement(By.xpath("//input[contains(@id,'shub')]")).sendKeys(emailID);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("Password")).sendKeys(password);
	    //driver.findElement(By.id("pass")).sendKeys(password);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("company")).sendKeys(company);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("mobile number")).sendKeys(mob_number);
	    Thread.sleep(3000);
	    
	    
	    driver.findElement(By.xpath(SubButton)).click(); 
	    
	   
	}

}
