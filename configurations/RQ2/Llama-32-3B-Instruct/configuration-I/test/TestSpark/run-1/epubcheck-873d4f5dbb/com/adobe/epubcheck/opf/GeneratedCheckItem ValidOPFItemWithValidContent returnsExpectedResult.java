package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCheckItem ValidOPFItemWithValidContent returnsExpectedResult {

    @Test
    public void checkItem

    ValidOPFItemWithValidContent returnsExpectedResult() {
        //Arrange
        OPFItem item = new OPFItem();
        List<String> content = List.of("content", "with valid");

        //Act
        boolean result = OPFChecker30.checkItem(item, () -> {
        });

        //Assert
        assertTrue(result);
    }

}