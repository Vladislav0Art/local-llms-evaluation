package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeTestForUnsupportedType {

    @Test
    public void isBlessedFontTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedFontType("font/truetype"));
    }

}