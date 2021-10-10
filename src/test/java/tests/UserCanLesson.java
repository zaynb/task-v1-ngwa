package tests;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.ChooseLanguagePage;
import pages.LessonWorkSheet;
import pages.PageBase;
import pages.SearchLessonPage;
import pages.SearchResultList;


public class UserCanLesson extends TestBase
{
	PageBase pagebaseObject ; 
	SearchLessonPage searchlessonObject ; 
	ChooseLanguagePage chooselangobj; 
	SearchResultList SearchResultListobj;
	LessonWorkSheet LessonWorkSheetObj;
	@Test ()
	public void StartSearchingOnNagwaLessons() throws InterruptedException 
	
	{  
		pagebaseObject  = new PageBase(driver);
			
		chooselangobj  = new ChooseLanguagePage(driver); 
		chooselangobj.ChoseEnglishLanguage();
		
		searchlessonObject = new SearchLessonPage (driver); 
		searchlessonObject.ClickOnSearchicon();
		
	}

	@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}
	@Test (dependsOnMethods = {"StartSearchingOnNagwaLessons"},dataProvider="ExcelData")
	
	public void UserCanEnterLesson(String LessonName1) 
	{ 
		searchlessonObject = new SearchLessonPage (driver); 
		searchlessonObject.LessonSearch(LessonName1);
		
		SearchResultListobj = new SearchResultList(driver);
		SearchResultListobj.ClickOnsecondResult();
		
	LessonWorkSheetObj = new LessonWorkSheet(driver);
		//LessonWorkSheetObj.scrollToBottom();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "");
		LessonWorkSheetObj.PreviewWorksheet();


	}}

