package TestCases;

import org.testng.annotations.Test;

import Facebook.homepage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestCase2 {
	WebDriver driver;
  @Test
  public void tc2() throws InterruptedException {
	  homepage home = new homepage(driver);
	  System.out.println("1. Launch Facebook webpage");
	  
	  System.out.println("2. Verify Facebook page");
	  home.ValidateFacebook();
	  
	  System.out.println("3. Login using valid email and wrong password");
	  home.Login("jluis.diazv@gmail.com", "test1234");
	  Thread.sleep(3000);
	  
	  System.out.println("4. Click Not You button");
	  home.ClickNotMe();
  }
  
  
  //Script Settings (Browser definition and behavior
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
