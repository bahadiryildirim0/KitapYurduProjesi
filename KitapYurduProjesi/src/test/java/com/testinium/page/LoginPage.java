package com.testinium.page;

import com.testinium.methods.methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    methods methods;

    public LoginPage(){
        methods=new methods();
    }
    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"bahadir.yildirim@testinium.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"1Q2w3e4r5t");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));

    }

}
