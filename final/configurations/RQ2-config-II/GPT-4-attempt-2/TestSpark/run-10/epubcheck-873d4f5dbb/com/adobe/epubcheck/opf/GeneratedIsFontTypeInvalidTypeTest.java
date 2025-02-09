package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsFontTypeInvalidTypeTest {

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isFontType("video/avi"));
    }

}