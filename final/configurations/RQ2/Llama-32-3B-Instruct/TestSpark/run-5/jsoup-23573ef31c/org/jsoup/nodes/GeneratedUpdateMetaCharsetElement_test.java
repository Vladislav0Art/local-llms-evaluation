package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElement_test {

    @Test
    public void updateMetaCharsetElement_test() {
        Document document = new Document("http://example.com");
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

}