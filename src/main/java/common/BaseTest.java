package common;

import BT_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void sleep(double second){
        try {
            Thread.sleep((long) (1000*second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createBrowser(){
        //Khởi tạo Browser
        driver = new ChromeDriver();
        //2 hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Học kỹ bài số 15
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //2 hàm để maximize/minimize cửa sổ trình duyệt
        driver.manage().window().maximize();
    }

    public static void createBrowser(String browserName){
        //Khởi tạo Browser

        if(browserName.trim().toLowerCase().equals("chrome")){
            driver = new ChromeDriver();
        }
        if(browserName.trim().toLowerCase().equals("edge")){
            driver = new EdgeDriver();
        }
        if(browserName.trim().toLowerCase().equals("firefox")){
            driver = new FirefoxDriver();
        }

        //2 hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Học kỹ bài số 15
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //2 hàm để maximize/minimize cửa sổ trình duyệt
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Đóng Browser
        driver.quit();
    }
    public static void loginCRM() {
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
    }

}