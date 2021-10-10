package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LessonWorkSheet extends PageBase 
{
	public LessonWorkSheet(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\'WorksheetSection\']/div/div[2]/div/a")
	private WebElement lessonWorksheet; 
	

	
	
	public void ScroltoWorksheetsection() 
	{
		scrollToBottom();
	}
	public void PreviewWorksheet() 
	{
		clickButton(lessonWorksheet);
	}

}
