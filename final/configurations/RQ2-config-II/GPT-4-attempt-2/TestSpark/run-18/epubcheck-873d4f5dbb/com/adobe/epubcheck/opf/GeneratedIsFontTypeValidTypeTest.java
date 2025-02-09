package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeValidTypeTest {

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

}