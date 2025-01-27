package com.adobe.epubcheck.opf;

public class GeneratedIsAudioType_AudioTypesTest {

    @Test
    public void isAudioType_AudioTypesTest() {
        // Given
        String type = "audio/mpeg";

        // When
        boolean result = OPFChecker30.class.getMethod("isAudioType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}