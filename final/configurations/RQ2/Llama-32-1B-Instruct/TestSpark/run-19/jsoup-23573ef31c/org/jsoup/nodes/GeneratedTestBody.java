package org.jsoup.nodes;

public class GeneratedTestBody {

    @Test
    public void testBody() {
        Document document = new Document("https://example.com");
        assertNotNull(document.body());
        assertEquals(0, document.body().children().size());
    }

}