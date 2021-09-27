package com.UrbanLadderProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadderProject.uiStore.HomePageUi;


public class HomePageObjects {

	WebDriver driver;
	HomePageUi h=new HomePageUi();
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ClosingPopUp()
	{
		return driver.findElement(h.popupclose);
	}
	public WebElement Search()
	{
		return driver.findElement(h.search);
	}
	public WebElement SearchButtonClick()
	{
		return driver.findElement(h.searchbuttonclk);
	}
	
	
	public WebElement Sheos()
	{
		return driver.findElement(h.Shoe);
	}
	public WebElement ShoeRackName()
	{
		return driver.findElement(h.shoeRack);
	}
	public WebElement RackPrice()
	{
		return driver.findElement(h.shoeRackprice);
	}
	
	public WebElement SizeDrop()
	{
		return driver.findElement(h.size);
	}
	public WebElement clicCab()
	{
		return driver.findElement(h.select);
	}
	public WebElement HoverPrice()
	{
		return driver.findElement(h.PriceHover);
     }
	public WebElement SelectPriceRange()
	{
		return driver.findElement(h.pricerng);
     }
	
	

	public WebElement GiftCards()
	{
		return driver.findElement(h.gift);
	}
	public WebElement voucher()
	{
		return driver.findElement(h.Voucherclk);
	}
	public WebElement EnterAmount()
	{
		return driver.findElement(h.amount);
     }
	public WebElement ClickNext()
	{
		return driver.findElement(h.next);
     }
	
	public WebElement ClickYt()
	{
		return driver.findElement(h.youtube);
	}
	
	public WebElement ClkAbout()
	{
		return driver.findElement(h.about);
	}
	public WebElement Ytviews()
	{
		return driver.findElement(h.views);
	}
	
	public WebElement SearchItem()
	{
		return driver.findElement(h.Item);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(h.addcart);
	}
	public WebElement SelectQuantity()
	{
		return driver.findElement(h.quantity);
	}
	public WebElement FinalPrice()
	{
		return driver.findElement(h.price);
	}
	public WebElement CheckOutProduct()
	{
		return driver.findElement(h.checkout);
	}
	
	public WebElement Chat()
	{
		return driver.findElement(h.chatbox);
	}
	public WebElement ChatFrame()
	{
		return driver.findElement(h.botchat);
	}
	public WebElement ChatBot()
	{
		return driver.findElement(h.chatwith);
	}
	public WebElement ChattBox()
	{
		return driver.findElement(h.chatText);
	}
	
	public WebElement TrackOrder()
	{
		return driver.findElement(h.track);
	}
		
	
	public WebElement Orderid()
	{
		return driver.findElement(h.orderid);
	}
	public WebElement PhoneNumber()
	{
		return driver.findElement(h.phno);
	}
	
	public WebElement GetCheckBox()
	{
		return driver.findElement(h.Checkbox);
	}
	public WebElement GetProductsCount()
	{
		return driver.findElement(h.productCount);
	}
	public WebElement GetStudyTable()
	{
		return driver.findElement(h.StudyTable);
	}
	public WebElement GetHelp()
	{
		return driver.findElement(h.Help);
	}
	public WebElement GetHelpSearch()
	{
		return driver.findElement(h.HelpSearch);
	}
	public List<WebElement> GetHelpSearchQuestions()
	{
		return driver.findElements(h.HelpQs);
	}
	
	
	
	public WebElement EnterSubMail()
	{
		return driver.findElement(h.submail);
     }
	public WebElement Subscribe()
	{
		return driver.findElement(h.subscibe);
     }
}
