package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isCommonVideoType {

    @Test
    public void testOPFChecker30_isCommonVideoType() {
        // Arrange
        String type = "video";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isCommonVideoType(type);

        // Assert
        assertTrue(result);
    }

}