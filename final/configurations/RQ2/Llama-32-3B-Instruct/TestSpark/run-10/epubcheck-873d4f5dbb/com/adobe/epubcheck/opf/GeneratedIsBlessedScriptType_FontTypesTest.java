package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedScriptType_FontTypesTest {

    @Test
    public void isBlessedScriptType_FontTypesTest() {
        // Given
        String type = "application/x-javascript";

        // When
        boolean result = OPFChecker30.class.getMethod("isBlessedScriptType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}