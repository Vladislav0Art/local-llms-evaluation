package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isBlessedFontType {

    @Test
    public void testOPFChecker30_isBlessedFontType() {
        // Arrange
        String type = "font";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isBlessedFontType(type);

        // Assert
        assertTrue(result);
    }

}