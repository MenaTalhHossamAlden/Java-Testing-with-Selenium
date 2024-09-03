package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        PracticeFormPage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();

        Assert.assertFalse(formsPage.isReadingSelected(), "\n \n Reading Checkbox Is Selected \n");
    }
}
