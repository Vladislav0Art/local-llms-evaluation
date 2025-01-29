package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType_SimpleCase {

    @Test
    public void testIsBlessedAudioType_SimpleCase() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("blessed audio"));
    }

}