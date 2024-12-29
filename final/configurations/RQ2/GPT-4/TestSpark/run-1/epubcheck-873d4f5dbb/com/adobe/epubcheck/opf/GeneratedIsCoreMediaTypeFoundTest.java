package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeFoundTest {

    @Test
    public void isCoreMediaTypeFoundTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/javascript"));
    }

}