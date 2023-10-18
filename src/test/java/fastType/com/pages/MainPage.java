package fastType.com.pages;

import fastType.com.utilities.Driver;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {


    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='tst-input']/div[2]/span")
    public List<WebElement> spanList;


    public  void loopType(String word){

        Actions actions = new Actions(Driver.getDriver());

            actions.sendKeys(word + " ").perform();

    }
    public String loadData(){

        String source = Driver.getDriver().getPageSource();

        Document document = Jsoup.parse(source);

        List<Element> tstInput = document.getElementsByClass("tst-input");



        Document document1 = Jsoup.parse(tstInput.get(0).toString());

        List<Element> tstInputWrapper = document1.getElementsByClass("tst-input-wrapper");


        Document document2 = Jsoup.parse(tstInputWrapper.get(1).toString());

        List<Element> spanList =document2.getElementsByTag("span");



return spanList.get(0).text();
    }


}
