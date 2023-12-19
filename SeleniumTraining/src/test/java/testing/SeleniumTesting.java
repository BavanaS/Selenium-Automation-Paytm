package testing;


import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting
{
    public static void main(String[] args)
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://makemytrip.com/");
    }

}

