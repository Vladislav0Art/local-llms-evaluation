package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeInvalidTest {

    @Test
    public void isBlessedFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedFontType("text/html"));
    }

}