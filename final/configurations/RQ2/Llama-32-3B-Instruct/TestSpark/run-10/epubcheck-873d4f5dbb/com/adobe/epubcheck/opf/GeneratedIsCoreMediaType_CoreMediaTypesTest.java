package com.adobe.epubcheck.opf;

public class GeneratedIsCoreMediaType_CoreMediaTypesTest {

    @Test
    public void isCoreMediaType_CoreMediaTypesTest() {
        // Given
        String type = "application/epub+zip";

        // When
        boolean result = OPFChecker30.class.getMethod("isCoreMediaType", String.class).invoke(null, type);

        // Then
        assertTrue(result);
    }

}