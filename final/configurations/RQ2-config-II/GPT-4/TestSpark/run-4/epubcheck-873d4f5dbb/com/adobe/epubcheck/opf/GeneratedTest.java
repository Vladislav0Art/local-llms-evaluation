package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {


    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFItem mockOPFItem;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void OPFChecker30ValidationContextConstructorTest() {
        new OPFChecker30(mockValidationContext);
    }

    @Test
    public void initHandlerTest() {
        new OPFChecker30(mockValidationContext).initHandler();
    }

    @Test
    public void checkPackageTest() {
        new OPFChecker30(mockValidationContext).checkPackage();
    }

    @Test
    public void checkContentTest() {
        new OPFChecker30(mockValidationContext).checkContent();
    }

    @Test
    public void checkItemTest() {
        new OPFChecker30(mockValidationContext).checkItem(mockOPFItem, mockOPFHandler);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        new OPFChecker30(mockValidationContext).checkItemAfterResourceValidation(mockOPFItem);
    }

    @Test
    public void checkSpineItemTest() {
        new OPFChecker30(mockValidationContext).checkSpineItem(mockOPFItem, mockOPFHandler);
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/x-msvideo"));
    }

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/x-font-ttf"));
    }

    @Test
    public void isBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/x-font-otf"));
    }

    @Test
    public void isBlessedScriptTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "path"));
    }

}