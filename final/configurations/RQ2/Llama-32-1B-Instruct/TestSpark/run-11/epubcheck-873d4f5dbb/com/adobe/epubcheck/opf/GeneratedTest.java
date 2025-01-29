package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testGetPreferredMediaType_Pdf() {
        String path = "/test/path.pdf";

        PdfReader pdfReader = new PdfReader(path);
        assertEquals("/test/path.pdf", PdfReader.getPreferredMediaType("type", path));
    }

    @Test
    public void testGetPreferredMediaType_Mp4() {
        boolean hasAudio = false;
        boolean hasVideo = false;

        Mp4Reader mp4Reader = new Mp4Reader();

        String path = "/test/path.mp4";
        assertEquals("/test/path.mp4", Mp4Reader.getPreferredMediaType("type", path));
    }

    @Test
    public void testGetPreferredMediaType_PdfNoPath() {
        String preferredMediaType = PdfReader.getPreferredMediaType("type", null);

        if (preferredMediaType != null) {
            assertEquals(null, preferredMediaType);
        } else {
            assertEquals("/test/path.pdf", preferredMediaType);
        }
    }

    @Test
    public void testGetPreferredMediaType_Mp4NoType() {
        boolean hasAudio = false;
        boolean hasVideo = false;

        String preferredMediaType = Mp4Reader.getPreferredMediaType(null, null);

        if (preferredMediaType != null) {
            assertEquals("/test/path.mp4", preferredMediaType);
        } else {
            assertEquals(null, preferredMediaType);
        }
    }

    @Test
    public void testGetPreferredMediaType_PdfNoType() {
        String path = "/test/path.pdf";

        PdfReader pdfReader = new PdfReader(path);

        assertEquals("/test/path.pdf", PdfReader.getPreferredMediaType("type", null));
    }

}