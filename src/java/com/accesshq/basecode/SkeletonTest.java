package com.accesshq.basecode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.accesshq.model.GetWebDriver;

public class SkeletonTest {

    private WebDriver driver;
    public static final String INITIAL_PAGE = "https://???.cloudfront.net/";

    @BeforeEach
    public void setup() {
        driver = new GetWebDriver().getDriver();
        driver.get(INITIAL_PAGE);
    }
    
    @Test
    public void GenericTest() {
        /* Arrange [Given]*/

        /* Act [When] */

        /* Assert [Then] */
        
    }
    
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
