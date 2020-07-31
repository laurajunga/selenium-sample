package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static final String URL = "https://ctco.lv/en";

    @FindBy(xpath = "//a[contains(@href, 'careers') and text()='Careers']")
    private WebElement careersMenu;
    @FindBy(xpath = "//a[contains(@href, 'vacancies') and text()='Vacancies']")
    private WebElement vacancies;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(URL);
        return this;
    }

    public HomePage openCareersMenu() {
        waitForElementToBeVisible(careersMenu).click();
        return this;
    }

    public VacanciesPage selectVacanciesMenuOption() {
        waitForElementToBeVisible(vacancies).click();
        return new VacanciesPage(driver);
    }
}
