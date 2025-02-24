package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    ValidationContext context;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenPackageIsChecked_thenResultIsAsExpected() {
        OPFChecker30 opfChecker = new OPFChecker30(context);
        boolean result = opfChecker.checkPackage();

        assertTrue(result);
    }

    @Test
    public void whenContentIsChecked_thenResultIsAsExpected() {
        OPFChecker30 opfChecker = new OPFChecker30(context);
        boolean result = opfChecker.checkContent();

        assertTrue(result);
    }

    @Test
    public void whenItemIsChecked_thenResultIsAsExpected() {
        OPFChecker30 opfChecker = new OPFChecker30(context);
        OPFHandler opfHandler = new OPFHandler();
        OPFItem item = new OPFItem();

        boolean result = opfChecker.checkItem(item, opfHandler);

        assertTrue(result);
    }

    @Test
    public void whenItemAfterResourceValidationIsChecked_thenResultIsAsExpected() {
        OPFChecker30 opfChecker = new OPFChecker30(context);
        OPFItem item = new OPFItem();

        opfChecker.checkItemAfterResourceValidation(item);
    }

}