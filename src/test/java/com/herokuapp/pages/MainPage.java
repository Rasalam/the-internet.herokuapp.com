package com.herokuapp.pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class MainPage {

    private final SelenideElement heading = $("[class='heading'");
    private final SelenideElement ABTesting = $(byLinkText("A/B Testing"));
    private final SelenideElement addRemoveElements = $(byText("Add/Remove Elements"));
    private final SelenideElement basicAuth = $(byText("Basic Auth"));
    private final SelenideElement brokenImages = $(byText("Broken Images"));
    private final SelenideElement challengingDOM = $(byText("Challenging DOM"));
    private final SelenideElement checkboxes = $(byText("Checkboxes"));
    private final SelenideElement contextMenu = $(byText("Context Menu"));
    private final SelenideElement digestAuthentication = $(byText("Digest Authentication"));
    private final SelenideElement disappearingElements = $(byText("Disappearing Elements"));
    private final SelenideElement dragAndDrop = $(byText("Drag and Drop"));
    private final SelenideElement dropdown = $(byText("Dropdown"));
    private final SelenideElement dynamicContent = $(byText("Dynamic Content"));
    private final SelenideElement dynamicControls = $(byText("Dynamic Controls"));
    private final SelenideElement dynamicLoading = $(byText("Dynamic Loading"));
    private final SelenideElement entryAd = $(byText("Entry Ad"));
    private final SelenideElement exitIntent = $(byText("Exit Intent"));
    private final SelenideElement fileDownload = $(byText("File Download"));
    private final SelenideElement fileUpload = $(byText("File Upload"));
    private final SelenideElement floatingMenu = $(byText("Floating Menu"));
    private final SelenideElement forgotPassword = $(byText("Forgot Password"));
    private final SelenideElement formAuthentication = $(byText("Form Authentication"));
    // TODO: 09.02.2023 : создать отдельную pageObject для элементов Frames на этой странице
    private final SelenideElement frames = $(byText("Frames"));
    private final SelenideElement geolocation = $(byText("Geolocation"));
    private final SelenideElement horizontalSlider = $(byText("Horizontal Slider"));
    private final SelenideElement hovers = $(byText("Hovers"));
    private final SelenideElement infiniteScroll = $(byText("Infinite Scroll"));
    private final SelenideElement inputs = $(byText("Inputs"));
    private final SelenideElement jQueryUIMenus = $(byText("JQuery UI Menus"));
    private final SelenideElement javaScriptAlerts = $(byText("JavaScript Alerts"));
    private final SelenideElement JavaScriptOnloadEventError = $(byText("JavaScript onload event error"));
    private final SelenideElement keyPresses = $(byText("Key Presses"));
    private final SelenideElement largeAndDeepDOM = $(byText("Large & Deep DOM"));
    private final SelenideElement multipleWindows = $(byText("Multiple Windows"));
    private final SelenideElement nestedFrames = $(byText("Nested Frames"));
    private final SelenideElement notificationMessages = $(byText("Notification Messages"));
    private final SelenideElement redirectLink = $(byText("Redirect Link"));
    private final SelenideElement secureFileDownload = $(byText("Secure File Download"));
    private final SelenideElement shadowDOM = $(byText("Shadow DOM"));
    // TODO: 09.02.2023 : создать отдельную pageObject для элементов Shifting Content
    private final SelenideElement shiftingContent = $(byText("Shifting Content"));
    private final SelenideElement slowResources = $(byText("Slow Resources"));
    private final SelenideElement sortableDataTables = $(byText("Sortable Data Tables"));
    private final SelenideElement statusCodes = $(byText("Status Codes"));
    private final SelenideElement typos = $(byText("Typos"));
    private final SelenideElement WYSIWYGEditor = $(byText("WYSIWYG Editor"));


    public MainPage() {
        heading.shouldBe(visible).shouldBe(exactText("Welcome to the-internet"));
    }

    public ABTestingPage getABTestingPage() {
        ABTesting.click();
        return new ABTestingPage();
    }

    public AddRemoveElementPage getAddRemoveElementsPage() {
        addRemoveElements.click();
        return new AddRemoveElementPage();
    }
}