package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        assertEquals("application/x-xhtml+http://www.w3.org/1999/xhtml", OPFChecker30.isBlessedScriptType("script"));
        assertEquals("", OPFChecker30.isBlessedScriptType(""));
        assertEquals("application/x-xhtml+http://www.w3.org/1999/xhtml", OPFChecker30.isBlessedScriptType("xhtml"));
        assertEquals("", OPFChecker30.isBlessedScriptType("xhtml"));
    }

}