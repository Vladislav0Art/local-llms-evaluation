package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeInValidTypeTest {

    @Test
    public void isBlessedFontTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/xyz"));
    }

}