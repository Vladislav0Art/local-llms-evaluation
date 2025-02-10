package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedScriptType_blessedScript {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isBlessedScriptType_blessedScript() {
        String type = "blessed script";

        // When and Then
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);
    }

}