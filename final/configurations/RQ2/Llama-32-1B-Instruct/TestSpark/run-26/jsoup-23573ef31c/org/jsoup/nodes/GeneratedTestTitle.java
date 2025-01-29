package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        String title = document.title();
        assertEquals("Example Title", title);
    }

}