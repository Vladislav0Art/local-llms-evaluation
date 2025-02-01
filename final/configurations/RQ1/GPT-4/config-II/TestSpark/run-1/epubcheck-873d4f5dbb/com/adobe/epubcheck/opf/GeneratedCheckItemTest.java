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

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() throws URISyntaxException {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        URI uri = new URI("http://example.com");
        when(item.getURL()).thenReturn(uri);
        when(item.getMimeType()).thenReturn("image/png");
        OPFChecker30 o = new OPFChecker30(context);
        o.checkItem(item, opfHandler);
        verify(item, times(1)).hasDataURL();
    }

}