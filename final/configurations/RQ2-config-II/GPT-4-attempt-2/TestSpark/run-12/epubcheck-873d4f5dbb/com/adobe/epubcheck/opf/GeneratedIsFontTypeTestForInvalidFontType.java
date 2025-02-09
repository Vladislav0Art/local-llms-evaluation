package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsFontTypeTestForInvalidFontType {

    @Test
    public void isFontTypeTestForInvalidFontType() {
        assertFalse(OPFChecker30.isFontType("text/plain"));
    }

}