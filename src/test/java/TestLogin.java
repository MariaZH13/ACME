import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestBase{

    @Test
    public void loginPositive(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        applicationManager.user.fillLoginForm("Anabel" + i,i + "3456FG");
        Assert.assertTrue(applicationManager.user.isElementPresent(By.id("time")));





    }
}
