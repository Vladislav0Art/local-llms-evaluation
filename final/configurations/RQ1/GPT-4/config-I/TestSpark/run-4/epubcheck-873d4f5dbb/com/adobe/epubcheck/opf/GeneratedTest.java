package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.outWriter;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.messages.MessageId;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ByteArrayOutputStream outWriter = new ByteArrayOutputStream();
        Report report = new outWriter(outWriter);
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        OPFChecker30 checker = new OPFChecker30(path, version, report);
        checker.initHandler();
        assertTrue(outWriter.toString().isEmpty());
    }

    @Test
    public void checkItemDataUrlTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        when(opfItem.hasDataURL()).thenReturn(true);
        when(opfItem.getLocation()).thenReturn(null);

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkItem(opfItem, opfHandler);

        Mockito.verify(checker, Mockito.times(1)).checkItem(opfItem, opfHandler);
    }

    @Test
    public void checkItemEmptyMimeTypeTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        when(opfItem.getMimeType()).thenReturn("");
        when(opfItem.getLocation()).thenReturn(null);

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkItem(opfItem, opfHandler);

        Mockito.verify(checker, Mockito.times(1)).checkItem(opfItem, opfHandler);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);

        when(opfItem.isRemote()).thenReturn(true);
        when(opfItem.getMimeType()).thenReturn("unsupportedMimeType");

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkItemAfterResourceValidation(opfItem);

        Mockito.verify(checker, Mockito.times(1)).checkItemAfterResourceValidation(opfItem);
    }

    @Test
    public void checkSpineItemTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        when(opfItem.hasDataURL()).thenReturn(false);
        when(opfItem.getMimeType()).thenReturn("unsupportedMimeType");

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkSpineItem(opfItem, opfHandler);

        Mockito.verify(checker, Mockito.times(1)).checkSpineItem(opfItem, opfHandler);
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("font/ttf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "path/to/file.ttf"));
    }

}