package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("image/jpeg"));
    }

}