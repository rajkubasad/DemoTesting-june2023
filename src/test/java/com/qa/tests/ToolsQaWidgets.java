package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pageobjects.ToolsQAWidgetsPage;
import com.qa.testComponents.BaseTest;

public class ToolsQaWidgets extends BaseTest {

	@Test(priority = 1, dependsOnMethods = {"Widgets_AutoComplete"})
	public void widgets_Accordian() {
		ToolsQAWidgetsPage widgets = new ToolsQAWidgetsPage(driver);
		widgets.getFirstselectionaccrodian();
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
	}

	@Test(priority = 2, groups = {"smoke"})
	public void Widgets_AutoComplete() throws InterruptedException {
		ToolsQAWidgetsPage widgets = new ToolsQAWidgetsPage(driver);
		widgets.autoComplete("Yello");

	}
}
