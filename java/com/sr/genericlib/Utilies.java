package com.sr.genericlib;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author bubbly
 *
 */
public class Utilies {

	/**
	 * To Handle the drop down
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	/**
	 * To Handle the mouse Action
	 * @param driver
	 * @param ele
	 */
	public void mouseAction(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	/**
	 * To Handle the doubleClick
	 * @param driver
	 * @param target
	 */
	public void doubleClick(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	/**
	 * TO Handle the ScrollBar
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * To Handle the Alertpopup
	 * @param driver
	 */
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * To wait for the element
	 * @param driver
	 * @param element
	 */
	public void elementToclicked(WebDriver driver,WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
