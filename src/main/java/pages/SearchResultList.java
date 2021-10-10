package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultList extends PageBase 
{
	public SearchResultList(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//html/body/div[2]/div[1]/div/div/main/div[3]/ul/li[2]/div/a")
	private WebElement secondresult; 
	

	
	public void ClickOnsecondResult() 
	{
		clickButton(secondresult);
	}

	

}
