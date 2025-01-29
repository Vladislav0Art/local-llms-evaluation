package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType_PrefixesNotConsidered {

    @Test
    public void testIsBlessedFontType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedFontType("prefix:blessedfont"));
    }

}