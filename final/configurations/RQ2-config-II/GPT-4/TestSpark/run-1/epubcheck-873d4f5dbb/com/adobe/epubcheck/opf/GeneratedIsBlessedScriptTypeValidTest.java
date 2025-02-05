package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeValidTest {

    @Test
    public void isBlessedScriptTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}