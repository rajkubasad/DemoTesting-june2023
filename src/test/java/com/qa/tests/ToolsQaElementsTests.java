package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageobjects.ElementsPage;
import com.qa.testComponents.BaseTest;
import com.qa.testData.DataReader;

public class ToolsQaElementsTests extends BaseTest {
	ElementsPage elementPage;
	
	@Test(priority = 1, dataProvider ="test-data", dataProviderClass = DataReader.class)
	public void elements_TextBox(String username, String email, String cAddr, String pAddr) throws IOException, InterruptedException {
		elementPage = new ElementsPage(driver);
		elementPage.elemets_textbox(username, email, cAddr, pAddr);
		String name = driver.findElement(By.cssSelector("#name")).getText();
		String[] splitted = name.split(":");
		String actualname = splitted[1];
		Assert.assertTrue(actualname.equalsIgnoreCase(username));
		
	}
	@Test(priority = 2,groups = {"smoke"})
	public void elements_CheckBox() throws IOException, InterruptedException {
		elementPage = new ElementsPage(driver);
		elementPage.elements_CheckBox("office");
	}

	
}
