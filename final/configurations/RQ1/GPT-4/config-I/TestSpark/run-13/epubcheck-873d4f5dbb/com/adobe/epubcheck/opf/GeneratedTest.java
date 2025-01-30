package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    OPFItem opfItem;

    @Mock
    OPFHandler opfHandler;

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("audio/mp3"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType(null));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
        assertFalse(OPFChecker30.isBlessedFontType("font/myfont"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("font/otf"));
        assertFalse(OPFChecker30.isCoreMediaType("font/myfont"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertNull(OPFChecker30.getPreferredMediaType("font/myfont", "/path/myfont.ttf"));
        assertEquals("font/(ttf|otf)", OPFChecker30.getPreferredMediaType("application/font-sfnt", "/path/myfont.xyz"));
        assertEquals("font/otf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "/path/myfont.otf"));
    }

}