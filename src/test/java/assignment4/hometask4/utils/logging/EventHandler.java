package assignment4.hometask4.utils.logging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class EventHandler implements WebDriverEventListener {


    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        CustomReporter.log("Navigate to " + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        CustomReporter.log("Navigated to " + url);
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        CustomReporter.log("Navigate back");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        CustomReporter.log("Current URL: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        CustomReporter.log("Navigate forward");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        CustomReporter.log("Current URL: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        CustomReporter.log("Refresh page");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        CustomReporter.log("Current URL: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        CustomReporter.log("Search for element " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        if (element != null) {
            CustomReporter.log("Found element " + element.getTagName());
        }
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        CustomReporter.log("Click on element " + element.getTagName());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        CustomReporter.log("Clicked element" + element.getTagName());
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }


    @Override
    public void beforeScript(String script, WebDriver driver) {
        CustomReporter.log("Execute script: " + script);
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        CustomReporter.log("Script executed");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        // already logged by reporter
    }
}
