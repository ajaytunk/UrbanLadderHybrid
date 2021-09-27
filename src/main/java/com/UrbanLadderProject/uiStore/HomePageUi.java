package com.UrbanLadderProject.uiStore;

import org.openqa.selenium.By;

public class HomePageUi {
	
	public By popupclose=By.cssSelector("a[data-gaaction=\"popup.auth.close\"]");
	public By search=By.id("search");
	public By searchbuttonclk=By.id("search_button");
	
	public By Checkbox=By.cssSelector("[id=\"filters_availability_In_Stock_Only\"]");
	public By productCount=By.cssSelector("[class=\"results-count\"]");
	public By StudyTable=By.cssSelector("[href=\"/study-table?src=explore_categories\"]");
	
	
	public By Shoe=By.cssSelector("[href=\"/shoe-rack?src=explore_categories\"]");
	public By shoeRack=By.cssSelector("[title=\"Webster Shoe Cabinet With Lock (Walnut Finish, 32 Pair Capacity)\"]");
	public By shoeRackprice=By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[3]/a/div[2]/span");
	
	public By size=By.cssSelector("[data-group=\"size\"]");
	public By select=By.id("filters_storage_type_Cabinet");
	public By PriceHover=By.cssSelector("[data-group=\"price\"]");
	public By pricerng=By.id("price_limit_9000-12999");
	
	public By submail=By.id("email_id");
	public By subscibe=By.cssSelector("input[data-gaaction=\"subscribed\"]");
	
	public By gift=By.cssSelector("a[href=\"../../gift-cards?src=header\"]");
	public By Voucherclk=By.cssSelector("img[src=\"https://www.ulcdn.net/media/gift-cards/occasions/wedding.jpg\"]");
	public By amount=By.id("ip_2251506436");
	public By next=By.cssSelector("._1IFIb._1fVSi.action-button._1gIUf._1XfDi");
	
	public By youtube=By.className("icofont-social-youtube");
	public By about=By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[6]/div");
	public By views=By.xpath("//*[@id='right-column']/yt-formatted-string[3]");
	
	public By Item=By.cssSelector("a[title=\"Mika Study Chair (White)\"]");
	public By addcart=By.id("add-to-cart-button");
	public By quantity=By.id("select_0_quantity");
	public By price=By.className("final-price");
	public By checkout=By.id("checkout-link");
	
	public By chatbox=By.id("fc_widget");
	public By botchat=By.className("icon-ic_chat_icon");
	public By chatwith=By.className("channel-name");
	public By chatText=By.id("app-conversation-editor");
	
	public By track=By.cssSelector("[href=\"/orders?src=track-order\"]");
	public By orderid=By.name("orderNumber");
	public By phno=By.name("phoneNumber");

	public By Help=By.cssSelector("[href=\"/help?src=g_footer\"]");
	public By HelpSearch=By.id("help-center-search-input");
	public By HelpQs=By.cssSelector(".col-sm-11.col-md-11.col-lg-11.text");
	
	
	
	
	
}
