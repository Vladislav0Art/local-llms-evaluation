package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isFontType {

    @Test
    public void testOPFChecker30_isFontType() {
        // Arrange
        String type = "font";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isFontType(type);

        // Assert
        assertTrue(result);
    }

}