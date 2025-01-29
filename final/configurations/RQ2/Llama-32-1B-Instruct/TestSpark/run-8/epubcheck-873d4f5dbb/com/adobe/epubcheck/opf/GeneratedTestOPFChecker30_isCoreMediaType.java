package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTestOPFChecker30_isCoreMediaType {

    public static void init() {
        // Implementation
    }

    @Test
    public void testOPFChecker30_isCoreMediaType() {
        boolean result = OPFChecker30.isCoreMediaType("video");
        Assert.assertFalse(result);
    }

}