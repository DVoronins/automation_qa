package lv.acodemy.step_defination;

import io.cucumber.java.en.Given;
import lv.acodemy.page_object.ProductsPage;

public class ProductsPageSteps {
    private final ProductsPage productsPage = new ProductsPage();

    @Given("user selects {string} product from list")
    public void user_selects_product_from_list(String productName) {
        productsPage.clickOnProductByName(productName);


    }
}