package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isVideoType {

    @Test
    public void testOPFChecker30_isVideoType() {
        // Arrange
        String type = "video";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isVideoType(type);

        // Assert
        assertTrue(result);
    }

}