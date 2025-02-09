package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeTestForInvalidMediaType {

    @Test
    public void getPreferredMediaTypeTestForInvalidMediaType() {
        assertEquals("text/plain", OPFChecker30.getPreferredMediaType("text/vbscript", "test.vb"));
    }

}