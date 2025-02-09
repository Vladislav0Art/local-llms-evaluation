package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isAudioType(type);
        assertFalse(result);
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertFalse(result);
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isVideoType(type);
        assertFalse(result);
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertFalse(result);
    }

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertTrue(result);
    }

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertFalse(result);
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        String type = "font/woff";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertFalse(result);
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        String type = "text/javascript";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertFalse(result);
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        String type = "text/html";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertFalse(result);
    }

    @Test
    public void checkItemTest() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(Mockito.mock(ValidationContext.class));
        checker.checkItem(item, handler);
        Mockito.verify(handler, Mockito.times(1)).registerUncheckedItem(item);
    }

}