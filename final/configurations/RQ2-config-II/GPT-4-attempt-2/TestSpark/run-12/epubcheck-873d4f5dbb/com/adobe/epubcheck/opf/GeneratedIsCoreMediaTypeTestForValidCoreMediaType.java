package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeTestForValidCoreMediaType {

    @Test
    public void isCoreMediaTypeTestForValidCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("application/javascript"));
    }

}