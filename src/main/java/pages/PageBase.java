package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver drvier ; 
	
    private WebDriverWait wait;
	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action ; 

	// create constructor 
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}
	
	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,3500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	protected void waitForElementToAppear(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
