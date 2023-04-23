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
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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

        WebElement birth_input = driver.findElement(By.id("dateOfBirthInput"));
        birth_input.click();

        //Select DOB field then select date of month dropdown and assign to variable then select month by index
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select MonthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        /*0-11*/
        MonthSelect.selectByValue("6");

        //Select year and assign to variable, then select year by index
        Select YearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        YearSelect.selectByValue("1998");

        //Select the specific day you want by classname
        driver.findElement(By.className("react-datepicker__day--002")).click();

        WebElement products=driver.findElement(By.id("subjectsInput"));
        products.sendKeys("Eng");
        products.sendKeys(Keys.TAB);

        products.sendKeys("Ch");
        products.sendKeys(Keys.TAB);

        WebElement sport = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label"));
        sport.click();

        WebElement reading = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]/label"));
        reading.click();

        WebElement music = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label"));
        music.click();

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Pues obvio mi casa que esta al lado de otra casa y de otra cosa");

        WebElement state = driver.findElement(By.id("stateCity-wrapper"));
        state.click();
        state.findElement(By.cssSelector("#react-select-3-option-2")).click();
    }



}
