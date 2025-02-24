package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFHandler opfHandler = new OPFHandler(new ValidationContext());
        OPFItem item = new OPFItem("test", "test", "test", "test", "test");
        opfChecker30.checkItem(item, opfHandler);
    }

}