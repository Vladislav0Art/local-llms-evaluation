package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType_PrefixesNotConsidered {

    @Test
    public void testIsBlessedAudioType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedAudioType("prefix:blessedaudio"));
    }

}