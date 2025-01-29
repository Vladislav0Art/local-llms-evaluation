package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isBlessedAudioType {

    @Test
    public void testOPFChecker30_isBlessedAudioType() {
        // Arrange
        String type = "audio";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isBlessedAudioType(type);

        // Assert
        assertTrue(result);
    }

}