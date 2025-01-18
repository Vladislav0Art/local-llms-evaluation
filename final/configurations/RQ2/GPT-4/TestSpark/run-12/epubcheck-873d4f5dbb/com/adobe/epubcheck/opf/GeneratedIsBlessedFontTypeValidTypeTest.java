package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeValidTypeTest {

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
    }

}