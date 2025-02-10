package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;

public class GeneratedTestCheckPackage {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void testCheckPackage() {
        when(opfChecker30UnderTest.checkPackage()).thenReturn(false);
        assertFalse(opfChecker30UnderTest.checkPackage());
    }

}