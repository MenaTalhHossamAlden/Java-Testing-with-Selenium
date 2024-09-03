package part3_4.com.demoqa.tests.part3.elements;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.elements.WebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "kierra@example.com";
        String expectedAge = "34";

        ElementsPage elementsPage = homePage.goToElements();
        WebTablesPage webTablesPage = elementsPage.clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge(expectedAge);
        webTablesPage.clickSubmitButton();
        String actualAge = webTablesPage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual & Expected Ages Do Not Match \n");
    }
}