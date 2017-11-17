package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import IntersysConsulting.homepage;
import IntersysConsulting.searchresultspage;

public class TestCase1 {
	WebDriver driver;
	
  @Test //Test Case 1, Footer Intersys Validation
  public void tc1() throws InterruptedException {
	  homepage home = new homepage(driver);
	  searchresultspage search = new searchresultspage(driver);
	  //Steps
	  System.out.println("1. Launch Intersys webpage");
	  System.out.println("2. Verify Intersys webpage is displayed");
	  home.ValidateHeader();
	  
	  System.out.println("3. Search 'Subscription Services'");
	  home.SearchText("Subscription Services");
	  
	  System.out.println("4. Verify Footer menu on Searched-For page");
	  search.ValidateSearchedFor();
	  System.out.println("5. Close Chrome browser");
  }
  
  //Script Settings (Browser definition and behavior
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.intersysconsulting.com/");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
