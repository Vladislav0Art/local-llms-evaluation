package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeInvalidTest {

    @Test
    public void isBlessedScriptTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/xhtml"));
    }

}