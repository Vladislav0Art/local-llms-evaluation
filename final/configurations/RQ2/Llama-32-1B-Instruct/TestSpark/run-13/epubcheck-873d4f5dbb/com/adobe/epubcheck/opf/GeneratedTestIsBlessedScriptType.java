package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsBlessedScriptType {

    @Test
    public void testIsBlessedScriptType() {
        String type = "application/x-font-stylesheet";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("application/x-font-stylesheet");
        result = OPFChecker30.isBlessedScriptType("application/x-font-stylesheet");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("application/pdf");
        result = OPFChecker30.isBlessedScriptType("application/pdf");
        assertTrue(result);
    }

}