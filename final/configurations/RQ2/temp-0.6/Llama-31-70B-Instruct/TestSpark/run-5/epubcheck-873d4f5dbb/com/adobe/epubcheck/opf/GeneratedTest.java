package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertFalse(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertFalse(opfChecker30.checkContent());
    }

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkItem(opfItem, opfHandler);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem();
        opfChecker30.checkItemAfterResourceValidation(opfItem);
    }

    @Test
    public void checkSpineItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkSpineItem(opfItem, opfHandler);
    }

    @Test
    public void isAudioTypeTest() {
        String type = "audio/mpeg";
        assertTrue(OPFChecker30.isAudioType(type));
    }

}