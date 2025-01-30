package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.messages.MessageLocation;
import com.adobe.epubcheck.util.FeatureReport;
import com.adobe.epubcheck.util.FeatureReport.Feature;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.util.url.URLBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        // Preparing Mock
        Report mockReport = Mockito.mock(Report.class);
        ValidationContext mockContext = Mockito.mock(ValidationContext.class);
        Mockito.when(mockContext.getReport()).thenReturn(mockReport);
        OPFItem mockItem = Mockito.mock(OPFItem.class);
        Mockito.when(mockItem.hasDataURL()).thenReturn(true);
        URL url = URLBuilder.build();

        // Preparing Object to test
        OPFChecker30 opfChecker30 = new OPFChecker30(mockContext);
        opfChecker30.initHandler();

        // Executing Test
        opfChecker30.checkItem(mockItem, opfChecker30.getOpfHandler());

        // Verifying Results
        Mockito.verify(mockReport).message(MessageId.RSC_029, new MessageLocation(url, -1, -1, ""));
    }

}