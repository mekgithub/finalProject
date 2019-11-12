package ComselPro;
//Why we are using prpoerties file,what is the advantages ?;
//1-when you change something in properties you don't need to recompile your java project
//2-It is used to store information which is to be changed frequently.
//3-key=value
//4- You can get easily values from properties file
//5-it sound like changing a part of engine while the engine is running
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\18327\\Desktop\\YEDEK-master\\YEDEK-master\\MyFinalProject\\src\\test\\java\\ComselPro\\global.properties ");
        prop.load(fis);
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Downloads\\chromedriver_win32\\chromedriver.exe");

         WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(prop.getProperty("url"));

     return driver;
    }


}
