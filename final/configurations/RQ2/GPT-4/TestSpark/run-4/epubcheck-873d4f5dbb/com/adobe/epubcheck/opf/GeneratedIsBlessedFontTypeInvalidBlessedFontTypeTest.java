package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlessedFontTypeInvalidBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeInvalidBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/pdf"));
    }

}