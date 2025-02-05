package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeInvalidTest {

    @Test
    public void isBlessedScriptTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/turtle"));
    }

}