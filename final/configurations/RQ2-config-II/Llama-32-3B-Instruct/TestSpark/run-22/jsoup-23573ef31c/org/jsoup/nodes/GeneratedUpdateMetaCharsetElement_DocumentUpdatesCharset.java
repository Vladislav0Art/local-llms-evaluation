package org.jsoup.nodes;

public class GeneratedUpdateMetaCharsetElement_DocumentUpdatesCharset {

    @Test
    public void updateMetaCharsetElement_DocumentUpdatesCharset() {
        boolean updated = false;
        when(DataUtil.getCharset()).thenReturn(Charset.forName("UTF-8"));
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(updated);
    }

}