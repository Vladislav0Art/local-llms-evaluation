package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.messages.Message;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.FeatureReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Report report;

    @Mock
    private FeatureReport featureReport;

    @Test
    public void checkItemDataURLTest() throws MalformedURLException {
        OPFChecker30 checker30 = new OPFChecker30(context);
        when(item.hasDataURL()).thenReturn(true);
        when(item.getLocation()).thenReturn(null);
        checker30.checkItem(item, opfHandler);
        verify(report).message(MessageId.RSC_029, null);
    }

    @Test
    public void checkItemMetaInfPathTest() throws MalformedURLException {
        OPFChecker30 checker30 = new OPFChecker30(context);
        when(item.hasDataURL()).thenReturn(false);
        when(item.getPath()).thenReturn("META-INF/test");
        when(item.getLocation()).thenReturn(null);
        checker30.checkItem(item, opfHandler);
        verify(report).message(MessageId.PKG_025, null);
    }

    @Test
    public void checkItemMimeTypeNoDataTypeTest() {
        when(item.getMimeType()).thenReturn(null);
        OPFChecker30 checker30 = new OPFChecker30(context);
        checker30.checkItem(item, opfHandler);
        assertTrue(true); //It's enough that the test passed without exceptions
    }

    @Test
    public void checkContentTest() {
        when(context.featureReport.hasFeature(FeatureReport.FeatureEnum.HAS_SCRIPTS)).thenReturn(true);
        OPFChecker30 checker30 = new OPFChecker30(context);
        assertTrue(checker30.checkContent());
    }

    @Test
    public void isAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isAudioTypeFalseTest() {
        assertTrue(!OPFChecker30.isAudioType("video/mpeg"));
    }

    @Test
    public void isCOREMediaTypeTrueTest() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
    }

    @Test
    public void isCOREMediaTypeFalseTest() {
        assertTrue(!OPFChecker30.isCoreMediaType("non/audio/mpeg"));
    }

}