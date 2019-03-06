package com.selenide.test.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class InitPage {
    /**
     *
     */
    @FindBy(xpath = "//div[@class='header-line']//a[@class='logo']")
    public SelenideElement headerLogo;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'portfolio')]")
    public SelenideElement headerProjects;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'web-development')]")
    public SelenideElement headerServices;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, '#')]")
    public SelenideElement headerIndustries;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'logistics')]")
    public SelenideElement headerLogistics;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'healthcare')]")
    public SelenideElement headerHealthcare;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'travel')]")
    public SelenideElement headerTravel;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'e-commerce')]")
    public SelenideElement headerEcommerce;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'team')]")
    public SelenideElement headerTeam;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'blog')]")
    public SelenideElement headerBlog;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'opensource')]")
    public SelenideElement headerOpensource;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'jobs')]")
    public SelenideElement headerCareers;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'contacts')]")
    public SelenideElement headerContacts;

    /**
     *
     */
    @FindBy(xpath = "//nav[@class='main-nav']//a[contains(@href, 'promotion')]")
    public SelenideElement headerAboutUs;

    /**
     *
     */
    @FindBy(xpath = "//button[contains(text(),'Start a project')]")
    public SelenideElement btnStartProject;

    @Step("Init URL page, Load and check")
    public InitPage openURL() {
        open(System.getProperty("url"), InitPage.class);
        page(InitPage.class).btnStartProject.waitUntil(visible.because("button Start Project is not visible during 10 sec"), 10000);
        return page(InitPage.class);
    }


    @Step("header menu LOGO. Check and click on it")
    public void clickHeaderLogo() {
        headerLogo.waitUntil(visible.because("Logo is not visible during 10 sec"), 10000);
        headerLogo.waitUntil(enabled.because("Logo is not enabled during 10 sec"), 10000);
        headerLogo.scrollTo();
        headerLogo.click();
    }

    @Step("header menu Projects. Check and click on it")
    public void clickHeaderProjects() {
        headerProjects.waitUntil(visible.because("Projects is not visible during 10 sec"), 10000);
        headerProjects.waitUntil(visible.because("Projects is not enabled during 10 sec"), 10000);
        headerProjects.scrollTo();
        headerProjects.click();
    }

    @Step("header menu Services. Check and click on it")
    public void clickHeaderServices() {
        headerServices.waitUntil(visible.because("Services is not visible during 10 sec"), 10000);
        headerServices.waitUntil(visible.because("Services is not enabled during 10 sec"), 10000);
        headerServices.scrollTo();
        headerServices.click();
        ;
    }

    @Step("header menu Industries. Check and click on it")
    public void clickHeaderIndustries() {
        headerIndustries.waitUntil(visible.because("Industries is not visible during 10 sec"), 10000);
        headerIndustries.waitUntil(enabled.because("Industries is not enabled during 10 sec"), 10000);
        headerIndustries.scrollTo();
        headerIndustries.click();
    }

    @Step("header sub-menu Logistics. Check and click on it")
    public void clickHeaderLogistics() {
        headerLogistics.waitUntil(visible.because("Logistics is not visible during 10 sec"), 10000);
        headerLogistics.waitUntil(enabled.because("Industries is not enabled during 10 sec"), 10000);
        headerLogistics.scrollTo();
        headerLogistics.click();
    }

    @Step("header sub-menu Travel. Check and click on it")
    public void clickHeaderTravel() {
        headerTravel.waitUntil(visible.because("Travel is not visible during 10 sec"), 10000);
        headerTravel.waitUntil(enabled.because("Travel is not enabled during 10 sec"), 10000);
        headerTravel.scrollTo();
        headerTravel.click();
    }

    @Step("header sub-menu Healthcare. Check and click on it")
    public void clickHeaderHealthcare() {
        headerHealthcare.waitUntil(visible.because("Healthcare is not visible during 10 sec"), 10000);
        headerHealthcare.waitUntil(enabled.because("Healthcare is not enabled during 10 sec"), 10000);
        headerHealthcare.scrollTo();
        headerHealthcare.click();
    }

    @Step("header sub-menu E-Commerce. Check and click on it")
    public void clickHeaderEcommerce() {
        headerEcommerce.waitUntil(visible.because("E-Commerce is not visible during 10 sec"), 10000);
        headerEcommerce.waitUntil(enabled.because("E-Commerce is not enabled during 10 sec"), 10000);
        headerEcommerce.scrollTo();
        headerEcommerce.click();
    }

    @Step("header menu Team. Check and click on it")
    public void clickHeaderTeam() {
        headerTeam.waitUntil(visible.because("Team is not visible during 10 sec"), 10000);
        headerTeam.waitUntil(enabled.because("Team is not enabled during 10 sec"), 10000);
        headerTeam.scrollTo();
        headerTeam.click();
    }

    @Step("header menu Blog. Check and click on it")
    public void clickHeaderBlog() {
        headerBlog.waitUntil(visible.because("Blog is not visible during 10 sec"), 10000);
        headerBlog.waitUntil(enabled.because("Blog is not enabled during 10 sec"), 10000);
        headerBlog.scrollTo();
        headerBlog.click();
    }

    @Step("header menu Open Source. Check and click on it")
    public void clickHeaderOpensource() {
        headerOpensource.waitUntil(visible.because("Open Source is not visible during 10 sec"), 10000);
        headerOpensource.waitUntil(enabled.because("Open Source is not enabled during 10 sec"), 10000);
        headerOpensource.scrollTo();
        headerOpensource.click();
    }

    @Step("header menu Careers. Check and click on it")
    public void clickHeaderCareers() {
        headerCareers.waitUntil(visible.because("Careers is not visible during 10 sec"), 10000);
        headerCareers.waitUntil(enabled.because("Careers is not enabled during 10 sec"), 10000);
        headerCareers.scrollTo();
        headerCareers.click();
    }

    @Step("header menu Contacts. Check and click on it")
    public void clickHeaderContacts() {
        headerContacts.waitUntil(visible.because("Contacts is not visible during 10 sec"), 10000);
        headerContacts.waitUntil(enabled.because("Contacts is not enabled during 10 sec"), 10000);
        headerContacts.scrollTo();
        headerContacts.click();
    }

    @Step("header menu About Us. Check and click on it")
    public void clickHeaderAboutUs() {
        headerAboutUs.waitUntil(visible.because("About Us is not visible during 10 sec"), 10000);
        headerAboutUs.waitUntil(enabled.because("About Us is not enabled during 10 sec"), 10000);
        headerAboutUs.scrollTo();
        headerAboutUs.click();
    }

}