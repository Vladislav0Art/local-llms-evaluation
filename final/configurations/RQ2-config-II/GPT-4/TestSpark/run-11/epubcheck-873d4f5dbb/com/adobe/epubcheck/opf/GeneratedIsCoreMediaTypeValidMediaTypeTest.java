package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeValidMediaTypeTest {

    @Test
    public void isCoreMediaTypeValidMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
        assertFalse(OPFChecker30.isCoreMediaType("image/tiff"));
    }

}