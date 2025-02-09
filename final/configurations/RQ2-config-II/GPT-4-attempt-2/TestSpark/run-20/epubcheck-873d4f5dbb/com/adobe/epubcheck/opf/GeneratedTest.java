package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/ogg"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/ogg"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("audio/mp3"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        assertFalse(OPFChecker30.isBlessedFontType("application/font-ttf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/x-javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/css"));
        assertFalse(OPFChecker30.isCoreMediaType("application/vnd.ms-excel"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg3", "test/path"));
        assertEquals("", OPFChecker30.getPreferredMediaType("", "test/path"));
    }

}