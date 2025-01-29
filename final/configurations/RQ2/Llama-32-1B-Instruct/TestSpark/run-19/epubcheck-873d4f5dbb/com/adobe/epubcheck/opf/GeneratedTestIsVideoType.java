package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        assert opfChecker.isVideoType("video/mp4") == true;
        assert opfChecker.isVideoType("") == false;
        assert opfChecker.isVideoType(null) == false;
    }

}