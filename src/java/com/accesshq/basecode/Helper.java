package com.accesshq.basecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Helper {

    public static void selectDropDown(WebDriver driver, WebElement dropdownElement, String textToSelect) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='v-input__append-inner']")).click();
        dropdownElement.sendKeys(Keys.DOWN);
        Thread.sleep(100);

        List<WebElement> allOptions = dropdownElement.findElements(By.xpath("//div[@class='v-list-item__content']"));
        for(WebElement we: allOptions) {
            if (we.findElement(By.xpath("./div[@class='v-list-item__title']")).getText().equalsIgnoreCase(textToSelect)) {
                dropdownElement.sendKeys(Keys.ENTER);
                break;
            }
            dropdownElement.sendKeys(Keys.DOWN);
            Thread.sleep(100);
        }
    }

    public static void clickElement(WebDriver driver, String elementName, String elementClass) {

        List<WebElement> elements = driver.findElements(By.className(elementClass));
        for(WebElement currentElement: elements) {
            if(currentElement.getText().equalsIgnoreCase(elementName)) {
                currentElement.click();
                break;
            }
        }
    }

    public static String convertStringToNum(String alphaNum) {
        StringBuilder numberString = new StringBuilder();

        for(char c: alphaNum.toCharArray()) {
            if (Character.isDigit(c)) {
                numberString.append(c);
            }
        }

        return numberString.toString();
    }

}
