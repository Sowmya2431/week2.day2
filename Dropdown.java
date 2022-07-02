package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  
		
		ChromeDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		WebElement usingIndexElement = driver.findElement(By.xpath("//*[@id='dropdown1']"));
		Select dd = new Select(usingIndexElement);
		dd.selectByIndex(1);
		
		WebElement usingTextElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select dd1 = new Select(usingTextElement);
		dd1.selectByVisibleText("Selenium");
		
		WebElement usingValueElement = driver.findElement(By.name("dropdown3"));
		Select dd2 = new Select(usingValueElement);
		dd2.selectByValue("1");
		
		
		WebElement usingSendkeysElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		usingSendkeysElement.sendKeys("Selenium");
		
		driver.close();
		
		
		
		
		
	}

}
