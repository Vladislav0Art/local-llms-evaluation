package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Mock
    private ValidationContext contextMock;

    private OPFChecker30 opfChecker30;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(contextMock.getVersion()).thenReturn(EPUBVersion.VERSION_3);
        this.opfChecker30 = new OPFChecker30(contextMock);
    }

    @Test
    public void isAudioTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isAudioType("audio/mpeg");
        assertEquals(true, result);
    }

    @Test
    public void isAudioTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isAudioType("video/mpeg");
        assertEquals(false, result);
    }

    @Test
    public void isBlessedAudioTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/mpeg");
        assertEquals(true, result);
    }

    @Test
    public void isBlessedAudioTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/wav");
        assertEquals(false, result);
    }

    @Test
    public void isVideoTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isVideoType("video/mp4");
        assertEquals(true, result);
    }

    @Test
    public void isVideoTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isVideoType("audio/mp4");
        assertEquals(false, result);
    }

    @Test
    public void isBlessedVideoTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedVideoType("video/mp4");
        assertEquals(true, result);
    }

    @Test
    public void isBlessedVideoTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedVideoType("video/quicktime");
        assertEquals(false, result);
    }

    @Test
    public void isCommonVideoTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isCommonVideoType("video/mp4");
        assertEquals(true, result);
    }

    @Test
    public void isCommonVideoTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isCommonVideoType("video/avi");
        assertEquals(false, result);
    }

    @Test
    public void isFontTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isFontType("font/otf");
        assertEquals(true, result);
    }

    @Test
    public void isFontTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isFontType("image/jpeg");
        assertEquals(false, result);
    }

    @Test
    public void isBlessedFontTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedFontType("font/otf");
        assertEquals(true, result);
    }

    @Test
    public void isBlessedFontTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isBlessedFontType("font/ttf");
        assertEquals(false, result);
    }

    @Test
    public void isCoreMediaTypeValidMimeTypeTest() {
        boolean result = OPFChecker30.isCoreMediaType("audio/mpeg");
        assertEquals(true, result);
    }

    @Test
    public void isCoreMediaTypeInvalidMimeTypeTest() {
        boolean result = OPFChecker30.isCoreMediaType("application/pdf");
        assertEquals(false, result);
    }

}