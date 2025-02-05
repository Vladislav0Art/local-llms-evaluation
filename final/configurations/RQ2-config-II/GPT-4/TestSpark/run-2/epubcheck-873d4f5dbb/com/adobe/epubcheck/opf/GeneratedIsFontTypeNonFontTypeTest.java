package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsFontTypeNonFontTypeTest {

    @Test
    public void isFontTypeNonFontTypeTest() {
        String type = "video/mp4";
        assertEquals(false, OPFChecker30.isFontType(type));
    }

}