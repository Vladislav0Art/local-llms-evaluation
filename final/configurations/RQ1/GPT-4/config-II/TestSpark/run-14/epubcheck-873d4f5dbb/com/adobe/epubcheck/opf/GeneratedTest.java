package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.DocumentValidator;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
        assertTrue(checker.opfHandler instanceof OPFHandler30);
    }

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        assertTrue(checker.checkContent());
    }

    @Test
    public void checkItemWithDataURLTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        URL url = mock(URL.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = new OPFItem("Test", url, "mimeType", opfHandler);
        item.dataUrl = true;

        checker.checkItem(item, opfHandler);
        verify(context.getMessage(), times(1)).message(Mockito.any(), Mockito.any());
    }

    @Test
    public void checkItemWithoutMimeTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        URL url = mock(URL.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = new OPFItem("Test", url, opfHandler);

        checker.checkItem(item, opfHandler);
        verify(context.getMessage(), never()).message(Mockito.any(), Mockito.any());
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/divx"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/php"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
        assertFalse(OPFChecker30.isCoreMediaType("audio/wav"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertTrue(OPFChecker30.getPreferredMediaType("application/font-sfnt", "font.ttf").equals("font/ttf"));
        assertFalse(OPFChecker30.getPreferredMediaType("application/font-sfnt", "font.woff").equals("font/ttf"));
    }

}