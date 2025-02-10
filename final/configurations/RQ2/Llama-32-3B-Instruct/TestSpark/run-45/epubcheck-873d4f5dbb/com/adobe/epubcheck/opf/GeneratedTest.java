package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void initHandler_NoExceptions

    Test() {
        new OPFChecker30(null);
    }

    @Test
    public void initHandler_WithExceptions

    Test() {
        new OPFChecker30(new ValidationContext());
    }

    @Test
    public void checkPackage_MustReturnFalse

    Test() {
        assertFalse(OPFChecker30.checkPackage());
    }

    @Test
    public void checkContent_MustReturnTrue

    Test() {
        assertTrue(OPFChecker30.checkContent());
    }

    @Test
    public void checkItem_NoExceptions

    Test() {
        OPFItem item = null;
        OPFHandler opfHandler = null;
        new OPFChecker30(null).checkItem(item, opfHandler);
    }

    @Test
    public void checkItem_WithExceptions

    Test() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        new OPFChecker30(new ValidationContext()).checkItem(item, opfHandler);
    }

    @Test
    public void checkSpineItem_NoExceptions

    Test() {
        OPFItem item = null;
        OPFHandler opfHandler = null;
        new OPFChecker30(null).checkSpineItem(item, opfHandler);
    }

    @Test
    public void checkSpineItem_WithExceptions

    Test() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        new OPFChecker30(new ValidationContext()).checkSpineItem(item, opfHandler);
    }

    @Test
    public void isAudioType_AudioTypes

    Test() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertFalse(OPFChecker30.isAudioType("video"));
    }

    @Test
    public void isBlessedAudioType_BlessedAudioTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedAudioType("blessed audio"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio"));
    }

    @Test
    public void isVideoType_VideoTypes

    Test() {
        assertTrue(OPFChecker30.isVideoType("video"));
        assertFalse(OPFChecker30.isVideoType("audio"));
    }

    @Test
    public void isBlessedVideoType_BlessedVideoTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedVideoType("blessed video"));
        assertFalse(OPFChecker30.isBlessedVideoType("video"));
    }

    @Test
    public void isCommonVideoType_CommonVideoTypes

    Test() {
        assertTrue(OPFChecker30.isCommonVideoType("common video"));
        assertFalse(OPFChecker30.isCommonVideoType("blessed common video"));
    }

    @Test
    public void isFontType_FontTypes

    Test() {
        assertTrue(OPFChecker30.isFontType("font"));
        assertFalse(OPFChecker30.isFontType("video"));
    }

    @Test
    public void isBlessedFontType_BlessedFontTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedFontType("blessed font"));
        assertFalse(OPFChecker30.isBlessedFontType("font"));
    }

    @Test
    public void isBlessedScriptType_BlessedScriptTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedScriptType("blessed script"));
        assertFalse(OPFChecker30.isBlessedScriptType("script"));
    }

    @Test
    public void isCoreMediaType_CoreMediaTypes

    Test() {
        assertTrue(OPFChecker30.isCoreMediaType("core media"));
        assertFalse(OPFChecker30.isCoreMediaType("other core media"));
    }

    @Test
    public void getPreferredMediaType_NoExceptions

    Test() {
        String type = "video";
        String path = "/path/to/video";
        String preferredMedia = OPFChecker30.getPreferredMediaType(type, path);
    }

    @Test
    public void getPreferredMediaType_WithExceptions

    Test() {
        String type = "video";
        String path = "/invalid/path";
        OPFChecker30.getPreferredMediaType(type, path);
    }

}