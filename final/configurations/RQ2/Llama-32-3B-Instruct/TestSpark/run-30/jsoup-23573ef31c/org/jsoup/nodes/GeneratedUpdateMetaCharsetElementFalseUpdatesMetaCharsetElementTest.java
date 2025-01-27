package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElementFalseUpdatesMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementFalseUpdatesMetaCharsetElementTest() {
        Document document = new Document("https://www.example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertFalse(updated);
    }

}