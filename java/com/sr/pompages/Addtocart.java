package com.sr.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {

	
	@FindBy(id="add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}


	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public void addtocartbtn() {
		addtocart.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement cart;
	
	public void cartbtn()
	{
		cart.click();
	}
	
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement gotocart;
	
	
	public void gotocartbtn()
	{
		gotocart.click();
	}
	
	public Addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
