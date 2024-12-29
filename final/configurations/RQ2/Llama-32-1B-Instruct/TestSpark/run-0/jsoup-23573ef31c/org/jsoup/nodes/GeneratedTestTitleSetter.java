package org.jsoup.nodes;

public class GeneratedTestTitleSetter {

    @Test
    public void testTitleSetter() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}