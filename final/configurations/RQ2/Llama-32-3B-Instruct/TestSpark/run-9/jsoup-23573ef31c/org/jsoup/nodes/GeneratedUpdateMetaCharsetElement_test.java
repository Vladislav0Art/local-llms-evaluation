package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElement_test {

    @Test
    public void updateMetaCharsetElement_test() {
        boolean update = true;
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}