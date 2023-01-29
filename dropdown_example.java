package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown_example {
    @Test
    public void dropdown()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\cromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//a[contains(@href,'signonForm')]")).click();
        driver.findElement(By.xpath("//a[text()='Register Now!']")).click();
        WebElement ele1=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
        Select s1=new Select(ele1);
        s1.selectByValue("japanese");
        WebElement ele= driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
        Select s= new Select(ele);
        s.selectByVisibleText("REPTILES");
    }
}
