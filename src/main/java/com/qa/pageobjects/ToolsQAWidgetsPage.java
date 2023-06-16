package com.qa.pageobjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.abstractComponents.AbstractComponents;

public class ToolsQAWidgetsPage extends AbstractComponents {
	public WebDriver driver;

	public ToolsQAWidgetsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[4]//div[1]//div[2]//*[name()='svg']")
	WebElement widgetsClick;

	@FindBy(xpath = "//span[text()=\"Accordian\"])")
	WebElement accordian;

	@FindBy(css = "div[class=\\\"card\\\"] [id=\\\"section1Heading\\\"]")
	WebElement accroadianselectionclick;

	@FindBy(xpath = "//span[normalize-space()='Auto Complete']")
	WebElement inputingInTextBox;

	@FindBy(id = "autoCompleteMultipleInput")
	WebElement autoCompleteMultipleInput;

	public void getFirstselectionaccrodian() {
		scrolldown();
		widgetsClick.click();
		scrolldown();
		accordian.click();
		accroadianselectionclick.click();

	}

	public void autoComplete(String inputcolor) {
		scrolldown();
		widgetsClick.click();
		scrolldown();
		inputingInTextBox.click();
		autoCompleteMultipleInput.sendKeys(inputcolor);
	}
}
