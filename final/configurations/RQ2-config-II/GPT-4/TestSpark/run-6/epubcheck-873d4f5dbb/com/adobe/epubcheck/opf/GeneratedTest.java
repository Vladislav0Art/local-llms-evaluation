package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("video/mpeg"));
    }

    @Test
    public void isVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        Assert.assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("application/pdf"));
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        Assert.assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("application/font-woff"));
        Assert.assertFalse(OPFChecker30.isFontType("audio/mpeg"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        Assert.assertFalse(OPFChecker30.isBlessedFontType("video/mp4"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("application/pdf"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
        Assert.assertFalse(OPFChecker30.isCoreMediaType("audio/amr"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.xhtml"));
        Assert.assertEquals("application/x-dtbook+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.dtbook"));
        Assert.assertEquals("text/css", OPFChecker30.getPreferredMediaType("text/css", "test.css"));
    }

    @Test
    public void constructorTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        Mockito.when(context.profile()).thenReturn(EPUBProfile.DEFAULT);
        OPFChecker30 checker = new OPFChecker30(context);
        Assert.assertNotNull(checker);
    }

}