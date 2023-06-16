package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.abstractComponents.AbstractComponents;

public class ElementsPage extends AbstractComponents {

	public WebDriver driver;

	public ElementsPage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']")
	WebElement element;

	@FindBy(css = "div[class='element-list collapse show'] li[id='item-0'] span[class='text']")
	WebElement textbox;

	@FindBy(id = "userName")
	WebElement username;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(id = "currentAddress")
	WebElement currentAddress;

	@FindBy(id = "permanentAddress")
	WebElement permanentAddress;

	@FindBy(xpath = "//div/div/button")
	WebElement submit;
	
	@FindBy(css = "#name")
	WebElement verifyName;
	
	/*Checkbox*/
	
	@FindBy(css = "div[class='element-list collapse show'] li[id='item-1'] span[class='text']")
	WebElement checkBox;
	
	@FindBy(css="button[title='Toggle']")
	WebElement rightArrow;
	
	@FindBy(xpath = "//li[2]/span[1]/button[1]")
	WebElement docsClick;
	
	@FindBy(xpath = "//*[text()=\"Office\"]")
	WebElement office;
	
	@FindBy(xpath = "//div[@id=\"result\"]/span[2]")
	WebElement verifyText;
	
	By waitforNextOptiontoOpen=By.cssSelector("button[title='Toggle']");

	public void elemets_textbox(String uname, String eMail, String cAddress, String pAddress) throws InterruptedException {
		scrolldown();
		element.click();
		textbox.click();
		username.sendKeys(uname);
		email.sendKeys(eMail);
		currentAddress.sendKeys(cAddress);
		permanentAddress.sendKeys(pAddress);
		scrolldown();
		submit.click();
	}

	public void elements_CheckBox(String selected) throws InterruptedException {
		scrolldown();
		element.click();
		checkBox.click();
		waitelementToBeVisible(waitforNextOptiontoOpen);
		rightArrow.click();
		docsClick.click();
		office.click();
		verifyText.getText().equalsIgnoreCase(selected);
	}
	
	

}
