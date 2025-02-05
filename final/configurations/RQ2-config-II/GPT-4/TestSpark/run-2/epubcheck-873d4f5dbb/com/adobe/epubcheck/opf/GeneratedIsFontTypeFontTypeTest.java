package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsFontTypeFontTypeTest {

    @Test
    public void isFontTypeFontTypeTest() {
        String type = "application/font-woff";
        assertEquals(true, OPFChecker30.isFontType(type));
    }

}