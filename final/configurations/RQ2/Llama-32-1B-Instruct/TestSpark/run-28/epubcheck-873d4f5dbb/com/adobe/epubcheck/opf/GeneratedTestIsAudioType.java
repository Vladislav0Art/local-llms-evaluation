package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        assertEquals("audio", OPFChecker30.isAudioType("audio"));
        assertEquals("", OPFChecker30.isAudioType(""));
        assertEquals("application", OPFChecker30.isAudioType("application"));
        assertEquals("", OPFChecker30.isAudioType("application"));
    }

}