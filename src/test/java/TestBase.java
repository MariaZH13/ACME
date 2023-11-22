import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    ApplicationManager applicationManager = new ApplicationManager();


    @BeforeMethod
    public void setUp(){
        applicationManager.init();
    }

    @AfterMethod
    public void tearDown(){
        applicationManager.stop();
    }
}
