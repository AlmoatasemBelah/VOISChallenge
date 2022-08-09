//package BrowserActions;
//
//import Drivers.Chrome;
//import org.junit.Assert;
//import org.openqa.selenium.*;
//import ExcelReader.ExcelReader;
//import java.io.IOException;
//import java.util.List;
//public class chromeActions {
//
////    public static WebDriver getChromeDriver(){
////        return Chrome.getChrome();
////    }
////    public static void setChromeDriver(){
////        Chrome.setChrome();
////    }
//
//    public static void maxmize(){
//        getChromeDriver().manage().window().maximize();
//    }
//
//    public static void chromeNavigate() throws IOException {
//        getChromeDriver().get(ExcelReader.Website());
//        org.testng.Assert.assertEquals("https://www.google.co.uk/", chromeActions.getURl());
//    }
//    public static void Write(String Element , String search){
//        getChromeDriver().findElement(By.cssSelector(Element)).sendKeys(search, Keys.ENTER);
//    }
//    public static WebElement getElement(String element){
//        return getChromeDriver().findElement(By.cssSelector(element));
//    }
//    public static List<WebElement> countElements(String element){
//        return getChromeDriver().findElements(By.cssSelector(element));
//    }
//    public static String getURl(){
//        return getChromeDriver().getCurrentUrl();
//    }
//
//    public static String gettext(String element){
//        return getChromeDriver().findElement(By.cssSelector(element)).getText();
//    }
//
//    public static void chromeSearch() throws IOException {
//        chromeActions.Write("[class=\"gLFyf gsfi\"]",ExcelReader.searchWord());
//        Assert.assertEquals(chromeActions.getURl().contains("Vodafone"), true);
//    }
//
//    public static int NumLinks2() {
//        // get number of links located in the second page
//        List<WebElement> secondPage = chromeActions.countElements("[class=\"LC20lb MBeuO DKV0Md\"]");
//        return secondPage.size();
//    }
//
//    public static int NumLinks3() {
//        // get number of links located in the thirdpage page
//        List<WebElement> thirdPage = chromeActions.countElements("[class=\"LC20lb MBeuO DKV0Md\"]");
//        return thirdPage.size();
//    }
//    public static void chrome2ndPage(){
//        // select on second page in the pagination tab
//        chromeActions.getElement("[aria-label=\"Page 2\"]").click();
//
//        org.testng.Assert.assertEquals(chromeActions.gettext("[id=\"result-stats\"]").contains("Page 2"), true);
//    }
//
//    public static void chrome3rdPage(){
//        // select on third page in the pagination tab
//        chromeActions.getElement("[aria-label=\"Page 3\"]").click();
//        org.testng.Assert.assertEquals(chromeActions.gettext("[id=\"result-stats\"]").contains("Page 3"), true);
//    }
//
//    public static void AssertNum(){
//        Assert.assertEquals(chromeActions.NumLinks2(),chromeActions.NumLinks3());
//    }
//
//    public static void close(){
//        getChromeDriver().close();
//    }
//
//}
