package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pago {

    WebDriver driver;
    By tabUpi = By.cssSelector("#UPTab");
    By box = By.id("vpaBox");
    By btnSubmit = By.id("paymentSubmit");

    public pago(WebDriver driver){
        this.driver = driver;
    }

     public WebElement menuUpi(){
        return driver.findElement(tabUpi);
     }

     public WebElement box(){
        return driver.findElement(box);
     }
     public WebElement submit(){
        return driver.findElement(btnSubmit);
     }

}
