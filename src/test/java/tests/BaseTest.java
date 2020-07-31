package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.Driver;
import util.exceptions.UnsupportedBrowserException;

public class BaseTest {

    @BeforeTest
    public void beforeTest() throws UnsupportedBrowserException {
        Driver.createDriverInstance();
    }

    @AfterTest
    public void afterTest() {
        Driver.killDriverInstance();
    }
}
