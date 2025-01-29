package org.jsoup.nodes;

public class GeneratedTestUpdateMetaCharsetElement {

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document = new Document("https://example.com");
        assertNotNull(document.updateMetaCharsetElement(true));
        assertEquals(true, document.updateMetaCharsetElement());
    }

}