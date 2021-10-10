package tests;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.ChooseLanguagePage;
import pages.HomePage;
import pages.PageBase;
import pages.SearchLessonPage;


public class UserCanLesson extends TestBase
{
	PageBase pagebaseObject ; 
	SearchLessonPage searchlessonObject ; 
	ChooseLanguagePage chooselangobj; 
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
		searchlessonObject.ClickOnSearchicon();
		


	}}

