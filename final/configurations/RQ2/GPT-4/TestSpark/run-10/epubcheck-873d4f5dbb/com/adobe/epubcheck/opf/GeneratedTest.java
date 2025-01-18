package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
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
        assertTrue(OPFChecker30.isCommonVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
        assertFalse(OPFChecker30.isFontType("audio/mp3"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        assertFalse(OPFChecker30.isBlessedFontType("audio/mp3"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/php"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
        assertFalse(OPFChecker30.isCoreMediaType("application/x-javascript"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "/path/to/file.xhtml"));
        assertEquals("application/x-dtbncx+xml", OPFChecker30.getPreferredMediaType("text/xml", "/path/to/file.ncx"));
    }

}