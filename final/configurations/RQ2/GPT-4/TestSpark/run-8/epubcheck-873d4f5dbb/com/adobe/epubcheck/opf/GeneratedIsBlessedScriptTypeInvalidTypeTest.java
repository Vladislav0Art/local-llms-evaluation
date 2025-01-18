package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeInvalidTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("application/invalid-script"));
    }

}