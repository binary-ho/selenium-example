import javax.swing.plaf.IconUIResource;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void 크롬을_통해_네이버_커리어에_접속할_수_있다() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

        driver.get("https://recruit.navercorp.com/");
        driver.manage().window().setSize(new Dimension(1552, 840));

        driver.findElement(By.cssSelector(".left_gnb > .gnb > .gnb_list:nth-child(2) .gnb_text")).click();
        driver.findElement(By.cssSelector(".people_item:nth-child(4) img")).click();
        driver.findElement(By.cssSelector(".link_out")).click();
    }

    @Test
    public void firefox를_통해_구글에서_검색할_수_있다() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;

        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1536, 824));
        {
            WebElement element = driver.findElement(By.linkText("로그인"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".a4bIc")).click();
        driver.findElement(By.cssSelector(".ikrT4e")).click();
        driver.findElement(By.id("APjFqb")).click();
        driver.findElement(By.id("APjFqb")).sendKeys("교촌치킨");
        driver.findElement(By.cssSelector(".LLD4me")).click();
        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf > a > .TbwUpd .apx8Vc"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    }
}

