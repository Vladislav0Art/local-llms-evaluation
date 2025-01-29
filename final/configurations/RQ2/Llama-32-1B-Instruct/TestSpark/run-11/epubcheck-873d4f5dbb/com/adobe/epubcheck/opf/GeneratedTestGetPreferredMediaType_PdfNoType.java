package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_PdfNoType {

    @Test
    public void testGetPreferredMediaType_PdfNoType() {
        String path = "/test/path.pdf";

        PdfReader pdfReader = new PdfReader(path);

        assertEquals("/test/path.pdf", PdfReader.getPreferredMediaType("type", null));
    }

}