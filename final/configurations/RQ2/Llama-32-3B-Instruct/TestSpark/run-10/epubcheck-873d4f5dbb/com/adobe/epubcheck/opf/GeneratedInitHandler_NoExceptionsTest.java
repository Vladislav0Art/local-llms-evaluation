package com.adobe.epubcheck.opf;

public class GeneratedInitHandler_NoExceptionsTest {

    @Test
    public void initHandler_NoExceptionsTest() {
        // Given
        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);

        // When
        boolean result = checker.initHandler();

        // Then
        assertTrue(result);
    }

}