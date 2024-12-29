package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedScriptTypeValidTypeTest {

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}