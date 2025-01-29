package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType_PrefixesNotConsidered {

    @Test
    public void testIsCommonVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isCommonVideoType("prefix:commonvideo"));
    }

}