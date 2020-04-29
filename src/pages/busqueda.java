package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class busqueda {

        WebDriver driver;

        public busqueda(WebDriver driver){
            this.driver = driver;
        }
        //Elementos DOM
        By book = By.xpath("//table/tbody[2]/tr[2]/td[3]/button[1]");
        //métodos
        public WebElement elegir(){
            return driver.findElement(book);
        }


    }

