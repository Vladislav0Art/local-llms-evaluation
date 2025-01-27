package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaType_DifferentMediaTypesTest {

    @Test
    public void getPreferredMediaType_DifferentMediaTypesTest() {
        // Given
        String type = "image/jpeg";
        String path = "path/to/media";

        // When
        String result = OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, type, path);

        // Then
        assertEquals(type, result);
    }

}