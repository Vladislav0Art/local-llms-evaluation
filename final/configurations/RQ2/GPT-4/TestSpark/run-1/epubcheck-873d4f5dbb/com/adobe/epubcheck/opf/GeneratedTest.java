package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeNotFoundTest() {
        assertFalse(OPFChecker30.isAudioType("unknownType"));
    }

    @Test
    public void isAudioTypeFoundTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

    @Test
    public void isBlessedAudioTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("unknownType"));
    }

    @Test
    public void isBlessedAudioTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

    @Test
    public void isVideoTypeNotFoundTest() {
        assertFalse(OPFChecker30.isVideoType("unknownType"));
    }

    @Test
    public void isVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("unknownType"));
    }

    @Test
    public void isBlessedVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeNotFoundTest() {
        assertFalse(OPFChecker30.isCommonVideoType("unknownType"));
    }

    @Test
    public void isCommonVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isFontTypeNotFoundTest() {
        assertFalse(OPFChecker30.isFontType("unknownType"));
    }

    @Test
    public void isFontTypeFoundTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

    @Test
    public void isBlessedFontTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedFontType("unknownType"));
    }

    @Test
    public void isBlessedFontTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/ttf"));
    }

    @Test
    public void isBlessedScriptTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("unknownType"));
    }

    @Test
    public void isBlessedScriptTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isCoreMediaTypeNotFoundTest() {
        assertFalse(OPFChecker30.isCoreMediaType("unknownType"));
    }

    @Test
    public void isCoreMediaTypeFoundTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/javascript"));
    }

    @Test
    public void getPreferredMediaTypeSameTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "file/path"));
    }

    @Test
    public void getPreferredMediaTypeReplacedTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "file/path"));
    }

}