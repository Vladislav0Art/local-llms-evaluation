package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedScriptTypeInvalidScriptTest {

    @Test
    public void isBlessedScriptTypeInvalidScriptTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("application/x-javascript"));
    }

}