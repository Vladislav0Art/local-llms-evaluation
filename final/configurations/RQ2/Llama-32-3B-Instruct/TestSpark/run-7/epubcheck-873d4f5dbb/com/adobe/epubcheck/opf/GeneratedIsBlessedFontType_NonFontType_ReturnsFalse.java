package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedFontType_NonFontType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isBlessedFontType_NonFontType_ReturnsFalse() {
        assertFalse(OPFChecker30.isBlessedFontType("text"));
    }

}