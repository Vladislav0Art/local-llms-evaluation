package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedAudioType_AudioTypesTest {

    @Test
    public void isBlessedAudioType_AudioTypesTest() {
        // Given
        String type = "application/screencapture";

        // When
        boolean result = OPFChecker30.class.getMethod("isBlessedAudioType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}