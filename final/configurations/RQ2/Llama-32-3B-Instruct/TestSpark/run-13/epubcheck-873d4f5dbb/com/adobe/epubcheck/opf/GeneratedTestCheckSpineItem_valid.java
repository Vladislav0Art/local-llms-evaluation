package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCheckSpineItem_valid {

    @Test
    public void testCheckSpineItem_valid() {
        // Arrange
        SpineItem spineItem = new SpineItem("valid html", 1);

        // Act
        boolean result = new SpineItemChecker().checkSpineItem(spineItem, new OPFHandler());

        // Assert
        assertTrue(result);
    }

}