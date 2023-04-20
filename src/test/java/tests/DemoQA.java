package tests;

import org.junit.After;
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
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DemoQA {

    WebDriver driver;

    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://demoqa.com/select-menu";
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
    public void DemoQASearch() throws InterruptedException {



        /*******Select Value**********/

       WebElement value = driver.findElement(By.xpath("//div[@id='withOptGroup']/div/div"));
        value.click();
        Thread.sleep(1000);
        WebDriverWait value_time = new WebDriverWait(driver, Duration.ofSeconds(2));

        select_multipl(r.nextInt(6));

        switch (r.nextInt(6)){
            case 0:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-0-0"))).click();
                break;
            case 1:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-0-1"))).click();
                break;
            case 2:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-1-0"))).click();
                break;
            case 3:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-1-1"))).click();
                break;
            case 4:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-2"))).click();
                break;
            case 5:
                value_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-3"))).click();
                break;
        }

       /********** Select One *********************/

        WebElement one = driver.findElement(By.xpath("//div[@id='selectOne']/div/div"));
        one.click();
        Thread.sleep(1000);
        WebDriverWait one_time = new WebDriverWait(driver, Duration.ofSeconds(2));
        one_time.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-option-0-2"))).click();







        /*******************************************************/

        /******** Old Select Menu *************/
        //Select listaEjemplo = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        //int prueba = r.nextInt(11);
        //listaEjemplo.selectByIndex(prueba);
        //listaEjemplo.selectByVisibleText("Black");
        //listaEjemplo.selectByValue("10");


        /*WebElement listaColores = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		listaColores.click();
		listaColores.sendKeys("Yellow");
		listaColores.click();
		*/


        /***************************************************************************************/

        /*******Multiselect drop down******/

       /* WebElement listaMultiple = driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[7]/div/div/div"));
        listaMultiple.click();
        //WebDriverWait waiting_time = new WebDriverWait(driver, Duration.ofSeconds(20));
        //waiting_time.until(ExpectedConditions.elementToBeSelected(By.id("")));
            */





        /*******Standard multi select******/

       /* Select oldMulti = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        List<WebElement> options = oldMulti.getOptions();
        for(WebElement e:options){
            opc.add(e.getText());
            System.out.println("The values are " + (e.getText()));

        }

        int valorDado = r.nextInt(opc.size());
        System.out.println("La palabra ramdom es:  " + opc.get(valorDado));

        if(oldMulti.isMultiple())
        {
            oldMulti.selectByVisibleText(opc.get(valorDado));
        }else{
            System.out.println("multi-select option");
        }

        */
    }

   /* @After
    public void Salir() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


*/
   public void select_multipl(int n){

   }
}


