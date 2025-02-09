package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTest {

    @Test
    public void isAudioTypeAudioMimeTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeNonAudioMimeTypeTest() {
        assertFalse(OPFChecker30.isAudioType("text/plain"));
    }

    @Test
    public void isBlessedAudioTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

    @Test
    public void isBlessedAudioTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeVideoMimeTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeNonVideoMimeTypeTest() {
        assertFalse(OPFChecker30.isVideoType("text/plain"));
    }

    @Test
    public void isBlessedVideoTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeCommonMimeTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeUnCommonMimeTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/flv"));
    }

    @Test
    public void isFontTypeFontMimeTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/x-font-ttf"));
    }

    @Test
    public void isFontTypeNonFontMimeTypeTest() {
        assertFalse(OPFChecker30.isFontType("text/plain"));
    }

    @Test
    public void isBlessedFontTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/x-font-truetype"));
    }

    @Test
    public void isBlessedFontTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/x-font-ttf"));
    }

    @Test
    public void isBlessedScriptTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

    @Test
    public void isBlessedScriptTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/plain"));
    }

    @Test
    public void isCoreMediaTypeCoreMimeTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
    }

    @Test
    public void isCoreMediaTypeNonCoreMimeTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("text/plain"));
    }

    @Test
    public void getPreferredMediaTypeCorePreferredMediaTypeTest() {
        assertEquals("text/html", OPFChecker30.getPreferredMediaType("text/plain", "index.html"));
    }

    @Test
    public void getPreferredMediaTypeNonCorePreferredMediaTypeTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("application/octet-stream", "index.data"));
    }

}