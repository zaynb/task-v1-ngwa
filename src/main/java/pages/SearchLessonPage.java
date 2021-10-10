package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLessonPage extends PageBase 
{
	public SearchLessonPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html/body/header/div[1]/div/div[3]/button/i")
	private WebElement searchIcon; 
	
	
	@FindBy(xpath="//*[@id='btn_global_search']/i")
	private WebElement clicksearchIcon;
	
	@FindBy(id="txt_search_query")
	private WebElement searchTextBox; 

	public void ClickOnSearchicon() 
	{
		clickButton(searchIcon);
	}

	public void ClickOntextbox() 
	{
		clickButton(searchTextBox);
	}
	public void LessonSearch(String LessonName) 
	{
		setTextElementText(searchTextBox, LessonName);
		clickButton(clicksearchIcon);
		
	}

	

}
