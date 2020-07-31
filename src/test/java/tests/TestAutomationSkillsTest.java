package tests;

import org.testng.annotations.Test;
import pageFactory.HomePage;
import util.Driver;

import static org.testng.Assert.assertEquals;

public class TestAutomationSkillsTest extends BaseTest {
    @Test
    public void test() {
        int actualSkillCount = new HomePage(Driver.getDriver())
                .openHomePage()
                .openCareersMenu()
                .selectVacanciesMenuOption()
                .selectTAVacancy()
                .countSkills();
        assertEquals(actualSkillCount, 5);
    }
}
