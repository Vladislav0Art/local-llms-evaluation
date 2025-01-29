package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        assertTrue(OPFChecker30.isBlessedVideoType("bible"));
        assertFalse(OPFChecker30.isBlessedVideoType("video"));
    }

}