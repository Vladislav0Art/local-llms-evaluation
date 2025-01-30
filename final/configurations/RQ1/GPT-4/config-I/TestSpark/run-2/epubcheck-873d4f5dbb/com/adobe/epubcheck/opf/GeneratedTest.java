package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.ValidationContext;
import org.junit.Assert;
import com.adobe.epubcheck.util.CheckingReport;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.messages.MessageId;
import io.mola.galimatias.URL;
import com.adobe.epubcheck.api.FeatureReport;

import java.util.Collections;

public class GeneratedTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkPackage();
        verify(context, times(1)).getReferences();
        verify(context, times(1)).getFeatureReport();
    }

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        Assert.assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void isAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

    @Test
    public void isVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        Assert.assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mpeg"));
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("audio/mpeg"));
    }

    @Test
    public void isFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("font/otf"));
        Assert.assertFalse(OPFChecker30.isFontType("video/mpeg"));
    }

    @Test
    public void isBlessedStyleTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("text/css"));
        Assert.assertFalse(OPFChecker30.isCoreMediaType("audio/mpeg"));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("font/otf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.otf"));
        Assert.assertEquals("font/ttf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.ttf"));
        Assert.assertNull(OPFChecker30.getPreferredMediaType("application/form-sdnt", "test.ttf"));
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        CheckingReport report = mock(CheckingReport.class);
        when(context.getReport()).thenReturn(report);
        when(context.hasReferences()).thenReturn(true);
        when(context.getFeatureReport()).thenReturn(mock(FeatureReport.class));

        URL url = mock(URL.class);

        OPFItem opfItem = mock(OPFItem.class);
        when(opfItem.getMimeType()).thenReturn("audio/mpeg");
        when(opfItem.getURL()).thenReturn(url);

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItemAfterResourceValidation(opfItem);
        verify(report, never()).message(MessageId.RSC_006, opfItem.getLocation().toString(), opfItem.getPath());
    }

    @Test
    public void checkItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        CheckingReport report = mock(CheckingReport.class);
        when(context.getReport()).thenReturn(report);

        OPFItem item = mock(OPFItem.class);
        when(item.getMimeType()).thenReturn("abc/def");
        when(item.getPath()).thenReturn("META-INF/item.xml");

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(item, null);
        verify(report, times(1)).message(MessageId.PKG_025, new Object[]{item.getLocation().toString()});
    }

}