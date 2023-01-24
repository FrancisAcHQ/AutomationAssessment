package com.accesshq.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Toolbar {

    private WebDriver driver;
    private String elementName;
    private String elementClass;

    public Toolbar(WebDriver driver, String elementName, String elementClass) {
        this.driver = driver;
        this.elementName = elementName;
        this.elementClass = elementClass;
    }

    public void clickForm() {
        clickTool();
    }

    public void clickPlanetsTab() {
        clickTool();
    }

    public void clickEarthButton() {

        WebElement earthPlanetElement = null;
        WebElement earthElement = null;

        List<WebElement> elements = driver.findElements(By.className(elementClass));
        for(WebElement currentElement: elements) {
            if(currentElement.getText().equalsIgnoreCase(elementName)) {
                earthPlanetElement = currentElement.findElement(By.xpath("./.."));
                earthPlanetElement.findElement(By.xpath("./button")).click();
                break;
            }
        }

    }

    private void clickTool() {

        List<WebElement> elements = driver.findElements(By.className(elementClass));
        for(WebElement currentElement: elements) {
            if(currentElement.getText().equalsIgnoreCase(elementName)) {
                currentElement.click();
                break;
            }
        }

    }
}
