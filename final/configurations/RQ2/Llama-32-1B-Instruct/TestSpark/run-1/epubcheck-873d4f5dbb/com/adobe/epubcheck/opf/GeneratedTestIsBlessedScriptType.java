package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        String type = "application/x-shockwave-flash";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isBlessedScriptType(type);
        Assert.assertTrue(result);
    }

}