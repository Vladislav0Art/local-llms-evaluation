package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals("Example", document.title());
    }

}