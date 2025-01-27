package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElementTrueUpdatesMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTrueUpdatesMetaCharsetElementTest() {
        Document document = new Document("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}