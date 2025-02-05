package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeInValidTypeTest {

    @Test
    public void isBlessedScriptTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/xyz"));
    }

}