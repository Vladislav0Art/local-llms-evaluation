package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCheckContent ValidContent returnsExpectedResult {

    @Test
    public void checkContent

    ValidContent returnsExpectedResult() {
        //Arrange
        String content = "Valid Content";

        //Act
        boolean result = OPFChecker30.checkContent(content);

        //Assert
        assertTrue(result);
    }

}