package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoHandler {

    @Test
    public void testOPFItemNoHandler() {
        // Arrange
        boolean checkItemAfterResourceValidationResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkItemAfterResourceValidation(item);

        // Assert
        assertTrue(checkItemAfterResourceValidationResult);
    }

}