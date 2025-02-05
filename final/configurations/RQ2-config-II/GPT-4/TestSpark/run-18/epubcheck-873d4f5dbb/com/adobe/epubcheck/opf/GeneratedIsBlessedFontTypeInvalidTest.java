package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeInvalidTest {

    @Test
    public void isBlessedFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedFontType("text/html"));
    }

}