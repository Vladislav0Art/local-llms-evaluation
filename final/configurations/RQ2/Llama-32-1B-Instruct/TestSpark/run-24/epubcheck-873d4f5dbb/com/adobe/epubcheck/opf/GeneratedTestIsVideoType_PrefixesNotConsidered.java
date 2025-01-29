package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType_PrefixesNotConsidered {

    @Test
    public void testIsVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isVideoType("prefix:videov"));
    }

}