package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkItem(new OPFItem(), new OPFHandler());

        // Assert
        assertEquals(true, result);
    }

}