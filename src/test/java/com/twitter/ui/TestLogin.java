package com.twitter.ui;
import com.twitter.ui.MainPage;
import org.testng.annotations.Test;


public class TestLogin extends BaseUI {

    @Test
    public void userCanLoginWithValidCredentials() throws InterruptedException {
        MainPage.open()
                .loginAs("test1488001@gmail.com", "test12346!","TestNam40911417");


    }

}
