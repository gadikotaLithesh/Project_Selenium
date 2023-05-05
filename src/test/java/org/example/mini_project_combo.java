package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mini_project_combo {
    public static void open_browser(){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        System.out.println("Successfully opened the browser.");

        System.out.println("Option 1 is successfully Executed");
    }

    public static void open_url(){
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/");

        System.out.println("Successfully Opened the Url");

        System.out.println("Option 2 is successfully Executed");
    }

    public static void open_url_valid(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/");

        driver.findElement(By.id("session_key")).sendKeys("2000032142@kluniversity.in");

        driver.findElement(By.name("session_password")).sendKeys("Lithesh142");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Successfully Logged In with Valid Credentials");

        System.out.println("Option 3 is successfully Executed");
    }


    public static void open_url_invalid(){

        WebDriver driver ;
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/login");

        driver.findElement(By.name("session_key")).sendKeys("2000032142@kluniversity.in");

        driver.findElement(By.name("session_password")).sendKeys("Lithesh55");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        System.out.println(driver.findElement(By.id("error-for-username")).getText());

        System.out.println("------------------------------------------------");

        System.out.println(driver.findElement(By.id("error-for-password")).getText());

        System.out.println("------------------------------------------------");
        System.out.println("Sucessfully Displayed the Error Message");

        System.out.println("Option 4 is successfully Executed");

    }

    public static void Apply_all_locators(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/login");

        driver.findElement(By.id("username")).sendKeys("2000032142@kluniversity.in");

        driver.findElement(By.name("session_password")).sendKeys("Lithesh");

        driver.findElement(By.linkText("Join now")).click();

        driver.findElement(By.cssSelector("input[id='email-or-phone']")).sendKeys("2000032142");


        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Lithesh");

        driver.findElement(By.className("main__sign-in-link")).click();


        driver.findElement(By.partialLinkText("Forgot password")).click();

        System.out.println("Successfully completed All locators navigation");

        System.out.println("option 5 is successfully Executed");


    }

    public static void highlight_static(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/login");

        highlight(driver,driver.findElement(By.id("username")));

        highlight(driver,driver.findElement(By.name("session_password")));

        highlight(driver,driver.findElement(By.linkText("Join now")));

        highlight(driver,driver.findElement(By.partialLinkText("Forgot password")));

        highlight(driver,driver.findElement(By.tagName("h1")));

        highlight(driver , driver.findElement(By.className("join-now")));

        System.out.println("Successfully completed all the highlight of static locators");

        System.out.println("option 6 is successfully Executed");


    }

    private static void highlight(WebDriver driver, WebElement element) {

        JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

        jsexecutor.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 2px solid green;');",element);

    }


    public static void dynamic_locators(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/login");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("2000032142@kluniversity.in");

        driver.findElement(By.cssSelector("input[name='session_password']")).sendKeys("Lithesh@32142");

        highlight(driver,driver.findElement(By.xpath("//input[@id='username']")));

        highlight(driver,driver.findElement(By.cssSelector("input[name='session_password']")));

        System.out.println("Successfully Completed all the Dynamic locators with highlight");

        System.out.println("option 7 is successfully Executed");


    }


    public static void all_html_control(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/demo-site/");

        driver.findElement(By.name("vfb-5")).sendKeys("Lithesh");

        driver.findElement(By.id("vfb-7")).sendKeys("Gadikota");

       WebElement radio= driver.findElement(By.className("vfb-choice"));

       boolean select_radio = radio.isSelected();

       if(select_radio == false){
           radio.click();
       }

       driver.findElement(By.id("vfb-13-address")).sendKeys("Andhra Pradesh");

       driver.findElement(By.id("vfb-13-address-2")).sendKeys("NGO Colony");

       driver.findElement(By.id("vfb-13-city")).sendKeys("Kadapa");

       driver.findElement(By.id("vfb-13-state")).sendKeys("AP");

       driver.findElement(By.name("vfb-13[zip]")).sendKeys("Kadapa");

       WebElement dropdown = driver.findElement(By.xpath("//select[@name='vfb-13[country]']"));

       boolean select_dropdown = dropdown.isSelected();

       if(select_dropdown == false){

           Select select = new Select(dropdown);

           select.selectByVisibleText("India");
       }

       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lithesh@gmail.com");

       WebElement dropdown_hour = driver.findElement(By.cssSelector("select[name='vfb-16[hour]']"));

       boolean select_dropdown_hour = dropdown_hour.isSelected();

       if(select_dropdown_hour == false){
           Select select = new Select(dropdown_hour);

           select.selectByVisibleText("13");
       }

       WebElement dropdown_minute = driver.findElement(By.cssSelector("select[name='vfb-16[min]']"));

       boolean select_dropdown_minute = dropdown_minute.isSelected();

       if(select_dropdown_minute == false){

           Select select = new Select(dropdown_minute);

           select.selectByVisibleText("05");
       }

       driver.findElement(By.cssSelector("input[name='vfb-19']")).sendKeys("7981446539");

       WebElement  check_box = driver.findElement(By.cssSelector("label[for='vfb-20-0']"));

       boolean select_check_box = check_box.isSelected();

       if(select_check_box == false){

           check_box.click();
       }

       driver.findElement(By.cssSelector("textarea[name='vfb-23']")).sendKeys("Software Testing");

       driver.findElement(By.id("vfb-3")).sendKeys("99");

       driver.findElement(By.cssSelector("input[type='submit'")).submit();

       System.out.println("Successfully completed all html controls");

       System.out.println("Option 8 is successfully Executed");


    }


    public static void simple_alerts(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        driver.findElement(By.cssSelector("button[name='alertbox']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        System.out.println("Successfully completed simple alert");

        System.out.println("Option 1 successfully Executed");

    }

    public static void confirm_alert(){
        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        driver.findElement(By.name("confirmalertbox")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();

        System.out.println(driver.findElement(By.id("demo")).getText());


        System.out.println("---------------------------------------");

        System.out.println("Successfully completed confirm alert");

        System.out.println("Option 2 successfully Executed");
    }

    public static void prompt_alert(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/alertandpopup/");

        driver.findElement(By.name("promptalertbox1234")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().sendKeys("Yes");

        driver.switchTo().alert().accept();

        System.out.println(driver.findElement(By.id("demoone")).getText());

        System.out.println("--------------------------------------");

        System.out.println("Successfully completed Prompt alert");

        System.out.println("Option 3 successfully Executed");
    }


    public static void screen_short() throws IOException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://github.com/gadikotaLithesh/mini_project_html_controls");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File file = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file , new File("./Screenshort/Output.png"));

        System.out.println("Sucessfully completed Taking Screenshot");

        System.out.println("Option 10 is successfully Executed");
    }


    public static void main(String args[]) throws IOException {

        int options =0 ;

       while(options != 11) {

           System.out.println("Option 1 : Open a browser");
           System.out.println("Option 2 : Open an url");
           System.out.println("Option 3 : Open an url with valid Credentials");
           System.out.println("Option 4 : Open an url with invalid Credentials");
           System.out.println("Option 5 : Navigating all the locators");
           System.out.println("Option 6 : Highlighting all the static locators");
           System.out.println("Option 7 : Navigating only dynamic locators also highlighting the dynamic locators ");
           System.out.println("Option 8 : Navigating all html controls");
           System.out.println("Option 9 : Different types of alerts");
           System.out.println("Option 10 : Screenshot of the Uploaded project in github");
           System.out.println("Option 11 : End of the program");

           System.out.println("Choose an option from above :");

           Scanner sc = new Scanner(System.in);

           options = sc.nextInt();

           switch (options){

               case 1:
                   open_browser();
                   break;

               case 2:
                   open_url();
                   break;
               case 3:
                   open_url_valid();
                   break;
               case 4:
                   open_url_invalid();
                   break;
               case 5:
                   Apply_all_locators();
                   break;
               case 6:
                   highlight_static();
                   break;
               case 7 :
                   dynamic_locators();
                   break;
               case 8:
                   all_html_control();
                   break;
               case 9:
                   int suboption =0;

                   while(suboption !=4){

                       System.out.println("Choose an alert : ");
                       System.out.println("Option 1 : Simple Alert");
                       System.out.println("Option 2 : Confirm Alert");
                       System.out.println("Option 3 : Prompt Alert");
                       System.out.println("Option 4 : Exit from the different types of Alert");

                       System.out.println("Choose an option from above :");
                       suboption=sc.nextInt();

                       switch (suboption){
                           case 1:
                               simple_alerts();
                               break;
                           case 2:
                               confirm_alert();
                               break;
                           case 3:
                               prompt_alert();
                               break;

                           case 4 :
                               System.out.println("Exit from the sub options");
                               break;

                           default:
                               System.out.println("You have choosen invalid option");

                               System.out.println("Choose from 1 to 4 options only.");
                               break;

                       }
                   }
                   break;
               case 10:
                   screen_short();
                   break;

               case 11:
                   System.out.println("Exit from the Main options");

                   break;
               default :

                   System.out.println("You have choosen invalid option");

                   System.out.println("Choose from 1 to 11 options only.");

           }
       }
    }

}
