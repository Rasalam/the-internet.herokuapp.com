package com.herokuapp.tests;

import com.herokuapp.pages.AddRemoveElementPage;
import com.herokuapp.pages.MainPage;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;



public class AddRemoveElementTest {
    private AddRemoveElementPage addRemoveElement;

    @BeforeEach
    public void setUp() {
        open("http://localhost:7080/");

    }

    @Test
    @DisplayName("01. Check for adding one element")
    void shouldAddingOneElement() {
        addRemoveElement = MainPage.
        addRemoveElement.addOneElement();



    }


}