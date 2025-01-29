package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        assert opfChecker.isCommonVideoType("video/avi") == true;
        assert opfChecker.isCommonVideoType("") == false;
        assert opfChecker.isCommonVideoType(null) == false;
    }

}