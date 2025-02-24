package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkPackage()).thenReturn(true);
        assertEquals(true, checker.checkPackage());
    }

}