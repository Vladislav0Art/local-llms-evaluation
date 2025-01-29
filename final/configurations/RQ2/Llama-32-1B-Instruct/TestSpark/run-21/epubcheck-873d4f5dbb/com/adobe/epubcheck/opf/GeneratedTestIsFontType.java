package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        assertTrue(OPFChecker30.isFontType("font"));
        assertFalse(OPFChecker30.isFontType("image"));
    }

}