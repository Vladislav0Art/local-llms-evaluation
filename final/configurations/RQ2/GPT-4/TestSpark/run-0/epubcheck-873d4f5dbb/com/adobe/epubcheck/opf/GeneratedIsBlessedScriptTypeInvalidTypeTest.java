package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedScriptTypeInvalidTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/ruby"));
    }

}