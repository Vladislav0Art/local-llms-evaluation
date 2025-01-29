package org.jsoup.nodes;

public class GeneratedTestQuirksMode {

    @Test
    public void testQuirksMode() {
        Document document = new Document("https://example.com");
        assertEquals(0, document.quirksMode().toString().length());
    }

}