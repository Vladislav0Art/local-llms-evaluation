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

public class GeneratedTest {

    @Test
    public void initHandlerTest() throws Exception {
        // Prepare test data
        ValidationContext validationContext = new ValidationContext();
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);

        // Execute the method
        opfChecker30.initHandler();

        // There is no return, so we check that OPFHandler is of type OPFHandler30
        Assert.assertTrue(opfChecker30.getOpfHandler() instanceof OPFHandler30);
    }

    @Test
    public void checkContentTest() throws Exception {
        // Prepare test data
        ValidationContext validationContext = new ValidationContext();
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        opfChecker30.initHandler();

        // Execute the method
        boolean result = opfChecker30.checkContent();

        // Assert the result
        Assert.assertTrue(result);
    }

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

    @Test
    public void checkSpecificsTest() {
        // Prepare Mock
        ValidationContext mockContext = Mockito.mock(ValidationContext.class);
        Profile mockProfile = new Profile(EPUBVersion.VERSION_3, "", MessageId.values());
        FeatureReport mockFeatureReport = new FeatureReport();
        mockFeatureReport.addFeature(new Feature(FeatureEnum.DICTIONARY, new ArrayList<>()));

        // Prepare Map
        Map<FeatureEnum, String> featureReportMap = new HashMap<>();
        featureReportMap.put(FeatureEnum.DICTIONARY, "dictionary");

        // Set Mock Arrays
        Mockito.when(mockContext.getProfile()).thenReturn(mockProfile);
        Mockito.when(mockContext.featureReport.hasFeature(FeatureEnum.DICTIONARY)).thenReturn(true);
        Mockito.when(mockContext.featureReport.hasFeature(FeatureEnum.DICTIONARY)).thenReturn(true);
        Mockito.when(mockContext.featureReport.getFeature(FeatureEnum.DICTIONARY)).thenReturn(mockFeatureReport.getFeature(FeatureEnum.DICTIONARY));
        OPFChecker30 opfChecker30 = new OPFChecker30(mockContext);
        opfChecker30.initHandler();

        // Execute checkSpecifics method
        opfChecker30.checkSpecifics();

        // Verify results
        Mockito.verify(mockContext.featureReport, Mockito.atLeastOnce()).hasFeature(FeatureEnum.DICTIONARY);
    }

}