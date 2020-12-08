import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupOfBugKillers extends BaseTest {

    @Test
    public void denSpeedTest() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://www.speedtest.net/");

        Thread.sleep(10000);
        WebElement button = driver.findElement(By.xpath("//span[@class='start-text']"));
        button.click();
        Thread.sleep(35000);
    }

    @Test
    public void denXPathTestForPulls() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        button.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='login_field']"));
        userNameField.sendKeys("DenHubPy"); // input real User Name
        WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
        passField.sendKeys("****************"); // input real Password
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButton.click();

        WebElement pullRequestsButton = driver.findElement(By.xpath("//a[@href= '/pulls']"));
        pullRequestsButton.click();
    }

    @Test
    public void denXPathTestForIssues() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        button.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='login_field']"));
        userNameField.sendKeys("DenHubPy"); // input real User Name
        WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
        passField.sendKeys("****************"); // input real Password
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButton.click();

        WebElement pullRequestsButton = driver.findElement(By.xpath("//a[@href= '/issues']"));
        pullRequestsButton.click();
    }

    @Test
    public void denXPathTestForMarketplace() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        button.click();
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='login_field']"));
        userNameField.sendKeys("DenHubPy"); // input real User Name
        WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
        passField.sendKeys("****************"); // input real Password
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInButton.click();

        WebElement pullRequestsButton = driver.findElement(By.xpath("//a[@href= '/marketplace']"));
        pullRequestsButton.click();
    }
}
