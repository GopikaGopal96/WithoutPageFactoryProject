package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
  @Test
  public void loginDetails() {
	  WebElement user = driver.findElement(By.name("UserName"));
	  //driver.navigate().refresh(); - StaleElementReference Exception
	  user.sendKeys("tutorial");
	  WebElement password = driver.findElement(By.name("Password"));
	  password.sendKeys("tutorial");
	  WebElement login = driver.findElement(By.name("Login"));
	  login.submit();
    }
  
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
}
