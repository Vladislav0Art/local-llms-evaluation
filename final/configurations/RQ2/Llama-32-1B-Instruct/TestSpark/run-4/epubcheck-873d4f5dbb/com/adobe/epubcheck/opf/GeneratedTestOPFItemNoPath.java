package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoPath {

    @Test
    public void testOPFItemNoPath() {
        // Arrange
        String type = "audio/mpeg";
        OPFItem item = new OPFItem("Audio", "");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

}