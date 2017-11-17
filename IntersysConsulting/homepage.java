package IntersysConsulting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepage {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	@FindBy(className="brand")
	WebElement IntersysHeader;
	
	@FindBy(xpath=".//*[@id='searchToggle']/i")
	WebElement SearchIcon;
	
	@FindBy(xpath=".//*[@id='searchBar']/form/div/input")
	WebElement SearchTxtBox;
	
	@FindBy(xpath=".//*[@id='searchBar']/form/button")
	WebElement SearchBtn;
	
	public homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateHeader() {
		Assert.assertTrue(IntersysHeader.isDisplayed(), "Intersys Header is not displayed");
		System.out.println(" - Intersys Header is displayed");
	}
	public void SearchText(String TextToFind) throws InterruptedException{
		SearchIcon.click();
		Thread.sleep(1000);
		Assert.assertTrue(SearchTxtBox.isDisplayed(), "Search Text Box is not displayed");
		SearchTxtBox.sendKeys(TextToFind);
		SearchBtn.click();
		
	}
}
