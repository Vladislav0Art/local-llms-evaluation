package org.jsoup.nodes;

public class GeneratedQuirksMode_test {

    @Test
    public void quirksMode_test() {
        Document document = new Document("http://example.com");
        QuirksMode mode = QuirksMode.CONFUSING;
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

}