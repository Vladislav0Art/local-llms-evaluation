package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isBlessedVideoType {

    @Test
    public void testOPFChecker30_isBlessedVideoType() {
        // Arrange
        String type = "video";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isBlessedVideoType(type);

        // Assert
        assertTrue(result);
    }

}