package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedFontType_FontTypesTest {

    @Test
    public void isBlessedFontType_FontTypesTest() {
        // Given
        String type = "font/otf";

        // When
        boolean result = OPFChecker30.class.getMethod("isBlessedFontType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}