package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("image", "path/to/image.jpg"));
    }

}