package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkPackage();

        assertTrue(opfChecker30.isValid());
    }

}