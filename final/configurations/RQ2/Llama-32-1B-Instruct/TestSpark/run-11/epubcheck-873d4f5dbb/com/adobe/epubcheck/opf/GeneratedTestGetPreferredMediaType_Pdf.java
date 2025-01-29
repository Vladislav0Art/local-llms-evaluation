package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_Pdf {

    @Test
    public void testGetPreferredMediaType_Pdf() {
        String path = "/test/path.pdf";

        PdfReader pdfReader = new PdfReader(path);
        assertEquals("/test/path.pdf", PdfReader.getPreferredMediaType("type", path));
    }

}