package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("audio/unknown"));
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/unknown"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/unknown"));
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/unknown"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("font/unknown"));
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("font/ttf"));
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("application/unknown"));
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/javascript"));
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/unknown"));
    }

    @Test
    public void getPreferredMediaTypeKnownTypeTest() {
        assertEquals("image/png", OPFChecker30.getPreferredMediaType("image/x-png", "/path/to/file.png"));
    }

    @Test
    public void getPreferredMediaTypeUnknownTypeTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("image/unknown", "/path/to/file.unknown"));
    }

}