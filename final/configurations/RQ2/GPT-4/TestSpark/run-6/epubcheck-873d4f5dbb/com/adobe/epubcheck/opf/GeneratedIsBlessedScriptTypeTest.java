package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/typescript"));
    }

}