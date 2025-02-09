package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        boolean result = OPFChecker30.isFontType("font/woff");
        assertTrue(result);
    }

}