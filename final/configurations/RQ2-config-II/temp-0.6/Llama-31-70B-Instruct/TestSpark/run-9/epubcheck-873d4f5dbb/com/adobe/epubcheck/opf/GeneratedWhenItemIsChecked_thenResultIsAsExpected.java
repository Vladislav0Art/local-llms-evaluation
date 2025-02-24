package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedWhenItemIsChecked_thenResultIsAsExpected {

    @Mock
    ValidationContext context;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenItemIsChecked_thenResultIsAsExpected() {
        OPFChecker30 opfChecker = new OPFChecker30(context);
        OPFHandler opfHandler = new OPFHandler();
        OPFItem item = new OPFItem();

        boolean result = opfChecker.checkItem(item, opfHandler);

        assertTrue(result);
    }

}