package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
    }

}