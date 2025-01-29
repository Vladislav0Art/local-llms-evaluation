package org.jsoup.nodes;

public class GeneratedTest_updateMetaCharsetElement {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_updateMetaCharsetElement() {
        Document document = new Document(BASE_URI);
        document.updateMetaCharsetElement(true);
        assertTrue(document.connection().metaCharsetElementUpdated());
    }

}