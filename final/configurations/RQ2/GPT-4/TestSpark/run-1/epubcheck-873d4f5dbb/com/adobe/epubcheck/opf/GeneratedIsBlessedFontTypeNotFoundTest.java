package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeNotFoundTest {

    @Test
    public void isBlessedFontTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedFontType("unknownType"));
    }

}