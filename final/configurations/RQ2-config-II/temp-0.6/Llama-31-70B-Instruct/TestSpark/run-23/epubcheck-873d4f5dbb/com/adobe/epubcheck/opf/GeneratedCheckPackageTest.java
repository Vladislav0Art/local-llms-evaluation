package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        assertEquals(true, opfChecker30.checkPackage());
    }

}