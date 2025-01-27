package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaType_NullPathTest {

    @Test
    public void getPreferredMediaType_NullPathTest() {
        // Given
        String type = "image/jpeg";
        String path = null;

        // When
        String result = OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, type, path);

        // Then
        assertEquals("", result);
    }

}