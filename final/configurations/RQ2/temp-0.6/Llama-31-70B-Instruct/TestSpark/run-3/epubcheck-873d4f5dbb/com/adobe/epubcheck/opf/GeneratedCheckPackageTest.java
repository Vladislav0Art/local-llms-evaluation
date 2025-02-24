package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext validationContext = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        assertFalse(opfChecker30.checkPackage());
    }

}