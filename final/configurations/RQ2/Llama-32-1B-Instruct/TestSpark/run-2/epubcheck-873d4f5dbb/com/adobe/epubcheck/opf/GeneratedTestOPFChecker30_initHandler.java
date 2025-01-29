package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_initHandler {

    @Test
    public void testOPFChecker30_initHandler() {
        // Arrange
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        checker.initHandler();

        // Assert
        verifyNothingtimes(1, any(ValidationContext.class));
    }

}