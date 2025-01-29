package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        assert opfChecker.isBlessedScriptType("application/x-font-otf") == true;
        assert opfChecker.isBlessedScriptType("") == false;
        assert opfChecker.isBlessedScriptType(null) == false;
    }

}