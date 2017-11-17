package IntersysConsulting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.base.Verify;

public class searchresultspage {
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(xpath=".//*[@id='staticHeader']/div[2]/h1")
	WebElement SearchedForLbl;
	
	@FindBy(id="menu-footer-menu")
	WebElement FooterMenuTxt;
	
	public searchresultspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateSearchedFor() {
		Verify.verify(SearchedForLbl.isDisplayed());
		if (FooterMenuTxt.getText().contains("Company")) {
			System.out.println(" - Company is displayed at footer menu");
		}else {
			System.out.println(" - Company is not displayed at footer menu");
		}
	}
}
