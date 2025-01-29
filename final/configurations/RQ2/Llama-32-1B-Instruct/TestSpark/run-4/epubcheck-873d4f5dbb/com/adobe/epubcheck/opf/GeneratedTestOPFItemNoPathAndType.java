package com.adobe.epubcheck.opf;

public class GeneratedTestOPFItemNoPathAndType {

    @Test
    public void testOPFItemNoPathAndType() {
        // Arrange
        String type = "";
        OPFItem item = new OPFItem("Audio", "");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

}