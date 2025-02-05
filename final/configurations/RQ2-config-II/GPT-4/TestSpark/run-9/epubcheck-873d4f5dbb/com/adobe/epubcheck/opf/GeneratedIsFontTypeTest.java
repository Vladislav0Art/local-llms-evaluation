package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
        assertFalse(OPFChecker30.isFontType("font/other"));
    }

}