package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeValidTest {

    @Test
    public void isBlessedFontTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/opentype"));
    }

}