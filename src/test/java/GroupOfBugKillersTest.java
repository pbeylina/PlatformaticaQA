import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupOfBugKillersTest extends BaseTest {


    @Test
    public void olenatTest() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement header = driver.findElement(By.xpath("//h2[.='About']"));

        Assert.assertEquals(header.getText(), "About");

        Thread.sleep(1000);
    }


}

