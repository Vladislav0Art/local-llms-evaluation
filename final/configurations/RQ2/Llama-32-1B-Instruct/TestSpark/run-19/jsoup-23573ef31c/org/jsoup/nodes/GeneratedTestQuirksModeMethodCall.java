package org.jsoup.nodes;

public class GeneratedTestQuirksModeMethodCall {

    @Test
    public void testQuirksModeMethodCall() {
        Document document = new Document("https://example.com");
        assertNotNull(document.quirksMode());
        document.quirksMode(new QuirksMode());
    }

}