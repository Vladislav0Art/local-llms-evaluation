package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeFalseTest {

    @Test
    public void isBlessedScriptTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/invalid"));
    }

}