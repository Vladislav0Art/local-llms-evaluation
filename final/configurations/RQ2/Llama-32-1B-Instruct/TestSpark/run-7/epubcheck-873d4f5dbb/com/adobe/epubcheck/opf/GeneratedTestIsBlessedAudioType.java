package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpeg"));
    }

}