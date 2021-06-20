package com.ATG.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	@CacheLookup
	@FindBy(name="")
	private WebElement hastLink;
	
	@CacheLookup
	@FindBy(name="")
	private WebElement sportLink;
	
	@CacheLookup
	@FindBy(name="")
	private WebElement v5;
	
	@CacheLookup
	@FindBy(id="onetrust-accept-btn-handler")
	private WebElement alertAccept;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"sidemenu\"]/div/div[2]/div[2]/div/div/div[2]")
	private WebElement allSpelaLink;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"sidemenu\"]/div/div[2]/div[2]/div[2]/div/div/a[10]/div")
	private WebElement v4Link;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[1]/div[2]/div[1]/span[1]/button")
	private WebElement v41Btn1;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[1]/div[2]/div[1]/span[2]/button")
	private WebElement v41Btn2;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[1]/div[2]/div[1]/span[3]/button")
	private WebElement v41Btn3;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[1]/div[2]/div[1]/span[4]/button")
	private WebElement v41Btn4;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[2]/div[2]/div[1]/span[1]/button")
	private WebElement v42Btn1;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[3]/div[2]/div[1]/span[1]/button")
	private WebElement v43Btn1;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[3]/div[2]/div[1]/span[2]/button")
	private WebElement v43Btn2;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[1]/div[4]/div[2]/div[2]/button")
	private WebElement v44AllBtn;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div/div/div[2]/div[4]/div/div/div[2]/div[2]/button[2]")
	private WebElement newCouponBtn;
	
	@CacheLookup
	@FindBy(xpath="//*[contains(text(),'Ny Kupong')]")
	private WebElement newCouponBtn1;
	
	@CacheLookup
	@FindBy(xpath="//*[contains(text(),'Tom kupong')]")
	private WebElement blankCouponBtn;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void acceptAlertCookies()
	{
		
		alertAccept.click();
		
/*		Alert alert = driver.switchTo().alert();
		elementControl.clickElement(alertAccept);
		
		alert.accept(); */	
	        
	}
	
	public void clickOnSpelaLink()
	{
		elementControl.clickElement(allSpelaLink);
	}
	
	public void scrolDown()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", v4Link); 
		//elementControl.clickElement(v4Link);
	}
	public void clickOnV4Link()
	{
		elementControl.clickElement(v4Link);
	}
	
	public void clickOnV41Btn()
	{
		elementControl.clickElement(v41Btn1);
		elementControl.clickElement(v41Btn2);
		elementControl.clickElement(v41Btn3);
		elementControl.clickElement(v41Btn4);
	}
	
	public void clickOnV42Btn()
	{
		elementControl.clickElement(v42Btn1);
	}
	
	public void clickOnV43Btn()
	{
		elementControl.clickElement(v43Btn1);
		elementControl.clickElement(v43Btn2);
	}
	
	public void clickOnV4AllBtn()
	{
		elementControl.clickElement(v44AllBtn);
	}
	
	public void clickOnNewCouponBtn()
	{
		elementControl.clickElement(newCouponBtn1);
	}
	
	public void clickOnBlankCouponBtn()
	{
		elementControl.clickElement(blankCouponBtn);
	}

}
