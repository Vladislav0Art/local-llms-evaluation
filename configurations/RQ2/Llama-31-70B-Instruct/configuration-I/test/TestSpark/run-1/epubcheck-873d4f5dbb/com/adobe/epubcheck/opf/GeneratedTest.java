package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.initHandler();
        // assertions
    }

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        boolean result = opfChecker30.checkContent();
        assertTrue(result);
    }

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.checkItem(mock(OPFItem.class), mock(OPFHandler.class));
        // assertions
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.checkItemAfterResourceValidation(mock(OPFItem.class));
        // assertions
    }

    @Test
    public void checkSpineItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.checkSpineItem(mock(OPFItem.class), mock(OPFHandler.class));
        // assertions
    }

}