package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsFontType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsFontType() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
        assertFalse(OPFChecker30.isFontType("image/png"));
    }

}