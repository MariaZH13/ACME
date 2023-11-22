import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    WebDriver wd;
    HelperUser user;

    public HelperUser getUser() {
        return user;
    }

    @BeforeMethod
    public void init(){
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://demo.applitools.com/index.html");
        user = new HelperUser(wd);

    }

    @AfterMethod
    public void stop(){
        wd.quit();
    }




}
