package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
        assertFalse(OPFChecker30.isFontType("font/otf"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
        assertFalse(OPFChecker30.isBlessedFontType("font/otf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/vbscript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
        assertFalse(OPFChecker30.isCoreMediaType("text/vbscript"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg", "path/to/file"));
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("unknown", "path/to/file.mp3"));
        assertEquals("unknown", OPFChecker30.getPreferredMediaType("unknown", "path/to/file.unknown"));
    }

}