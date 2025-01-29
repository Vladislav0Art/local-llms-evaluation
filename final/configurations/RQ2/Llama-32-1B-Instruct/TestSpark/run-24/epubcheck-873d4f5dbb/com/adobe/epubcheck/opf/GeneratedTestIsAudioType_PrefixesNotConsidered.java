package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType_PrefixesNotConsidered {

    @Test
    public void testIsAudioType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isAudioType("prefix:audio"));
    }

}