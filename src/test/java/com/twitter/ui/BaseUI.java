package com.twitter.ui;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;


public class BaseUI {


    @BeforeSuite
    public void setUp() throws InterruptedException {
        Configuration.baseUrl = "https://twitter.com";
        Configuration.browser = "com.twitter.ui.SelenoidDriverProvider";
    }

    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }

}
