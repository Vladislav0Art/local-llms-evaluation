package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoHandlerAndItem {

    @Test
    public void testOPFItemNoHandlerAndItem() {
        // Arrange
        boolean checkSpineItemResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkSpineItem(item, null);

        // Assert
        assertTrue(checkSpineItemResult);
    }

}