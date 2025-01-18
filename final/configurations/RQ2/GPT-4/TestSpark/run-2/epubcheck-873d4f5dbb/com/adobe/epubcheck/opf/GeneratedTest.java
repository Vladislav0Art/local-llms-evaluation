package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("video/mpeg"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("audio/mpeg"));
    }

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("video/mp4"));
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("video/mp4"));
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/css"));
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/css"));
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("text/jpg"));
    }

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "index.xhtml"));
    }

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        assertNotEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "index.html"));
    }

}