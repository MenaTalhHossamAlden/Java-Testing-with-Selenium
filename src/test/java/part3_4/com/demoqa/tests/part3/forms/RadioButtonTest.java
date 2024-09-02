package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.pages.Forms.FormsPage;
import com.demoqa.pages.Forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        PracticeFormPage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        Assert.assertTrue(formsPage.isFemaleRadioSelected(), "\n\n Female Radio Button Is Not Selected.\n");
    }
}
