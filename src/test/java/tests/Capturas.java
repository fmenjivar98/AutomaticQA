package tests;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Capturas {

    WebDriver driver;

    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://buggy.justtestit.org/";


    @Before
    public void Start()
    {
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(key_url);
    }

    public String fechaCaptura()
    {
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();

        return formatoFecha.format(fecha);

    }

    public void screen()
    {
        File captura = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(captura,new File("C:\\Users\\ferna\\OneDrive\\Documentos\\CapturaEjemplo" + fechaCaptura() + ".png"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void capturas() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-success-outline']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("Automatizaci102");
        Thread.sleep(1000);
        driver.findElement(By.id("firstName")).sendKeys("Automatizacion102");
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys("Automatizacion102");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Automatizar102");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.id("confirmPassword")).sendKeys("Automatizar102");
        screen();
        Thread.sleep(1000);

        //driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    }

    @After
    public void cierre()
    {
    }
}
