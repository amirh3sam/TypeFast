package fastType.com.stepDefs;

import fastType.com.pages.MainPage;
import fastType.com.utilities.BrowserUtils;
import fastType.com.utilities.ConfigurationReader;
import fastType.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import javax.print.attribute.standard.DocumentName;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class T01_TestCase01 {
    MainPage page = new MainPage();

    @Given("user is on the learning website how to type fast")
    public void user_is_on_the_learning_website_how_to_type_fast() {

        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));

    }

    @Then("user start typying")
    public void user_start_typying() {
        int i = 0 ;

        while( i < 507){
            String data = page.loadData();
            page.loopType(data);
            i++;
        }
    }

}
