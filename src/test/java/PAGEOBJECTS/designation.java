package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class designation {
	WebDriver ldriver;

	public designation(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(xpath="//span[text()=\" Administrator \"]") WebElement admint;
	@FindBy(xpath="(//a[@href=\"https://develop.vacisautomation.com/designations\"])[2]") WebElement desi;
	@FindBy(xpath="//a[@data-bs-target=\"#add_designation\"]") WebElement add_des;
	@FindBy(xpath="//input[@placeholder=\"Enter Designation Name\"][1]") WebElement enter_des;
	@FindBy(xpath="//button[@id=\"btn-designation\"]") WebElement enter_sub;
	
	public void Administartor()
	{
		admint.click();
	}
	public void designation()
	{
		desi.click();
	}
    public void clk_add_des()
    {
    	add_des.click();
    }
    public void enter_designation(String name)
    {
    	enter_des.sendKeys(name);
    }
    public void clk_sub()
    {
    	enter_sub.click();
    }
}
