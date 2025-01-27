package com.adobe.epubcheck.opf;

public class GeneratedIsVideoType_VideoTypesTest {

    @Test
    public void isVideoType_VideoTypesTest() {
        // Given
        String type = "video/mp4";

        // When
        boolean result = OPFChecker30.class.getMethod("isVideoType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}