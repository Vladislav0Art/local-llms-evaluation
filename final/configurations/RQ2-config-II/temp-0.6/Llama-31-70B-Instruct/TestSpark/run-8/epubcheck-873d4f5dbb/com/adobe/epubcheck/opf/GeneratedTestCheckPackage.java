package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkPackage();

        // Assert
        assertEquals(true, result);
    }

}