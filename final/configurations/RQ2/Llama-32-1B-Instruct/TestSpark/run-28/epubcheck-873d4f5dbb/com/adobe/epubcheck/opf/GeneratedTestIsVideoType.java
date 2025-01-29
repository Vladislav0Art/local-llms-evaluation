package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        assertEquals("video/mp4", OPFChecker30.isVideoType("video"));
        assertEquals("", OPFChecker30.isVideoType(""));
        assertEquals("video/mpeg", OPFChecker30.isVideoType("mpeg"));
        assertEquals("", OPFChecker30.isVideoType("mpeg"));
    }

}