package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType_PrefixesNotConsidered {

    @Test
    public void testIsBlessedVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedVideoType("prefix:blessedvideo"));
    }

}