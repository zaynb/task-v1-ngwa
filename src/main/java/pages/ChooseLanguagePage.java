package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseLanguagePage extends PageBase
{
	public ChooseLanguagePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html/body/div/div/main/div[2]/ul/li[1]/a")
    private WebElement EnglishSelection;
	

    public void ChoseEnglishLanguage() 
    {
    	
         clickButton(EnglishSelection);
    }
	
}
