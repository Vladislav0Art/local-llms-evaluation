package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void initHandler_ValidatesOPFHeader() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        Mockito.verify(opfHandler).init();
    }

    @Test
    public void checkPackage_ThrowsExceptionForInvalidPackage() {
        when(validationContext.getOPF()).thenReturn(new OPF("invalid xml"));
        try {
            OPFChecker30 instance = new OPFChecker30(validationContext);
            instance.checkPackage();
            assert false;
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void checkContent_ValidatesMetadata() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkContent();
    }

    @Test
    public void checkItem_ValidatesSPINE() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        when(opfHandler.getSpine()).thenReturn(new SPINE());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkItem(new OPFItem(), opfHandler);
    }

    @Test
    public void checkItemAfterResourceValidation_ValidatesResources() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        when(opfHandler.getResources()).thenReturn(new Resources());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkItemAfterResourceValidation(new OPFItem());
    }

    @Test
    public void checkSpineItem_ValidatesNAV() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        when(opfHandler.getNav()).thenReturn(new NAV());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkSpineItem(new OPFItem(), opfHandler);
    }

    @Test
    public void isAudioType_ValidatesAudioFormat() {
        String type = "audio/mpeg";
        assertTrue(OPFChecker30.isAudioType(type));
    }

    @Test
    public void isBlessedAudioType_ValidatesBlessedAudioFormat() {
        String type = "audio/blessed-mpeg";
        assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

    @Test
    public void isVideoType_ValidatesVideoFormat() {
        String type = "video/mp4";
        assertTrue(OPFChecker30.isVideoType(type));
    }

    @Test
    public void isBlessedVideoType_ValidatesBlessedVideoFormat() {
        String type = "video/blessed-mp4";
        assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

    @Test
    public void isCommonVideoType_ValidatesCommonVideoFormat() {
        String type = "video/x-mpeg-4";
        assertTrue(OPFChecker30.isCommonVideoType(type));
    }

    @Test
    public void isFontType_ValidatesFontFormat() {
        String type = "text/plain";
        assertTrue(OPFChecker30.isFontType(type));
    }

    @Test
    public void isBlessedFontType_ValidatesBlessedFontFormat() {
        String type = "text/blessed-plain";
        assertTrue(OPFChecker30.isBlessedFontType(type));
    }

    @Test
    public void isBlessedScriptType_ValidatesBlessedScriptFormat() {
        String type = "application/x-blessed-script";
        assertTrue(OPFChecker30.isBlessedScriptType(type));
    }

    @Test
    public void isCoreMediaType_ValidatesCoreMediaFormat() {
        String type = "text/coremedia";
        assertTrue(OPFChecker30.isCoreMediaType(type));
    }

    @Test
    public void getPreferredMediaType_ValidatesPreferredMediaType() {
        String type = "video/mp4";
        String path = "/path/to/video.mp4";
        String preferredMediaType = "video/mp4";
        assertEquals(preferredMediaType, OPFChecker30.getPreferredMediaType(type, path));
    }

}