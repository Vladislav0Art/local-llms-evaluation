package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedScriptType_ValidatesBlessedScriptFormat {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isBlessedScriptType_ValidatesBlessedScriptFormat() {
        String type = "application/x-blessed-script";
        assertTrue(OPFChecker30.isBlessedScriptType(type));
    }

}