package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCheckSpineItem {

    @Test
    public void testCheckSpineItem() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFHandler opfHandler = new OPFHandler(new ValidationContext());
        OPFItem item = new OPFItem("test", "test", "test", "test", "test");
        opfChecker30.checkSpineItem(item, opfHandler);
    }

}