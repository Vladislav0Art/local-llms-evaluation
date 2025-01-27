package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedVideoType_VideoTypesTest {

    @Test
    public void isBlessedVideoType_VideoTypesTest() {
        // Given
        String type = "application/x-xp2";

        // When
        boolean result = OPFChecker30.class.getMethod("isBlessedVideoType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}