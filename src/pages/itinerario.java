package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class itinerario {
    WebDriver driver;
    By continuar = By.id("itineraryBtn");

    public itinerario(WebDriver driver){
        this.driver = driver;
    }

    public WebElement continuar(){
        return driver.findElement(continuar);
    }

}
