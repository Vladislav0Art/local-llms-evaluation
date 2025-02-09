package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
    }

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        Assert.assertTrue(checker.checkPackage());
    }

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        Assert.assertTrue(checker.checkContent());
    }

    @Test
    public void isAudioTypeTest() {
        String type = "audio/mpeg";
        Assert.assertTrue(OPFChecker30.isAudioType(type));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        String type = "audio/mp4";
        Assert.assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

    @Test
    public void isVideoTypeTest() {
        String type = "video/mp4";
        Assert.assertTrue(OPFChecker30.isVideoType(type));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        String type = "video/webm";
        Assert.assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

    @Test
    public void isCommonVideoTypeTest() {
        String type = "video/x-ms-wmv";
        Assert.assertTrue(OPFChecker30.isCommonVideoType(type));
    }

    @Test
    public void isFontTypeTest() {
        String type = "application/x-font-woff";
        Assert.assertTrue(OPFChecker30.isFontType(type));
    }

    @Test
    public void isBlessedFontTypeTest() {
        String type = "application/font-woff";
        Assert.assertTrue(OPFChecker30.isBlessedFontType(type));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        String type = "text/javascript";
        Assert.assertTrue(OPFChecker30.isBlessedScriptType(type));
    }

    @Test
    public void isCoreMediaTypeTest() {
        String type = "image/gif";
        Assert.assertTrue(OPFChecker30.isCoreMediaType(type));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        String type = "audio/mpg";
        String path = "/path/to/file.mp3";
        Assert.assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType(type, path));
    }

}