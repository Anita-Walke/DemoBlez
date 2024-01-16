package UtilLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByVisibleText(WebElement wb,String value)
	{
		new Select(Wait.visibilityStatus(wb)).selectByVisibleText(value);
	}
	public static void selectByValue(WebElement wb,String value)
	{
		new Select(Wait.visibilityStatus(wb)).selectByValue(value);
	}
	public static void selectByIndex(WebElement wb,int index)
	{
		new Select(Wait.visibilityStatus(wb)).selectByIndex(index);
	}
	public static WebElement getFirstSelectedIndex(WebElement wb)
	{
		return new Select(Wait.visibilityStatus(wb)).getFirstSelectedOption();
	}
	public void getOptions(List<WebElement>list)
	{
		List<WebElement> ls=Wait.visibilityOfAllElement(list);
		for(WebElement lisdata:ls)
		{
			System.out.println(lisdata.getText());
		}
	}
	public static int size(WebElement wb)
	{
			return new Select(Wait.visibilityStatus(wb)).getOptions().size();
	
	}
	public void selectDropDown(List<WebElement> list,String value)
	{
		List<WebElement>ls=Wait.visibilityOfAllElement(list);
		for(WebElement data:ls)
		{
			String val=data.getText();
			if(val.equalsIgnoreCase(value))
			{
				data.click();
				break;
			}
		}
		
	}
}
