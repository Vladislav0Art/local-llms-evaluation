package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeFalseTest {

    @Test
    public void isBlessedFontTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/invalid"));
    }

}