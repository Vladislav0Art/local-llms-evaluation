package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        String type = "image/jpeg";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("image/jpeg");
        result = OPFChecker30.isCoreMediaType("image/jpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("image/png");
        result = OPFChecker30.isCoreMediaType("image/png");
        assertTrue(result);
    }

}