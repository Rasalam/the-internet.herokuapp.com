package com.herokuapp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElementPage {

    private final SelenideElement heading = $(byId("content"));
    private final SelenideElement addButton = $(byText("Add Element"));
    private final SelenideElement addButton1 = $("[onclick='addElement()']");
    private final SelenideElement deleteButton = $("[onclick='deleteElement()']");


    public AddRemoveElementPage() {
        heading.shouldBe(visible).shouldBe(exactText("Add/Remove Elements"));
    }

    public void addOneElement() {
        addButton.click();

    }

    public void addTwoElement() {
        addButton.click();
        addButton.click();
    }

//
//    public void clearForm() {
//        cardNumberElement.click();
//        cardNumberElement.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//        monthElement.click();
//        monthElement.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//        yearElement.click();
//        yearElement.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//        ownerElement.click();
//        ownerElement.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//        cvvElement.click();
//        cvvElement.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//    }
//
//    public void shouldChangeInscriptionOnButton() {
//        expectationButton.shouldBe(visible, Duration.ofSeconds(15));
//    }
//
//    public void closePopUpNotification() {
//        closeNoticeButton.click();
//    }
//
//    public void shouldShowApprovedNotice() {
//        noticeApproved.shouldBe(visible, Duration.ofSeconds(10));
//    }
//
//    public void shouldShowDeclinedNotice() {
//        noticeDeclined.shouldBe(visible, Duration.ofSeconds(10));
//    }
//
//    public void shouldShowNoticeIfFiledIsEmpty() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Поле обязательно для заполнения"));
//    }
//
//    public void shouldShowNoticeIfCardNumberIsInvalid() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Проверьте номер карты"));
//    }
//
//    public void shouldShowNoticeIfExpireDateIsInvalid() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Неверно указан срок действия карты"));
//    }
//
//
//    public void shouldShowNoticeIfCardExpired() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Истёк срок действия карты"));
//    }
//
//    public void shouldShowNoticeIfOwnerContainInvalidSymbols() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Допустимы латинские символы, знаки \"-\", \".\", \"'\""));
//    }
//
//    public void shouldShowNoticeIfOwnerContainsOneLetter() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Поле должно содержать не менее двух символов"));
//    }
//
//    public void shouldShowNoticeIfOwnerContainsOverTwentySixSymbols() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Длина поля не может превышать 26 символов"));
//    }
//
//    public void shouldShowNoticeIfCVVIsInvalid() {
//        noticeErrorFiled.shouldBe(visible).shouldHave(text("Проверьте защитный код карты"));
//    }

}