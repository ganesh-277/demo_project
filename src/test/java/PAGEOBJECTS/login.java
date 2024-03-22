package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
WebDriver ldriver;

public login(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="//input[@placeholder=\"Email\"]") WebElement email;
@FindBy(xpath="//input[@placeholder=\"Password\"]") WebElement pass;
@FindBy(xpath="//button[@type=\"submit\"]") WebElement btn;

public void setusername(String uname)
{
	email.sendKeys(uname);
}

public void setpassword(String pwd)
{
	pass.sendKeys(pwd);
}
public void clkbtn()
{
	btn.click();
}
}
