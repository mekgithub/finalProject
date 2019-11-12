package PageObjects;

import ComselPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class homepage extends Base {
    public By search = By.xpath("//input[@type='search']");

    public WebElement getSearch() {
        return driver.findElement(search);

    }
    public By productName=By.cssSelector("h4.product-name");
    public WebElement getProductName(){
        return driver.findElement(productName);
    }
    @FindBy (xpath="//button[contains(text(),'ADD TO CART')]") WebElement addToCart;
    public void SetToCart(){
        addToCart.click();

    }
    //this is the Page factory Class,for finding elmn we can use this method or classic methhos,it is up to you.
    @FindBy (how=How.CSS, using = "a.increment") WebElement increment;
    public void increment(){
        increment.click();
    }
   // public List<WebElement>


}

