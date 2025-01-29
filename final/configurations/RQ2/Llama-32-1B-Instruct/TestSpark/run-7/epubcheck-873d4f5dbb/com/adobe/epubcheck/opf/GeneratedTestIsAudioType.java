package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("image/jpeg"));
    }

}