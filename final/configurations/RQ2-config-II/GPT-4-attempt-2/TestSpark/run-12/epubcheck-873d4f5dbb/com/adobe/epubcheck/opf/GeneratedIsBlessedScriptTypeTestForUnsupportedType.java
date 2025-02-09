package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedScriptTypeTestForUnsupportedType {

    @Test
    public void isBlessedScriptTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/vbscript"));
    }

}