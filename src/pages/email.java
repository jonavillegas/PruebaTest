package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class email {
    WebDriver driver;
    By correo = By.id("username");
    By btnLogin = By.id("LoginContinueBtn_1");

    public email (WebDriver driver){
        this.driver = driver;
    }

    public WebElement correo(){
        return driver.findElement(correo);
    }

    public WebElement login(){
        return driver.findElement(btnLogin);
    }

}
