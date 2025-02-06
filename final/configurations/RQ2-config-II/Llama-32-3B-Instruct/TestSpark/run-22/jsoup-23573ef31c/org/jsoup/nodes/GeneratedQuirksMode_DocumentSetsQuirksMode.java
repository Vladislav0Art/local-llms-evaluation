package org.jsoup.nodes;

public class GeneratedQuirksMode_DocumentSetsQuirksMode {

    @Test
    public void quirksMode_DocumentSetsQuirksMode() {
        QuirksMode mode = QuirksMode.CONSERVATIVE;
        Document document = new Document("https://example.com");
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

}