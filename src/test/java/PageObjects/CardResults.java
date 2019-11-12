package PageObjects;

import ComselPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardResults {
    public By productName=By.cssSelector(("p.product-name"));
    public WebElement getPass(){
        return Base.driver.findElement(productName);
    }
}
