package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import io.mola.galimatias.URL;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);
        checker30.initHandler();
        assertTrue(true); // not throwing exceptions is considered a successful run
    }

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);
        boolean result = checker30.checkPackage();
        assertNotNull(result);
    }

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);
        boolean result = checker30.checkContent();
        assertNotNull(result);
    }

    @Test
    public void checkItemTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);
        checker30.checkItem(item, handler);
        verify(handler).registerItem(item);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = mock(OPFItem.class);
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);
        checker30.checkItemAfterResourceValidation(item);
        verify(item).getIdentifier();
    }

    @Test
    public void isAudioTypeTest() {
        String type = "audio";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedAudioTypeTest() {
        String type = "blessedaudio";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);
    }

    @Test
    public void isVideoTypeTest() {
        String type = "video";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedVideoTypeTest() {
        String type = "blessedvideo";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);
    }

    @Test
    public void isFontTypeTest() {
        String type = "font";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);
    }

    @Test
    public void getPreferredMediaTypeTest() {
        String type = "preftype";
        String path = "/test/path";
        String result = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals(result, type);
    }

}