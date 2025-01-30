package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void checkItemHasDataURLTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem opfItem = mock(OPFItem.class);
        Report report = mock(Report.class);
        when(context.report).thenReturn(report);
        when(opfItem.getLocation()).thenReturn(null);
        when(opfItem.hasDataURL()).thenReturn(true);

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(opfItem, opfHandler);
        verify(report).message(eq(MessageId.RSC_029), any());
    }

    @Test
    public void checkItemStartsWithMetaInfTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem opfItem = mock(OPFItem.class);
        Report report = mock(Report.class);
        when(context.report).thenReturn(report);
        when(opfItem.getLocation()).thenReturn(null);
        when(opfItem.hasDataURL()).thenReturn(false);
        when(opfItem.getPath()).thenReturn("META-INF/test");

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(opfItem, opfHandler);
        verify(report).message(eq(MessageId.PKG_025), any());
    }

    @Test
    public void isAudioTypeTest() {
        String type = "audio/test";
        Assert.assertTrue(OPFChecker30.isAudioType(type));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        String type = "audio/mpeg";
        Assert.assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

    @Test
    public void isVideoTypeTest() {
        String type = "video/test";
        Assert.assertTrue(OPFChecker30.isVideoType(type));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        String type = "video/mp4";
        Assert.assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

    @Test
    public void isFontTypeTest() {
        String type = "font/otf";
        Assert.assertTrue(OPFChecker30.isFontType(type));
    }

    @Test
    public void isBlessedFontTypeTest() {
        String type = "font/otf";
        Assert.assertTrue(OPFChecker30.isBlessedFontType(type));
    }

    @Test
    public void isBlessedItemTypeTest() {
        String type = "application/xhtml+xml";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Assert.assertTrue(OPFChecker30.isBlessedItemType(type, version));
    }

}