package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeValidTest {

    @Test
    public void isFontTypeValidTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

}