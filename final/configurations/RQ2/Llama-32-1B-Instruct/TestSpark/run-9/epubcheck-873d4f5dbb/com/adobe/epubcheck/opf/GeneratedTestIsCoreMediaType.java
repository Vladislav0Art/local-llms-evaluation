package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        assertEquals(true, isCoreMediaType("audio video"));
    }

}