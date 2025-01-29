package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType_PrefixesNotConsidered {

    @Test
    public void testIsBlessedScriptType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedScriptType("prefix:blessedscript"));
    }

}