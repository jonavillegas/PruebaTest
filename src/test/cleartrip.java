package test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;

import static org.openqa.selenium.Keys.ENTER;


public class cleartrip {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\DriverChrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        reserva reserva;
        busqueda busqueda;
        itinerario itinerario;
        email email;
        pasajeros pasajero;
        pago pago;
        reserva = new reserva(driver);
         //reserva.menuFlights().click();
      //  Thread.sleep(2000);
        reserva.idaYvuelta().click();
        //Thread.sleep(2000);
        reserva.origen().sendKeys("LIMA");
        Thread.sleep(4000);
        reserva.origen().sendKeys(ENTER);
        reserva.destino().sendKeys("CUZCO");
        Thread.sleep(4000);
        reserva.destino().sendKeys(ENTER);
        reserva.date().clear();
        reserva.date().sendKeys("Thu, 24 Sep, 2020");
        reserva.dateRegreso().clear();
        reserva.dateRegreso().sendKeys("Thu, 30 Sep, 2020");
      //  Thread.sleep(1000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        reserva.buscar().click();
        busqueda = new busqueda(driver);
        Thread.sleep(7000);
        busqueda.elegir().click();
        itinerario = new itinerario(driver);
        itinerario.continuar().click();
        Thread.sleep(2000);
        email = new email(driver);
        email.correo().sendKeys("jonaville@gmail.com");
        email.login().click();
        pasajero = new pasajeros(driver);
        Thread.sleep(3000);
        Select s = new Select(pasajero.titulo());
        Thread.sleep(4000);
        s.selectByValue("Mr");
        pasajero.nombre().sendKeys("Pedro");
        pasajero.apellido().sendKeys("Alva");
        pasajero.celular().sendKeys("9435367999");
        pasajero.continuar().click();
        pago = new pago(driver);
        Thread.sleep(9000);
        pago.menuUpi().click();
        Thread.sleep(2000);
        pago.box().sendKeys("test@banco.com");
        Thread.sleep(1000);
        pago.submit().click();

        


      /*  driver.findElement(By.linkText("Phones")).click();
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.linkText("Add to cart")).click();
*/


    }



}
