package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", ""));
        assertNotEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("text/plain", ""));
    }

}