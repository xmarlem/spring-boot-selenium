package com.ml.demospringbootselenium;

import org.openqa.selenium.WebDriver;
public class HomePage {
    WebDriver driver;
    String url = "http://www.vpl.ca";
    String title = "Vancouver Public Library - Home";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open()  {
        driver.get(url);
    }

    public Boolean isTitleCorrect() {
        return driver.getTitle().equals(title);
    }

}