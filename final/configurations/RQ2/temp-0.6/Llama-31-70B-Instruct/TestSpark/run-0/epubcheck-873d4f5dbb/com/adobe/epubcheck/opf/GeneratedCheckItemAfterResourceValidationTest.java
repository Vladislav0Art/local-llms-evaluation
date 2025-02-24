package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem(null, null, null);
        opfChecker30.checkItemAfterResourceValidation(opfItem);
    }

}