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

public class GeneratedInitHandlerTest {

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

}