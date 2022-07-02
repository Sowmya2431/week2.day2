package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HyperLinks {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement homepageLinkElement = driver.findElement(By.linkText("Go to Home Page"));
		homepageLinkElement.click();
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a")).getAttribute("href"));
		
		//Verify am I broken?
		WebElement brokenElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/a"));
		brokenElement.click();
		System.out.println("Url is:"+ driver.getTitle());
		driver.close();
		
		
		
		
		
		

}
}
