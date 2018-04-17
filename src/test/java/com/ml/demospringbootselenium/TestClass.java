package com.ml.demospringbootselenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.*;
import java.net.MalformedURLException;

public class TestClass  {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testScript() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        assertTrue(homePage.isTitleCorrect());
    }

}