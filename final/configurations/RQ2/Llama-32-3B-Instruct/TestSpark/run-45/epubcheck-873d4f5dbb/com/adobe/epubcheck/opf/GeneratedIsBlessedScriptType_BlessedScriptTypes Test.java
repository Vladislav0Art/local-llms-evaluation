package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsBlessedScriptType_BlessedScriptTypes Test {

    @Test
    public void isBlessedScriptType_BlessedScriptTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedScriptType("blessed script"));
        assertFalse(OPFChecker30.isBlessedScriptType("script"));
    }

}