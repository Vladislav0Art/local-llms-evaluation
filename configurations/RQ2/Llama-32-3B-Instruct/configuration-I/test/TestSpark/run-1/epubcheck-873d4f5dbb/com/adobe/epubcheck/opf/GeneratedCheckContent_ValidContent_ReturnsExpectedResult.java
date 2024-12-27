package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCheckContent_ValidContent_ReturnsExpectedResult {

    @Test
    public void checkContent_ValidContent_ReturnsExpectedResult() {
        //Arrange
        String content = "Valid Content";

        //Act
        boolean result = OPFChecker30.checkContent(content);

        //Assert
        assertTrue(result);
    }

}