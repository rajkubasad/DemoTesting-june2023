package com.qa.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.pageobjects.ToolsQaAlertsTestsPage;
import com.qa.testComponents.BaseTest;
import com.qa.testComponents.Retry;

public class ToolsQaAlertsTests extends BaseTest{

	@Test(retryAnalyzer = Retry.class)
	public void alertOptions() throws InterruptedException {
		ToolsQaAlertsTestsPage alert=new ToolsQaAlertsTestsPage(driver);
		alert.alertOptions();
	}
	 
	
}
