package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker = new OPFChecker30(mockContext);
        checker.initHandler();
        assertTrue(true); // If we reached here, it means no exceptions were thrown.
    }

    @Test
    public void checkPackageTest() {
        OPFChecker30 checker = new OPFChecker30(mockContext);
        assertFalse(checker.checkPackage());
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 checker = new OPFChecker30(mockContext);
        assertFalse(checker.checkContent());
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("other"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wave"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("other"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("video/wmv"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
        assertFalse(OPFChecker30.isFontType("font/other"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
        assertFalse(OPFChecker30.isBlessedFontType("font/ttf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
        assertFalse(OPFChecker30.isCoreMediaType("text/plain"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", ""));
        assertNotEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("text/plain", ""));
    }

}