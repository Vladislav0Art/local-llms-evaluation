package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        String type = "font/truetype";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/truetype");
        result = OPFChecker30.isBlessedFontType("font/truetype");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/opentype");
        result = OPFChecker30.isBlessedFontType("font/opentype");
        assertTrue(result);
    }

}