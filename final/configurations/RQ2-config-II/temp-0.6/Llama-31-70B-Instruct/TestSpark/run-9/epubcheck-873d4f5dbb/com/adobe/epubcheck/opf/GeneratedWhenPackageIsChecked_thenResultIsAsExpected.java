package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedWhenPackageIsChecked_thenResultIsAsExpected {

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

}