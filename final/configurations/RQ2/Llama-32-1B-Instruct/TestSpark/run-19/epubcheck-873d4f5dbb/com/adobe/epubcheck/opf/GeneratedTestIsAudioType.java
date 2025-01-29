package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        assert opfChecker.isAudioType("audio/mpeg") == true;
        assert opfChecker.isAudioType("") == false;
        assert opfChecker.isAudioType(null) == false;
    }

}