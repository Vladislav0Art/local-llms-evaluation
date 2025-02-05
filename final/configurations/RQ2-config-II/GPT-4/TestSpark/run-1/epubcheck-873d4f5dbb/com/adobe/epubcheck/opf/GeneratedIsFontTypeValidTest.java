package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeValidTest {

    @Test
    public void isFontTypeValidTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
    }

}