package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BaseTest {
    @Test
    public void LoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

}