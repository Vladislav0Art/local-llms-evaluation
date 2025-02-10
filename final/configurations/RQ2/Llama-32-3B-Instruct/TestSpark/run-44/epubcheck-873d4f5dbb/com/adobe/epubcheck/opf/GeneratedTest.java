package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerInit() {
        opfChecker30.initHandler();
    }

    @Test
    public void checkPackageReturnsFalse() {
        when(context.getOPFItem()).thenReturn(new OPFItem());
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentReturnsTrue() {
        when(context.getOPFItem()).thenReturn(new OPFItem());
        assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void checkItem_returnsFalse_WhenItemIsMissing() {
        when(context.getOPFItem()).thenReturn(null);
        assertFalse(opfChecker30.checkItem(new OPFItem(), new OPFHandler()));
    }

    @Test
    public void checkItemAfterResourceValidation_returnsFalse_WhenItemHasNoResources() {
        when(context.getOPFItem()).thenReturn(new OPFItem());
        opfChecker30.checkItemAfterResourceValidation(new OPFItem());
        assertFalse(opfChecker30.checkItemAfterResourceValidation(new OPFItem()));
    }

    @Test
    public void checkSpineItem_returnsFalse_WhenItemIsMissing() {
        when(context.getOPFItem()).thenReturn(null);
        assertFalse(opfChecker30.checkSpineItem(new OPFItem(), new OPFHandler()));
    }

    @Test
    public void isAudioType

    ReturnsCorrectValueForAudioTypes() {
        assertEquals(true, OPFChecker30.isAudioType("audio"));
        assertEquals(false, OPFChecker30.isAudioType("video"));
    }

    @Test
    public void isBlessedAudioType

    ReturnsCorrectValueForBlessedAudioTypes() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("blessed audio"));
        assertEquals(false, OPFChecker30.isBlessedAudioType("audio"));
    }

    @Test
    public void isVideoType

    ReturnsTrueForVideoType() {
        assertEquals(true, OPFChecker30.isVideoType("video"));
        assertEquals(false, OPFChecker30.isVideoType("audio"));
    }

    @Test
    public void isBlessedVideoType

    ReturnsTrueForBlessedVideoTypes() {
        assertEquals(true, OPFChecker30.isBlessedVideoType("blessed video"));
        assertEquals(false, OPFChecker30.isBlessedVideoType("video"));
    }

    @Test
    public void isCommonVideoType

    ReturnsCorrectValueForCommonVideoTypes() {
        assertEquals(true, OPFChecker30.isCommonVideoType("common video"));
        assertEquals(false, OPFChecker30.isCommonVideoType("blessed common video"));
    }

    @Test
    public void isFontType

    ReturnsTrueForFontType() {
        assertEquals(true, OPFChecker30.isFontType("font"));
        assertEquals(false, OPFChecker30.isFontType("video"));
    }

    @Test
    public void isBlessedFontType

    ReturnsTrueForBlessedFontTypes() {
        assertEquals(true, OPFChecker30.isBlessedFontType("blessed font"));
        assertEquals(false, OPFChecker30.isBlessedFontType("font"));
    }

    @Test
    public void isBlessedScriptType

    ReturnsTrueForBlessedScriptTypes() {
        assertEquals(true, OPFChecker30.isBlessedScriptType("blessed script"));
        assertEquals(false, OPFChecker30.isBlessedScriptType("script"));
    }

    @Test
    public void isCoreMediaType

    ReturnsTrueForCoreMediaTypes() {
        assertEquals(true, OPFChecker30.isCoreMediaType("core media"));
        assertEquals(false, OPFChecker30.isCoreMediaType("blessed core media"));
    }

    @Test
    public void getPreferredMediaType

    ReturnsCorrectPreferredMediaForGivenPath() {
        when(context.getPreferredMediaType()).thenReturn(Optional.of("preferred media"));
        String preferredMediaType = OPFChecker30.getPreferredMediaType("path", "media");
        assertEquals("preferred media", preferredMediaType);
    }

}