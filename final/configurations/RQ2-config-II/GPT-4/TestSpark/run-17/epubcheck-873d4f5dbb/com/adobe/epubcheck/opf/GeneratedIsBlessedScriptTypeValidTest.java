package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeValidTest {

    @Test
    public void isBlessedScriptTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}