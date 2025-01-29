package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        assert opfChecker.isBlessedAudioType("audio/mpeg") == true;
        assert opfChecker.isBlessedAudioType("") == false;
        assert opfChecker.isBlessedAudioType(null) == false;
    }

}