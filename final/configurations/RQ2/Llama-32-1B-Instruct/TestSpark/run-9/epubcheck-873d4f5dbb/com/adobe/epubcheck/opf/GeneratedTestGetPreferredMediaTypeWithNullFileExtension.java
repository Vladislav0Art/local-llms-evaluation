package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPreferredMediaTypeWithNullFileExtension {

    @Test
    public void testGetPreferredMediaTypeWithNullFileExtension() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("/path/to/video", null));
    }

}