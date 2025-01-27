package com.adobe.epubcheck.opf;

public class GeneratedIsFontType_FontTypesTest {

    @Test
    public void isFontType_FontTypesTest() {
        // Given
        String type = "font/woff2";

        // When
        boolean result = OPFChecker30.class.getMethod("isFontType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}