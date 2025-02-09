package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("video/mpeg"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/avc"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isVideoType("audio/avc"));
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/avc"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("audio/avc"));
    }

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCommonVideoType("audio/mp4"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("application/not-a-font"));
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("application/not-a-font"));
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("text/not-a-script"));
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("image/png"));
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("image/not-a-core-media"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("image/png",
                OPFChecker30.getPreferredMediaType("image/png", "image-path.png"));
    }

}