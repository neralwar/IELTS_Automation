package com.ielts.pagefactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://takeielts.britishcouncil.org/organisations/organisations-recognise-ielts")
public class SearchResultPage extends PageObject {

	
	@FindBy(xpath="//p[contains(text(),'Click on the below')]")
	@CacheLookup
	WebElement Searchpagelandingtext;
	
	@FindBy(xpath="//div[@class='field-content item-bandscore']")
	List<WebElement> ieltsscoreresult;
    
	public void searchpagecheck(String ieltsccore) throws InterruptedException {
		

			Assert.assertTrue(Searchpagelandingtext.isDisplayed());
			
	}

}
