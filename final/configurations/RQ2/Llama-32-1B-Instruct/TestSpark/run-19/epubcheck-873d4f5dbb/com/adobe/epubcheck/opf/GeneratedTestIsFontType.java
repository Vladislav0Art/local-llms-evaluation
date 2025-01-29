package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        assert opfChecker.isFontType("font/ttf") == true;
        assert opfChecker.isFontType("") == false;
        assert opfChecker.isFontType(null) == false;
    }

}