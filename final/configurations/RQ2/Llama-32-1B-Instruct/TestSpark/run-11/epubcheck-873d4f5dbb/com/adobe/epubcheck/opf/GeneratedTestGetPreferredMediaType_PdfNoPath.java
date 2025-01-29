package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_PdfNoPath {

    @Test
    public void testGetPreferredMediaType_PdfNoPath() {
        String preferredMediaType = PdfReader.getPreferredMediaType("type", null);

        if (preferredMediaType != null) {
            assertEquals(null, preferredMediaType);
        } else {
            assertEquals("/test/path.pdf", preferredMediaType);
        }
    }

}