package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeKnownTypeTest {

    @Test
    public void getPreferredMediaTypeKnownTypeTest() {
        assertEquals("image/png", OPFChecker30.getPreferredMediaType("image/x-png", "/path/to/file.png"));
    }

}