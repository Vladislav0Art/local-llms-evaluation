package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testIsAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("image/jpeg"));
    }

    @Test
    public void testIsBlessedAudioType() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpeg"));
    }

    @Test
    public void testIsVideoType() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("image/jpeg"));
    }

    @Test
    public void testIsBlessedVideoType() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("image/jpeg"));
    }

    @Test
    public void testIsCommonVideoType() {
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
        assertFalse(OPFChecker30.isCommonVideoType("image/jpeg"));
    }

    @Test
    public void testIsFontType() {
        assertTrue(OPFChecker30.isFontType("application/x-font-family"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

    @Test
    public void testIsBlessedFontType() {
        assertTrue(OPFChecker30.isBlessedFontType("application/x-font-family"));
        assertFalse(OPFChecker30.isBlessedFontType("image/jpeg"));
    }

    @Test
    public void testIsBlessedScriptType() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/x-shockwave-flash"));
        assertFalse(OPFChecker30.isBlessedScriptType("image/jpeg"));
    }

    @Test
    public void testIsCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
        assertFalse(OPFChecker30.isCoreMediaType("image/jpeg"));
    }

    @Test
    public void testGetPreferredMediaType() {
        String mediaType = OPFChecker30.getPreferredMediaType("video/mp4", "/path/to/video");
        assertEquals("video/mp4", mediaType);
    }

}