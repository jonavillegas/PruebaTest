package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reserva {

        WebDriver driver;
        public reserva(WebDriver driver){
            this.driver = driver;
        }
        //Elementos DOM
        By idaYvuelta = By.id("RoundTrip");
        By menuVuelos = By.linkText("Flights");
        By origen = By.id("FromTag");
        By destino = By.id("ToTag");
        By dateIda = By.id("DepartDate");
        By dateVuelta = By.id("ReturnDate");
        By idAdulto = By.id("Adults");
        By idChildrens = By.id("Childrens");
        By buscar = By.id("SearchBtn");
        String txtOrigen = "LIMA";
        String txtDestino = "PIURA";
        String fechaIda = "08152020";
        String fechaVuelta = "08252020";


        //métodos
        public WebElement menuFlights(){
            return driver.findElement(menuVuelos);
        }

        public WebElement idaYvuelta(){
            return driver.findElement(idaYvuelta);
        }

        public WebElement origen(){
            return driver.findElement(origen);
        }

        public WebElement destino(){
            return driver.findElement(destino);
        }

        public WebElement date(){
            return driver.findElement(dateIda);
        }

        public WebElement dateRegreso(){
            return driver.findElement(dateVuelta);
        }

        public WebElement adultos(){
            return driver.findElement(idAdulto);
        }

        public WebElement children(){
            return driver.findElement(idChildrens);
        }

        public WebElement buscar(){
            return driver.findElement(buscar);
        }



    }

