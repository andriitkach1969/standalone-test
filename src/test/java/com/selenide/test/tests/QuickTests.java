package com.selenide.test.tests;

import com.selenide.test.config.BaseConfigs;
import com.selenide.test.pages.InitPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

public class QuickTests extends BaseConfigs {

    @Features("Quick tests for cheking out header menu")
    @Description("1.1 Open start page. Check out header menu elements.")
    @Title("Check header menu elements")
    @Stories("Check header menu elements")
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
        initPage.clickHeaderLogo();
        initPage.clickHeaderTravel();
        initPage.clickHeaderLogo();
        initPage.clickHeaderHealthcare();
        initPage.clickHeaderLogo();
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
