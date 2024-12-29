package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedScriptTypeNotFoundTest {

    @Test
    public void isBlessedScriptTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("unknownType"));
    }

}