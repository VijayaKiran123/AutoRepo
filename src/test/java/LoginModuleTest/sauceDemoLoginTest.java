package LoginModuleTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import LoginModule.saucedemoLoginPage;

public class sauceDemoLoginTest extends BaseClass{
	saucedemoLoginPage login;
	saucedemoHomePage home;
	
@BeforeClass
 public void openBrowser()
  {
	intialLizeBrowser();
	login=new saucedemoLoginPage(driver);
	home=new saucedemoHomePage(driver);
	
  }
@Test
public void loginApp() throws IOException
{
	login.inpSauceDemoLoginUserName(UtilityClass.getPfData("UN"));
	login.inpSauceDemoLoginPWD(UtilityClass.getPfData("PWD"));
	login.clickSauceDemoLoginbtn();
}

@Test
public void verifyTitle() throws EncryptedDocumentException, IOException
{
	String expectedTitle=UtilityClass.getData(0,0);
	String actualTitle=home.getsaucedemoHomePageTitle();
	Assert.assertEquals(expectedTitle,actualTitle);
}

@Test
public void searchFilterVerify()
{
   home.selectOptionFromSauceDemoeSearchFilter(2);	
   home.sortPrice();
}  

}
