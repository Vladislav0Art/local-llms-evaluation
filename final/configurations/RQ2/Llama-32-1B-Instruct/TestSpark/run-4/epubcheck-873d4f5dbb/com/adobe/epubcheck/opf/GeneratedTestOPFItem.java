package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItem {

    @Test
    public void testOPFItem() {
        // Arrange
        String type = "audio/mpeg";
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "audio/mpeg");

        // Assert
        assertTrue(result);
        assertEquals(preferredMediaType, expectedPreferedsMediaTypes());
    }

}