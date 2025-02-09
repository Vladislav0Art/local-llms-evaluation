package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeNonBlessedMimeTypeTest {

    @Test
    public void isBlessedScriptTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/plain"));
    }

}