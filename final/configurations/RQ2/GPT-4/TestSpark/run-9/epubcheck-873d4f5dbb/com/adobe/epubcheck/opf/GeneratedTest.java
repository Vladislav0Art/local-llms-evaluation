package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.opf.OPFChecker30;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void isAudioTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("image/jpeg"));
    }

    @Test
    public void isBlessedAudioTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("video/mp4"));
    }

    @Test
    public void isVideoTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isVideoTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("application/pdf"));
    }

    @Test
    public void isBlessedVideoTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("audio/mp3"));
    }

    @Test
    public void isCommonVideoTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("audio/aac"));
    }

    @Test
    public void isFontTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

    @Test
    public void isFontTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("video/avi"));
    }

    @Test
    public void isBlessedFontTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
    }

    @Test
    public void isBlessedFontTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("image/jpeg"));
    }

    @Test
    public void isBlessedScriptTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

    @Test
    public void isBlessedScriptTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("application/java"));
    }

    @Test
    public void isCoreMediaTypeGivenValidTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void isCoreMediaTypeGivenInvalidTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/octet-stream"));
    }

    @Test
    public void getPreferredMediaTypeGivenAudioTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg", "/path/to/file.mp3"));
    }

    @Test
    public void getPreferredMediaTypeGivenVideoTypeTest() {
        assertEquals("video/mp4", OPFChecker30.getPreferredMediaType("video/mp4", "/path/to/file.mp4"));
    }

}