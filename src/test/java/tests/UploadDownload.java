package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;

public class UploadDownload {

    WebDriver driver;

    String key= "webdriver.chrome.driver";
    String value= "J:\\Intellij\\AutomaticQA\\chromedriver\\chromedriver.exe";
    String key_url = "https://demoqa.com/upload-download";

    String directoy = "C:\\Users\\ferna\\OneDrive\\Documentos\\documento _subir";

    @Before
    public void Start()
    {
        System.setProperty(key, value);

        HashMap<String, Object> preferencias = new HashMap<String, Object>();
        preferencias.put("profile.default_content_settings-popups",0);
        preferencias.put("download.default_directory", directoy);

        ChromeOptions navegador = new ChromeOptions();
        navegador.setExperimentalOption("prefs", preferencias);

        driver = new ChromeDriver(navegador);
        driver.manage().window().maximize();
        driver.get(key_url);

    }

    @Test
    public void UploadDownload()
    {
        File file = new File("C:\\Users\\ferna\\OneDrive\\Documentos\\documento _subir\\documento.txt");
        String path = file.getAbsolutePath();
        driver.findElement(By.id("uploadFile")).sendKeys(path);

        driver.findElement(By.id("downloadButton")).click();
    };


}
