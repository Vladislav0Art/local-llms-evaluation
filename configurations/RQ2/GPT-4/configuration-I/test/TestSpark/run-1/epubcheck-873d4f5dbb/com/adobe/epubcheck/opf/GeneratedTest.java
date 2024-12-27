package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.ValidationContext.ContextMode;
import com.adobe.epubcheck.util.PathUtil;
import com.adobe.epubcheck.util.Messages;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.adobe.epubcheck.opf.ValidationContext;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.adobe.epubcheck.opf.ValidationContext.ValidationContextBuilder;
import com.adobe.epubcheck.opf.OPFItem.OPFItemBuilder;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpeg"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isBlessedVideoType("image/jpeg"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/vnd.ms-opentype"));
        assertFalse(OPFChecker30.isFontType("audio/mpeg"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/vnd.ms-opentype"));
        assertFalse(OPFChecker30.isBlessedFontType("audio/mpeg"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("audio/mpeg"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
        assertFalse(OPFChecker30.isCoreMediaType("application/vnd.ms-opentype"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mpeg3", OPFChecker30.getPreferredMediaType("audio/mpeg", "mpeg3"));
        assertEquals("text/html", OPFChecker30.getPreferredMediaType("text/plain", "html"));
    }

}