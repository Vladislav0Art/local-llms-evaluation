package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("image/jpeg"));
    }

}