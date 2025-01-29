package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkPackage {

    @Test
    public void testOPFChecker30_checkPackage() {
        // Arrange
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.checkPackage();

        // Assert
        assertFalse(result);
    }

}