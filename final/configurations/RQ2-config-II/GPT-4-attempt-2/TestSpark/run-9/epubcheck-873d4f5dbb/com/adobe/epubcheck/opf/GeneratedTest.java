package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp4"));
        assertFalse(OPFChecker30.isAudioType("image/jpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("image/jpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        assertFalse(OPFChecker30.isBlessedFontType("application/font-ttf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/coffeescript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
        assertFalse(OPFChecker30.isCoreMediaType("text/pdf"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "/test/path"));
    }

    @Test
    public void checkPackageTest() throws IOException {
        Report report = Mockito.mock(Report.class);
        URL url = Mockito.mock(URL.class);
        List<String> list = Mockito.mock(List.class);
        ValidationContext validationContext = new ValidationContext(EPUBVersion.VERSION_3, report, url, list);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
        Mockito.verify(report, Mockito.times(1)).info(Mockito.any(), Mockito.any(), Mockito.any());
    }

}