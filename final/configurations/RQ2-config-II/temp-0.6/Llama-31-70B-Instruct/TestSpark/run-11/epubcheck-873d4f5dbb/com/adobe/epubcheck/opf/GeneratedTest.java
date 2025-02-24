package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testCheckPackage() {
        OPFChecker30 opfChecker30 = Mockito.spy(new OPFChecker30(new ValidationContext()));
        assertTrue(opfChecker30.checkPackage());
    }

}