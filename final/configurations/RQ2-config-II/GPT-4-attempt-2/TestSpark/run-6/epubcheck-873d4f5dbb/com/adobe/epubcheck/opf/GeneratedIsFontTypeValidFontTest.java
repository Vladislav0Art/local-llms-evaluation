package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsFontTypeValidFontTest {

    @Test
    public void isFontTypeValidFontTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

}