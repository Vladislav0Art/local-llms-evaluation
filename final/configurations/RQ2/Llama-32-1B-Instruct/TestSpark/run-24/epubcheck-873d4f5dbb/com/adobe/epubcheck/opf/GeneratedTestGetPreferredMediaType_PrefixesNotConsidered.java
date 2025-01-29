package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_PrefixesNotConsidered {

    @Test
    public void testGetPreferredMediaType_PrefixesNotConsidered() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("prefix:audio/video/test", "test"));
    }

}