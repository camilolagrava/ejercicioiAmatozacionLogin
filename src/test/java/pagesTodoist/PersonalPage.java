package pagesTodoist;

import control.Image;
import org.openqa.selenium.By;

public class PersonalPage {
    public Image avatarImage = new Image(By.xpath("//img[@class='user_avatar big settings_avatar']"));
}
