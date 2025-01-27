package com.adobe.epubcheck.opf;

public class GeneratedCheckContent_NoExceptionsTest {

    @Test
    public void checkContent_NoExceptionsTest() {
        // Given
        ValidationContext context = new ValidationContext();

        // When
        boolean result = OPFChecker30.class.getMethod("checkContent", Object[].class).invoke(null, (Object[]) new Object[]{});

        // Then
        assertTrue(result);
    }

}