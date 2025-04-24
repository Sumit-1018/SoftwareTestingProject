import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bikewaleTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bikewale.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Print the url and title of the page
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

        //Selecting the city as Jalandhar
        WebElement city = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[2]/div[2]"));
        city.click();
        Thread.sleep(1000);

        WebElement citySearch = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[1]/div[2]/div/div/div/div[1]/div/input"));
        citySearch.sendKeys("Jalandhar");
        Thread.sleep(1000);

        WebElement jalandhar = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[2]/div/div/div[2]/div/ul/li/span/mark"));
        jalandhar.click();
        Thread.sleep(1000);

//        //selecting an area in Jalandhar, we can select any area but I will be choosing the one on top named Abadpura
        WebElement area = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[2]/div/div/div[2]/div/ul/li[1]/span"));
        area.click();
        Thread.sleep(2000);

        //scrolling to Browse by Brands section in small parts because the site doesn't load in many cases
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //Selecting the brand as TVS
        WebElement brand = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/section/div/div/div[2]/div[1]/div/div/div/div[1]/div/ul/li[4]/a/div[2]"));
        brand.click();
        Thread.sleep(3000);

        //Selecting the Top Comparison
        WebElement topComparison = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/section/div[1]/div[2]/ul/li[2]/div/span/div"));
        topComparison.click();
        Thread.sleep(6000);

        //scrolling back to top
        js.executeScript("window.scrollBy(0,-6000)");
        Thread.sleep(2000);

        //selecting Reviews
        WebElement reviews = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/section/div[1]/div[2]/ul/li[4]/div/span/div"));
        reviews.click();
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //going back to the home page
        WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/div/a"));
        home.click();
        Thread.sleep(2000);

        //going to menu to select new launches from new bikes section
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/div/span"));
        menu.click();
        Thread.sleep(2000);

        WebElement newBikes = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div/div/nav/ul/li[2]/div[1]/div[1]/div/span"));
        newBikes.click();
        Thread.sleep(2000);

        //selecting new launches
        WebElement newLaunches = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div/div/nav/ul/li[2]/div[2]/div/ul/li[7]/a/span"));
        newLaunches.click();
        Thread.sleep(2000);

        //going back to home to select the body style
        WebElement home1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/div/a"));
        home1.click();
        Thread.sleep(2000);

//      //scrolling to body style section in small parts because the site doesn't load properly in many cases
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(500);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //selecting bodystyle<cruiser
        WebElement bodyStyle = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/section/div/div/div[1]/div/ul/li[4]/div"));
        bodyStyle.click();
        Thread.sleep(2000);

        WebElement cruiser = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/section/div/div/div[2]/div[4]/div/div/ul/li[3]/a/div[2]"));
        cruiser.click();
        Thread.sleep(2000);

        //Select any bike from the list
        WebElement bike = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/section[2]/div[2]/div/ul/li[3]/div/div[2]/div[2]/a/h3/span"));
        bike.click();

        //closing the browser after 15 seconds
        Thread.sleep(15000);
        driver.quit();

    }
}
