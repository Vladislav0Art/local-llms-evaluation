package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        opfChecker30.initHandler();
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem(null, null, null);
        OPFHandler opfHandler = new OPFHandler(null);
        opfChecker30.checkItem(opfItem, opfHandler);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem(null, null, null);
        opfChecker30.checkItemAfterResourceValidation(opfItem);
    }

}