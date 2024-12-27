package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCheckItem_ValidOPFItemWithValidContent_ReturnsExpectedResult {

    @Test
    public void checkItem_ValidOPFItemWithValidContent_ReturnsExpectedResult() {
        //Arrange
        OPFItem item = new OPFItem();
        List<String> content = List.of("content", "with valid");

        //Act
        boolean result = OPFChecker30.checkItem(item, opfHandler -> {
        });

        //Assert
        assertTrue(result);
    }

}