package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoHandlerAndItemAndContent {

    @Test
    public void testOPFItemNoHandlerAndItemAndContent() {
        // Arrange
        boolean checkItemAfterResourceValidationResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");
        boolean checkContentResult = true;

        // Act
        checkItemAfterResourceValidation(item);
        checkItem(item, null);

        // Assert
        assertTrue(checkItemAfterResourceValidationResult);
        assertTrue(checkContentResult);
    }

    private static Set<String> expectedPreferedsMediaTypes() {
        return Set.of("audio/mpeg");
    }

}