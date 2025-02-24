package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem item = new OPFItem("test", "test", "test", "test", "test");
        opfChecker30.checkItemAfterResourceValidation(item);
    }

}