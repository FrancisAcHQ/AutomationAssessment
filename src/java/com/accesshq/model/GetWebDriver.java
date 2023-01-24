package com.accesshq.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebDriver {

    private static String environment = "test";

    public WebDriver getDriver() {

        switch (environment) {
            //case "test": return new ChromeDriver();

            //case "dev": return new ChromeDriver();

            default: return new ChromeDriver();
        }
    }

}
