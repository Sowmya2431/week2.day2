package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEdits {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		
		ChromeDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement enterEmailElement = driver.findElement(By.id("email"));
		enterEmailElement.sendKeys("sowmyamuru91@gmail.com");
		
		WebElement appendTextElement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendTextElement.sendKeys("append");
		
		WebElement getDefaultTextElement = driver.findElement(By.name("username"));
		String text = getDefaultTextElement.getAttribute("value");
		System.out.println(text);
		
		WebElement clearTextElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearTextElement.clear();
		
		WebElement editFieldElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = editFieldElement.isEnabled();
		System.out.println(enabled);
		
	
		
		
		
		
		
		
	}

	
	
		
	}

