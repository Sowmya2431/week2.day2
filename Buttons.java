package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Click button to travel home page
		WebElement homePageElement = driver.findElement(By.id("home"));
		homePageElement.click();
		//how to verify this page
		String title = driver.getTitle();
		String pageTitle ="TestLeaf - Selenium Playground";
		if(title.equals(pageTitle))
		{
			System.out.println("Home page is verified");
		}else {
			System.out.println("Home page is not verified");
		}
		driver.navigate().back();
		
		//Find position of button (x,y)
	    Point location = driver.findElement(By.id("position")).getLocation();
	    int X = location.getX();
	    System.out.println("X: "+ X);
	
	    int Y = location.getY();
	    System.out.println("Y: " + Y);
		
		
		//Find button color
		WebElement buttonColorElement = driver.findElement(By.id("color"));
		String cssValue = buttonColorElement.getCssValue("background-color");
		System.out.println("CSS Value: " + cssValue);
		
		//Find the height and width
		WebElement sizeElement = driver.findElement(By.id("size"));
		Dimension size = sizeElement.getSize();
		System.out.println("Size: " +size);
		
		
	}
}
	
	

