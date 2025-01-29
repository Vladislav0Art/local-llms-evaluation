package org.jsoup.nodes;

public class GeneratedTestCharset {

    @Test
    public void testCharset() {
        Document document = new Document("https://example.com");
        assertEquals("utf-8", document.charset().toString());
    }

}