import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Test_Selenium_2 {
    @Test
    public void openPageinChrome() {
        File file = new File("src/test/resources/chromedriver.exe");
       // File file = new File ("src/test/resources/IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
       // System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
       // WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.


        driver.quit();
}


}
