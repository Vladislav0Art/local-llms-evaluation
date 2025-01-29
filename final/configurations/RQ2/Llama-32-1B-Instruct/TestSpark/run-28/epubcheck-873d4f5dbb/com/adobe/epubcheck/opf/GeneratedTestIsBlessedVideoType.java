package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        assertEquals("application/x-mpegurl", OPFChecker30.isBlessedVideoType("video"));
        assertEquals("", OPFChecker30.isBlessedVideoType(""));
        assertEquals("application/x-mpegurl", OPFChecker30.isBlessedVideoType("mpeg"));
        assertEquals("", OPFChecker30.isBlessedVideoType("mpeg"));
    }

}