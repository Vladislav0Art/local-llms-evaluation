package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTestOPFChecker30_checkItem {

    public static void init() {
        // Implementation
    }

    @Test
    public void testOPFChecker30_checkItem() {
        OPFItem item = new OPFItem("test", "test");
        OPFHandler handler = new OPFHandler(new MockHandler());
        OPFChecker30checker = new OPFChecker30(handler);
        checkItem(item, checker);
        assert Not null;
    }

}