package GoogleTests;

import BrowserActions.BrowserActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearch {
    List<WebElement> secondPage;
    List<WebElement> thirdPage;


    @Given("Desired {string} is openned")
    public void desired_is_openned(String browserType) {
        BrowserActions.newDriver(browserType);
        BrowserActions.maximize();
    }

    @When("User searches {string} using {string} and navigates to 2nd page")
    public void user_searches_using_and_navigates_to_2nd_page(String link, String searchText) throws InterruptedException {
        BrowserActions.navigate(link);
        BrowserActions.search("Name", "q", searchText);
        while (!BrowserActions.isElementPresent("css", "[aria-label=\"Page 2\"]")){
            System.out.println("page is still loading");
        }
        BrowserActions.click("css", "[aria-label=\"Page 2\"]");
    }

    @When("User checks number of links of 2nd and 3rd page")
    public void user_checks_number_of_links_of_2nd_and_3rd_page() throws InterruptedException {
        secondPage = BrowserActions.elementsListCreator("css", "[class=\"LC20lb MBeuO DKV0Md\"]");
        BrowserActions.click("css", "[aria-label=\"Page 3\"]");
        thirdPage = BrowserActions.elementsListCreator("css", "[class=\"LC20lb MBeuO DKV0Md\"]");
    }

    @Then("Number of links on 2nd page matches 3rd page")
    public void number_of_links_on_2nd_page_matches_3rd_page() {
        Assert.assertEquals("Number of links on both pages do not match",secondPage.size(),thirdPage.size());
    }
}
