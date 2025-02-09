package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeValidFontTest {

    @Test
    public void isBlessedFontTypeValidFontTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

}