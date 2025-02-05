package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("invalid/type"));
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("invalid/type"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isVideoType("invalid/type"));
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("invalid/type"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("invalid/type"));
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("invalid/type"));
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("invalid/type"));
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("invalid/type"));
    }

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        Assert.assertEquals(OPFChecker30.getPreferredMediaType("image/jpeg", "test.jpg"), "image/jpeg");
    }

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        Assert.assertEquals(OPFChecker30.getPreferredMediaType("invalid/type", "test.jpg"), "application/octet-stream");
    }

    @Test
    public void checkItemValidItemTest() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30();
        checker.checkItem(item, handler);
        Mockito.verify(handler).getItemById(Mockito.anyString());
    }

}