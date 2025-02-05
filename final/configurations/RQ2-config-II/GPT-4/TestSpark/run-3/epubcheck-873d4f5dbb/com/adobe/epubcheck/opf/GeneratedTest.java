package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

    @Test
    public void isAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("video/mp4"));
    }

    @Test
    public void isVideoTypeValidTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mp3"));
    }

    @Test
    public void isBlessedVideoTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("audio/mp3"));
    }

    @Test
    public void isFontTypeValidTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
    }

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("text/xml"));
    }

    @Test
    public void isBlessedFontTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff2"));
    }

    @Test
    public void isBlessedFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedFontType("text/xml"));
    }

    @Test
    public void isCoreMediaTypeValidTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/xml"));
    }

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("font/woff"));
    }

    @Test
    public void getPreferredMediaTypeValidScenarioTest() {
        assertEquals("image/png", OPFChecker30.getPreferredMediaType("image/png", "icon.png"));
    }

    @Test
    public void getPreferredMediaTypeInvalidScenarioTest() {
        assertNotEquals("text/xml", OPFChecker30.getPreferredMediaType("image/png", "icon.png"));
    }

}