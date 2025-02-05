package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isAudioType("image/png"));
    }

    @Test
    public void isBlessedAudioTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("text/html"));
    }

    @Test
    public void isVideoTypeValidTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isVideoType("image/png"));
    }

    @Test
    public void isBlessedVideoTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("text/html"));
    }

    @Test
    public void isCommonVideoTypeValidTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isCommonVideoType("text/html"));
    }

    @Test
    public void isFontTypeValidTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
    }

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("image/png"));
    }

    @Test
    public void isBlessedFontTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
    }

    @Test
    public void isBlessedFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedFontType("text/html"));
    }

    @Test
    public void isBlessedScriptTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/turtle"));
    }

    @Test
    public void isCoreMediaTypeValidTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/javascript"));
    }

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/vmd.ms-powerpoint"));
    }

    @Test
    public void getPreferredMediaTypeValidTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg", "audio.mp3"));
    }

    @Test
    public void getPreferredMediaTypeInvalidTest() {
        assertNotEquals("text/html", OPFChecker30.getPreferredMediaType("text/xml", "index.html"));
    }

}