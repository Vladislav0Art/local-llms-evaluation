package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType_PrefixesNotConsidered {

    @Test
    public void testIsFontType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isFontType("prefix:font"));
    }

}