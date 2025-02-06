package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElementShouldReturnCorrectBoolean {

    @Test
    public void updateMetaCharsetElementShouldReturnCorrectBoolean() {
        Document document = new Document("https://example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}