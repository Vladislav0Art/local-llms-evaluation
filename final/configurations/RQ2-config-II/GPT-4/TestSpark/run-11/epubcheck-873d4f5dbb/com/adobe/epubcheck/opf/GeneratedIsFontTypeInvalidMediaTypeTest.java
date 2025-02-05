package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsFontTypeInvalidMediaTypeTest {

    @Test
    public void isFontTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isFontType("invalid/font"));
    }

}