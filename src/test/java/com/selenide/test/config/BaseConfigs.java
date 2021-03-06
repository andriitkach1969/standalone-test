package com.selenide.test.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

public class BaseConfigs extends ScreenshotListener {
    private static final String CHROMEDRIVER_PATH_FORMAT = "ChromeDriver/chromedriver_%s";
    private static final String CHROMEDRIVER_PATH_MAC =
            String.format(CHROMEDRIVER_PATH_FORMAT, "mac64/chromedriver");
    private static final String CHROMEDRIVER_PATH_LINUX =
            String.format(CHROMEDRIVER_PATH_FORMAT, "linux64/chromedriver");
    private static final String CHROMEDRIVER_PATH_WINDOWS =
            String.format(CHROMEDRIVER_PATH_FORMAT, "win32/chromedriver.exe");
    public WebDriver webDriver;

    //style for fields messages
    public static final String FIELD_TEXT_MESSAGE_VISIBLE="opacity: 1; margin-top: 0px;";
    public static final String FIELD_TEXT_INCORRECT_LIGHT_RGB="rgb(236, 65, 59)";
    public static final String FIELD_TEXT_INCORRECT_LIGHT_RGBA="rgba(236, 65, 59, 1)";
    public static final String FIELD_TEXT_INCORRECT_LIGHT_RADIOBATTONS_RGB="rgb(213, 0, 0)";


    @Step("Инициализация браузера")
    public void setBrowser () {

        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless", "window-size=1368,768", "--no-sandbox");
        chromeOptions.addArguments("window-size=1368,768", "--no-sandbox");
        webDriver = new ChromeDriver( chromeOptions );
        WebDriverRunner.setWebDriver(webDriver);
        Configuration.reportsFolder = "target/screenshots";
        Configuration.timeout=8000;
        Configuration.collectionsTimeout=8000;
    }



    @BeforeMethod
    public void setBrowserConfig () {
        String chromeBinaryPath = "";
        String osName = System.getProperty("os.name").toUpperCase();

        if (osName.contains("WINDOWS")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_WINDOWS;
        } else if (osName.contains("MAC")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_MAC;
        } else if (osName.contains("LINUX")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_LINUX;
        }

        File chromedriver = new File(ClassLoader.getSystemResource(chromeBinaryPath).getPath());

        // set application user permissions to 455
        chromedriver.setExecutable(true);

        System.setProperty("webdriver.chrome.driver", chromedriver.getPath());

    }


    @AfterMethod
    public void shutdown() {
        Selenide.close();
    }
}
