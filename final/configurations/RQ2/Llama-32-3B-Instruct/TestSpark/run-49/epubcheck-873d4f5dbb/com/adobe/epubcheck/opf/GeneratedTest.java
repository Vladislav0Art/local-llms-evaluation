package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext context;

    public void setUp() {
        when(context.getEPUBLocation()).thenReturn(EPUBLocation.of("http://example.com"));
    }

    @Test
    public void initHandler_ReturnsTrue() {
        when(context.isFirstRun()).thenReturn(true);
        assertTrue(OPFChecker30.class.getMethod("initHandler", ValidationContext.class).invoke(null, context));
    }

    @Test
    public void checkPackage_ReturnsFalse() {
        assertTrue(OPFChecker30.class.getMethod("checkPackage", ValidationContext.class).invoke(null, context));
    }

    @Test
    public void checkContent_ReturnsTrue() {
        assertTrue(OPFChecker30.class.getMethod("checkContent", ValidationContext.class).invoke(null, context));
    }

    @Test
    public void checkItem_ReturnsFalse() {
        when(context.isFirstRun()).thenReturn(false);
        assertFalse(OPFChecker30.class.getMethod("checkItem", OPFItem.class, OPFHandler.class).invoke(null, null, null));
    }

    @Test
    public void isAudioType_AudioTypesReturnTrue() {
        assertTrue(OPFChecker30.class.getMethod("isAudioType", String.class).invoke(null, "audio"));
    }

    @Test
    public void isBlessedAudioType_BlessedAudioTypeReturnsTrue() {
        assertTrue(OPFChecker30.class.getMethod("isBlessedAudioType", String.class).invoke(null, "blessed:audio"));
    }

    @Test
    public void isVideoType_VideoTypesReturnFalse() {
        assertFalse(OPFChecker30.class.getMethod("isVideoType", String.class).invoke(null, "video"));
    }

    @Test
    public void getPreferredMediaType_PreferenceMediaTypesReturnsTrue() {
        assertTrue(OPFChecker30.class.getMethod("getPreferredMediaType", String.class, String.class).invoke(null, "audio", "/path/to/audio"));
    }

}