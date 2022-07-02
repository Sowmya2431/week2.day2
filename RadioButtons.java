package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//Are you enjoying the classes?
		WebElement yes = driver.findElement(By.id("yes"));
		yes.click();
		boolean selected = yes.isSelected();
		System.out.println(selected);
		
		//Find default selected radio button
		WebElement defaultElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		System.out.println(defaultElement.isSelected());
		
		//Select your age group (Only if choice wasn't selected)
		WebElement ageElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		System.out.println(ageElement.isSelected());

		
		

}
}
