package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTest {

    @Test
    public void testIsAudioType() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");
        result = OPFChecker30.isAudioType("audio/mpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/ogg");
        result = OPFChecker30.isAudioType("audio/ogg");
        assertTrue(result);
    }

    @Test
    public void testIsBlessedAudioType() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");
        result = OPFChecker30.isBlessedAudioType("audio/mpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/ogg");
        result = OPFChecker30.isBlessedAudioType("audio/ogg");
        assertTrue(result);
    }

    @Test
    public void testIsVideoType() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/mp4");
        result = OPFChecker30.isVideoType("video/mp4");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isVideoType("video/ogg");
        assertTrue(result);
    }

    @Test
    public void testIsBlessedVideoType() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/mp4");
        result = OPFChecker30.isBlessedVideoType("video/mp4");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isBlessedVideoType("video/ogg");
        assertTrue(result);
    }

    @Test
    public void testIsCommonVideoType() {
        String type = "video/webm";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/webm");
        result = OPFChecker30.isCommonVideoType("video/webm");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isCommonVideoType("video/ogg");
        assertTrue(result);
    }

    @Test
    public void testIsFontType() {
        String type = "font/truetype";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/truetype");
        result = OPFChecker30.isFontType("font/truetype");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/opentype");
        result = OPFChecker30.isFontType("font/opentype");
        assertTrue(result);
    }

    @Test
    public void testIsBlessedFontType() {
        String type = "font/truetype";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/truetype");
        result = OPFChecker30.isBlessedFontType("font/truetype");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/opentype");
        result = OPFChecker30.isBlessedFontType("font/opentype");
        assertTrue(result);
    }

    @Test
    public void testIsBlessedScriptType() {
        String type = "application/x-font-stylesheet";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("application/x-font-stylesheet");
        result = OPFChecker30.isBlessedScriptType("application/x-font-stylesheet");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("application/pdf");
        result = OPFChecker30.isBlessedScriptType("application/pdf");
        assertTrue(result);
    }

    @Test
    public void testIsCoreMediaType() {
        String type = "image/jpeg";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("image/jpeg");
        result = OPFChecker30.isCoreMediaType("image/jpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("image/png");
        result = OPFChecker30.isCoreMediaType("image/png");
        assertTrue(result);
    }

    @Test
    public void testGetPreferredMediaType() {
        String type = "audio/mpeg";
        String expected = "audio/mpeg";
        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");

        assertEquals(expected, OPFChecker30.getPreferredMediaType(type));
    }

}