package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeTrueTest {

    @Test
    public void isBlessedFontTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
    }

}