package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeValidTest {

    @Test
    public void isBlessedScriptTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}