package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        assertTrue(opfChecker30.checkPackage());
    }

}