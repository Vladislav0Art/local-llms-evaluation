package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        assert opfChecker.isCoreMediaType("image/jpeg") == true;
        assert opfChecker.isCoreMediaType("") == false;
        assert opfChecker.isCoreMediaType(null) == false;
    }

}