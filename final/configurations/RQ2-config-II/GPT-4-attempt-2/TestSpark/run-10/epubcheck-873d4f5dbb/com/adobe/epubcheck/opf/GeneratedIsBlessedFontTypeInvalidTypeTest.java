package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedFontTypeInvalidTypeTest {

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isBlessedFontType("font/ttf"));
    }

}