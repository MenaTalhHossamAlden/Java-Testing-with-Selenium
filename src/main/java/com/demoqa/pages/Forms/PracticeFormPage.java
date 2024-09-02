package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton =By.id("#gender-radio-2");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioSelected() {
        return find(femaleRadioButton).isSelected();
    }
}
