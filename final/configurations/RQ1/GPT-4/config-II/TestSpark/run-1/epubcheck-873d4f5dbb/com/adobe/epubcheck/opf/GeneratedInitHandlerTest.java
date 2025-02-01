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

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();
        Mockito.verify(context, times(1)).getVersion();
    }

}