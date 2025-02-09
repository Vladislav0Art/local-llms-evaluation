package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsFontTypeValidTypeTest {

    @Test
    public void isFontTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isFontType("font/ttf"));
    }

}