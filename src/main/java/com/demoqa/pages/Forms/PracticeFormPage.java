package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton =By.id("#gender-radio-2");
    private By sportsHobbyCheckbox = By.id("#hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("#hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("#hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckbox() {
        if(!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        if(!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        if(!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckbox() {
        if(find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }
}
