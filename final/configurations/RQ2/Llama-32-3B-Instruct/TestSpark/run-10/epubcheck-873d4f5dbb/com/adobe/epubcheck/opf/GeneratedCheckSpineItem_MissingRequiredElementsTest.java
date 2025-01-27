package com.adobe.epubcheck.opf;

public class GeneratedCheckSpineItem_MissingRequiredElementsTest {

    @Test
    public void checkSpineItem_MissingRequiredElementsTest() {
        // Given
        ValidationContext context = new ValidationContext();

        // When
        boolean result = OPFChecker30.class.getMethod("checkSpineItem", Object[].class).invoke(null, (Object[]) new Object[]{});

        // Then
        assertFalse(result);
    }

}