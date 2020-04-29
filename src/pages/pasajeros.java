package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;
import java.util.List;

public class pasajeros {

    WebDriver driver;
    By nombre = By.id("AdultFname1");
    By apellido = By.id("AdultLname1");
    By cel = By.id("mobileNumber");
    By btnContinuar = By.id("travellerBtn");
    By title = By.id("AdultTitle1");


    public pasajeros(WebDriver driver){
        this.driver = driver;
    }

    public WebElement nombre(){
        return driver.findElement(nombre);
    }
    public WebElement apellido(){
        return driver.findElement(apellido);
    }
    public WebElement celular(){
        return driver.findElement(cel);
    }
    public WebElement continuar(){
        return driver.findElement(btnContinuar);
    }
    public WebElement titulo(){
        return driver.findElement(title);
    }

}

