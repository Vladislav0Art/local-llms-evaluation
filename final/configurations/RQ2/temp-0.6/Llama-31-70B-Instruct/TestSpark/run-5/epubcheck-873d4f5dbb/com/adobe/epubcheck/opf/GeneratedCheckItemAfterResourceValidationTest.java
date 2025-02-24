package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem();
        opfChecker30.checkItemAfterResourceValidation(opfItem);
    }

}