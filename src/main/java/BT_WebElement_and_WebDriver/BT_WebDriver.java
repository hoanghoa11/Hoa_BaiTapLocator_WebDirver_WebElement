package BT_WebElement_and_WebDriver;

import BT_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class BT_WebDriver extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo trình duyệt
        createBrowser();

        //Log in vào CRM
        loginCRM();
        Thread.sleep(2000);

        //Click vào Project bên thanh taskbar bên trái
        driver.findElement(By.xpath(LocatorsCRM.menuProject)).click();
        Thread.sleep(1000);

        //Xác nhận rằng trang hiện tại đang là trang Project

        System.out.println("Current page is: " + driver.findElement(By.xpath(LocatorsCRM.headerProjectPage)).getText());

        //Tạo 1 project mới

        //Tab Project
        driver.findElement(By.xpath(LocatorsCRM.buttonNewProject)).click();
        driver.findElement(By.xpath(LocatorsCRM.textboxProjectName)).sendKeys("Automation with Selenium");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='clientid']/following-sibling::div//input")).sendKeys("Công ty CP Sunshine Group");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//select[@id='clientid']/following-sibling::div//span)[2]")).click();

        driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        Thread.sleep(1000);
        boolean isSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).isSelected();
        if (isSelected == false) {
            driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        }

        //Scroll đến dropdown Billing Type
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[@for='billing_type']")));

        driver.findElement(By.xpath(LocatorsCRM.dropdownlistbillingType)).click();
        Thread.sleep(1000);
        Select select1 = new Select(driver.findElement(By.id("billing_type")));
        select1.selectByVisibleText("Fixed Rate");

        driver.findElement(By.xpath(LocatorsCRM.dropdownlistStatus)).click();
        Thread.sleep(1000);
        Select select2 = new Select(driver.findElement(By.id("status")));
        select2.selectByVisibleText("Finished");

        driver.findElement(By.xpath(LocatorsCRM.textboxTotalRate)).sendKeys("75");
        driver.findElement(By.xpath(LocatorsCRM.textboxEstimatedHours)).sendKeys("150");

        driver.findElement(By.xpath(LocatorsCRM.dropdownlistMember)).click();
        Thread.sleep(1000);
        Select select3 = new Select(driver.findElement(By.id("project_members[]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='project_members[]']/following-sibling::div//button[normalize-space()='Select All']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistMember)).click();

        driver.findElement(By.xpath(LocatorsCRM.startdateTextbox)).click();
        driver.findElement(By.xpath(LocatorsCRM.startdateTextbox)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.startdateTextbox)).sendKeys("25-10-2024");
        driver.findElement(By.xpath(LocatorsCRM.startdateDatepicker)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.deadlineDatepicker)).click();
        driver.findElement(By.xpath(LocatorsCRM.deadlineTextbox)).sendKeys("25-11-2024");
        driver.findElement(By.xpath(LocatorsCRM.deadlineDatepicker)).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.tagstextbox)).click();
        driver.findElement(By.xpath(LocatorsCRM.tagstextbox)).sendKeys("Selenium");
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);

        //Xử lý iframe Description
        driver.switchTo().frame("description_ifr");
        driver.findElement(By.xpath("//body[@id='tinymce']//p")).sendKeys("This is an Automation Project which uses Selenium for Java");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);

        //Scroll đến cuối trang
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(LocatorsCRM.buttonSaveP)));
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.checkboxsendCreatedEmail)).click();
        Thread.sleep(1000);
        boolean isSelected2 = driver.findElement(By.xpath(LocatorsCRM.checkboxsendCreatedEmail)).isSelected();
        if (isSelected2 == false) {
            driver.findElement(By.xpath(LocatorsCRM.checkboxsendCreatedEmail)).click();
        }

        //Tab Project Settings

        //Scroll đến element
        Thread.sleep(2000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(LocatorsCRM.projectSettingsTab)));

        driver.findElement(By.xpath(LocatorsCRM.projectSettingsTab)).click();
        Thread.sleep(1000);

        //ĐANG LỖI Ở ĐÂY
        driver.findElement(By.xpath(LocatorsCRM.dropdownsendContactsNotifications)).click();
        Thread.sleep(1000);
        Select select4 = new Select(driver.findElement(By.id("contact_notification")));
        select4.selectByVisibleText("Do not send notifications");
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.dropdownvisibleTabs)).click();
        Thread.sleep(1000);
        Select select5 = new Select(driver.findElement(By.id("available_features")));
        driver.findElement(By.xpath("//select[@id='available_features']/following-sibling::div//button[normalize-space()='Select All']")).click();
        driver.findElement(By.xpath(LocatorsCRM.dropdownvisibleTabs)).click();

        driver.findElement(By.xpath(LocatorsCRM.allowCustomerToViewTasks)).click();
        Thread.sleep(1000);
        boolean isSelected3 = driver.findElement(By.xpath(LocatorsCRM.allowCustomerToViewTasks)).isSelected();
        if (isSelected == false) {
            driver.findElement(By.xpath(LocatorsCRM.allowCustomerToViewTasks)).click();
        }

        driver.findElement(By.xpath(LocatorsCRM.allowCustomerToCreateTasks)).click();
        Thread.sleep(1000);
        boolean isSelected4 = driver.findElement(By.xpath(LocatorsCRM.allowCustomerToCreateTasks)).isSelected();
        if (isSelected == false) {
            driver.findElement(By.xpath(LocatorsCRM.allowCustomerToCreateTasks)).click();
        }

        driver.findElement(By.xpath(LocatorsCRM.allowCustomerToUploadFiles)).click();
        Thread.sleep(1000);
        boolean isSelected5 = driver.findElement(By.xpath(LocatorsCRM.allowCustomerToUploadFiles)).isSelected();
        if (isSelected == false) {
            driver.findElement(By.xpath(LocatorsCRM.allowCustomerToUploadFiles)).click();
        }
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.buttonSaveP)).click();
        Thread.sleep(3000);

        //Kiểm tra lại thông tin project vừa tạo => Dùng các hàm của WebElement để xác nhận element đó đã tồn tại đúng chưa.
        System.out.println("Customer name: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Customer']/following-sibling::dd/a")).getText());
        System.out.println("Billing Type: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Billing Type']/following-sibling::dd")).getText());
        System.out.println("Total Rate: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Total Rate']/following-sibling::dd")).getText());
        System.out.println("Status: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Status']/following-sibling::dd")).getText());
        System.out.println("Date Created: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Date Created']/following-sibling::dd")).getText());
        System.out.println("Start Date: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Start Date']/following-sibling::dd")).getText());
        System.out.println("Deadline: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Deadline']/following-sibling::dd")).getText());
        System.out.println("Estimated Hours: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Estimated Hours']/following-sibling::dd")).getText());
        System.out.println("Tags: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Tags']/following-sibling::dd//span[normalize-space()='Selenium']")).getText());
        System.out.println("Description: " + driver.findElement(By.xpath("//div/dt[normalize-space()='Description']/following-sibling::dd/p")).getText());

        //Đóng trình duyệt
        closeBrowser();
    }
}