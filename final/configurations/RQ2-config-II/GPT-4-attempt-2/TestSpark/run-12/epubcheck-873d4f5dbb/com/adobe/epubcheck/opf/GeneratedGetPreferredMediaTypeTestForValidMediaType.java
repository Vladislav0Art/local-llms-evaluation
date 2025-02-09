package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeTestForValidMediaType {

    @Test
    public void getPreferredMediaTypeTestForValidMediaType() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/ecmascript", "test.js"));
    }

}