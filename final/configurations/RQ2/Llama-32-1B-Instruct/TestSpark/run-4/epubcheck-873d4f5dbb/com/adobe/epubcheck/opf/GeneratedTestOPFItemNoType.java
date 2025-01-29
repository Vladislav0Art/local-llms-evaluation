package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoType {

    @Test
    public void testOPFItemNoType() {
        // Arrange
        String type = "";
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

}