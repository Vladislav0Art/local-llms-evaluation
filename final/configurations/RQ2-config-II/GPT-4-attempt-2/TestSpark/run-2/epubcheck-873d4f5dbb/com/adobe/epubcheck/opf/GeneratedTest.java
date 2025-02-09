package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void isAudioTypeAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeNonAudioTypeTest() {
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeNonBlessedAudioTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeNonVideoTypeTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeNonBlessedVideoTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeNonCommonVideoTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

    @Test
    public void isFontTypeFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
    }

    @Test
    public void isFontTypeNonFontTypeTest() {
        assertFalse(OPFChecker30.isFontType("audio/mpeg"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
    }

    @Test
    public void isBlessedFontTypeNonBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("font/ttf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/x-javascript"));
    }

    @Test
    public void isBlessedScriptTypeNonBlessedScriptTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/ruby"));
    }

    @Test
    public void isCoreMediaTypeTestCore() {
        assertTrue(OPFChecker30.isCoreMediaType("application/epub+zip"));
    }

    @Test
    public void isCoreMediaTypeTestNotCore() {
        assertFalse(OPFChecker30.isCoreMediaType("text/csv"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/epub+zip",
                OPFChecker30.getPreferredMediaType("application/epub+zip", "/path/to/file.epub"));
    }

}