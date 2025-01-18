package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlessedScriptTypeInvalidBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidBlessedScriptTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/pdf"));
    }

}