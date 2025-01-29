package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        Document document = new Document("http://example.com");
        String title = document.title();
        assertNotNull(title);
        assertEquals("Example HTML Test", title);
    }

}