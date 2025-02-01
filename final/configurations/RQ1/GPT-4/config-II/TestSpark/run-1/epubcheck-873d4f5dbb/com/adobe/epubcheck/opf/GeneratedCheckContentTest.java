package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.FeatureReport;
import com.adobe.epubcheck.util.FeatureReport.Feature;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.util.ReportingLevel;
import com.adobe.epubcheck.opf.XPathLocation;
import com.adobe.epubcheck.opf.OPFData;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.ValidationContext.ValidationContextBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        when(context.getReportingLevel()).thenReturn(ReportingLevel.Usage);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        Boolean result = opfChecker30.checkContent();
        assert result.equals(true);
        verify(context, times(1)).getFeatureReport();
        verify(context, times(1)).getOPFHHandler();
    }

}