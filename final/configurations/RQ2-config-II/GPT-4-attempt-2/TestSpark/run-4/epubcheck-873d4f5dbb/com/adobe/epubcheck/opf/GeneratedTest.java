package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidAudioTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("invalid/audio"));
    }

    @Test
    public void isBlessedAudioTypeValidAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

    @Test
    public void isBlessedAudioTypeInvalidAudioTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("invalid/audio"));
    }

    @Test
    public void isVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

    @Test
    public void isVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isVideoType("invalid/video"));
    }

    @Test
    public void isBlessedVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("invalid/video"));
    }

    @Test
    public void isCommonVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isCommonVideoType("invalid/video"));
    }

    @Test
    public void isFontTypeValidFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

    @Test
    public void isFontTypeInvalidFontTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("invalid/font"));
    }

    @Test
    public void isBlessedFontTypeValidFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("font/ttf"));
    }

    @Test
    public void isBlessedFontTypeInvalidFontTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("invalid/font"));
    }

    @Test
    public void isBlessedScriptTypeValidScriptTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidScriptTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("invalid/javascript"));
    }

    @Test
    public void isCoreMediaTypeValidMediaTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void isCoreMediaTypeInvalidMediaTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("invalid/media"));
    }

    @Test
    public void getPreferredMediaTypeValidMediaTypeTest() {
        Assert.assertEquals("application/xhtml+xml+zip", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.zip"));
    }

    @Test
    public void getPreferredMediaTypeInvalidMediaTypeTest() {
        Assert.assertEquals("invalid/media", OPFChecker30.getPreferredMediaType("invalid/media", "test.zip"));
    }

}