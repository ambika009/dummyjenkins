package com.sr.pompages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sr.genericlib.BaseClass;

public class LikeToFb extends BaseClass {

	
	@FindBy(xpath="//a[contains(text(),' GEARS ')]")
	private WebElement gearbtn;
	
	public void gearclick()
	{
		gearbtn.click();
	}
	
	
	
	//@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	//private WebElement skillrarydemo;
	
	public void skillrarydemoclick() throws FileNotFoundException, IOException
	{
		//util.dropDown(skillrarydemo,p.getPropertyData("skillrarydemotext"));
		util.dropDown(gearbtn," SkillRary Demo APP");
		
	}
	
	public LikeToFb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}


