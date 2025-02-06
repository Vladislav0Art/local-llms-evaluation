package org.jsoup.nodes;

public class GeneratedText_DocumentSetsText {

    @Test
    public void text_DocumentSetsText() {
        Document document = new Document("https://example.com");
        document.text("Hello World!");
        assertEquals("Hello World!", document.text());
    }

}