import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void simpleTest() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");

        Thread.sleep(3000);
    }

    @Test
    public void secondTest() {

        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement button = driver.findElement(By.xpath("//details[contains(@data-action, 'get-repo')]"));
        button.click();

        WebElement input = driver.findElement(By.xpath("(//div[@class='input-group']/input)[1]"));
        Assert.assertEquals(input.getAttribute("value"), "https://github.com/SergeiDemyanenko/PlatformaticaQA.git");
    }

    @Test
    public void speedTest() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://www.speedtest.net/");

        Thread.sleep(10000);
        WebElement button = driver.findElement(By.xpath("//span[@class='start-text']"));
        button.click();
        Thread.sleep(35000);
    }
}
