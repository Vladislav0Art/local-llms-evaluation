package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/midi"));
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("text/plain"));
    }

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("audio/amr"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/jpeg"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isVideoType("text/html"));
    }

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("video/quicktime"));
    }

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/jpeg"));
    }

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("text/css"));
    }

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("font/oth"));
    }

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("font/type1"));
    }

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("application/ecmascript"));
    }

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("text/html"));
    }

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("text/css"));
    }

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("audio/midi"));
    }

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        Assert.assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mp3", "audioPath.mp3"));
    }

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        Assert.assertEquals("unknown", OPFChecker30.getPreferredMediaType("audio/amr", "audioPath.amr"));
    }

}