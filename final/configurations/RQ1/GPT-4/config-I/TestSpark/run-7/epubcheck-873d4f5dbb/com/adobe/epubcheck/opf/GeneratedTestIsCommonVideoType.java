package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.FeatureReport;
import com.adobe.epubcheck.api.MessageId;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageLocationImpl;
import com.adobe.epubcheck.opf.DocumentValidator;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

public class GeneratedTestIsCommonVideoType {

    @Mock
    ValidationContext contextMock;
    @Mock
    Report reportMock;
    @Mock
    FeatureReport featureReportMock;

    private OPFChecker30 opfChecker30;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(contextMock.getVersion()).thenReturn(EPUBVersion.VERSION_3);
        Mockito.when(contextMock.getReport()).thenReturn(reportMock);
        Mockito.when(contextMock.featureReport).thenReturn(featureReportMock);
        this.opfChecker30 = new OPFChecker30(contextMock);
    }

    @Test
    public void testIsCommonVideoType() {
        assertEquals(true, OPFChecker30.isCommonVideoType("video/mp4"));
        assertEquals(false, OPFChecker30.isCommonVideoType("video/avi"));
    }

}