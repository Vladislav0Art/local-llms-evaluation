package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        String mediaType = OPFChecker30.getPreferredMediaType("video/mp4", "/path/to/video");
        assertEquals("video/mp4", mediaType);
    }

}