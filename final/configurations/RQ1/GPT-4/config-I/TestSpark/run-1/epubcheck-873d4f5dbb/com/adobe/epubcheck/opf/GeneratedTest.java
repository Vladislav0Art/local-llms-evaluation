package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void checkItemEmptyValidationContextTest() {
        OPFChecker30 checker = new OPFChecker30(Report.createReport("test", EPUBVersion.VERSION_3));
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(true);
        checker.checkItem(item, Mockito.mock(OPFHandler.class));
        verify(item, Mockito.times(1)).getLocation();
    }

    @Test
    public void checkItemAfterResourceValidationWithItemInSpineTest() {
        OPFChecker30 checker = new OPFChecker30(Report.createReport("test", EPUBVersion.VERSION_3));
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.isInSpine()).thenReturn(true);
        when(item.isRemote()).thenReturn(true);
        checker.checkItemAfterResourceValidation(item);
        verify(item, Mockito.times(2)).getLocation();
    }

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("invalid"));
    }

    @Test
    public void isAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/"));
    }

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("invalid"));
    }

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("invalid"));
    }

    @Test
    public void isVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/"));
    }

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("invalid"));
    }

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("invalid"));
    }

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/"));
    }

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        String preferredMedia = OPFChecker30.getPreferredMediaType("", "");
        assertTrue(preferredMedia == null || preferredMedia.isEmpty());
    }

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        String preferredMedia = OPFChecker30.getPreferredMediaType("text/javascript", "");
        assertTrue(preferredMedia.equals("application/javascript"));
    }

    @Test
    public void getPreferredMediaTypeValidTypeWithPluginTest() {
        String preferredMedia = OPFChecker30.getPreferredMediaType("application/vnd.ms-opentype", "something.otf");
        assertTrue(preferredMedia.equals("font/otf"));
    }

}