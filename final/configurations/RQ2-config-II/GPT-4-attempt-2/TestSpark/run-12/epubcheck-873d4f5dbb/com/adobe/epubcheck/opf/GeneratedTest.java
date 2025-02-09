package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeTestForValidAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeTestForInvalidAudioType() {
        assertFalse(OPFChecker30.isAudioType("text/plain"));
    }

    @Test
    public void isBlessedAudioTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

    @Test
    public void isBlessedAudioTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wma"));
    }

    @Test
    public void isVideoTypeTestForValidVideoType() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

    @Test
    public void isVideoTypeTestForInvalidVideoType() {
        assertFalse(OPFChecker30.isVideoType("text/plain"));
    }

    @Test
    public void isBlessedVideoTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isCommonVideoType("video/x-matroska"));
    }

    @Test
    public void isCommonVideoTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isCommonVideoType("video/flv"));
    }

    @Test
    public void isFontTypeTestForValidFontType() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

    @Test
    public void isFontTypeTestForInvalidFontType() {
        assertFalse(OPFChecker30.isFontType("text/plain"));
    }

    @Test
    public void isBlessedFontTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

    @Test
    public void isBlessedFontTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedFontType("font/truetype"));
    }

    @Test
    public void isBlessedScriptTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/ecmascript"));
    }

    @Test
    public void isBlessedScriptTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/vbscript"));
    }

    @Test
    public void isCoreMediaTypeTestForValidCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("application/javascript"));
    }

    @Test
    public void isCoreMediaTypeTestForInvalidCoreMediaType() {
        assertFalse(OPFChecker30.isCoreMediaType("application/python"));
    }

    @Test
    public void getPreferredMediaTypeTestForValidMediaType() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/ecmascript", "test.js"));
    }

    @Test
    public void getPreferredMediaTypeTestForInvalidMediaType() {
        assertEquals("text/plain", OPFChecker30.getPreferredMediaType("text/vbscript", "test.vb"));
    }

}