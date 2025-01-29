package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType_PrefixesNotConsidered {

    @Test
    public void testIsCoreMediaType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isCoreMediaType("prefix:coremedia-type"));
    }

}