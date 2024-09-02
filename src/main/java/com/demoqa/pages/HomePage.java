package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
