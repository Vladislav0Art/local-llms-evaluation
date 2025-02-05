package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void checkPackageTrueTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        assertTrue(checker.checkPackage());
    }

    @Test
    public void checkContentTrueTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        assertTrue(checker.checkContent());
    }

    @Test
    public void checkItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, handler);
        Mockito.verify(handler).registerResource(item);
    }

    @Test
    public void isAudioTypeTrueTest() {
        String audioType = "audio/mp3";
        assertTrue(OPFChecker30.isAudioType(audioType));
    }

    @Test
    public void isAudioTypeFalseTest() {
        String notAudioType = "text/html";
        assertFalse(OPFChecker30.isAudioType(notAudioType));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        String type = "video/mp4";
        String path = "/video/file.mp4";
        assertEquals("video/mp4", OPFChecker30.getPreferredMediaType(type, path));
    }

    @Test
    public void isVideoTypeTrueTest() {
        String videoType = "video/mp4";
        assertTrue(OPFChecker30.isVideoType(videoType));
    }

    @Test
    public void isVideoTypeFalseTest() {
        String notVideoType = "text/html";
        assertFalse(OPFChecker30.isVideoType(notVideoType));
    }

    @Test
    public void isFontTypeTrueTest() {
        String fontType = "application/font-woff";
        assertTrue(OPFChecker30.isFontType(fontType));
    }

    @Test
    public void isFontTypeFalseTest() {
        String notFontType = "text/html";
        assertFalse(OPFChecker30.isFontType(notFontType));
    }

    @Test
    public void isCoreMediaTypeTrueTest() {
        String coreType = "application/javascript";
        assertTrue(OPFChecker30.isCoreMediaType(coreType));
    }

    @Test
    public void isCoreMediaTypeFalseTest() {
        String notCoreType = "text/html";
        assertFalse(OPFChecker30.isCoreMediaType(notCoreType));
    }

}