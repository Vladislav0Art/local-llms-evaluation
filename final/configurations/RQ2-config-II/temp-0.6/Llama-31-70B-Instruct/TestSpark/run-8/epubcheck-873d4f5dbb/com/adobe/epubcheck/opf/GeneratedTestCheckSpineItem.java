package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCheckSpineItem {

    @Test
    public void testCheckSpineItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkSpineItem(new OPFItem(), new OPFHandler());

        // Assert
        assertEquals(true, result);
    }

}