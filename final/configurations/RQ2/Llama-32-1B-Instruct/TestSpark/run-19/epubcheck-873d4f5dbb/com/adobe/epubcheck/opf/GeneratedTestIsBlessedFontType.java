package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        assert opfChecker.isBlessedFontType("font/ttf") == true;
        assert opfChecker.isBlessedFontType("") == false;
        assert opfChecker.isBlessedFontType(null) == false;
    }

}