package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeReplacedTest {

    @Test
    public void getPreferredMediaTypeReplacedTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "file/path"));
    }

}