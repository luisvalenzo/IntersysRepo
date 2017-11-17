package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepage {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='blueBarDOMInspector']/div/div")
	WebElement FacebookHeader;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement emailTxtBx;
	
	@FindBy(xpath=".//*[@id='pass']")
	WebElement pwdTxtBx;
	
	@FindBy(xpath=".//*[@id='loginbutton']")
	WebElement loginBtn;
	
	@FindBy(id="not_me_link")
	WebElement NotMeLink;
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateFacebook() {
		Assert.assertTrue(FacebookHeader.isDisplayed());
	}
	
	public void Login(String email, String pwd) {
		emailTxtBx.sendKeys(email);
		pwdTxtBx.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void ClickNotMe() {
		Assert.assertTrue(NotMeLink.isDisplayed(), "Not Me link is not diplayed");
		NotMeLink.click();
	}
}
