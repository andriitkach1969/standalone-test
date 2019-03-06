package com.selenide.test.tests;

import com.selenide.test.config.BaseConfigs;
import com.selenide.test.config.MyRetry;
import com.selenide.test.config.ScreenshotListener;
import com.selenide.test.pages.InitPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Features("Quick tests for checking out header menu")
@Listeners(ScreenshotListener.class)
public class quickTest extends BaseConfigs {

    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    @Description("1.1 Open start page. Check out header menu elements.")
    @Title("Check header menu elements")
    @Stories("Check header menu elements")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckHeaderMenu() {

        setBrowser();
        InitPage initPage = new InitPage();
        initPage = initPage.openURL();
        initPage.clickHeaderLogo();
        initPage.clickHeaderProjects();
        initPage.clickHeaderLogo();
        initPage.clickHeaderServices();
        initPage.clickHeaderLogo();
        initPage.clickHeaderIndustries();
        initPage.clickHeaderLogistics();
        initPage.clickHeaderIndustries();
        initPage.clickHeaderTravel();
        initPage.clickHeaderIndustries();
        initPage.clickHeaderHealthcare();
        initPage.clickHeaderIndustries();
        initPage.clickHeaderEcommerce();
        initPage.clickHeaderLogo();
        initPage.clickHeaderTeam();
        initPage.clickHeaderLogo();
        initPage.clickHeaderBlog();
        initPage.clickHeaderLogo();
        initPage.clickHeaderOpensource();
        initPage.clickHeaderLogo();
        initPage.clickHeaderCareers();
        initPage.clickHeaderLogo();
        initPage.clickHeaderContacts();
        initPage.clickHeaderLogo();

    }

}
