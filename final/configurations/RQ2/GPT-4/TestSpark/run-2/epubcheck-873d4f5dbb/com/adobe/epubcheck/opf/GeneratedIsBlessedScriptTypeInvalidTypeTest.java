package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeInvalidTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/css"));
    }

}