package webDriverSamplesB46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioCheckbox {
	
		WebDriver driver;
		  @Test
		  public void RadioCheckboxText() {
			  
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://the-internet.herokuapp.com/");
			  WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
	            checkboxesLink.click();
	            System.out.println("Navigated to the 'Checkboxes' page.");
	            driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	            boolean isSel = driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isDisplayed();
	            if(isSel) 
	            {
	            	driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
	            }
	            
	            
  }
	            
}
