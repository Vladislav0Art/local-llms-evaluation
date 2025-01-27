package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedFontType_ValidOPF {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> resources;

    @Test
    public void isBlessedFontType_ValidOPF() {
        when(context.isBlessedFontType("font")).thenReturn(true);
        boolean result = OPFChecker30.isBlessedFontType("font");
        assertTrue(result);
    }

}