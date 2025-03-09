package BT_WebElement_and_WebDriver;

import BT_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

public class BT_WebDriver extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://crm.anhtester.com/admin/authentication");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();
        //Chọn Group
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        sleep(1);
        String groupName = "VIP";
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).sendKeys(groupName);
        //Click chọn item group hoặc nhấn ENTER
        //driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[normalize-space()='" + groupName + "']")).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();

        closeBrowser();
    }
}