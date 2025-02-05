package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeTest {

    private final ValidationContext mockContext = new ValidationContext(EPUBVersion.VERSION_3_0);

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
        assertFalse(OPFChecker30.isCoreMediaType("text/plain"));
    }

}