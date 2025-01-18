package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

    @Test
    public void checkPackageWithNullContextTest() {
        ValidationContext context = null;
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkPackage();
        assertFalse(result);
    }

    @Test
    public void checkContentWithNullContextTest() {
        ValidationContext context = null;
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkContent();
        assertFalse(result);
    }

    @Test
    public void checkItemWithNullParamsTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(null, null);

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

    @Test
    public void checkItemAfterResourceValidationWithNullParamTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(null);

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

    @Test
    public void checkSpineItemWithNullParamsTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkSpineItem(null, null);

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audi/flac"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("audio/mp4"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
        assertFalse(OPFChecker30.isFontType("font/opentype"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        assertFalse(OPFChecker30.isBlessedFontType("font/opentype"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/typescript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
        assertFalse(OPFChecker30.isCoreMediaType("application/xml"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "path/to/file.js"));
        assertEquals("text/vcard", OPFChecker30.getPreferredMediaType("text/x-vcard", "path/to/file.vcf"));
    }

}