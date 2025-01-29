package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testIsAudioType() {
        assert opfChecker.isAudioType("audio/mpeg") == true;
        assert opfChecker.isAudioType("") == false;
        assert opfChecker.isAudioType(null) == false;
    }

    @Test
    public void testIsBlessedAudioType() {
        assert opfChecker.isBlessedAudioType("audio/mpeg") == true;
        assert opfChecker.isBlessedAudioType("") == false;
        assert opfChecker.isBlessedAudioType(null) == false;
    }

    @Test
    public void testIsVideoType() {
        assert opfChecker.isVideoType("video/mp4") == true;
        assert opfChecker.isVideoType("") == false;
        assert opfChecker.isVideoType(null) == false;
    }

    @Test
    public void testIsBlessedVideoType() {
        assert opfChecker.isBlessedVideoType("video/mp4") == true;
        assert opfChecker.isBlessedVideoType("") == false;
        assert opfChecker.isBlessedVideoType(null) == false;
    }

    @Test
    public void testIsCommonVideoType() {
        assert opfChecker.isCommonVideoType("video/avi") == true;
        assert opfChecker.isCommonVideoType("") == false;
        assert opfChecker.isCommonVideoType(null) == false;
    }

    @Test
    public void testIsFontType() {
        assert opfChecker.isFontType("font/ttf") == true;
        assert opfChecker.isFontType("") == false;
        assert opfChecker.isFontType(null) == false;
    }

    @Test
    public void testIsBlessedFontType() {
        assert opfChecker.isBlessedFontType("font/ttf") == true;
        assert opfChecker.isBlessedFontType("") == false;
        assert opfChecker.isBlessedFontType(null) == false;
    }

    @Test
    public void testIsBlessedScriptType() {
        assert opfChecker.isBlessedScriptType("application/x-font-otf") == true;
        assert opfChecker.isBlessedScriptType("") == false;
        assert opfChecker.isBlessedScriptType(null) == false;
    }

    @Test
    public void testIsCoreMediaType() {
        assert opfChecker.isCoreMediaType("image/jpeg") == true;
        assert opfChecker.isCoreMediaType("") == false;
        assert opfChecker.isCoreMediaType(null) == false;
    }

    @Test
    public void testGetPreferredMediaType() {
        assert opfChecker.getPreferredMediaType("application/x-font-otf", "/path/to/file.jpg") == "image/jpeg";
        assert opfChecker.getPreferredMediaType("", "/path/to/file.jpg") == null;
        assert opfChecker.getPreferredMediaType(null, "/path/to/file.jpg") == null;
    }

}