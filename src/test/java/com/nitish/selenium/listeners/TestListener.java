package com.nitish.selenium.listeners;

import com.nitish.selenium.util.Constants;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot ts = (TakesScreenshot)result.getTestContext().getAttribute(Constants.DRIVER);
        String screenshot = ts.getScreenshotAs(OutputType.BASE64);
        String htmlImageFormat = "<img width=700px src='data:image/png;base64,%s' />";
        String htmlImage = String.format(htmlImageFormat, screenshot);
        Reporter.log(htmlImage);
    }
}
