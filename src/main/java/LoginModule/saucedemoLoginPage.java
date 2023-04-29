package LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucedemoLoginPage {
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@type='submit']") private WebElement LoginBtn;
	
	public saucedemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpSauceDemoLoginUserName(String user)
	{
		UN.sendKeys(user);
	}
	
	public void inpSauceDemoLoginPWD(String pass)
	{
		PWD.sendKeys(pass);
	}
	
	public void clickSauceDemoLoginbtn()
	{
		LoginBtn.click();;
	}

}
