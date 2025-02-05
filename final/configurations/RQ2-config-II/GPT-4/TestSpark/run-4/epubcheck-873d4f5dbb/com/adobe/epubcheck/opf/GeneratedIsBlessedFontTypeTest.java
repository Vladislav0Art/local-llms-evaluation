package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedFontTypeTest {


    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFItem mockOPFItem;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void isBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/x-font-otf"));
    }

}