package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        assertTrue(OPFChecker30.isBlessedFontType("bible"));
        assertTrue(OPFChecker30.isBlessedFontType("font"));
    }

}