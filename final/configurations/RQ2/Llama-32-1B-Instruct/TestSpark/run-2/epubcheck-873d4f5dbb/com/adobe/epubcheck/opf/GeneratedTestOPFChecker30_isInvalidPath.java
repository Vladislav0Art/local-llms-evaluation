package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isInvalidPath {

    @Test
    public void testOPFChecker30_isInvalidPath() {
        // Arrange
        String type = "audio";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isAudioType(type);

        // Assert
        assertFalse(result);
    }

}