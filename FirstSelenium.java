
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args){


        WebDriver wd = new ChromeDriver();

        wd.get("https://foodstore-1.web.app/\t\t\t\n");
        String url =wd.getCurrentUrl();
        System.out.println("my current url is" +url);
        String title=wd.getTitle();
        System.out.println("Title of the website is : " +title);




    }

}
