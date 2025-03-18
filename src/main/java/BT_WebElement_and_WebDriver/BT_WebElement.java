package BT_WebElement_and_WebDriver;


import BT_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class BT_WebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo trình duyệt
        createBrowser();

        //Log in vào CRM
        loginCRM();
        Thread.sleep(2000);

        //Click vào Menu Customers bên thanh taskbar bên trái
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        Thread.sleep(1000);

        //Xác nhận rằng trang hiện tại đang là trang Customer
        System.out.println("Current page is: " + driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).getText());

        //Add New Customers
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxCompany)).sendKeys("Công ty CP Sunshine Group");
        driver.findElement(By.xpath(LocatorsCRM.textboxVATNumber)).sendKeys("012200111");
        driver.findElement(By.xpath(LocatorsCRM.textboxPhone)).sendKeys("0123456789");
        driver.findElement(By.xpath(LocatorsCRM.website)).sendKeys("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']/following-sibling::div//input")).sendKeys("VIP");

        driver.findElement(By.xpath("//a[@id='bs-select-1-112']")).click();

        driver.findElement(By.xpath(LocatorsCRM.dropdownlistGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='default_currency']/following-sibling::div//input")).sendKeys("USD");
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistDefaultLang)).click();
        driver.findElement(By.xpath("//option[@value='vietnamese']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='default_language']")).click();

        //Scroll đến element
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[@for='city']")));

        driver.findElement(By.xpath(LocatorsCRM.textboxAddress)).sendKeys("Số nhà 123, đường Nguyễn Du");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxCity)).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxState)).sendKeys("Hai Bà Trưng");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxZipCode)).sendKeys("000084");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='country']/following-sibling::div//input")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-4-243']")).click();

        //Scroll lên đầu trang
        Thread.sleep(2000);
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(LocatorsCRM.tabbillingAndShipping)));

        //Nhập thông tin phần Billing Address
        driver.findElement(By.xpath(LocatorsCRM.tabbillingAndShipping)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingStreet)).sendKeys("Nguyễn Du");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingState)).sendKeys("Hai Bà Trưng");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingZipCode)).sendKeys("000084");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistBillingCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='billing_country']/following-sibling::div//input")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-5-243']/child::span[normalize-space()='Vietnam']")).click();
        Thread.sleep(1000);

        //Nhập thông tin phần Shipping Address
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingStreet)).sendKeys("Vũ Tông Phan");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingState)).sendKeys("Thanh Xuân");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingZipCode)).sendKeys("000084");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistShippingCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='shipping_country']/following-sibling::div//input")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-6-243']/child::span[normalize-space()='Vietnam']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.buttonSaveC)).click();
        Thread.sleep(3000);

        //Kiểm tra lại thông tin customer vừa tạo => Dùng các hàm của WebElement để xác nhận element đó đã tồn tại đúng chưa.

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.searchBoxCustomer)).sendKeys("Công ty CP Sunshine Group");
        driver.findElement(By.xpath("//a[normalize-space()='Công ty CP Sunshine Group']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='customer_admins_assign']/ancestor::div/h4")).getText());

        System.out.println("Company name: " + driver.findElement(By.xpath("//input[@id='company']")).getAttribute("value"));
        System.out.println("VAT No: " + driver.findElement(By.xpath("//input[@id='vat']")).getAttribute("value"));
        System.out.println("Phone number: " + driver.findElement(By.xpath("//input[@id='phonenumber']")).getAttribute("value"));
        System.out.println("Website: " + driver.findElement(By.xpath("//input[@id='website']")).getAttribute("value"));
        System.out.println("Groups: " + driver.findElement(By.xpath("//button[@data-id='groups_in[]']")).getAttribute("title"));
        System.out.println("Currency: " + driver.findElement(By.xpath("//button[@data-id='default_currency']")).getAttribute("title"));
        System.out.println("Language: " + driver.findElement(By.xpath("//button[@data-id='default_language']")).getAttribute("title"));
        System.out.println("Address: " + driver.findElement(By.xpath("//textarea[@id='address']")).getText());
        System.out.println("City: " + driver.findElement(By.xpath("//input[@id='city']")).getAttribute("value"));
        System.out.println("State: " + driver.findElement(By.xpath("//input[@id='state']")).getAttribute("value"));
        System.out.println("Zip code: " + driver.findElement(By.xpath("//input[@id='zip']")).getAttribute("value"));
        System.out.println("Country: " + driver.findElement(By.xpath("//button[@data-id='country']")).getAttribute("title"));

        //Đóng trình truyệt
        closeBrowser();
    }
}
