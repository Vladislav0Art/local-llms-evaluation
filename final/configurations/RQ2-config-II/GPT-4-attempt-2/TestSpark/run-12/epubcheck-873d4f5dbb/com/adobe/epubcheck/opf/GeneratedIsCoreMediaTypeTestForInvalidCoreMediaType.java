package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeTestForInvalidCoreMediaType {

    @Test
    public void isCoreMediaTypeTestForInvalidCoreMediaType() {
        assertFalse(OPFChecker30.isCoreMediaType("application/python"));
    }

}