package com.adobe.epubcheck.opf;

public class GeneratedIsCommonVideoType_VideoTypesTest {

    @Test
    public void isCommonVideoType_VideoTypesTest() {
        // Given
        String type = "video/ogg";

        // When
        boolean result = OPFChecker30.class.getMethod("isCommonVideoType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}