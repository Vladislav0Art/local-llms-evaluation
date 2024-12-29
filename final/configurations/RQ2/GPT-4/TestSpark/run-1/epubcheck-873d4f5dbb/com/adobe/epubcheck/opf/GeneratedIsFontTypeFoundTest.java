package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsFontTypeFoundTest {

    @Test
    public void isFontTypeFoundTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

}