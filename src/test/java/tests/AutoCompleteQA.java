package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AutoCompleteQA {

    WebDriver driver;

    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://demoqa.com/auto-complete";


    public static TimeUnit time;

    @Before
    public void Start()
    {
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(key_url);
    }

    @Test
    public void auto_complete() throws InterruptedException {


        WebElement products=driver.findElement(By.xpath("//div[@id='autoCompleteMultipleContainer']/div/div"));
        products.click();
        products.sendKeys("Red");
        products.sendKeys(Keys.TAB);



    }


    /*
    *   WebElement listaColores = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		listaColores.click();
		String opcion = JOptionPane.showInputDialog("Ingresa un color");
		listaColores.sendKeys(opcion);
    *
    *
    * */

}
