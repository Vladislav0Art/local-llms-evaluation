package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isAudioType("audio/mpeg");
        assertTrue(result);
    }

    @Test
    public void isBlessedAudioTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isBlessedAudioType("audio/mp4");
        assertTrue(result);
    }

    @Test
    public void isVideoTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isVideoType("video/mpeg");
        assertTrue(result);
    }

    @Test
    public void isBlessedVideoTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isBlessedVideoType("video/mp4");
        assertTrue(result);
    }

    @Test
    public void isCommonVideoTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isCommonVideoType("video/ogg");
        assertTrue(result);
    }

    @Test
    public void isFontTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isFontType("font/ttf");
        assertTrue(result);
    }

    @Test
    public void isBlessedFontTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isBlessedFontType("font/opentype");
        assertTrue(result);
    }

    @Test
    public void isBlessedScriptTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isBlessedScriptType("text/javascript");
        assertTrue(result);
    }

    @Test
    public void isCoreMediaTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isCoreMediaType("image/jpeg");
        assertTrue(result);
    }

    @Test
    public void getPreferredMediaTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        String result = checker30.getPreferredMediaType("image/jpg", "path");
        assertEquals("image/jpeg", result);
    }

}