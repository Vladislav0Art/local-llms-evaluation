package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeValidTypeTest {

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}