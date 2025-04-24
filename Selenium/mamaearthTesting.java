import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mamaearthTesting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mamaearth.in/");
        driver.manage().window().maximize();
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(2000);

        //creating an action object
        Actions actions = new Actions(driver);
        WebElement face = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[2]/a"));
        actions.moveToElement(face).perform();
        Thread.sleep(2000);

        WebElement faceWash = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[2]/div/div[2]/a[2]"));
        faceWash.click();
        Thread.sleep(2000);

        //hovering the cursor over bestseller to remove the hover window from face section
        WebElement bestSeller = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[3]/div/div[1]/div"));
        actions.moveToElement(bestSeller).perform();
        Thread.sleep(2000);

        //scrolling the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);

        WebElement teaTreeFaceWash = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[6]/div/div/button[4]"));
        teaTreeFaceWash.click();
        Thread.sleep(2000);

        //scrolling the page
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);

        WebElement teaTree1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[8]/div[1]/section/section/div[1]/div[2]/div/div[1]/div[1]"));
        teaTree1.click();
        Thread.sleep(2000);

        //hair<conditioner
        WebElement hair = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[3]/a"));
        actions.moveToElement(hair).perform();
        Thread.sleep(1000);

        WebElement conditioner = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[3]/div/div[2]/a[4]"));
        conditioner.click();
        Thread.sleep(2000);

        //hovering the cursor over our products to remove the hover window from face section
        WebElement ourProducts = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[4]/div[1]"));
        actions.moveToElement(ourProducts).perform();

        //scrolling the page
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);

        //sorting by henna
        WebElement henna = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[5]/div/div/button[8]"));
        henna.click();
        Thread.sleep(1000);

        //scrolling the page
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);

        //all the henna conditioners were out of stock at the time of testing so I added a random product from rosemary section
        WebElement rosemary = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[5]/div/div/button[3]"));
        rosemary.click();
        Thread.sleep(1000);

        //scrolling the page
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        WebElement rosemary1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[7]/div[1]/section/section/div[1]/div[2]/div/div[1]/div[1]"));
        rosemary1.click();
        Thread.sleep(3000);

        //adding the product to the cart
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[1]/div/div[4]/div/div[2]/div[4]/button/span"));
        addToCart.click();
        Thread.sleep(15000);

        //closing the browser after 15 seconds
        driver.quit();
        
    }
}
