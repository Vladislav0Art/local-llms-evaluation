package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoContent {

    @Test
    public void testOPFItemNoContent() {
        // Arrange
        boolean checkContentResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkItem(item, null);

        // Assert
        assertTrue(checkContentResult);
    }

}