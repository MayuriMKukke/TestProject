package com.IQVIA.IQVIAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{

	@Test
    public void WebDriverManagerTest()
    {
     
        WebDriverManager.ChromeDriver().setup();
        WebDriver driver = new ChromeDriver();
 
        //Navigate to a URL
        driver.get("http://toolsqa.com");
 
        //quit the browser
        driver.quit();
    }
}