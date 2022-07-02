package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropDown {
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();  
		
		ChromeDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
			
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement leadElement = driver.findElement(By.linkText("Leads"));
		leadElement.click();
		
		WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
		createLeadElement.click();
		
		WebElement sourceElement= driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceElement.sendKeys("Employee");
		
		WebElement industryElement= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd = new Select(industryElement);
		dd.selectByIndex(0);
		
		WebElement ownershipElement= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd1 = new Select(ownershipElement);
		dd1.selectByVisibleText("Sole Proprietorship");
		
		WebElement marketingCampignElement= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(marketingCampignElement);
		dd2.selectByValue("9002");
		
		
		
		
	}
	

	


}
