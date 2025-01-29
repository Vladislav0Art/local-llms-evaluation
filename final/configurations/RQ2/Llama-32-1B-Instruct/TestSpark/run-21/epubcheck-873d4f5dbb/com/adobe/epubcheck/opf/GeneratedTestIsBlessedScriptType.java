package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        assertTrue(OPFChecker30.isBlessedScriptType("script"));
        assertFalse(OPFChecker30.isBlessedScriptType("audio"));
    }

}