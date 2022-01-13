package com.twitter.ui;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static MainPage open() throws InterruptedException {
        Selenide.open("");
        Thread.sleep(5000);
        return new MainPage();
    }

    public void loginAs(String username, String password,String name) {
        $(byXpath("//*[contains(text(),'Sign in')]")).click();
        $(byXpath("//input[@name='text']")).hover().setValue(username);
        $(byXpath("//*[contains(text(),'Next')]")).click();
        $(byXpath("//input[@inputmode='text']")).setValue(name);
        $(byXpath("//*[contains(text(),'Next')]")).click();
        $(byXpath("//*[@name='password']")).setValue(password);
        $(byXpath("//div[@class='css-1dbjc4n']//*[contains(text(),'Log in')]")).click();

    }
}
