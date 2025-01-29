package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        assert opfChecker.isBlessedVideoType("video/mp4") == true;
        assert opfChecker.isBlessedVideoType("") == false;
        assert opfChecker.isBlessedVideoType(null) == false;
    }

}