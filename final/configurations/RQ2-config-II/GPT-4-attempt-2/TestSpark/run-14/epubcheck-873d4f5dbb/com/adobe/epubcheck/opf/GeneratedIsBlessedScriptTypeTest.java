package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        boolean result = OPFChecker30.isBlessedScriptType("text/javascript");
        assertTrue(result);
    }

}