package com.adobe.epubcheck.opf;

public class GeneratedCheckItem_MissingRequiredElementsTest {

    @Test
    public void checkItem_MissingRequiredElementsTest() {
        // Given
        ValidationContext context = new ValidationContext();

        // When
        boolean result = OPFChecker30.class.getMethod("checkItem", Object[].class).invoke(null, (Object[]) new Object[]{});

        // Then
        assertFalse(result);
    }

}