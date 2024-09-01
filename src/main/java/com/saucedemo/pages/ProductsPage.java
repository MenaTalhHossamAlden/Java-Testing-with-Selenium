package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//span[text()='products']");

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
