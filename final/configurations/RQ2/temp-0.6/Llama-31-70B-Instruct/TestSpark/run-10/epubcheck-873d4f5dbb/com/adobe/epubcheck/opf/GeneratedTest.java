package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.initHandler();

        assertTrue(opfChecker30.isValid());
    }

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkPackage();

        assertTrue(opfChecker30.isValid());
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkContent();

        assertTrue(opfChecker30.isValid());
    }

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));

        assertTrue(opfChecker30.isValid());
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkItemAfterResourceValidation(Mockito.mock(OPFItem.class));

        assertTrue(opfChecker30.isValid());
    }

}