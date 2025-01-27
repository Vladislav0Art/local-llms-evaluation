package com.adobe.epubcheck.opf;

public class GeneratedCheckPackage_MissingRequiredElementsTest {

    @Test
    public void checkPackage_MissingRequiredElementsTest() {
        // Given
        OPFItem item = mock(OPFItem.class);
        EPUBLocation location = new EPUBLocation();
        ValidationContext context = new ValidationContext();

        // When
        boolean result = OPFChecker30.class.getMethod("checkPackage", Object[].class).invoke(null, (Object[]) new Object[]{item, location, context});

        // Then
        assertFalse(result);
    }

}