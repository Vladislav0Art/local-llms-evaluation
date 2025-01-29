package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testIsAudioType_SimpleCase() {
        assertEquals(true, OPFChecker30.isAudioType("audio"));
    }

    @Test
    public void testIsAudioType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isAudioType("prefix:audio"));
    }

    @Test
    public void testIsBlessedAudioType_SimpleCase() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("blessed audio"));
    }

    @Test
    public void testIsBlessedAudioType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedAudioType("prefix:blessedaudio"));
    }

    @Test
    public void testIsVideoType_SimpleCase() {
        assertEquals(true, OPFChecker30.isVideoType("video"));
    }

    @Test
    public void testIsVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isVideoType("prefix:videov"));
    }

    @Test
    public void testIsBlessedVideoType_SimpleCase() {
        assertEquals(true, OPFChecker30.isBlessedVideoType("blessed video"));
    }

    @Test
    public void testIsBlessedVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedVideoType("prefix:blessedvideo"));
    }

    @Test
    public void testIsCommonVideoType_SimpleCase() {
        assertEquals(true, OPFChecker30.isCommonVideoType("common video"));
    }

    @Test
    public void testIsCommonVideoType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isCommonVideoType("prefix:commonvideo"));
    }

    @Test
    public void testIsFontType_SimpleCase() {
        assertEquals(true, OPFChecker30.isFontType("font"));
    }

    @Test
    public void testIsFontType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isFontType("prefix:font"));
    }

    @Test
    public void testIsBlessedFontType_SimpleCase() {
        assertEquals(true, OPFChecker30.isBlessedFontType("blessed font"));
    }

    @Test
    public void testIsBlessedFontType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedFontType("prefix:blessedfont"));
    }

    @Test
    public void testIsBlessedScriptType_SimpleCase() {
        assertEquals(true, OPFChecker30.isBlessedScriptType("blessed script"));
    }

    @Test
    public void testIsBlessedScriptType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isBlessedScriptType("prefix:blessedscript"));
    }

    @Test
    public void testIsCoreMediaType_SimpleCase() {
        assertEquals(true, OPFChecker30.isCoreMediaType("core media type"));
    }

    @Test
    public void testIsCoreMediaType_PrefixesNotConsidered() {
        assertEquals(false, OPFChecker30.isCoreMediaType("prefix:coremedia-type"));
    }

    @Test
    public void testGetPreferredMediaType_SimpleCase() {
        assertEquals("audio/video", OPFChecker30.getPreferredMediaType("audio/video", "test"));
    }

    @Test
    public void testGetPreferredMediaType_PrefixesNotConsidered() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("prefix:audio/video/test", "test"));
    }

}