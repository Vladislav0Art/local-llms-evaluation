package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedScriptTypeFoundTest {

    @Test
    public void isBlessedScriptTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}