package com.admindemonop;

import com.admindemonop.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.myBrowser();
        driverManager.maxWindow();
    }

   @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
