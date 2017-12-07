package com.opentext.appworks.Tests;

import com.opentext.appworks.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.logging.Logger;

public class LoginScreenTest {

    private static final String LOGIN_URL = "http://some.appworks.gateway:8080/#/login";
    private static final String VALID_USERNAME = "otag-build";
    private static final String VALID_PASSWORD = "otag";

    private static final String CHROMEDRIVER_ENV_VAR = "CHROMEDRIVER";

    private WebDriver driver;

    public static WebDriverWait wait;

    public static final Logger LOGGER = Logger.getLogger(LoginScreenTest.class.getName());

    LoginPage loginPage = new LoginPage(driver);

    @Before
    public void beforeEach() {
        createDriver();
        driver.manage().window().maximize();
        // GET the page under test
        driver.get(LOGIN_URL);
    }

    private void createDriver() {
        // the Chrome driver has to be in a known location and has to be set as a system property thus
        String chromeDriverLocation = System.getenv(CHROMEDRIVER_ENV_VAR);
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        driver = new ChromeDriver();
    }

    @After
    public void teardown() throws IOException {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^the login view is currently displayed$")
    public void theLoginViewIsCurrentlyDisplayed() throws Throwable {
        wait = new WebDriverWait(driver, 10, 10);
        wait.until(ExpectedConditions.titleContains("Login"));
        LOGGER.info("Finish verifying page title");
        throw new PendingException();
    }

    @When("^the username field is not populated$")
    public void theUsernameFieldIsNotPopulated() throws Throwable {
        LOGGER.info("username field is empty");
        throw new PendingException();
    }

    @Then("^the submit button should be disabled$")
    public void theSubmitButtonShouldBeDisabled() throws Throwable {
        loginPage.submitButtonCheck();
        throw new PendingException();
    }

    @When("^the password field is not populated$")
    public void thePasswordFieldIsNotPopulated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
