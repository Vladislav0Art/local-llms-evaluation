package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElementShouldReturnBooleanValue {

    @Test
    public void updateMetaCharsetElementShouldReturnBooleanValue() {
        Document document = Document.createShell("https://example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}