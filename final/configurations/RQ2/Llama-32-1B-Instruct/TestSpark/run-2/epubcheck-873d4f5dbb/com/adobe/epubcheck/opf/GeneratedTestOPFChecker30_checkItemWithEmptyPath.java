package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkItemWithEmptyPath {

    @Test
    public void testOPFChecker30_checkItemWithEmptyPath() {
        // Arrange
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.checkItem(new OPFItem(), null);

        // Assert
        assertFalse(result);
    }

}