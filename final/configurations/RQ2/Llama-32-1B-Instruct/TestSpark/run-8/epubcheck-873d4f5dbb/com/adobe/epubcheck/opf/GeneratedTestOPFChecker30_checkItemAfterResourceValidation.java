package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTestOPFChecker30_checkItemAfterResourceValidation {

    public static void init() {
        // Implementation
    }

    @Test
    public void testOPFChecker30_checkItemAfterResourceValidation() {
        OPFItem item = new OPFItem("test", "test");
        OPFHandler handler = new MockHandler();
        OPFChecker30checker = new OPFChecker30(handler);
        checkItemAfterResourceValidation(item, checker);
        assert Not null;
    }

}