import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Pipeline {
@Test
        void myFirstPipeline(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options=new ChromeOptions();
    options.addArguments("--incognito");
    options.addArguments("--headless");
    WebDriver driver=new ChromeDriver(options);

    // Launch Website
    driver.navigate().to("http://www.javatpoint.com/");

    //Maximize the browser
    driver.manage().window().maximize();

    //Scroll down the webpage by 5000 pixels
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0, 5000)");
}

}
