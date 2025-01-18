package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeInvalidTypeTest {

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("font/ttf"));
    }

}