package org.jsoup.nodes;

public class GeneratedTestTitleUpdate {

    @Test
    public void testTitleUpdate() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        boolean update = document.updateMetaCharsetElement(true);
        assertTrue(update);
    }

}