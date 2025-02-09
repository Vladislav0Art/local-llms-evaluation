package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeInvalidFontTest {

    @Test
    public void isBlessedFontTypeInvalidFontTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/pdf"));
    }

}