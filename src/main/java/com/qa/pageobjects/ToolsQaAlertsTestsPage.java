package com.qa.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.abstractComponents.AbstractComponents;

import io.reactivex.rxjava3.functions.Action;

public class ToolsQaAlertsTestsPage extends AbstractComponents {
	public WebDriver driver;

	public ToolsQaAlertsTestsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	WebElement alertCard;

	@FindBy(xpath = "//span[text()='Alerts']")
	WebElement alertoption;

	@FindBy(id = "alertButton")
	WebElement alertButton;

	@FindBy(id = "timerAlertButton")
	WebElement timalert;

	By albtn = By.id("alertButton");

	public void alertOptions() throws InterruptedException {
		scrolldown();
		alertCard.click();
		alertoption.click();
		alertButton.click();
		driver.switchTo().alert().accept();
		timalert.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}
}
