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
        assertFalse(OPFChecker30.isAudioType("audio/invalid"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/invalid"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/invalid"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/invalid"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("application/invalid"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

    @Test
    public void isBlessedFontTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/invalid"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/invalid"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void isCoreMediaTypeFalseTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/invalid"));
    }

    @Test
    public void getPreferredMediaTypeJavascriptTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "path.js"));
    }

    @Test
    public void getPreferredMediaTypeDefaultTest() {
        assertEquals("application/unknown", OPFChecker30.getPreferredMediaType("application/unknown", "unknowntype.unknown"));
    }

}