package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsBlessedScriptType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsBlessedScriptType() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/x-msexcel"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/html"));
    }

}