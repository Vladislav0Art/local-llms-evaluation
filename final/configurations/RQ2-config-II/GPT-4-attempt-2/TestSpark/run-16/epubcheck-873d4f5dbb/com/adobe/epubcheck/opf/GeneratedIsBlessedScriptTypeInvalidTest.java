package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeInvalidTest {

    @Test
    public void isBlessedScriptTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/jsscript"));
    }

}