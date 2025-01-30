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

public class GeneratedCheckContentTest {

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

}