package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
	
	WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
	companyNameElement.sendKeys("IBM");
	
	WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
	firstNameElement.sendKeys("Sowmya");
	
	WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
	lastNameElement.sendKeys("M");
	
	WebElement localFirstNameElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	localFirstNameElement.sendKeys("SowmyaIBM");
	
	WebElement deptNameElement = driver.findElement(By.name("departmentName"));
	deptNameElement.sendKeys("Testing");
	
	WebElement descriptionElement = driver.findElement(By.name("description"));
	descriptionElement.sendKeys("FunctionalTesting");
	
	WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
	emailElement.sendKeys("abcedfgh@gmail.com");
	
	WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select(stateElement);
	dd.selectByVisibleText("New York");
	
	WebElement createLeadElement1 = driver.findElement(By.className("smallSubmit"));
	createLeadElement1.click();
	
	System.out.println("The title is :"+ driver.getTitle());
	
	driver.close();
	
	
	/*1:Create Lead
	  1. Launch URL "http://leaftaps.com/opentaps/control/login"
	  2. Enter UserName and Password Using Id Locator
	  3. Click on Login Button using Class Locator
	  4. Click on CRM/SFA Link
	  5. Click on Leads Button
	  6. Click on Create Lead 
	  7. Enter CompanyName Field Using id Locator
	  8. Enter FirstName Field Using id Locator
	  9. Enter LastName Field Using id Locator
	  10. Enter FirstName(Local) Field Using id Locator
	  11. Enter Department Field Using any Locator of Your Choice
	  12. Enter Description Field Using any Locator of your choice 
	  13. Enter your email in the E-mail address Field using the locator of your choice
	  14. Select State/Province as NewYork Using Visible Text
	  15. Click on Create Button
            16. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/
}

}
