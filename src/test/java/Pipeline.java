import org.openqa.selenium.WebDriver;

public class Pipeline {
@Test
        void myFirstPipeline(){
    WebDriverbDriver driver=new ChromeDriver();

    // Launch Website
    driver.navigate().to("http://www.javatpoint.com/");

    //Maximize the browser
    driver.manage().window().maximize();

    //Scroll down the webpage by 5000 pixels
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0, 5000)");
}

}
