package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Random;

public class FormQA {

    WebDriver driver;

    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://demoqa.com/automation-practice-form";
    Random r = new Random();


    ArrayList<String> opc = new ArrayList<String>();


    @Before
    public void Start()
    {
        System.setProperty(key, value);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(key_url);
    }

    @Test
    public void form()
    {
        WebElement first_name = driver.findElement(By.id("firstName"));
        first_name.click();
        first_name.sendKeys("Fernando");

        WebElement last_name = driver.findElement(By.id("lastName"));
        last_name.click();
        last_name.sendKeys("Menjivar");

        WebElement user_name = driver.findElement(By.id("userEmail"));
        user_name.click();
        user_name.sendKeys("fernandomenjivar1998@gmail.com");

        switch (r.nextInt(3)){
            case 0:
                WebElement male_radio = driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label"));
                male_radio.click();
                break;
            case 1:
                WebElement female_radio = driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]/label"));
                female_radio.click();
                break;
            case 2:
                WebElement other_radio = driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[3]/label"));
                other_radio.click();
                break;

        }

        WebElement user_number = driver.findElement(By.id("userNumber"));
        user_number.click();
        user_number.sendKeys("1023410234");



    }



}
