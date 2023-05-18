package utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
	
  @BeforeMethod
  public void beforeClass() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("Webdriver.Chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Automation Testing\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demosite.executeautomation.com/Login.html");
  }

  @AfterMethod
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
  }

}
