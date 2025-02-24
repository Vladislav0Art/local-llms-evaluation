package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkContent();

        // Assert
        assertEquals(true, result);
    }

}