package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        assertEquals("image/jpeg", OPFChecker30.getPreferredMediaType("image/jpeg", "path/to/image.jpg"));
    }

}