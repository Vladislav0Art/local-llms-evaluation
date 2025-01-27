package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsBlessedScriptType_validType_ReturnsTrue {

    @Test
    public void isBlessedScriptType_validType_ReturnsTrue() {
        String type = "blessed script/wasm";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);
    }

}