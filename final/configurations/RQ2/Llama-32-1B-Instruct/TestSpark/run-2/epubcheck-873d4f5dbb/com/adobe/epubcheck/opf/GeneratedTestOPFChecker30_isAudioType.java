package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isAudioType {

    @Test
    public void testOPFChecker30_isAudioType() {
        // Arrange
        String type = "audio";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isAudioType(type);

        // Assert
        assertTrue(result);
    }

}