package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeValidTest {

    @Test
    public void isBlessedFontTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/x-font-ttf"));
    }

}