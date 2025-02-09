package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

}