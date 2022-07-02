package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement imageElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imageElement.click();
		driver.navigate().back();
		
		//Am I Broken Image?
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if(brokenImage.getAttribute("src")!="0") {
			System.out.println("The image is broken");
		}else {
			System.out.println("The image is not broken");
		}
		
		//Click me using Keyboard or Mouse
		WebElement keyboardElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img"));
		keyboardElement.click();
		System.out.println(driver.getTitle());
		driver.close();
}
}

