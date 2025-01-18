package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidAudioTypeTest() {
        assertFalse(OPFChecker30.isAudioType("audio/pdf"));
    }

    @Test
    public void isBlessedAudioTypeValidBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/ogg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidBlessedAudioTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/pdf"));
    }

    @Test
    public void isVideoTypeValidVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeInvalidVideoTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/pdf"));
    }

    @Test
    public void isBlessedVideoTypeValidBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidBlessedVideoTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/pdf"));
    }

    @Test
    public void isCommonVideoTypeValidCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeInvalidCommonVideoTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/pdf"));
    }

    @Test
    public void isFontTypeValidFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/vnd.ms-fontobject"));
    }

    @Test
    public void isFontTypeInvalidFontTypeTest() {
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

    @Test
    public void isBlessedFontTypeValidBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/vnd.ms-fontobject"));
    }

    @Test
    public void isBlessedFontTypeInvalidBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/pdf"));
    }

    @Test
    public void isBlessedScriptTypeValidBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidBlessedScriptTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/pdf"));
    }

    @Test
    public void isCoreMediaTypeValidCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void isCoreMediaTypeInvalidCoreMediaTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/pdf"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        String actual = OPFChecker30.getPreferredMediaType("text/plain", "test.txt");
        String expected = "application/oebps-package+xml";
        assertEquals(expected, actual);
    }

}