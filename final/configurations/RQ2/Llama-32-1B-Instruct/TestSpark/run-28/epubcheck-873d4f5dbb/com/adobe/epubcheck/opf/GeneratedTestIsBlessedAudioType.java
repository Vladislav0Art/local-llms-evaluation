package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        assertEquals("application/ogg", OPFChecker30.isBlessedAudioType("audio"));
        assertEquals("", OPFChecker30.isBlessedAudioType(""));
        assertEquals("application/ogg", OPFChecker30.isBlessedAudioType("ogg"));
        assertEquals("", OPFChecker30.isBlessedAudioType("ogg"));
    }

}