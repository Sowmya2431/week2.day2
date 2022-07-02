package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkboxes {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();  
	
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	
	WebElement languageElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
	languageElement.click();
	WebElement sql = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
	sql.click();
	
	//Confirm Selenium is checked
	WebElement selenium = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
	boolean selected = selenium.isSelected();
	if (selected)
	{
		System.out.println("Selected");
	}else
	{
		System.out.println("Not selected");
	}
	
	
	//DeSelect only checked
	List<WebElement> elements = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
	for (int i = 0; i < elements.size(); i++) {
		if(elements.get(i).isSelected()) {
			elements.get(i).click();
		}
	}
	
	//Select all below checkboxes
	List<WebElement> selectAll = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
	
	for (int i = 0; i < selectAll.size(); i++) {
		selectAll.get(i).click();
	}


	
}
}
