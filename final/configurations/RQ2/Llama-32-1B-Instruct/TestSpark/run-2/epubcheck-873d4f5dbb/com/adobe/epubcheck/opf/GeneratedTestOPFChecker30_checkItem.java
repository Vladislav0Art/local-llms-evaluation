package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkItem {

    @Test
    public void testOPFChecker30_checkItem() {
        // Arrange
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result1 = checker.checkItem(null, null);
        boolean result2 = checker.checkItem(new OPFItem(), null);

        // Assert
        assertTrue(result1 && result2);
    }

}