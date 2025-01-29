package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/x-shockwave-flash"));
        assertFalse(OPFChecker30.isBlessedScriptType("image/jpeg"));
    }

}