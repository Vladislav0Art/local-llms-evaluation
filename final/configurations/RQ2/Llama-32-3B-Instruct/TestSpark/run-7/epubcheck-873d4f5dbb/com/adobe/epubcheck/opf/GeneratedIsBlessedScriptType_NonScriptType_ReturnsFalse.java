package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedScriptType_NonScriptType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isBlessedScriptType_NonScriptType_ReturnsFalse() {
        assertFalse(OPFChecker30.isBlessedScriptType("text"));
    }

}