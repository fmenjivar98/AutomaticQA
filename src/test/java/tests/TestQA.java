package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestQA {

    /*Variables*/
    WebDriver driver;
    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://demo.guru99.com/test/newtours/register.php";
    long time = 10;


    /*Antes de realizar la prueba Prerequisitos*/
    @Before
    public void start(){
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(key_url);
    }

    /*Durante la prueba*/
    @Test
    public void googleSearch()
    {

        /*Tiempo de espera de la pagina o el aplicativo para que muestre los elementos */
        //WebDriverWait waiting_time = new WebDriverWait(driver, Duration.ofSeconds(time));
       // waiting_time.until(ExpectedConditions.titleContains("resultados"));

        /*Contact Information*/
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Fernando");

        WebElement LastName = driver.findElement(By.name("lastName"));
        LastName.sendKeys("Menjivar");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("61804796");

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("fernandomenjivar1998@gmail.com");

        /*Mailing Information*/
        WebElement address1 = driver.findElement(By.name("address1"));
        address1.sendKeys("Residencial");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Santa Tecla");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Libertad");

        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("0511");

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByValue("RUSSIA");
        //country.selectByVisibleText("ARGENTINA");
        //country.selectByVisibleText("ANGOLA");
        //country.selectByIndex(1);

        /*Use Information*/
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("fmenjivar");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456789");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("123456789");

        /*Submit*/
        //firstName.submit();
    }


    /*Realizar acciones cuando termine la prueba*/
    //@After



}
