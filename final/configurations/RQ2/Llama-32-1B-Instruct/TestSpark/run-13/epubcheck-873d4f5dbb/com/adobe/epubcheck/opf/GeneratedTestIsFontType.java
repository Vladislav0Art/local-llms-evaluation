package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        String type = "font/truetype";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/truetype");
        result = OPFChecker30.isFontType("font/truetype");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("font/opentype");
        result = OPFChecker30.isFontType("font/opentype");
        assertTrue(result);
    }

}