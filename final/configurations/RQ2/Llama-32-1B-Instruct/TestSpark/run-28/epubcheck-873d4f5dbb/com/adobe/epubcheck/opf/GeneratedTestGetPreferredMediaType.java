package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        String[] types = {"audio", "blessed audio", "video", "blessed video"};
        for (String type : types) {
            assertEquals("application/x-mpegurl", OPFChecker30.getPreferredMediaType(type, ""));
        }
    }

}