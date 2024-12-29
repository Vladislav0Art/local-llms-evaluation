package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeSameTest {

    @Test
    public void getPreferredMediaTypeSameTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "file/path"));
    }

}