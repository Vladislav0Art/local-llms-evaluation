package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTest {

    @Test
    public void isAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isAudioType("application/pdf"));
    }

    @Test
    public void isBlessedAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

    @Test
    public void isBlessedAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isVideoType("application/pdf"));
    }

    @Test
    public void isBlessedVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/mpeg"));
    }

    @Test
    public void isCommonVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isCommonVideoType("application/pdf"));
    }

    @Test
    public void isFontTypeTrueTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
    }

    @Test
    public void isFontTypeFalseTest() {
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

    @Test
    public void isBlessedFontTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
    }

    @Test
    public void isBlessedFontTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedFontType("font/otf"));
    }

    @Test
    public void isBlessedScriptTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/coffeescript"));
    }

    @Test
    public void isCoreMediaTypeTrueTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void isCoreMediaTypeFalseTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/pdf"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals(OPFChecker30.getPreferredMediaType("application/pdf", "/path/to/document.pdf"), "application/pdf");
    }

}