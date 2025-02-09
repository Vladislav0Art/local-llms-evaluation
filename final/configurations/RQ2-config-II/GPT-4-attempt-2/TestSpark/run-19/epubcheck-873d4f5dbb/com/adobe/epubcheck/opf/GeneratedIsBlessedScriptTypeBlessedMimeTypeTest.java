package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeBlessedMimeTypeTest {

    @Test
    public void isBlessedScriptTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

}