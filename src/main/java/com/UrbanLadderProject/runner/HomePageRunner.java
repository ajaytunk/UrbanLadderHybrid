package com.UrbanLadderProject.runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UrbanLadderProject.pageObjects.HomePageObjects;
import com.UrbanLadderProject.resuableComponents.Base;
import com.UrbanLadderProject.resuableComponents.ReusableMethods;
import com.UrbanLadderProject.utilities.ExcelReader;
import com.UrbanLadderProject.utilities.PropertyFileReader;

import jdk.internal.org.jline.utils.Log;

public class HomePageRunner extends Base {

	@Test(priority=5)
	public void CountOfItem() throws IOException, InterruptedException
	{
			driver=initializedriver();
			ReusableMethods.Implicitwait(driver);
			OpenUrl();
			HomePageObjects hp= new HomePageObjects(driver);
			hp.ClosingPopUp().click();
			Thread.sleep(5000);
			hp.Search().sendKeys("Dining Table");
			hp.SearchButtonClick().click();
			String totalcount=hp.GetProductsCount().getText();
			System.out.println("Total items count : "+totalcount);
			hp.GetCheckBox().click();
			Thread.sleep(5000);
			if(hp.GetCheckBox().isSelected())
			{
				System.out.println("Check box selected");
				String InstockCount=hp.GetProductsCount().getText();
				System.out.println("Items Instock Count : "+InstockCount);
				logger.info("Count items Instock and out of stock");
			}
			 
	}
	
	@Test(priority=1)
	public void ShoeRackProps() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.Sheos().click();
		System.out.println("shoe Rack Name : "+hpo.ShoeRackName().getAttribute("title"));
		System.out.println("sheo Rack Price : "+hpo.RackPrice().getText());
		logger.info("Printing item name and price");

	}
	
	@Test(priority=2)
	public void ClickingCheckBoxes() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.Search().sendKeys("Study table");
		hpo.SearchButtonClick().click();
		  
		Actions action = new Actions(driver);
		  
		action.moveToElement(hpo.SizeDrop()).perform();
		action.moveToElement(hpo.clicCab()).click().perform();
		Thread.sleep(5000);
		action.moveToElement(hpo.HoverPrice()).click().perform();
		 action.moveToElement(hpo.SelectPriceRange()).click().perform();
			if(hpo.clicCab().isSelected())
			{
				
			System.out.println("Checkbox Got selected");
			logger.info("To sort the items check box got selected");
					  
			}
	}

	
	@Test(dataProvider="getData",priority=0)
	public void Subskribe(String mail) throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.EnterSubMail().sendKeys(mail);
		//hpo.Subscribe().click();
		logger.info("To subscribe to page");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		prop=PropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetname1");
		Object[][] data=ExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	@Test(priority=4)
	public void GiftCards() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.GiftCards().click();
		hpo.voucher().click();
		hpo.EnterAmount().sendKeys("1000");
		hpo.ClickNext().click();
		
	}
	
	
	@Test(priority=3)
	public void YouTubeViewsCount() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.ClickYt().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
            	
            driver.switchTo().window(handle);
            hpo.ClkAbout().click();
            System.out.println(driver.getTitle());
            Thread.sleep(5000);
            System.out.println("Youtube Total views count: "+hpo.Ytviews().getText());
            logger.info("Youtube views printed sucessfully");
            }
        }
        
	}
	
	
	@Test(priority=7)
	public void CheckOut() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.Search().sendKeys("Study chair");
		hpo.SearchButtonClick().click();
		hpo.SearchItem().click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        for(String handle: allWindowHandles)
        {
            if(!handle.equals(mainWindowHandle)) 
            {
             driver.switchTo().window(handle);
             hpo.Addtocart().click();
             int n=3;
     		for(int i=1;i<n;i++) {
     		hpo.SelectQuantity().sendKeys(Keys.ARROW_DOWN);
     		}
    		hpo.SelectQuantity().sendKeys(Keys.ENTER);
    		System.out.println("Final Price For"+n+" +chairs+ :"+hpo.FinalPrice().getText());
    	    hpo.CheckOutProduct().click();
    	    logger.info("total price printed and checkout");
       
            }
            
        }
		
		
	}
	
	@Test(priority=6)
	public void ChatBox() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		driver.switchTo().frame(hpo.Chat());
		Thread.sleep(5000);
		hpo.ChatFrame().click();
		Thread.sleep(5000);
		hpo.ChatBot().click();
		hpo.ChattBox().sendKeys("Hello");
		hpo.ChattBox().sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();

	}
	
	@Test(dataProvider="GetData",priority=8)
	public void OrderCheck(String ordi,String Phno) throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.TrackOrder().click();
		hpo.Orderid().sendKeys(ordi);
		hpo.PhoneNumber().sendKeys(Phno);
	}
	
	@DataProvider
	public Object[][] GetData() throws IOException
	{
		prop=PropertyFileReader.LoadFile();
		String p=prop.getProperty("path");
		String file=prop.getProperty("fileName");
		String sheet=prop.getProperty("sheetName");
		Object[][] data=ExcelReader.readExcel(p,file,sheet);
		
		return data;
	}
	
	@Test(priority=9)
	public void Warranty() throws IOException, InterruptedException
	{
		driver=initializedriver();
		ReusableMethods.Implicitwait(driver);
		OpenUrl();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.ClosingPopUp().click();
		Thread.sleep(5000);
		hpo.GetHelp().click();
		hpo.GetHelpSearch().sendKeys("warranty");
		hpo.GetHelpSearch().sendKeys(Keys.ARROW_DOWN.ENTER);
		int s=hpo.GetHelpSearchQuestions().size();
		System.out.println("Total questions related to warranty : "+s);
        List<WebElement> allLinks=hpo.GetHelpSearchQuestions();
        for(WebElement link:allLinks)
        {
        	System.out.println(link.getText());
        	logger.info("To print questions");
        }
	}
	@AfterMethod
	public void DriverClose()
	{
		logger.info("driver closed");
		driver.quit();
	}
	


}
