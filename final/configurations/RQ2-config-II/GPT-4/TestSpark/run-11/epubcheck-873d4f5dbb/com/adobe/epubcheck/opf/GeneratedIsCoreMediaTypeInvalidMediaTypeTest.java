package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidMediaTypeTest {

    @Test
    public void isCoreMediaTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("invalid/core"));
    }

}