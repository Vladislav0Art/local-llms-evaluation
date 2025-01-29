package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void updateMetaCharsetElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        boolean update = true;
        doc.updateMetaCharsetElement(update);
        assertTrue(doc.updateMetaCharsetElement());
        doc.updateMetaCharsetElement(false);
    }

}