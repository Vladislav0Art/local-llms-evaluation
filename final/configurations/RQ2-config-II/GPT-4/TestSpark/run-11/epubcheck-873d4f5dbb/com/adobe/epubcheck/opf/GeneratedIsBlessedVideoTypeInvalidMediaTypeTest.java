package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsBlessedVideoTypeInvalidMediaTypeTest {

    @Test
    public void isBlessedVideoTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("invalid/video"));
    }

}