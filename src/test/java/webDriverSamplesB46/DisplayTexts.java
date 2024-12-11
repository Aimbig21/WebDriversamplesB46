package webDriverSamplesB46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayTexts {
		WebDriver driver;
	  @Test
	  public void verifyBookDetails() {
		  
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://automationbookstore.dev/");
		  driver.findElement(By.id("searchBar")).sendKeys("Tests");
		  WebElement closeIon = driver.findElement(By.cssSelector("a[title= 'Clear text']"));
		  closeIon.click();
		  System.out.println(closeIon.isDisplayed());
		  
  }
	  
}
