package org.jsoup.nodes;

public class GeneratedTestHead {

    @Test
    public void testHead() {
        Document document = new Document("https://example.com");
        assertNotNull(document.head());
        assertEquals(0, document.head().children().size());
    }

}