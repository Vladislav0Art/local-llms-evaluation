package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkContent {

    @Test
    public void testOPFChecker30_checkContent() {
        // Arrange
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.checkContent();

        // Assert
        assertFalse(result);
    }

}