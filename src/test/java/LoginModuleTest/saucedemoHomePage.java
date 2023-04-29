package LoginModuleTest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class saucedemoHomePage {
	@FindBy(xpath="//div[@class='app_logo']") private WebElement HomePageTiltle;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement searchFilter;
	@FindBy(xpath="//div[@class='inventory_item_price']") private List<WebElement> prices;
	
	
	public saucedemoHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getsaucedemoHomePageTitle()
	{
		String actTitle=HomePageTiltle.getText();
		return actTitle;
	}
	
	public void selectOptionFromSauceDemoeSearchFilter(int index)
	{
		 Select s=new Select(searchFilter);
		 s.selectByIndex(index);	 
	}
	public void sortPrice()
	{   
		String[] priceArray=new String[prices.size()];
		int index=0;
		for(WebElement p:prices)
		{
			String s=p.getText();
			priceArray[index]=s;
			index=index+1;	
		}
		
		Arrays.sort(priceArray);
		for(int i=0;i<=priceArray.length-1;i++)
		{
			System.out.println(priceArray[i]);
		}
			
	}

}
