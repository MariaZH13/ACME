import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void fillLoginForm(String username, String password){
        type(By.id("username"),username);
        type(By.id("password"),password);
        click(By.xpath("//input[@class='form-check-input']"));
        click(By.id("log-in"));

    }
}
